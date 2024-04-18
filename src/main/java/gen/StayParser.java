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
		OR=12, NOT=13, TRUE=14, FALSE=15, COMMA=16, DOT=17, SEMI=18, LPAREN=19, 
		RPAREN=20, LCURLY=21, RCURLY=22, INT_TYPE=23, FLOAT_TYPE=24, STRING_TYPE=25, 
		PRINT=26, READ=27, IF=28, REPEAT=29, TIMES=30, INT=31, STRING=32, FLOAT=33, 
		ID=34, WS=35;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_stat = 2, RULE_expr = 3, RULE_assignment = 4, 
		RULE_printStat = 5, RULE_readStat = 6, RULE_ifStat = 7, RULE_loopStat = 8, 
		RULE_repetitions = 9, RULE_blockif = 10, RULE_boolValue = 11, RULE_intAssignment = 12, 
		RULE_floatAssignment = 13, RULE_stringAssignment = 14, RULE_printValue = 15, 
		RULE_intValue = 16, RULE_arithmeticOp = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "stat", "expr", "assignment", "printStat", "readStat", 
			"ifStat", "loopStat", "repetitions", "blockif", "boolValue", "intAssignment", 
			"floatAssignment", "stringAssignment", "printValue", "intValue", "arithmeticOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'and'", "'or'", "'not'", "'true'", "'false'", "','", "'.'", 
			"';'", "'('", "')'", "'{'", "'}'", "'int'", "'float'", "'str'", "'print'", 
			"'read'", "'if'", "'repeat'", "'times'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "ADD", "SUB", "MUL", "DIV", "GT", "LT", "GE", "LE", "EQ", 
			"AND", "OR", "NOT", "TRUE", "FALSE", "COMMA", "DOT", "SEMI", "LPAREN", 
			"RPAREN", "LCURLY", "RCURLY", "INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", 
			"PRINT", "READ", "IF", "REPEAT", "TIMES", "INT", "STRING", "FLOAT", "ID", 
			"WS"
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			block();
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1065353216L) != 0)) {
				{
				{
				setState(38);
				stat();
				}
				}
				setState(43);
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
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public LoopStatContext loopStat() {
			return getRuleContext(LoopStatContext.class,0);
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
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				expr();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				printStat();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				readStat();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				ifStat();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				loopStat();
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
		enterRule(_localctx, 6, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
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
		enterRule(_localctx, 8, RULE_assignment);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				intAssignment();
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				floatAssignment();
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
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
		enterRule(_localctx, 10, RULE_printStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(PRINT);
			setState(59);
			match(LPAREN);
			setState(60);
			printValue();
			setState(61);
			match(RPAREN);
			setState(62);
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
		enterRule(_localctx, 12, RULE_readStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(READ);
			setState(65);
			match(LPAREN);
			setState(66);
			match(ID);
			setState(67);
			match(RPAREN);
			setState(68);
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
	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(StayParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(StayParser.LPAREN, 0); }
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StayParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(StayParser.LCURLY, 0); }
		public BlockifContext blockif() {
			return getRuleContext(BlockifContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(StayParser.RCURLY, 0); }
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IF);
			setState(71);
			match(LPAREN);
			setState(72);
			boolValue();
			setState(73);
			match(RPAREN);
			setState(74);
			match(LCURLY);
			setState(75);
			blockif();
			setState(76);
			match(RCURLY);
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
	public static class LoopStatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(StayParser.REPEAT, 0); }
		public RepetitionsContext repetitions() {
			return getRuleContext(RepetitionsContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(StayParser.TIMES, 0); }
		public TerminalNode LCURLY() { return getToken(StayParser.LCURLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(StayParser.RCURLY, 0); }
		public LoopStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterLoopStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitLoopStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitLoopStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatContext loopStat() throws RecognitionException {
		LoopStatContext _localctx = new LoopStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loopStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(REPEAT);
			setState(79);
			repetitions();
			setState(80);
			match(TIMES);
			setState(81);
			match(LCURLY);
			setState(82);
			block();
			setState(83);
			match(RCURLY);
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
	public static class RepetitionsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(StayParser.INT, 0); }
		public RepetitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterRepetitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitRepetitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitRepetitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetitionsContext repetitions() throws RecognitionException {
		RepetitionsContext _localctx = new RepetitionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_repetitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(INT);
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
	public static class BlockifContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterBlockif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitBlockif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitBlockif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockifContext blockif() throws RecognitionException {
		BlockifContext _localctx = new BlockifContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			block();
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
	public static class BoolValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StayParser.ID, 0); }
		public TerminalNode EQ() { return getToken(StayParser.EQ, 0); }
		public TerminalNode INT() { return getToken(StayParser.INT, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StayParserListener ) ((StayParserListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StayParserVisitor ) return ((StayParserVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_boolValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ID);
			setState(90);
			match(EQ);
			setState(91);
			match(INT);
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
		enterRule(_localctx, 24, RULE_intAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(INT_TYPE);
			setState(94);
			match(ID);
			setState(95);
			match(ASSIGN);
			setState(96);
			intValue();
			setState(97);
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
		enterRule(_localctx, 26, RULE_floatAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(FLOAT_TYPE);
			setState(100);
			match(ID);
			setState(101);
			match(ASSIGN);
			setState(102);
			match(FLOAT);
			setState(103);
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
		enterRule(_localctx, 28, RULE_stringAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(STRING_TYPE);
			setState(106);
			match(ID);
			setState(107);
			match(ASSIGN);
			setState(108);
			match(STRING);
			setState(109);
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
		enterRule(_localctx, 30, RULE_printValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 23622320128L) != 0)) ) {
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
		enterRule(_localctx, 32, RULE_intValue);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
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
		enterRule(_localctx, 34, RULE_arithmeticOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(120);
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
		"\u0004\u0001#{\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002"+
		"\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0005\u0001(\b\u0001\n\u0001\f\u0001+\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00022\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00049\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010u\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"\u0000\u0003\u0002\u0000\u001f \"\"\u0002\u0000\u001f\u001f\""+
		"\"\u0001\u0000\u0002\u0005q\u0000$\u0001\u0000\u0000\u0000\u0002)\u0001"+
		"\u0000\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000"+
		"\u0000\b8\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000\f@\u0001"+
		"\u0000\u0000\u0000\u000eF\u0001\u0000\u0000\u0000\u0010N\u0001\u0000\u0000"+
		"\u0000\u0012U\u0001\u0000\u0000\u0000\u0014W\u0001\u0000\u0000\u0000\u0016"+
		"Y\u0001\u0000\u0000\u0000\u0018]\u0001\u0000\u0000\u0000\u001ac\u0001"+
		"\u0000\u0000\u0000\u001ci\u0001\u0000\u0000\u0000\u001eo\u0001\u0000\u0000"+
		"\u0000 t\u0001\u0000\u0000\u0000\"v\u0001\u0000\u0000\u0000$%\u0003\u0002"+
		"\u0001\u0000%\u0001\u0001\u0000\u0000\u0000&(\u0003\u0004\u0002\u0000"+
		"\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*\u0003\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000,2\u0003\u0006\u0003\u0000-2\u0003\n\u0005\u0000.2\u0003"+
		"\f\u0006\u0000/2\u0003\u000e\u0007\u000002\u0003\u0010\b\u00001,\u0001"+
		"\u0000\u0000\u00001-\u0001\u0000\u0000\u00001.\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0005\u0001\u0000"+
		"\u0000\u000034\u0003\b\u0004\u00004\u0007\u0001\u0000\u0000\u000059\u0003"+
		"\u0018\f\u000069\u0003\u001a\r\u000079\u0003\u001c\u000e\u000085\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u000087\u0001\u0000\u0000\u0000"+
		"9\t\u0001\u0000\u0000\u0000:;\u0005\u001a\u0000\u0000;<\u0005\u0013\u0000"+
		"\u0000<=\u0003\u001e\u000f\u0000=>\u0005\u0014\u0000\u0000>?\u0005\u0012"+
		"\u0000\u0000?\u000b\u0001\u0000\u0000\u0000@A\u0005\u001b\u0000\u0000"+
		"AB\u0005\u0013\u0000\u0000BC\u0005\"\u0000\u0000CD\u0005\u0014\u0000\u0000"+
		"DE\u0005\u0012\u0000\u0000E\r\u0001\u0000\u0000\u0000FG\u0005\u001c\u0000"+
		"\u0000GH\u0005\u0013\u0000\u0000HI\u0003\u0016\u000b\u0000IJ\u0005\u0014"+
		"\u0000\u0000JK\u0005\u0015\u0000\u0000KL\u0003\u0014\n\u0000LM\u0005\u0016"+
		"\u0000\u0000M\u000f\u0001\u0000\u0000\u0000NO\u0005\u001d\u0000\u0000"+
		"OP\u0003\u0012\t\u0000PQ\u0005\u001e\u0000\u0000QR\u0005\u0015\u0000\u0000"+
		"RS\u0003\u0002\u0001\u0000ST\u0005\u0016\u0000\u0000T\u0011\u0001\u0000"+
		"\u0000\u0000UV\u0005\u001f\u0000\u0000V\u0013\u0001\u0000\u0000\u0000"+
		"WX\u0003\u0002\u0001\u0000X\u0015\u0001\u0000\u0000\u0000YZ\u0005\"\u0000"+
		"\u0000Z[\u0005\n\u0000\u0000[\\\u0005\u001f\u0000\u0000\\\u0017\u0001"+
		"\u0000\u0000\u0000]^\u0005\u0017\u0000\u0000^_\u0005\"\u0000\u0000_`\u0005"+
		"\u0001\u0000\u0000`a\u0003 \u0010\u0000ab\u0005\u0012\u0000\u0000b\u0019"+
		"\u0001\u0000\u0000\u0000cd\u0005\u0018\u0000\u0000de\u0005\"\u0000\u0000"+
		"ef\u0005\u0001\u0000\u0000fg\u0005!\u0000\u0000gh\u0005\u0012\u0000\u0000"+
		"h\u001b\u0001\u0000\u0000\u0000ij\u0005\u0019\u0000\u0000jk\u0005\"\u0000"+
		"\u0000kl\u0005\u0001\u0000\u0000lm\u0005 \u0000\u0000mn\u0005\u0012\u0000"+
		"\u0000n\u001d\u0001\u0000\u0000\u0000op\u0007\u0000\u0000\u0000p\u001f"+
		"\u0001\u0000\u0000\u0000qu\u0005\u001f\u0000\u0000ru\u0005\"\u0000\u0000"+
		"su\u0003\"\u0011\u0000tq\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"ts\u0001\u0000\u0000\u0000u!\u0001\u0000\u0000\u0000vw\u0007\u0001\u0000"+
		"\u0000wx\u0007\u0002\u0000\u0000xy\u0007\u0001\u0000\u0000y#\u0001\u0000"+
		"\u0000\u0000\u0004)18t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}