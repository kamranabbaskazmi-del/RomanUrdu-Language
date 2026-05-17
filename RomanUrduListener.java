// Generated from RomanUrdu.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RomanUrduParser}.
 */
public interface RomanUrduListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RomanUrduParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RomanUrduParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanUrduParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RomanUrduParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanUrduParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RomanUrduParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanUrduParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RomanUrduParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanUrduParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(RomanUrduParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanUrduParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(RomanUrduParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanUrduParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(RomanUrduParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanUrduParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(RomanUrduParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanUrduParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(RomanUrduParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanUrduParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(RomanUrduParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanUrduParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(RomanUrduParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanUrduParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(RomanUrduParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanUrduParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(RomanUrduParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanUrduParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(RomanUrduParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanUrduParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RomanUrduParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanUrduParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RomanUrduParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanUrduParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(RomanUrduParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanUrduParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(RomanUrduParser.ExprContext ctx);
}