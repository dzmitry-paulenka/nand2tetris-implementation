// Generated from D:/Work/!GitHub/nand2tetris-implementation/Chapter-06/Assembler/src/main/java/com/dpaulenk/nand2tetris/assembler\Assembler.g4 by ANTLR 4.4.1-dev
package com.dpaulenk.nand2tetris.assembler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, NEWLINE=27, SYMBOL=28, NUMBER=29, COMMENTS=30, WS=31;
	public static final String[] tokenNames = {
		"<INVALID>", "'&'", "'-'", "'('", "'A'", "'AMD'", "'MD'", "'JLE'", "'AD'", 
		"'0'", "'JGE'", "'M'", "'JEQ'", "'AM'", "')'", "'JLT'", "'D'", "'+'", 
		"'@'", "'JMP'", "'='", "';'", "'JNE'", "'1'", "'JGT'", "'|'", "'!'", "NEWLINE", 
		"SYMBOL", "NUMBER", "COMMENTS", "WS"
	};
	public static final int
		RULE_program = 0, RULE_newLineOrComments = 1, RULE_labelWithInstruction = 2, 
		RULE_label = 3, RULE_instruction = 4, RULE_ainstr = 5, RULE_address = 6, 
		RULE_cinstr = 7, RULE_dest = 8, RULE_jump = 9, RULE_comp = 10, RULE_consts = 11, 
		RULE_unary = 12, RULE_binary = 13;
	public static final String[] ruleNames = {
		"program", "newLineOrComments", "labelWithInstruction", "label", "instruction", 
		"ainstr", "address", "cinstr", "dest", "jump", "comp", "consts", "unary", 
		"binary"
	};

	@Override
	public String getGrammarFileName() { return "Assembler.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AssemblerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<NewLineOrCommentsContext> newLineOrComments() {
			return getRuleContexts(NewLineOrCommentsContext.class);
		}
		public TerminalNode EOF() { return getToken(AssemblerParser.EOF, 0); }
		public List<LabelWithInstructionContext> labelWithInstruction() {
			return getRuleContexts(LabelWithInstructionContext.class);
		}
		public NewLineOrCommentsContext newLineOrComments(int i) {
			return getRuleContext(NewLineOrCommentsContext.class,i);
		}
		public LabelWithInstructionContext labelWithInstruction(int i) {
			return getRuleContext(LabelWithInstructionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(29);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__17) | (1L << T__15) | (1L << T__13) | (1L << T__10) | (1L << T__8) | (1L << T__3) | (1L << T__0))) != 0)) {
						{
						setState(28); labelWithInstruction();
						}
					}

					setState(31); newLineOrComments();
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(38);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__17) | (1L << T__15) | (1L << T__13) | (1L << T__10) | (1L << T__8) | (1L << T__3) | (1L << T__0))) != 0)) {
				{
				setState(37); labelWithInstruction();
				}
			}

			setState(40); match(EOF);
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
		public TerminalNode NEWLINE() { return getToken(AssemblerParser.NEWLINE, 0); }
		public TerminalNode COMMENTS() { return getToken(AssemblerParser.COMMENTS, 0); }
		public NewLineOrCommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newLineOrComments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterNewLineOrComments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitNewLineOrComments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitNewLineOrComments(this);
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
			setState(42);
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

	public static class LabelWithInstructionContext extends ParserRuleContext {
		public List<NewLineOrCommentsContext> newLineOrComments() {
			return getRuleContexts(NewLineOrCommentsContext.class);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public NewLineOrCommentsContext newLineOrComments(int i) {
			return getRuleContext(NewLineOrCommentsContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public LabelWithInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelWithInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterLabelWithInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitLabelWithInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitLabelWithInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelWithInstructionContext labelWithInstruction() throws RecognitionException {
		LabelWithInstructionContext _localctx = new LabelWithInstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_labelWithInstruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(44); label();
				setState(45); newLineOrComments();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52); instruction();
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(AssemblerParser.SYMBOL, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(T__23);
			setState(55); match(SYMBOL);
			setState(56); match(T__12);
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
		public CinstrContext cinstr() {
			return getRuleContext(CinstrContext.class,0);
		}
		public AinstrContext ainstr() {
			return getRuleContext(AinstrContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		try {
			setState(60);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); ainstr();
				}
				break;
			case T__24:
			case T__22:
			case T__21:
			case T__20:
			case T__18:
			case T__17:
			case T__15:
			case T__13:
			case T__10:
			case T__3:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(59); cinstr();
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

	public static class AinstrContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(AssemblerParser.SYMBOL, 0); }
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public AinstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ainstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterAinstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitAinstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitAinstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AinstrContext ainstr() throws RecognitionException {
		AinstrContext _localctx = new AinstrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ainstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(T__8);
			setState(65);
			switch (_input.LA(1)) {
			case T__17:
			case T__3:
			case NUMBER:
				{
				setState(63); address();
				}
				break;
			case SYMBOL:
				{
				setState(64); match(SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AddressContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AssemblerParser.NUMBER, 0); }
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_address);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__3) | (1L << NUMBER))) != 0)) ) {
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

	public static class CinstrContext extends ParserRuleContext {
		public JumpContext jump() {
			return getRuleContext(JumpContext.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public DestContext dest() {
			return getRuleContext(DestContext.class,0);
		}
		public CinstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cinstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterCinstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitCinstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitCinstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CinstrContext cinstr() throws RecognitionException {
		CinstrContext _localctx = new CinstrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cinstr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(69); dest();
				setState(70); match(T__6);
				}
				break;
			}
			setState(74); comp();
			setState(77);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(75); match(T__5);
				setState(76); jump();
				}
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

	public static class DestContext extends ParserRuleContext {
		public DestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterDest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitDest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitDest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestContext dest() throws RecognitionException {
		DestContext _localctx = new DestContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__15) | (1L << T__13) | (1L << T__10))) != 0)) ) {
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

	public static class JumpContext extends ParserRuleContext {
		public JumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitJump(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitJump(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpContext jump() throws RecognitionException {
		JumpContext _localctx = new JumpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jump);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__16) | (1L << T__14) | (1L << T__11) | (1L << T__7) | (1L << T__4) | (1L << T__2))) != 0)) ) {
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

	public static class CompContext extends ParserRuleContext {
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public ConstsContext consts() {
			return getRuleContext(ConstsContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comp);
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83); consts();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84); binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85); unary();
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

	public static class ConstsContext extends ParserRuleContext {
		public ConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterConsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitConsts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitConsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstsContext consts() throws RecognitionException {
		ConstsContext _localctx = new ConstsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_consts);
		try {
			setState(92);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); match(T__17);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); match(T__3);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(90); match(T__24);
				setState(91); match(T__3);
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

	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if (_la==T__24 || _la==T__0) {
				{
				setState(94);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__0) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(97);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__15) | (1L << T__10))) != 0)) ) {
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

	public static class BinaryContext extends ParserRuleContext {
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_binary);
		int _la;
		try {
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__15) | (1L << T__10))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(100);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(101); match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); match(T__10);
				setState(103);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__24) | (1L << T__9) | (1L << T__1))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(104);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(106); match(T__24);
				setState(107); match(T__10);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!q\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\2\7\2#\n\2\f\2\16\2&\13"+
		"\2\3\2\5\2)\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\7\4\62\n\4\f\4\16\4\65\13"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6?\n\6\3\7\3\7\3\7\5\7D\n\7\3\b\3"+
		"\b\3\t\3\t\3\t\5\tK\n\t\3\t\3\t\3\t\5\tP\n\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\5\fY\n\f\3\r\3\r\3\r\3\r\5\r_\n\r\3\16\5\16b\n\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17o\n\17\3\17\2\2\20\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\2\13\4\2\35\35  \5\2\13\13\31\31\37\37"+
		"\7\2\6\b\n\n\r\r\17\17\22\22\t\2\t\t\f\f\16\16\21\21\25\25\30\30\32\32"+
		"\4\2\4\4\34\34\5\2\6\6\r\r\22\22\4\2\4\4\23\23\5\2\3\4\23\23\33\33\4\2"+
		"\6\6\r\rq\2$\3\2\2\2\4,\3\2\2\2\6\63\3\2\2\2\b8\3\2\2\2\n>\3\2\2\2\f@"+
		"\3\2\2\2\16E\3\2\2\2\20J\3\2\2\2\22Q\3\2\2\2\24S\3\2\2\2\26X\3\2\2\2\30"+
		"^\3\2\2\2\32a\3\2\2\2\34n\3\2\2\2\36 \5\6\4\2\37\36\3\2\2\2\37 \3\2\2"+
		"\2 !\3\2\2\2!#\5\4\3\2\"\37\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%(\3"+
		"\2\2\2&$\3\2\2\2\')\5\6\4\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\2\2\3+"+
		"\3\3\2\2\2,-\t\2\2\2-\5\3\2\2\2./\5\b\5\2/\60\5\4\3\2\60\62\3\2\2\2\61"+
		".\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63"+
		"\3\2\2\2\66\67\5\n\6\2\67\7\3\2\2\289\7\5\2\29:\7\36\2\2:;\7\20\2\2;\t"+
		"\3\2\2\2<?\5\f\7\2=?\5\20\t\2><\3\2\2\2>=\3\2\2\2?\13\3\2\2\2@C\7\24\2"+
		"\2AD\5\16\b\2BD\7\36\2\2CA\3\2\2\2CB\3\2\2\2D\r\3\2\2\2EF\t\3\2\2F\17"+
		"\3\2\2\2GH\5\22\n\2HI\7\26\2\2IK\3\2\2\2JG\3\2\2\2JK\3\2\2\2KL\3\2\2\2"+
		"LO\5\26\f\2MN\7\27\2\2NP\5\24\13\2OM\3\2\2\2OP\3\2\2\2P\21\3\2\2\2QR\t"+
		"\4\2\2R\23\3\2\2\2ST\t\5\2\2T\25\3\2\2\2UY\5\30\r\2VY\5\34\17\2WY\5\32"+
		"\16\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\27\3\2\2\2Z_\7\13\2\2[_\7\31\2\2"+
		"\\]\7\4\2\2]_\7\31\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2_\31\3\2\2\2`b\t"+
		"\6\2\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\t\7\2\2d\33\3\2\2\2ef\t\7\2\2f"+
		"g\t\b\2\2go\7\31\2\2hi\7\22\2\2ij\t\t\2\2jo\t\n\2\2kl\t\n\2\2lm\7\4\2"+
		"\2mo\7\22\2\2ne\3\2\2\2nh\3\2\2\2nk\3\2\2\2o\35\3\2\2\2\16\37$(\63>CJ"+
		"OX^an";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}