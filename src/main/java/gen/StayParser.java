// Generated from C:/Users/jankr/IdeaProjects/StayCompiler/src/main/antlr/StayParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class StayParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, ADD=2, SUB=3, MUL=4, DIV=5, GT=6, LT=7, GE=8, LE=9, EQ=10, AND=11, 
		OR=12, NOT=13, COMMA=14, DOT=15, SEMI=16, LPAREN=17, RPAREN=18, LCURLY=19, 
		RCURLY=20, INT_TYPE=21, FLOAT_TYPE=22, STRING_TYPE=23, PRINT=24, READ=25, 
		INT=26, STRING=27, FLOAT=28, ID=29, WS=30;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_expr = 2, RULE_assignment = 3, RULE_printStat = 4, 
		RULE_readStat = 5, RULE_intAssignment = 6, RULE_floatAssignment = 7, RULE_stringAssignment = 8, 
		RULE_printValue = 9, RULE_intValue = 10, RULE_arithmeticOp = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "expr", "assignment", "printStat", "readStat", "intAssignment", 
			"floatAssignment", "stringAssignment", "printValue", "intValue", "arithmeticOp"
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

	@Override
	public String getGrammarFileName() { return "StayParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StayParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65011712L) != 0)) {
				{
				{
				setState(24);
				stat();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStatContext printStat() {
			return getRuleContext(PrintStatContext.class,0);
		}
		public ReadStatContext readStat() {
			return getRuleContext(ReadStatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				expr();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				printStat();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				readStat();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ExprContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			assignment();
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
	public static class AssignmentContext extends ParserRuleContext {
		public IntAssignmentContext intAssignment() {
			return getRuleContext(IntAssignmentContext.class,0);
		}
		public FloatAssignmentContext floatAssignment() {
			return getRuleContext(FloatAssignmentContext.class,0);
		}
		public StringAssignmentContext stringAssignment() {
			return getRuleContext(StringAssignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				intAssignment();
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				floatAssignment();
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				stringAssignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class PrintStatContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(StayParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(StayParser.LPAREN, 0); }
		public PrintValueContext printValue() {
			return getRuleContext(PrintValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StayParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(StayParser.SEMI, 0); }
		public PrintStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterPrintStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitPrintStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitPrintStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatContext printStat() throws RecognitionException {
		PrintStatContext _localctx = new PrintStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(PRINT);
			setState(43);
			match(LPAREN);
			setState(44);
			printValue();
			setState(45);
			match(RPAREN);
			setState(46);
			match(SEMI);
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
	public static class ReadStatContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(StayParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(StayParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(StayParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(StayParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(StayParser.SEMI, 0); }
		public ReadStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterReadStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitReadStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitReadStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStatContext readStat() throws RecognitionException {
		ReadStatContext _localctx = new ReadStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_readStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(READ);
			setState(49);
			match(LPAREN);
			setState(50);
			match(ID);
			setState(51);
			match(RPAREN);
			setState(52);
			match(SEMI);
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
	public static class IntAssignmentContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(StayParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(StayParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(StayParser.ASSIGN, 0); }
		public IntValueContext intValue() {
			return getRuleContext(IntValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StayParser.SEMI, 0); }
		public IntAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterIntAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitIntAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitIntAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntAssignmentContext intAssignment() throws RecognitionException {
		IntAssignmentContext _localctx = new IntAssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_intAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(INT_TYPE);
			setState(55);
			match(ID);
			setState(56);
			match(ASSIGN);
			setState(57);
			intValue();
			setState(58);
			match(SEMI);
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
	public static class FloatAssignmentContext extends ParserRuleContext {
		public TerminalNode FLOAT_TYPE() { return getToken(StayParser.FLOAT_TYPE, 0); }
		public TerminalNode ID() { return getToken(StayParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(StayParser.ASSIGN, 0); }
		public TerminalNode FLOAT() { return getToken(StayParser.FLOAT, 0); }
		public TerminalNode SEMI() { return getToken(StayParser.SEMI, 0); }
		public FloatAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterFloatAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitFloatAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitFloatAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatAssignmentContext floatAssignment() throws RecognitionException {
		FloatAssignmentContext _localctx = new FloatAssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_floatAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(FLOAT_TYPE);
			setState(61);
			match(ID);
			setState(62);
			match(ASSIGN);
			setState(63);
			match(FLOAT);
			setState(64);
			match(SEMI);
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
	public static class StringAssignmentContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(StayParser.STRING_TYPE, 0); }
		public TerminalNode ID() { return getToken(StayParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(StayParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(StayParser.STRING, 0); }
		public TerminalNode SEMI() { return getToken(StayParser.SEMI, 0); }
		public StringAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterStringAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitStringAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitStringAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringAssignmentContext stringAssignment() throws RecognitionException {
		StringAssignmentContext _localctx = new StringAssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(STRING_TYPE);
			setState(67);
			match(ID);
			setState(68);
			match(ASSIGN);
			setState(69);
			match(STRING);
			setState(70);
			match(SEMI);
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
	public static class PrintValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(StayParser.INT, 0); }
		public TerminalNode STRING() { return getToken(StayParser.STRING, 0); }
		public TerminalNode ID() { return getToken(StayParser.ID, 0); }
		public PrintValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterPrintValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitPrintValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitPrintValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintValueContext printValue() throws RecognitionException {
		PrintValueContext _localctx = new PrintValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 738197504L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
	public static class IntValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(StayParser.INT, 0); }
		public TerminalNode ID() { return getToken(StayParser.ID, 0); }
		public ArithmeticOpContext arithmeticOp() {
			return getRuleContext(ArithmeticOpContext.class,0);
		}
		public IntValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterIntValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitIntValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitIntValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntValueContext intValue() throws RecognitionException {
		IntValueContext _localctx = new IntValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_intValue);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				arithmeticOp();
				}
				break;
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
	public static class ArithmeticOpContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(StayParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(StayParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(StayParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StayParser.ID, i);
		}
		public TerminalNode ADD() { return getToken(StayParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(StayParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(StayParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(StayParser.DIV, 0); }
		public ArithmeticOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterArithmeticOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitArithmeticOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitArithmeticOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOpContext arithmeticOp() throws RecognitionException {
		ArithmeticOpContext _localctx = new ArithmeticOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arithmeticOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\u0004\u0001\u001eT\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003)\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0003\nN\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0000\u0003\u0002\u0000\u001a\u001b\u001d\u001d\u0002\u0000\u001a"+
		"\u001a\u001d\u001d\u0001\u0000\u0002\u0005N\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0002!\u0001\u0000\u0000\u0000\u0004#\u0001\u0000\u0000\u0000\u0006"+
		"(\u0001\u0000\u0000\u0000\b*\u0001\u0000\u0000\u0000\n0\u0001\u0000\u0000"+
		"\u0000\f6\u0001\u0000\u0000\u0000\u000e<\u0001\u0000\u0000\u0000\u0010"+
		"B\u0001\u0000\u0000\u0000\u0012H\u0001\u0000\u0000\u0000\u0014M\u0001"+
		"\u0000\u0000\u0000\u0016O\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002"+
		"\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000"+
		"\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000"+
		"\u0000\u0000\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001e\"\u0003\u0004\u0002\u0000\u001f\"\u0003\b\u0004\u0000"+
		" \"\u0003\n\u0005\u0000!\u001e\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000! \u0001\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000"+
		"#$\u0003\u0006\u0003\u0000$\u0005\u0001\u0000\u0000\u0000%)\u0003\f\u0006"+
		"\u0000&)\u0003\u000e\u0007\u0000\')\u0003\u0010\b\u0000(%\u0001\u0000"+
		"\u0000\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0007"+
		"\u0001\u0000\u0000\u0000*+\u0005\u0018\u0000\u0000+,\u0005\u0011\u0000"+
		"\u0000,-\u0003\u0012\t\u0000-.\u0005\u0012\u0000\u0000./\u0005\u0010\u0000"+
		"\u0000/\t\u0001\u0000\u0000\u000001\u0005\u0019\u0000\u000012\u0005\u0011"+
		"\u0000\u000023\u0005\u001d\u0000\u000034\u0005\u0012\u0000\u000045\u0005"+
		"\u0010\u0000\u00005\u000b\u0001\u0000\u0000\u000067\u0005\u0015\u0000"+
		"\u000078\u0005\u001d\u0000\u000089\u0005\u0001\u0000\u00009:\u0003\u0014"+
		"\n\u0000:;\u0005\u0010\u0000\u0000;\r\u0001\u0000\u0000\u0000<=\u0005"+
		"\u0016\u0000\u0000=>\u0005\u001d\u0000\u0000>?\u0005\u0001\u0000\u0000"+
		"?@\u0005\u001c\u0000\u0000@A\u0005\u0010\u0000\u0000A\u000f\u0001\u0000"+
		"\u0000\u0000BC\u0005\u0017\u0000\u0000CD\u0005\u001d\u0000\u0000DE\u0005"+
		"\u0001\u0000\u0000EF\u0005\u001b\u0000\u0000FG\u0005\u0010\u0000\u0000"+
		"G\u0011\u0001\u0000\u0000\u0000HI\u0007\u0000\u0000\u0000I\u0013\u0001"+
		"\u0000\u0000\u0000JN\u0005\u001a\u0000\u0000KN\u0005\u001d\u0000\u0000"+
		"LN\u0003\u0016\u000b\u0000MJ\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000ML\u0001\u0000\u0000\u0000N\u0015\u0001\u0000\u0000\u0000OP\u0007"+
		"\u0001\u0000\u0000PQ\u0007\u0002\u0000\u0000QR\u0007\u0001\u0000\u0000"+
		"R\u0017\u0001\u0000\u0000\u0000\u0004\u001b!(M";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}