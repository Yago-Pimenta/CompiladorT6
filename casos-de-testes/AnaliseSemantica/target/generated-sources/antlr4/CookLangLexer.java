// Generated from java-escape by ANTLR 4.11.1

  package br.ufscar.dc.compiladores.cooklang;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CookLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RECEITA=1, INGREDIENTES=2, MODO_PREPARO=3, TEMPO_KW=4, NUMBER=5, UNIT=6, 
		TEMPO=7, DOT=8, WORD=9, WS=10, NL=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RECEITA", "INGREDIENTES", "MODO_PREPARO", "TEMPO_KW", "NUMBER", "UNIT", 
			"TEMPO", "DOT", "WORD", "WS", "NL"
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


	public CookLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CookLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000b\u0086\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004"+
		"\u0004H\b\u0004\u000b\u0004\f\u0004I\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005g\b\u0005\u0001\u0006\u0004\u0006j\b\u0006\u000b\u0006\f\u0006"+
		"k\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006r\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0004\bw\b\b\u000b\b\f\bx\u0001\t\u0004"+
		"\t|\b\t\u000b\t\f\t}\u0001\t\u0001\t\u0001\n\u0003\n\u0083\b\n\u0001\n"+
		"\u0001\n\u0000\u0000\u000b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0001"+
		"\u0000\u0003\u0001\u000009\n\u0000--AZaz\u00e1\u00e1\u00e3\u00e3\u00e7"+
		"\u00e7\u00e9\u00ea\u00ed\u00ed\u00f3\u00f5\u00fa\u00fa\u0002\u0000\t\t"+
		"  \u0092\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003"+
		" \u0001\u0000\u0000\u0000\u0005.\u0001\u0000\u0000\u0000\u0007?\u0001"+
		"\u0000\u0000\u0000\tG\u0001\u0000\u0000\u0000\u000bf\u0001\u0000\u0000"+
		"\u0000\ri\u0001\u0000\u0000\u0000\u000fs\u0001\u0000\u0000\u0000\u0011"+
		"v\u0001\u0000\u0000\u0000\u0013{\u0001\u0000\u0000\u0000\u0015\u0082\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0005R\u0000\u0000\u0018\u0019\u0005e\u0000"+
		"\u0000\u0019\u001a\u0005c\u0000\u0000\u001a\u001b\u0005e\u0000\u0000\u001b"+
		"\u001c\u0005i\u0000\u0000\u001c\u001d\u0005t\u0000\u0000\u001d\u001e\u0005"+
		"a\u0000\u0000\u001e\u001f\u0005:\u0000\u0000\u001f\u0002\u0001\u0000\u0000"+
		"\u0000 !\u0005I\u0000\u0000!\"\u0005n\u0000\u0000\"#\u0005g\u0000\u0000"+
		"#$\u0005r\u0000\u0000$%\u0005e\u0000\u0000%&\u0005d\u0000\u0000&\'\u0005"+
		"i\u0000\u0000\'(\u0005e\u0000\u0000()\u0005n\u0000\u0000)*\u0005t\u0000"+
		"\u0000*+\u0005e\u0000\u0000+,\u0005s\u0000\u0000,-\u0005:\u0000\u0000"+
		"-\u0004\u0001\u0000\u0000\u0000./\u0005M\u0000\u0000/0\u0005o\u0000\u0000"+
		"01\u0005d\u0000\u000012\u0005o\u0000\u000023\u0005 \u0000\u000034\u0005"+
		"d\u0000\u000045\u0005e\u0000\u000056\u0005 \u0000\u000067\u0005P\u0000"+
		"\u000078\u0005r\u0000\u000089\u0005e\u0000\u00009:\u0005p\u0000\u0000"+
		":;\u0005a\u0000\u0000;<\u0005r\u0000\u0000<=\u0005o\u0000\u0000=>\u0005"+
		":\u0000\u0000>\u0006\u0001\u0000\u0000\u0000?@\u0005T\u0000\u0000@A\u0005"+
		"e\u0000\u0000AB\u0005m\u0000\u0000BC\u0005p\u0000\u0000CD\u0005o\u0000"+
		"\u0000DE\u0005:\u0000\u0000E\b\u0001\u0000\u0000\u0000FH\u0007\u0000\u0000"+
		"\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000J\n\u0001\u0000\u0000\u0000Kg\u0005"+
		"g\u0000\u0000LM\u0005k\u0000\u0000Mg\u0005g\u0000\u0000NO\u0005m\u0000"+
		"\u0000Og\u0005l\u0000\u0000Pg\u0005l\u0000\u0000QR\u0005u\u0000\u0000"+
		"RS\u0005n\u0000\u0000ST\u0005i\u0000\u0000Tg\u0005d\u0000\u0000UV\u0005"+
		"x\u0000\u0000VW\u0005i\u0000\u0000Wg\u0005c\u0000\u0000XY\u0005c\u0000"+
		"\u0000YZ\u0005o\u0000\u0000Z[\u0005l\u0000\u0000[\\\u0005h\u0000\u0000"+
		"\\]\u0005e\u0000\u0000]g\u0005r\u0000\u0000^_\u0005c\u0000\u0000_`\u0005"+
		"o\u0000\u0000`a\u0005l\u0000\u0000ab\u0005h\u0000\u0000bc\u0005e\u0000"+
		"\u0000cd\u0005r\u0000\u0000de\u0005e\u0000\u0000eg\u0005s\u0000\u0000"+
		"fK\u0001\u0000\u0000\u0000fL\u0001\u0000\u0000\u0000fN\u0001\u0000\u0000"+
		"\u0000fP\u0001\u0000\u0000\u0000fQ\u0001\u0000\u0000\u0000fU\u0001\u0000"+
		"\u0000\u0000fX\u0001\u0000\u0000\u0000f^\u0001\u0000\u0000\u0000g\f\u0001"+
		"\u0000\u0000\u0000hj\u0007\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lq\u0001\u0000\u0000\u0000mn\u0005m\u0000\u0000no\u0005i\u0000\u0000"+
		"or\u0005n\u0000\u0000pr\u0005h\u0000\u0000qm\u0001\u0000\u0000\u0000q"+
		"p\u0001\u0000\u0000\u0000r\u000e\u0001\u0000\u0000\u0000st\u0005.\u0000"+
		"\u0000t\u0010\u0001\u0000\u0000\u0000uw\u0007\u0001\u0000\u0000vu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000y\u0012\u0001\u0000\u0000\u0000z|\u0007\u0002"+
		"\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0006\t\u0000\u0000\u0080\u0014\u0001\u0000\u0000\u0000"+
		"\u0081\u0083\u0005\r\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005\n\u0000\u0000\u0085\u0016\u0001\u0000\u0000\u0000\b\u0000"+
		"Ifkqx}\u0082\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}