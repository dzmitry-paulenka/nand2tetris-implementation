// Generated from D:/Work/!GitHub/nand2tetris-implementation/Chapter-08/HackVM/src/main/java/com/dpaulenk/nand2tetris/vmtranslator\VMTranslator.g4 by ANTLR 4.4.1-dev
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
		"'neg'", "'label'", "'and'", "'add'", "'eq'", "'static'", "'lt'", "'pointer'", 
		"'function'", "'constant'", "'pop'", "'sub'", "'gt'", "'return'", "'goto'", 
		"'this'", "'if-goto'", "'temp'", "'call'", "NEWLINE", "SYMBOL", "NUMBER", 
		"COMMENTS", "WS"
	};
	public static final int
		RULE_program = 0, RULE_newLineOrComments = 1, RULE_instruction = 2, RULE_binary = 3, 
		RULE_compare = 4, RULE_unary = 5, RULE_memory = 6, RULE_stackConst = 7, 
		RULE_stackStatic = 8, RULE_stackRegs = 9, RULE_regSegment = 10, RULE_stackSegs = 11, 
		RULE_segment = 12, RULE_stackOp = 13, RULE_flow = 14, RULE_functional = 15, 
		RULE_function = 16, RULE_call = 17, RULE_xreturn = 18;
	public static final String[] ruleNames = {
		"program", "newLineOrComments", "instruction", "binary", "compare", "unary", 
		"memory", "stackConst", "stackStatic", "stackRegs", "regSegment", "stackSegs", 
		"segment", "stackOp", "flow", "functional", "function", "call", "xreturn"
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
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__20) | (1L << T__19) | (1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << T__10) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__2) | (1L << T__0))) != 0)) {
						{
						setState(38); instruction();
						}
					}

					setState(41); newLineOrComments();
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(48);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__20) | (1L << T__19) | (1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << T__10) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__2) | (1L << T__0))) != 0)) {
				{
				setState(47); instruction();
				}
			}

			setState(50); match(EOF);
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
			setState(52);
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
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public FunctionalContext functional() {
			return getRuleContext(FunctionalContext.class,0);
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
			setState(60);
			switch (_input.LA(1)) {
			case T__20:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(54); memory();
				}
				break;
			case T__21:
			case T__16:
			case T__15:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(55); binary();
				}
				break;
			case T__19:
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(56); unary();
				}
				break;
			case T__14:
			case T__12:
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(57); compare();
				}
				break;
			case T__17:
			case T__4:
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(58); flow();
				}
				break;
			case T__10:
			case T__5:
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(59); functional();
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
			setState(62);
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
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__12) | (1L << T__6))) != 0)) ) {
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
			setState(66);
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
		public StackStaticContext stackStatic() {
			return getRuleContext(StackStaticContext.class,0);
		}
		public StackConstContext stackConst() {
			return getRuleContext(StackConstContext.class,0);
		}
		public StackRegsContext stackRegs() {
			return getRuleContext(StackRegsContext.class,0);
		}
		public StackSegsContext stackSegs() {
			return getRuleContext(StackSegsContext.class,0);
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
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); stackConst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); stackStatic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70); stackRegs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71); stackSegs();
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

	public static class StackConstContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(VMTranslatorParser.NUMBER, 0); }
		public StackConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackConst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitStackConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackConstContext stackConst() throws RecognitionException {
		StackConstContext _localctx = new StackConstContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stackConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(T__20);
			setState(75); match(T__9);
			setState(76); match(NUMBER);
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

	public static class StackStaticContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(VMTranslatorParser.NUMBER, 0); }
		public StackOpContext stackOp() {
			return getRuleContext(StackOpContext.class,0);
		}
		public StackStaticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackStatic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitStackStatic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackStaticContext stackStatic() throws RecognitionException {
		StackStaticContext _localctx = new StackStaticContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stackStatic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); stackOp();
			setState(79); match(T__13);
			setState(80); match(NUMBER);
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

	public static class StackRegsContext extends ParserRuleContext {
		public RegSegmentContext regSegment() {
			return getRuleContext(RegSegmentContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(VMTranslatorParser.NUMBER, 0); }
		public StackOpContext stackOp() {
			return getRuleContext(StackOpContext.class,0);
		}
		public StackRegsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackRegs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitStackRegs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackRegsContext stackRegs() throws RecognitionException {
		StackRegsContext _localctx = new StackRegsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stackRegs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); stackOp();
			setState(83); regSegment();
			setState(84); match(NUMBER);
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

	public static class RegSegmentContext extends ParserRuleContext {
		public RegSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regSegment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitRegSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegSegmentContext regSegment() throws RecognitionException {
		RegSegmentContext _localctx = new RegSegmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_regSegment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__1) ) {
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

	public static class StackSegsContext extends ParserRuleContext {
		public SegmentContext segment() {
			return getRuleContext(SegmentContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(VMTranslatorParser.NUMBER, 0); }
		public StackOpContext stackOp() {
			return getRuleContext(StackOpContext.class,0);
		}
		public StackSegsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackSegs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitStackSegs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackSegsContext stackSegs() throws RecognitionException {
		StackSegsContext _localctx = new StackSegsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stackSegs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); stackOp();
			setState(89); segment();
			setState(90); match(NUMBER);
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
		enterRule(_localctx, 24, RULE_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__23) | (1L << T__22) | (1L << T__3))) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_stackOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
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
		enterRule(_localctx, 28, RULE_flow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__4) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(97); match(SYMBOL);
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

	public static class FunctionalContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public XreturnContext xreturn() {
			return getRuleContext(XreturnContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public FunctionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitFunctional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalContext functional() throws RecognitionException {
		FunctionalContext _localctx = new FunctionalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functional);
		try {
			setState(102);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(99); function();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); call();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(101); xreturn();
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
		enterRule(_localctx, 32, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(T__10);
			setState(105); match(SYMBOL);
			setState(106); match(NUMBER);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(VMTranslatorParser.SYMBOL, 0); }
		public TerminalNode NUMBER() { return getToken(VMTranslatorParser.NUMBER, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(T__0);
			setState(109); match(SYMBOL);
			setState(110); match(NUMBER);
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

	public static class XreturnContext extends ParserRuleContext {
		public XreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xreturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMTranslatorVisitor ) return ((VMTranslatorVisitor<? extends T>)visitor).visitXreturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XreturnContext xreturn() throws RecognitionException {
		XreturnContext _localctx = new XreturnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_xreturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(T__5);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 u\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t"+
		"\23\4\24\t\24\3\2\5\2*\n\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\5\2\63\n"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\5\bK\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\5\21i\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\n"+
		"\4\2\34\34\37\37\5\2\6\6\13\f\24\24\5\2\r\r\17\17\25\25\3\2\b\t\4\2\20"+
		"\20\32\32\4\2\3\5\30\30\4\2\7\7\23\23\5\2\n\n\27\27\31\31n\2.\3\2\2\2"+
		"\4\66\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16J\3\2\2\2"+
		"\20L\3\2\2\2\22P\3\2\2\2\24T\3\2\2\2\26X\3\2\2\2\30Z\3\2\2\2\32^\3\2\2"+
		"\2\34`\3\2\2\2\36b\3\2\2\2 h\3\2\2\2\"j\3\2\2\2$n\3\2\2\2&r\3\2\2\2(*"+
		"\5\6\4\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+-\5\4\3\2,)\3\2\2\2-\60\3\2\2\2"+
		".,\3\2\2\2./\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\61\63\5\6\4\2\62\61\3\2\2"+
		"\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\2\2\3\65\3\3\2\2\2\66\67\t\2\2"+
		"\2\67\5\3\2\2\28?\5\16\b\29?\5\b\5\2:?\5\f\7\2;?\5\n\6\2<?\5\36\20\2="+
		"?\5 \21\2>8\3\2\2\2>9\3\2\2\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2"+
		"?\7\3\2\2\2@A\t\3\2\2A\t\3\2\2\2BC\t\4\2\2C\13\3\2\2\2DE\t\5\2\2E\r\3"+
		"\2\2\2FK\5\20\t\2GK\5\22\n\2HK\5\24\13\2IK\5\30\r\2JF\3\2\2\2JG\3\2\2"+
		"\2JH\3\2\2\2JI\3\2\2\2K\17\3\2\2\2LM\7\7\2\2MN\7\22\2\2NO\7\36\2\2O\21"+
		"\3\2\2\2PQ\5\34\17\2QR\7\16\2\2RS\7\36\2\2S\23\3\2\2\2TU\5\34\17\2UV\5"+
		"\26\f\2VW\7\36\2\2W\25\3\2\2\2XY\t\6\2\2Y\27\3\2\2\2Z[\5\34\17\2[\\\5"+
		"\32\16\2\\]\7\36\2\2]\31\3\2\2\2^_\t\7\2\2_\33\3\2\2\2`a\t\b\2\2a\35\3"+
		"\2\2\2bc\t\t\2\2cd\7\35\2\2d\37\3\2\2\2ei\5\"\22\2fi\5$\23\2gi\5&\24\2"+
		"he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i!\3\2\2\2jk\7\21\2\2kl\7\35\2\2lm\7\36"+
		"\2\2m#\3\2\2\2no\7\33\2\2op\7\35\2\2pq\7\36\2\2q%\3\2\2\2rs\7\26\2\2s"+
		"\'\3\2\2\2\b).\62>Jh";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}