// Generated from C:/Users/jankr/IdeaProjects/StayCompiler/src/main/antlr/StayParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StayParser}.
 */
public interface StayParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StayParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(StayParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(StayParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(StayParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(StayParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(StayParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(StayParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(StayParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(StayParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(StayParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(StayParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#printStat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(StayParser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#printStat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(StayParser.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#readStat}.
	 * @param ctx the parse tree
	 */
	void enterReadStat(StayParser.ReadStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#readStat}.
	 * @param ctx the parse tree
	 */
	void exitReadStat(StayParser.ReadStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(StayParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(StayParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#loopStat}.
	 * @param ctx the parse tree
	 */
	void enterLoopStat(StayParser.LoopStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#loopStat}.
	 * @param ctx the parse tree
	 */
	void exitLoopStat(StayParser.LoopStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#repetitions}.
	 * @param ctx the parse tree
	 */
	void enterRepetitions(StayParser.RepetitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#repetitions}.
	 * @param ctx the parse tree
	 */
	void exitRepetitions(StayParser.RepetitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#blockif}.
	 * @param ctx the parse tree
	 */
	void enterBlockif(StayParser.BlockifContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#blockif}.
	 * @param ctx the parse tree
	 */
	void exitBlockif(StayParser.BlockifContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(StayParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(StayParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#intAssignment}.
	 * @param ctx the parse tree
	 */
	void enterIntAssignment(StayParser.IntAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#intAssignment}.
	 * @param ctx the parse tree
	 */
	void exitIntAssignment(StayParser.IntAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#floatAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFloatAssignment(StayParser.FloatAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#floatAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFloatAssignment(StayParser.FloatAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#stringAssignment}.
	 * @param ctx the parse tree
	 */
	void enterStringAssignment(StayParser.StringAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#stringAssignment}.
	 * @param ctx the parse tree
	 */
	void exitStringAssignment(StayParser.StringAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#printValue}.
	 * @param ctx the parse tree
	 */
	void enterPrintValue(StayParser.PrintValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#printValue}.
	 * @param ctx the parse tree
	 */
	void exitPrintValue(StayParser.PrintValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#intValue}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(StayParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#intValue}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(StayParser.IntValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link StayParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOp(StayParser.ArithmeticOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link StayParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOp(StayParser.ArithmeticOpContext ctx);
}