// Generated from /home/nejento/prk_lang/nlang.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class nlangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, TYPE=6, BINDEC=7, DECBIN=8, NON_ZERO_DIGIT=9, 
		DIGIT=10, INT_DEFAULT=11, INT=12, BINARY_DEFAULT=13, BINARY=14, STRING=15, 
		COMMENT=16, NEWLINE=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "TYPE", "BINDEC", "DECBIN", "NON_ZERO_DIGIT", 
			"DIGIT", "INT_DEFAULT", "INT", "BINARY_DEFAULT", "BINARY", "STRING", 
			"COMMENT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'+'", "'%'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "TYPE", "BINDEC", "DECBIN", "NON_ZERO_DIGIT", 
			"DIGIT", "INT_DEFAULT", "INT", "BINARY_DEFAULT", "BINARY", "STRING", 
			"COMMENT", "NEWLINE", "WS"
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


	public nlangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "nlang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\78\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\5\13T\n\13\3"+
		"\f\3\f\7\fX\n\f\f\f\16\f[\13\f\3\r\3\r\5\r_\n\r\3\16\3\16\3\16\6\16d\n"+
		"\16\r\16\16\16e\3\17\3\17\5\17j\n\17\3\20\3\20\7\20n\n\20\f\20\16\20q"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21y\n\21\f\21\16\21|\13\21\3\21"+
		"\3\21\3\21\3\22\6\22\u0082\n\22\r\22\16\22\u0083\3\23\6\23\u0087\n\23"+
		"\r\23\16\23\u0088\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\6\3\2$$\4\2#"+
		"#%%\4\2\f\f\17\17\4\2\13\13\"\"\2\u0099\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)"+
		"\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21"+
		"D\3\2\2\2\23O\3\2\2\2\25S\3\2\2\2\27U\3\2\2\2\31^\3\2\2\2\33`\3\2\2\2"+
		"\35i\3\2\2\2\37k\3\2\2\2!t\3\2\2\2#\u0081\3\2\2\2%\u0086\3\2\2\2\'(\7"+
		",\2\2(\4\3\2\2\2)*\7-\2\2*\6\3\2\2\2+,\7\'\2\2,\b\3\2\2\2-.\7*\2\2.\n"+
		"\3\2\2\2/\60\7+\2\2\60\f\3\2\2\2\618\5\31\r\2\628\5\35\17\2\638\5\37\20"+
		"\2\648\5!\21\2\658\5\17\b\2\668\5\21\t\2\67\61\3\2\2\2\67\62\3\2\2\2\67"+
		"\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\16\3\2\2\29:\7"+
		"d\2\2:;\7k\2\2;<\7p\2\2<=\7f\2\2=>\7g\2\2>?\7e\2\2?@\7*\2\2@A\3\2\2\2"+
		"AB\5\35\17\2BC\7+\2\2C\20\3\2\2\2DE\7f\2\2EF\7g\2\2FG\7e\2\2GH\7d\2\2"+
		"HI\7k\2\2IJ\7p\2\2JK\7*\2\2KL\3\2\2\2LM\5\31\r\2MN\7+\2\2N\22\3\2\2\2"+
		"OP\4\63;\2P\24\3\2\2\2QT\7\62\2\2RT\5\23\n\2SQ\3\2\2\2SR\3\2\2\2T\26\3"+
		"\2\2\2UY\5\23\n\2VX\5\25\13\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2"+
		"Z\30\3\2\2\2[Y\3\2\2\2\\_\5\27\f\2]_\5\17\b\2^\\\3\2\2\2^]\3\2\2\2_\32"+
		"\3\2\2\2`a\7d\2\2ac\4\62\63\2bd\4\62\63\2cb\3\2\2\2de\3\2\2\2ec\3\2\2"+
		"\2ef\3\2\2\2f\34\3\2\2\2gj\5\33\16\2hj\5\21\t\2ig\3\2\2\2ih\3\2\2\2j\36"+
		"\3\2\2\2ko\7$\2\2ln\n\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr"+
		"\3\2\2\2qo\3\2\2\2rs\7$\2\2s \3\2\2\2tu\7%\2\2uv\7#\2\2vz\3\2\2\2wy\n"+
		"\3\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7"+
		"#\2\2~\177\7%\2\2\177\"\3\2\2\2\u0080\u0082\t\4\2\2\u0081\u0080\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084$"+
		"\3\2\2\2\u0085\u0087\t\5\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\23"+
		"\2\2\u008b&\3\2\2\2\r\2\67SY^eioz\u0083\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}