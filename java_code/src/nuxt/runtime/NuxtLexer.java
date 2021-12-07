// Generated from Nuxt.g4 by ANTLR 4.9.3

    package nuxt.runtime;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NuxtLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, USE=5, SERVICE=6, JSON=7, XML=8, ANY=9, 
		PRINT=10, VARIABLE=11, ALPHA=12, DIGIT=13, CODE=14, NEWLINE=15, WS=16, 
		ANYTHING=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "USE", "SERVICE", "JSON", "XML", "ANY", 
			"PRINT", "VARIABLE", "ALPHA", "DIGIT", "CODE", "NEWLINE", "WS", "ANYTHING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'${'", "'}'", "'/'", "'as'", "'use'", "'service'", "'json'", "'xml'", 
			null, "'@print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "USE", "SERVICE", "JSON", "XML", "ANY", 
			"PRINT", "VARIABLE", "ALPHA", "DIGIT", "CODE", "NEWLINE", "WS", "ANYTHING"
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


	public NuxtLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Nuxt.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\fQ\n\f\f\f\16\fT\13\f"+
		"\3\r\3\r\3\16\3\16\3\17\6\17[\n\17\r\17\16\17\\\3\17\5\17`\n\17\3\17\3"+
		"\17\5\17d\n\17\3\17\6\17g\n\17\r\17\16\17h\3\17\6\17l\n\17\r\17\16\17"+
		"m\5\17p\n\17\3\20\6\20s\n\20\r\20\16\20t\3\20\3\20\3\21\6\21z\n\21\r\21"+
		"\16\21{\3\21\3\21\3\22\6\22\u0081\n\22\r\22\16\22\u0082\3\22\3\22\2\2"+
		"\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23\3\2\n\3\2\"\"\5\2C\\aac|\3\2\62;\7\2*+\60\60\62;B\\"+
		"c|\4\2}}\177\177\4\2\f\f\17\17\5\2\13\f\17\17\"\"\6\2&&BB}}\177\177\2"+
		"\u0090\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\3%\3\2\2\2\5(\3\2\2\2\7*\3\2\2\2\t,\3\2\2\2\13/\3\2\2\2\r"+
		"\63\3\2\2\2\17;\3\2\2\2\21@\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27M\3\2\2"+
		"\2\31U\3\2\2\2\33W\3\2\2\2\35o\3\2\2\2\37r\3\2\2\2!y\3\2\2\2#\u0080\3"+
		"\2\2\2%&\7&\2\2&\'\7}\2\2\'\4\3\2\2\2()\7\177\2\2)\6\3\2\2\2*+\7\61\2"+
		"\2+\b\3\2\2\2,-\7c\2\2-.\7u\2\2.\n\3\2\2\2/\60\7w\2\2\60\61\7u\2\2\61"+
		"\62\7g\2\2\62\f\3\2\2\2\63\64\7u\2\2\64\65\7g\2\2\65\66\7t\2\2\66\67\7"+
		"x\2\2\678\7k\2\289\7e\2\29:\7g\2\2:\16\3\2\2\2;<\7l\2\2<=\7u\2\2=>\7q"+
		"\2\2>?\7p\2\2?\20\3\2\2\2@A\7z\2\2AB\7o\2\2BC\7n\2\2C\22\3\2\2\2DE\n\2"+
		"\2\2E\24\3\2\2\2FG\7B\2\2GH\7r\2\2HI\7t\2\2IJ\7k\2\2JK\7p\2\2KL\7v\2\2"+
		"L\26\3\2\2\2MR\5\31\r\2NQ\5\31\r\2OQ\5\33\16\2PN\3\2\2\2PO\3\2\2\2QT\3"+
		"\2\2\2RP\3\2\2\2RS\3\2\2\2S\30\3\2\2\2TR\3\2\2\2UV\t\3\2\2V\32\3\2\2\2"+
		"WX\t\4\2\2X\34\3\2\2\2Y[\t\5\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3"+
		"\2\2\2]_\3\2\2\2^`\5!\21\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\7?\2\2bd\5"+
		"!\21\2cb\3\2\2\2cd\3\2\2\2df\3\2\2\2eg\n\6\2\2fe\3\2\2\2gh\3\2\2\2hf\3"+
		"\2\2\2hi\3\2\2\2ip\3\2\2\2jl\t\5\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3"+
		"\2\2\2np\3\2\2\2oZ\3\2\2\2ok\3\2\2\2p\36\3\2\2\2qs\t\7\2\2rq\3\2\2\2s"+
		"t\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\20\2\2w \3\2\2\2xz\t\b\2\2"+
		"yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\b\21\2\2~\"\3\2\2"+
		"\2\177\u0081\n\t\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\5\37\20\2"+
		"\u0085$\3\2\2\2\20\2PRZ\\_chkmot{\u0082\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}