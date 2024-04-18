package com.stay;

import gen.StayLexer;
import gen.StayParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) {
//        String code = "int myInt = 69;" +
//                "print(123);" +
//                "str myStr = \"test\";" +
//                "print(myStr);" +
//                "print(\"hellaw\");" +
//                "print(myInt);";

//        String code = "int firstInt = 111;\n" + "int secondInt = 7;\n" +
//                "int result = firstInt * secondInt;\n" +
//                "print(result);\n";

//        String code = "int myInt = 12;\n" +
//                "if(myInt == 12){\n" +
//                "print(\"yo yo yo\");\n" +
//                "}\n";

        String code = "int intToPrint = 123;" +
                "repeat 3 times {\n" +
                "print(intToPrint);" +
                "}\n" +
                "print(\"done\");\n";

        CharStream stream = CharStreams.fromString(code);
        StayLexer lexer = new StayLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        StayParser parser = new StayParser(tokens);

        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        StayToLLVMListener listener = new StayToLLVMListener();
        walker.walk(listener, tree);

        System.out.println(listener.getResult());
//        System.out.println(tree.toStringTree(parser));
    }
}