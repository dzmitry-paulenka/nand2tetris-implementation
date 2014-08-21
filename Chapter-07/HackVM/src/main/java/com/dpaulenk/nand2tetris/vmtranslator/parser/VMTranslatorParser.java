// Generated from D:/Work/!GitHub/nand2tetris-implementation/Chapter-07/HackVM/src/main/java/com/dpaulenk/nand2tetris/vmtranslator\VMTranslator.g4 by ANTLR 4.4.1-dev
package com.dpaulenk.nand2tetris.vmtranslator.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VMTranslatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__24=1, T__23=2, T__22=3, T__21=4, T__20=5, T__19=6, T__18=7, T__17=8, 
		T__16=9, T__15=10, T__14=11, T__13=12, T__12=13, T__11=14, T__10=15, T__9=16, 
		T__8=17, T__7=18, T__6=19, T__5=20, T__4=21, T__3=22, T__2=23, T__1=24, 
		T__0=25, NEWLINE=26, SYMBOL=27, NUMBER=28, COMMENTS=29, WS=30;
	public static final String[] tokenNames = {
		"<INVALID>", "'that'", "'argument'", "'local'", "'or'", "'push'", "'not'", 
		"'neg'", "'label'", "'and'", "'add'", "'static'", "'eq'", "'lt'", "'pointer'", 
		"'function'", "'constant'", "'pop'", "'sub'", "'gt'", "'return'", "'goto'", 
		"'this'", "'if-goto'", "'temp'", "'call'", "NEWLINE", "SYMBOL", "NUMBER", 
		"COMMENTS", "WS"
	};
	public static final int
		RULE_program = 0, RULE_newLineOrComments = 1, RULE_instruction = 2, RULE_binary = 3, 
		RULE_compare = 4, RULE_unary = 5, RULE_memory = 6, RULE_stackOp = 7, RULE_segment = 8, 
		RULE_flow = 9, RULE_function = 10;
	public static final String[] ruleNames = {
		"program", "newLineOrComments", "instruction", "binary", "compare", "unary", 
		"memory", "stackOp", "segment", "flow", "function"
	};

	@Override
	public String getGrammarFileName() { return "VMTranslator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VMTranslatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<NewLineOrCommentsContext> newLineOrComments() {
			return getRuleContexts(NewLineOrCommentsContext.class);
		}
		public TerminalNode EOF() { return getToken(VMTranslatorParser.EOF, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public NewLineOrCommentsContext newLineOrComments(int i) {
			return getRuleContext(NewLineOrCommentsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(23);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__20) | (1L << T__19) | (1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__13) | (1L << T__12) | (1L << T__10) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__2) | (1L << T__0))) != 0)) {
						{
						setState(22); instruction();
						}
					}

					setState(25); newLineOrComments();
					}
					} 
				}
				setState(30);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(32);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__20) | (1L << T__19) | (1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__13) | (1L << T__12) | (1L << T__10) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__2) | (1L << T__0))) != 0)) {
				{
				setState(31); instruction();
				}
			}

			setState(34); match(EOF);
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

	public static class NewLineOrCommentsContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(VMTranslatorParser.NEWLINE, 0); }
		public TerminalNode COMMENTS() { return getToken(VMTranslatorParser.COMMENTS, 0); }
		public NewLineOrCommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newLineOrComments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitNewLineOrComments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewLineOrCommentsContext newLineOrComments() throws RecognitionException {
		NewLineOrCommentsContext _localctx = new NewLineOrCommentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_newLineOrComments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==COMMENTS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class InstructionContext extends ParserRuleContext {
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public MemoryContext memory() {
			return getRuleContext(MemoryContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public FlowContext flow() {
			return getRuleContext(FlowContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(44);
			switch (_input.LA(1)) {
			case T__20:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); memory();
				}
				break;
			case T__21:
			case T__16:
			case T__15:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); binary();
				}
				break;
			case T__19:
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(40); unary();
				}
				break;
			case T__13:
			case T__12:
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(41); compare();
				}
				break;
			case T__17:
			case T__4:
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(42); flow();
				}
				break;
			case T__10:
			case T__5:
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(43); function();
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

	public static class BinaryContext extends ParserRuleContext {
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__16) | (1L << T__15) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class CompareContext extends ParserRuleContext {
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__12) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class MemoryContext extends ParserRuleContext {
		public SegmentContext segment() {
			return getRuleContext(SegmentContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(VMTranslatorParser.NUMBER, 0); }
		public StackOpContext stackOp() {
			return getRuleContext(StackOpContext.class,0);
		}
		public MemoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitMemory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemoryContext memory() throws RecognitionException {
		MemoryContext _localctx = new MemoryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_memory);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); stackOp();
			setState(53); segment();
			setState(54); match(NUMBER);
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

	public static class StackOpContext extends ParserRuleContext {
		public StackOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitStackOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackOpContext stackOp() throws RecognitionException {
		StackOpContext _localctx = new StackOpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stackOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class SegmentContext extends ParserRuleContext {
		public SegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegmentContext segment() throws RecognitionException {
		SegmentContext _localctx = new SegmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__23) | (1L << T__22) | (1L << T__14) | (1L << T__11) | (1L << T__9) | (1L << T__3) | (1L << T__1))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class FlowContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(VMTranslatorParser.SYMBOL, 0); }
		public FlowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitFlow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlowContext flow() throws RecognitionException {
		FlowContext _localctx = new FlowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_flow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__4) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(61); match(SYMBOL);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(VMTranslatorParser.SYMBOL, 0); }
		public TerminalNode NUMBER() { return getToken(VMTranslatorParser.NUMBER, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			setState(67);
			switch (_input.LA(1)) {
			case T__10:
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__0) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(64); match(SYMBOL);
				setState(65); match(NUMBER);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); match(T__5);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 H\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\3\2\5\2\32\n\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\5\2#\n\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\fF\n\f\3"+
		"\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\n\4\2\34\34\37\37\5\2\6\6\13\f\24"+
		"\24\4\2\16\17\25\25\3\2\b\t\4\2\7\7\23\23\b\2\3\5\r\r\20\20\22\22\30\30"+
		"\32\32\5\2\n\n\27\27\31\31\4\2\21\21\33\33E\2\36\3\2\2\2\4&\3\2\2\2\6"+
		".\3\2\2\2\b\60\3\2\2\2\n\62\3\2\2\2\f\64\3\2\2\2\16\66\3\2\2\2\20:\3\2"+
		"\2\2\22<\3\2\2\2\24>\3\2\2\2\26E\3\2\2\2\30\32\5\6\4\2\31\30\3\2\2\2\31"+
		"\32\3\2\2\2\32\33\3\2\2\2\33\35\5\4\3\2\34\31\3\2\2\2\35 \3\2\2\2\36\34"+
		"\3\2\2\2\36\37\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2!#\5\6\4\2\"!\3\2\2\2\""+
		"#\3\2\2\2#$\3\2\2\2$%\7\2\2\3%\3\3\2\2\2&\'\t\2\2\2\'\5\3\2\2\2(/\5\16"+
		"\b\2)/\5\b\5\2*/\5\f\7\2+/\5\n\6\2,/\5\24\13\2-/\5\26\f\2.(\3\2\2\2.)"+
		"\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\7\3\2\2\2\60\61\t\3"+
		"\2\2\61\t\3\2\2\2\62\63\t\4\2\2\63\13\3\2\2\2\64\65\t\5\2\2\65\r\3\2\2"+
		"\2\66\67\5\20\t\2\678\5\22\n\289\7\36\2\29\17\3\2\2\2:;\t\6\2\2;\21\3"+
		"\2\2\2<=\t\7\2\2=\23\3\2\2\2>?\t\b\2\2?@\7\35\2\2@\25\3\2\2\2AB\t\t\2"+
		"\2BC\7\35\2\2CF\7\36\2\2DF\7\26\2\2EA\3\2\2\2ED\3\2\2\2F\27\3\2\2\2\7"+
		"\31\36\".E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}