// Generated from C:/Users/jankr/IdeaProjects/StayCompiler/src/main/antlr/StayParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StayParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StayParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StayParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(StayParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link StayParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(StayParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link StayParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(StayParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StayParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(StayParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StayParser#printStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat(StayParser.PrintStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link StayParser#readStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStat(StayParser.ReadStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link StayParser#intAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAssignment(StayParser.IntAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StayParser#floatAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatAssignment(StayParser.FloatAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StayParser#stringAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAssignment(StayParser.StringAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StayParser#printValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintValue(StayParser.PrintValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StayParser#intValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntValue(StayParser.IntValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StayParser#arithmeticOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOp(StayParser.ArithmeticOpContext ctx);
}