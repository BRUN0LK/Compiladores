// Generated from Expr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(ExprParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(ExprParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(ExprParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(ExprParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(ExprParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(ExprParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ExprParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ExprParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(ExprParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(ExprParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(ExprParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(ExprParser.RelOpContext ctx);
}