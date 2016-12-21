// Generated from D:/source/juliarFuture/src/com/juliar/parser\juliar.g4 by ANTLR 4.6
package com.juliar.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class juliarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, INT=17, 
		FLOAT=18, DOUBLE=19, LONG=20, STRING=21, ID=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "INT", "FLOAT", 
		"DOUBLE", "LONG", "STRING", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'if'", "'('", "')'", "'{'", "'}'", "'+'", "'add'", "'-'", 
		"'subtract'", "'x'", "'multiply'", "'/'", "'divide'", "'='", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "INT", "FLOAT", "DOUBLE", "LONG", "STRING", 
		"ID", "WS"
	};
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


	public juliarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "juliar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\6\22j\n\22\r\22\16\22k\3\23\6\23o"+
		"\n\23\r\23\16\23p\3\23\3\23\7\23u\n\23\f\23\16\23x\13\23\3\24\6\24{\n"+
		"\24\r\24\16\24|\3\24\3\24\7\24\u0081\n\24\f\24\16\24\u0084\13\24\3\25"+
		"\6\25\u0087\n\25\r\25\16\25\u0088\3\25\3\25\7\25\u008d\n\25\f\25\16\25"+
		"\u0090\13\25\3\26\3\26\7\26\u0094\n\26\f\26\16\26\u0097\13\26\3\26\3\26"+
		"\3\27\3\27\7\27\u009d\n\27\f\27\16\27\u00a0\13\27\3\30\6\30\u00a3\n\30"+
		"\r\30\16\30\u00a4\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\3\2\7\3\2\62;\7\2\"\"\62;C\\aac|\5\2C\\aac|\7\2//\62;C\\aac|\5\2"+
		"\13\f\17\17\"\"\u00b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\66\3\2\2\2\t8\3\2"+
		"\2\2\13:\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21@\3\2\2\2\23D\3\2\2\2\25F\3"+
		"\2\2\2\27O\3\2\2\2\31Q\3\2\2\2\33Z\3\2\2\2\35\\\3\2\2\2\37c\3\2\2\2!e"+
		"\3\2\2\2#i\3\2\2\2%n\3\2\2\2\'z\3\2\2\2)\u0086\3\2\2\2+\u0091\3\2\2\2"+
		"-\u009a\3\2\2\2/\u00a2\3\2\2\2\61\62\7=\2\2\62\4\3\2\2\2\63\64\7k\2\2"+
		"\64\65\7h\2\2\65\6\3\2\2\2\66\67\7*\2\2\67\b\3\2\2\289\7+\2\29\n\3\2\2"+
		"\2:;\7}\2\2;\f\3\2\2\2<=\7\177\2\2=\16\3\2\2\2>?\7-\2\2?\20\3\2\2\2@A"+
		"\7c\2\2AB\7f\2\2BC\7f\2\2C\22\3\2\2\2DE\7/\2\2E\24\3\2\2\2FG\7u\2\2GH"+
		"\7w\2\2HI\7d\2\2IJ\7v\2\2JK\7t\2\2KL\7c\2\2LM\7e\2\2MN\7v\2\2N\26\3\2"+
		"\2\2OP\7z\2\2P\30\3\2\2\2QR\7o\2\2RS\7w\2\2ST\7n\2\2TU\7v\2\2UV\7k\2\2"+
		"VW\7r\2\2WX\7n\2\2XY\7{\2\2Y\32\3\2\2\2Z[\7\61\2\2[\34\3\2\2\2\\]\7f\2"+
		"\2]^\7k\2\2^_\7x\2\2_`\7k\2\2`a\7f\2\2ab\7g\2\2b\36\3\2\2\2cd\7?\2\2d"+
		" \3\2\2\2ef\7?\2\2fg\7?\2\2g\"\3\2\2\2hj\t\2\2\2ih\3\2\2\2jk\3\2\2\2k"+
		"i\3\2\2\2kl\3\2\2\2l$\3\2\2\2mo\4\62;\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2"+
		"pq\3\2\2\2qr\3\2\2\2rv\7\60\2\2su\4\62;\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2"+
		"\2vw\3\2\2\2w&\3\2\2\2xv\3\2\2\2y{\4\62;\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2"+
		"\2|}\3\2\2\2}~\3\2\2\2~\u0082\7\60\2\2\177\u0081\4\62;\2\u0080\177\3\2"+
		"\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"(\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\4\62;\2\u0086\u0085\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008e\7\60\2\2\u008b\u008d\4\62;\2\u008c\u008b\3\2\2\2"+
		"\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f*\3"+
		"\2\2\2\u0090\u008e\3\2\2\2\u0091\u0095\7$\2\2\u0092\u0094\t\3\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7$\2\2\u0099"+
		",\3\2\2\2\u009a\u009e\t\4\2\2\u009b\u009d\t\5\2\2\u009c\u009b\3\2\2\2"+
		"\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f.\3"+
		"\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\t\6\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\b\30\2\2\u00a7\60\3\2\2\2\r\2kpv|\u0082\u0088\u008e\u0095"+
		"\u009e\u00a4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}