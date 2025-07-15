// Generated from java-escape by ANTLR 4.11.1

  package br.ufscar.dc.compiladores.cooklang;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CookLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CookLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CookLangParser#receita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceita(CookLangParser.ReceitaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookLangParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(CookLangParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookLangParser#ingrediente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngrediente(CookLangParser.IngredienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link CookLangParser#passo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasso(CookLangParser.PassoContext ctx);
}