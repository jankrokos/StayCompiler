// Generated from C:/Users/jankr/IdeaProjects/StayCompiler/src/main/antlr/StayLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class StayLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, ADD=2, SUB=3, MUL=4, DIV=5, GT=6, LT=7, GE=8, LE=9, EQ=10, AND=11, 
		OR=12, NOT=13, COMMA=14, DOT=15, SEMI=16, LPAREN=17, RPAREN=18, LCURLY=19, 
		RCURLY=20, INT_TYPE=21, FLOAT_TYPE=22, STRING_TYPE=23, PRINT=24, READ=25, 
		INT=26, STRING=27, FLOAT=28, ID=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSIGN", "ADD", "SUB", "MUL", "DIV", "GT", "LT", "GE", "LE", "EQ", "AND", 
			"OR", "NOT", "COMMA", "DOT", "SEMI", "LPAREN", "RPAREN", "LCURLY", "RCURLY", 
			"INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", "PRINT", "READ", "INT", "STRING", 
			"FLOAT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'and'", "'or'", "'not'", "','", "'.'", "';'", "'('", "')'", 
			"'{'", "'}'", "'int'", "'float'", "'str'", "'print'", "'read'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "ADD", "SUB", "MUL", "DIV", "GT", "LT", "GE", "LE", "EQ", 
			"AND", "OR", "NOT", "COMMA", "DOT", "SEMI", "LPAREN", "RPAREN", "LCURLY", 
			"RCURLY", "INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", "PRINT", "READ", "INT", 
			"STRING", "FLOAT", "ID", "WS"
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


	public StayLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StayLexer.g4"; }

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
		"\u0004\u0000\u001e\u00ad\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0004\u0019\u0088\b\u0019\u000b\u0019\f"+
		"\u0019\u0089\u0001\u001a\u0001\u001a\u0005\u001a\u008e\b\u001a\n\u001a"+
		"\f\u001a\u0091\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0004\u001b"+
		"\u0096\b\u001b\u000b\u001b\f\u001b\u0097\u0001\u001b\u0001\u001b\u0004"+
		"\u001b\u009c\b\u001b\u000b\u001b\f\u001b\u009d\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u00a2\b\u001c\n\u001c\f\u001c\u00a5\t\u001c\u0001\u001d\u0004"+
		"\u001d\u00a8\b\u001d\u000b\u001d\f\u001d\u00a9\u0001\u001d\u0001\u001d"+
		"\u0000\u0000\u001e\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e\u0001"+
		"\u0000\u0005\u0001\u000009\u0002\u0000\"\"\\\\\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0003\u0000\t\n\f\r  \u00b2\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0001=\u0001\u0000\u0000\u0000\u0003?"+
		"\u0001\u0000\u0000\u0000\u0005A\u0001\u0000\u0000\u0000\u0007C\u0001\u0000"+
		"\u0000\u0000\tE\u0001\u0000\u0000\u0000\u000bG\u0001\u0000\u0000\u0000"+
		"\rI\u0001\u0000\u0000\u0000\u000fK\u0001\u0000\u0000\u0000\u0011N\u0001"+
		"\u0000\u0000\u0000\u0013Q\u0001\u0000\u0000\u0000\u0015T\u0001\u0000\u0000"+
		"\u0000\u0017X\u0001\u0000\u0000\u0000\u0019[\u0001\u0000\u0000\u0000\u001b"+
		"_\u0001\u0000\u0000\u0000\u001da\u0001\u0000\u0000\u0000\u001fc\u0001"+
		"\u0000\u0000\u0000!e\u0001\u0000\u0000\u0000#g\u0001\u0000\u0000\u0000"+
		"%i\u0001\u0000\u0000\u0000\'k\u0001\u0000\u0000\u0000)m\u0001\u0000\u0000"+
		"\u0000+q\u0001\u0000\u0000\u0000-w\u0001\u0000\u0000\u0000/{\u0001\u0000"+
		"\u0000\u00001\u0081\u0001\u0000\u0000\u00003\u0087\u0001\u0000\u0000\u0000"+
		"5\u008b\u0001\u0000\u0000\u00007\u0095\u0001\u0000\u0000\u00009\u009f"+
		"\u0001\u0000\u0000\u0000;\u00a7\u0001\u0000\u0000\u0000=>\u0005=\u0000"+
		"\u0000>\u0002\u0001\u0000\u0000\u0000?@\u0005+\u0000\u0000@\u0004\u0001"+
		"\u0000\u0000\u0000AB\u0005-\u0000\u0000B\u0006\u0001\u0000\u0000\u0000"+
		"CD\u0005*\u0000\u0000D\b\u0001\u0000\u0000\u0000EF\u0005/\u0000\u0000"+
		"F\n\u0001\u0000\u0000\u0000GH\u0005>\u0000\u0000H\f\u0001\u0000\u0000"+
		"\u0000IJ\u0005<\u0000\u0000J\u000e\u0001\u0000\u0000\u0000KL\u0005>\u0000"+
		"\u0000LM\u0005=\u0000\u0000M\u0010\u0001\u0000\u0000\u0000NO\u0005<\u0000"+
		"\u0000OP\u0005=\u0000\u0000P\u0012\u0001\u0000\u0000\u0000QR\u0005=\u0000"+
		"\u0000RS\u0005=\u0000\u0000S\u0014\u0001\u0000\u0000\u0000TU\u0005a\u0000"+
		"\u0000UV\u0005n\u0000\u0000VW\u0005d\u0000\u0000W\u0016\u0001\u0000\u0000"+
		"\u0000XY\u0005o\u0000\u0000YZ\u0005r\u0000\u0000Z\u0018\u0001\u0000\u0000"+
		"\u0000[\\\u0005n\u0000\u0000\\]\u0005o\u0000\u0000]^\u0005t\u0000\u0000"+
		"^\u001a\u0001\u0000\u0000\u0000_`\u0005,\u0000\u0000`\u001c\u0001\u0000"+
		"\u0000\u0000ab\u0005.\u0000\u0000b\u001e\u0001\u0000\u0000\u0000cd\u0005"+
		";\u0000\u0000d \u0001\u0000\u0000\u0000ef\u0005(\u0000\u0000f\"\u0001"+
		"\u0000\u0000\u0000gh\u0005)\u0000\u0000h$\u0001\u0000\u0000\u0000ij\u0005"+
		"{\u0000\u0000j&\u0001\u0000\u0000\u0000kl\u0005}\u0000\u0000l(\u0001\u0000"+
		"\u0000\u0000mn\u0005i\u0000\u0000no\u0005n\u0000\u0000op\u0005t\u0000"+
		"\u0000p*\u0001\u0000\u0000\u0000qr\u0005f\u0000\u0000rs\u0005l\u0000\u0000"+
		"st\u0005o\u0000\u0000tu\u0005a\u0000\u0000uv\u0005t\u0000\u0000v,\u0001"+
		"\u0000\u0000\u0000wx\u0005s\u0000\u0000xy\u0005t\u0000\u0000yz\u0005r"+
		"\u0000\u0000z.\u0001\u0000\u0000\u0000{|\u0005p\u0000\u0000|}\u0005r\u0000"+
		"\u0000}~\u0005i\u0000\u0000~\u007f\u0005n\u0000\u0000\u007f\u0080\u0005"+
		"t\u0000\u0000\u00800\u0001\u0000\u0000\u0000\u0081\u0082\u0005r\u0000"+
		"\u0000\u0082\u0083\u0005e\u0000\u0000\u0083\u0084\u0005a\u0000\u0000\u0084"+
		"\u0085\u0005d\u0000\u0000\u00852\u0001\u0000\u0000\u0000\u0086\u0088\u0007"+
		"\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a4\u0001\u0000\u0000\u0000\u008b\u008f\u0005\""+
		"\u0000\u0000\u008c\u008e\b\u0001\u0000\u0000\u008d\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005\"\u0000\u0000"+
		"\u00936\u0001\u0000\u0000\u0000\u0094\u0096\u0007\u0000\u0000\u0000\u0095"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0003\u001d\u000e\u0000\u009a"+
		"\u009c\u0007\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e8\u0001\u0000\u0000\u0000\u009f\u00a3"+
		"\u0007\u0002\u0000\u0000\u00a0\u00a2\u0007\u0003\u0000\u0000\u00a1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4:\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a8\u0007"+
		"\u0004\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0006"+
		"\u001d\u0000\u0000\u00ac<\u0001\u0000\u0000\u0000\u0007\u0000\u0089\u008f"+
		"\u0097\u009d\u00a3\u00a9\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}