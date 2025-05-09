// Generated from c:/Users/quido/OneDrive/Documentos/Faculdade/Linguagens de Programação/simple-dsl/antlr4/sexpression.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sexpressionParser}.
 */
public interface sexpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sexpressionParser#sexpr}.
	 * @param ctx the parse tree
	 */
	void enterSexpr(sexpressionParser.SexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sexpressionParser#sexpr}.
	 * @param ctx the parse tree
	 */
	void exitSexpr(sexpressionParser.SexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sexpressionParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(sexpressionParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link sexpressionParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(sexpressionParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link sexpressionParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(sexpressionParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sexpressionParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(sexpressionParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sexpressionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(sexpressionParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link sexpressionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(sexpressionParser.AtomContext ctx);
}