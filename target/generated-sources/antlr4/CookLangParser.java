// Generated from java-escape by ANTLR 4.11.1

  package br.ufscar.dc.compiladores.cooklang;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CookLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RECEITA=1, INGREDIENTES=2, MODO_PREPARO=3, TEMPO_KW=4, NUMBER=5, UNIT=6, 
		TEMPO=7, DOT=8, WORD=9, WS=10, NL=11;
	public static final int
		RULE_receita = 0, RULE_title = 1, RULE_ingrediente = 2, RULE_passo = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"receita", "title", "ingrediente", "passo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Receita:'", "'Ingredientes:'", "'Modo de Preparo:'", "'Tempo:'", 
			null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RECEITA", "INGREDIENTES", "MODO_PREPARO", "TEMPO_KW", "NUMBER", 
			"UNIT", "TEMPO", "DOT", "WORD", "WS", "NL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CookLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReceitaContext extends ParserRuleContext {
		public TerminalNode RECEITA() { return getToken(CookLangParser.RECEITA, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(CookLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(CookLangParser.NL, i);
		}
		public TerminalNode INGREDIENTES() { return getToken(CookLangParser.INGREDIENTES, 0); }
		public TerminalNode MODO_PREPARO() { return getToken(CookLangParser.MODO_PREPARO, 0); }
		public TerminalNode EOF() { return getToken(CookLangParser.EOF, 0); }
		public List<IngredienteContext> ingrediente() {
			return getRuleContexts(IngredienteContext.class);
		}
		public IngredienteContext ingrediente(int i) {
			return getRuleContext(IngredienteContext.class,i);
		}
		public List<PassoContext> passo() {
			return getRuleContexts(PassoContext.class);
		}
		public PassoContext passo(int i) {
			return getRuleContext(PassoContext.class,i);
		}
		public ReceitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookLangListener ) ((CookLangListener)listener).enterReceita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookLangListener ) ((CookLangListener)listener).exitReceita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookLangVisitor ) return ((CookLangVisitor<? extends T>)visitor).visitReceita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceitaContext receita() throws RecognitionException {
		ReceitaContext _localctx = new ReceitaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_receita);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(RECEITA);
			setState(9);
			title();
			setState(10);
			match(NL);
			setState(11);
			match(INGREDIENTES);
			setState(12);
			match(NL);
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13);
				ingrediente();
				}
				}
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(18);
			match(MODO_PREPARO);
			setState(19);
			match(NL);
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				passo();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(25);
				match(NL);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TitleContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(CookLangParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(CookLangParser.WORD, i);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookLangListener ) ((CookLangListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookLangListener ) ((CookLangListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookLangVisitor ) return ((CookLangVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				match(WORD);
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IngredienteContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CookLangParser.NUMBER, 0); }
		public TerminalNode UNIT() { return getToken(CookLangParser.UNIT, 0); }
		public TerminalNode NL() { return getToken(CookLangParser.NL, 0); }
		public List<TerminalNode> WORD() { return getTokens(CookLangParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(CookLangParser.WORD, i);
		}
		public IngredienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingrediente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookLangListener ) ((CookLangListener)listener).enterIngrediente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookLangListener ) ((CookLangListener)listener).exitIngrediente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookLangVisitor ) return ((CookLangVisitor<? extends T>)visitor).visitIngrediente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngredienteContext ingrediente() throws RecognitionException {
		IngredienteContext _localctx = new IngredienteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ingrediente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(NUMBER);
			setState(39);
			match(UNIT);
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				match(WORD);
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(45);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PassoContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CookLangParser.NUMBER, 0); }
		public TerminalNode DOT() { return getToken(CookLangParser.DOT, 0); }
		public TerminalNode TEMPO_KW() { return getToken(CookLangParser.TEMPO_KW, 0); }
		public TerminalNode TEMPO() { return getToken(CookLangParser.TEMPO, 0); }
		public TerminalNode NL() { return getToken(CookLangParser.NL, 0); }
		public List<TerminalNode> WORD() { return getTokens(CookLangParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(CookLangParser.WORD, i);
		}
		public PassoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookLangListener ) ((CookLangListener)listener).enterPasso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookLangListener ) ((CookLangListener)listener).exitPasso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookLangVisitor ) return ((CookLangVisitor<? extends T>)visitor).visitPasso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PassoContext passo() throws RecognitionException {
		PassoContext _localctx = new PassoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_passo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(NUMBER);
			setState(48);
			match(DOT);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				match(WORD);
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(54);
			match(TEMPO_KW);
			setState(55);
			match(TEMPO);
			setState(56);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000b;\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u000f\b\u0000\u000b"+
		"\u0000\f\u0000\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0016"+
		"\b\u0000\u000b\u0000\f\u0000\u0017\u0001\u0000\u0005\u0000\u001b\b\u0000"+
		"\n\u0000\f\u0000\u001e\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004"+
		"\u0001#\b\u0001\u000b\u0001\f\u0001$\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002*\b\u0002\u000b\u0002\f\u0002+\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u00033\b\u0003\u000b\u0003\f\u0003"+
		"4\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0000\u0000"+
		"\u0004\u0000\u0002\u0004\u0006\u0000\u0000<\u0000\b\u0001\u0000\u0000"+
		"\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000"+
		"\u0006/\u0001\u0000\u0000\u0000\b\t\u0005\u0001\u0000\u0000\t\n\u0003"+
		"\u0002\u0001\u0000\n\u000b\u0005\u000b\u0000\u0000\u000b\f\u0005\u0002"+
		"\u0000\u0000\f\u000e\u0005\u000b\u0000\u0000\r\u000f\u0003\u0004\u0002"+
		"\u0000\u000e\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000"+
		"\u0010\u000e\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0003\u0000\u0000"+
		"\u0013\u0015\u0005\u000b\u0000\u0000\u0014\u0016\u0003\u0006\u0003\u0000"+
		"\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000"+
		"\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000"+
		"\u0018\u001c\u0001\u0000\u0000\u0000\u0019\u001b\u0005\u000b\u0000\u0000"+
		"\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000"+
		"\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000"+
		"\u001d\u001f\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000"+
		"\u001f \u0005\u0000\u0000\u0001 \u0001\u0001\u0000\u0000\u0000!#\u0005"+
		"\t\u0000\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\""+
		"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\u0003\u0001\u0000"+
		"\u0000\u0000&\'\u0005\u0005\u0000\u0000\')\u0005\u0006\u0000\u0000(*\u0005"+
		"\t\u0000\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-.\u0005\u000b\u0000\u0000.\u0005\u0001\u0000\u0000\u0000/0\u0005\u0005"+
		"\u0000\u000002\u0005\b\u0000\u000013\u0005\t\u0000\u000021\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0005\u0004\u0000\u0000"+
		"78\u0005\u0007\u0000\u000089\u0005\u000b\u0000\u00009\u0007\u0001\u0000"+
		"\u0000\u0000\u0006\u0010\u0017\u001c$+4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}