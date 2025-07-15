// Generated from java-escape by ANTLR 4.11.1

  package br.ufscar.dc.compiladores.cooklang;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CookLangParser}.
 */
public interface CookLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CookLangParser#receita}.
	 * @param ctx the parse tree
	 */
	void enterReceita(CookLangParser.ReceitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookLangParser#receita}.
	 * @param ctx the parse tree
	 */
	void exitReceita(CookLangParser.ReceitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookLangParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(CookLangParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookLangParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(CookLangParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookLangParser#ingrediente}.
	 * @param ctx the parse tree
	 */
	void enterIngrediente(CookLangParser.IngredienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookLangParser#ingrediente}.
	 * @param ctx the parse tree
	 */
	void exitIngrediente(CookLangParser.IngredienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookLangParser#passo}.
	 * @param ctx the parse tree
	 */
	void enterPasso(CookLangParser.PassoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookLangParser#passo}.
	 * @param ctx the parse tree
	 */
	void exitPasso(CookLangParser.PassoContext ctx);
}