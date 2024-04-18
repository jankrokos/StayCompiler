package com.stay;

import gen.StayParser;
import gen.StayParserBaseListener;

import java.util.*;

public class StayToLLVMListener extends StayParserBaseListener {

    Map<String, String> stringConstants = new HashMap<>();
    Set<String> intVariables = new HashSet<>();
    Set<String> floatVariables = new HashSet<>();
    Set<String> stringVariables = new HashSet<>();
    private String code = "";
    Stack<Integer> brstack = new Stack<>();

    int reg = 1;
    int br = 0;

    public String getResult() {
        StringBuilder result = new StringBuilder();

        result.append("declare i32 @printf(i8*, ...)\n");
        result.append("declare i32 @__isoc99_scanf(i8*, ...)\n");
        result.append("@strp = constant [4 x i8] c\"%d\\0A\\00\"\n");
        result.append("@strs = constant [3 x i8] c\"%d\\00\"\n");

        for (String s : stringConstants.keySet()) {
            result.append("@.").append(stringConstants.get(s)).append(" = private constant [").append(s.length()).append(" x i8] c\"").append(s).append("\"\n");
        }

        return ((result.length() == 0) ? "" : result + "\n") + "define i32 @main() {\n" + code + "    ret i32 1\n}";
    }

    @Override
    public void exitIntAssignment(StayParser.IntAssignmentContext ctx) {
        String id = ctx.ID().getText();

        StayParser.IntValueContext intValue = ctx.intValue();
        String value = intValue.getText();
        intVariables.add(id);

        if (intValue.INT() != null) {
            code += "    %" + id + " = alloca i32\n";
            code += "    store i32 " + value + ", i32* %" + id + "\n";

        } else if (intValue.ID() != null) {
            if (!intVariables.contains(value)) {
                System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + value);
            } else {
                code += "    %" + id + " = alloca i32\n";
                code += "    %" + reg + " = load i32* %" + value + "\n";
                reg++;
                code += "    store i32 %" + (reg - 1) + ", i32* %" + id + "\n";
            }
        } else if (intValue.arithmeticOp() != null) {
            String left = intValue.arithmeticOp().getChild(0).getText();
            String operator = arithmeticCharToOperation(intValue.arithmeticOp().getChild(1).getText());
            String right = intValue.arithmeticOp().getChild(2).getText();

            code += "    %" + id + " = alloca i32\n";

            if (!isInteger(left)) {
                if (!intVariables.contains(left)) {
                    System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + left);
                } else {
                    left = "%" + left;
                    code += "    %" + reg + " = load i32* " + left + "\n";
                    left = "%" + reg;
                    reg++;
                }
            }

            if (!isInteger(right)) {
                if (!intVariables.contains(right)) {
                    System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + right);
                } else {
                    right = "%" + right;
                    code += "    %" + reg + " = load i32* " + right + "\n";
                    right = "%" + reg;
                    reg++;
                }
            }

            code += "    %" + reg + " = " + operator + " i32 " + left + ", " + right + "\n";
            reg++;
            code += "    store i32 %" + (reg - 1) + ", i32* %" + id + "\n";

        }

    }

    @Override
    public void exitFloatAssignment(StayParser.FloatAssignmentContext ctx) {
        String id = ctx.ID().getText();
        String value = ctx.FLOAT().getText();
        floatVariables.add(id);

        code += "    %" + id + " = alloca double\n";
        code += "    store double " + value + ", double* %" + id + "\n";
    }

    @Override
    public void exitStringAssignment(StayParser.StringAssignmentContext ctx) {
        String id = ctx.ID().getText();
        String value = ctx.STRING().getText().substring(1, ctx.STRING().getText().length() - 1);
        stringVariables.add(id);

        String var;
        if (!stringConstants.containsKey(value)) {
            var = "str" + (stringConstants.keySet().size());
            stringConstants.put(value, var);
        } else {
            var = stringConstants.get(value);
        }

        code += "    %" + id + " = getelementptr inbounds [" +
                value.length() + " x i8]* @." + var + " , i32 0, i32 0\n";
    }

    @Override
    public void exitPrintStat(StayParser.PrintStatContext ctx) {
        StayParser.PrintValueContext printValue = ctx.printValue();
        String value = printValue.getText();

        if (printValue.STRING() != null) {
            String text = value.substring(1, value.length() - 1);
            String var;
            if (!stringConstants.containsKey(text)) {
                var = "str" + (stringConstants.keySet().size());
                stringConstants.put(text, var);
            } else {
                var = stringConstants.get(text);
            }

            code += "    %" + reg + " = getelementptr inbounds [" +
                    text.length() + " x i8]* @." + var + ", i32 0, i32 0\n";
            reg++;

            printfString(String.valueOf(reg - 1));

        } else if (printValue.INT() != null) {
            code += "    %" + reg + " = alloca i32\n" +
                    "    store i32 " + value + ", i32* %" + reg + "\n";
            reg++;
            printfInt(String.valueOf(reg - 1));

        } else if (printValue.ID() != null) {

            if (intVariables.contains(value)) {
                printfInt(value);
            } else if (stringVariables.contains(value)) {
                printfString(value);
            } else {
                System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + value);
            }
        }
    }

    @Override
    public void exitReadStat(StayParser.ReadStatContext ctx) {
        String id = ctx.ID().getText();

        scanf(id);
    }

    @Override
    public void enterBlockif(StayParser.BlockifContext ctx) {
        ifStart();
    }

    @Override
    public void exitBlockif(StayParser.BlockifContext ctx) {
        ifEnd();
    }

    @Override
    public void exitBoolValue(StayParser.BoolValueContext ctx) {
        String id = ctx.ID().getText();
        String value = ctx.INT().getText();

        if (intVariables.contains(id)) {
            icmp(id, value);
        } else {
            System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + id);
        }
    }

    @Override
    public void exitRepetitions(StayParser.RepetitionsContext ctx) {
        String repetitions = ctx.INT().getText();
        repeatStart(repetitions);
    }

    @Override
    public void exitBlock(StayParser.BlockContext ctx) {
        if (ctx.getParent() instanceof StayParser.LoopStatContext) {
            repeatEnd();
        }
    }

    void repeatStart(String repetitions) {
        code += "    %" + reg + " = alloca i32\n";
        int counter = reg;
        reg++;
        code += "    store i32 " + "0" + ", i32* %" + counter + "\n";
        br++;
        code += "    br label %cond" + br + "\n";
        code += "cond" + br + ":\n";

        code += "    %" + reg + " = load i32* %" + counter + "\n";
        reg++;
        code += "    %" + reg + " = add i32 " + "%" + (reg - 1) + ", " + "1" + "\n";
        reg++;
        code += "    store i32 " + "%" + (reg - 1) + ", i32* %" + counter + "\n";

        code += "    %" + reg + " = icmp slt i32 %" + (reg - 2) + ", " + repetitions + "\n";
        reg++;

        code += "    br i1 %" + (reg - 1) + ", label %true" + br + ", label %false" + br + "\n";
        code += "true" + br + ":\n";
        brstack.push(br);
    }

    void repeatEnd() {
        int b = brstack.pop();
        code += "    br label %cond" + b + "\n";
        code += "false" + b + ":\n";
    }

    void ifStart() {
        br++;
        code += "    br i1 %" + (reg - 1) + ", label %true" + br + ", label %false" + br + "\n";
        code += "true" + br + ":\n";
        brstack.push(br);
    }


    void ifEnd() {
        int b = brstack.pop();
        code += "    br label %false" + b + "\n";
        code += "false" + b + ":\n";
    }

    void icmp(String id, String value) {
        code += "    %" + reg + " = load i32* %" + id + "\n";
        reg++;
        code += "    %" + reg + " = icmp eq i32 %" + (reg - 1) + ", " + value + "\n";
        reg++;
    }


    void printfInt(String id) {
        code += "    %" + reg + " = load i32* %" + id + "\n";
        reg++;
        code += "    %" + reg + " = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @strp, i32 0, i32 0), i32 %" +
                (reg - 1) + ")\n";
        reg++;
    }

    void printfString(String id) {
        code += "    %" + reg + " = call i32 (i8*, ...)* @printf(i8* %" + id + ")\n";
        reg++;
    }

    void scanf(String id) {
        code += "    %" + reg + " = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8]* @strs, i32 0, i32 0), i32* %" +
                id + ")\n";
        reg++;
    }

    String arithmeticCharToOperation(String arithmeticChar) {
        switch (arithmeticChar) {
            case "+":
                return "add";
            case "-":
                return "sub";
            case "*":
                return "mul";
            case "/":
                return "sdiv";
        }
        System.err.println("Unsupported arithmetic operator: " + arithmeticChar);
        return null;
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
}
