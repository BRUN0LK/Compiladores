// Generated from Expr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(ExprParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(ExprParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(ExprParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ExprParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(ExprParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(ExprParser.RelOpContext ctx);
}