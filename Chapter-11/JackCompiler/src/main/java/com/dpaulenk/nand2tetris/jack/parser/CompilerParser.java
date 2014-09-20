// Generated from D:/Work/!GitHub/nand2tetris-implementation/Chapter-11/JackCompiler/src/main/java/com/dpaulenk/nand2tetris/jack\Compiler.g4 by ANTLR 4.4.1-dev
package com.dpaulenk.nand2tetris.jack.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__39=1, T__38=2, T__37=3, T__36=4, T__35=5, T__34=6, T__33=7, T__32=8, 
		T__31=9, T__30=10, T__29=11, T__28=12, T__27=13, T__26=14, T__25=15, T__24=16, 
		T__23=17, T__22=18, T__21=19, T__20=20, T__19=21, T__18=22, T__17=23, 
		T__16=24, T__15=25, T__14=26, T__13=27, T__12=28, T__11=29, T__10=30, 
		T__9=31, T__8=32, T__7=33, T__6=34, T__5=35, T__4=36, T__3=37, T__2=38, 
		T__1=39, T__0=40, STRING=41, INTEGER=42, ID=43, WS=44, COMMENT=45, LINE_COMMENT=46;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'&'", "','", "'while'", "'['", "'-'", "'*'", "'('", 
		"'if'", "'int'", "'<'", "'false'", "'var'", "'void'", "'{'", "'let'", 
		"'method'", "'constructor'", "'else'", "'}'", "'boolean'", "'true'", "'static'", 
		"'char'", "'do'", "'function'", "')'", "'.'", "'+'", "'='", "'return'", 
		"';'", "'field'", "'this'", "'>'", "'null'", "'/'", "'~'", "'class'", 
		"'|'", "STRING", "INTEGER", "ID", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_clazz = 0, RULE_classVarDec = 1, RULE_varList = 2, RULE_scopeType = 3, 
		RULE_type = 4, RULE_subroutineDec = 5, RULE_subroutineKind = 6, RULE_returnType = 7, 
		RULE_parameterList = 8, RULE_typedVar = 9, RULE_subroutineBody = 10, RULE_varDec = 11, 
		RULE_className = 12, RULE_subroutineName = 13, RULE_varName = 14, RULE_statements = 15, 
		RULE_statement = 16, RULE_letStatement = 17, RULE_arrayIndexing = 18, 
		RULE_ifStatement = 19, RULE_elseClause = 20, RULE_whileStatement = 21, 
		RULE_doStatement = 22, RULE_returnStatement = 23, RULE_expression = 24, 
		RULE_term = 25, RULE_number = 26, RULE_string = 27, RULE_varExpr = 28, 
		RULE_unaryExpr = 29, RULE_arrayExpr = 30, RULE_subroutineCall = 31, RULE_qualifier = 32, 
		RULE_expressionList = 33, RULE_op = 34, RULE_unaryOp = 35, RULE_keywordConstant = 36;
	public static final String[] ruleNames = {
		"clazz", "classVarDec", "varList", "scopeType", "type", "subroutineDec", 
		"subroutineKind", "returnType", "parameterList", "typedVar", "subroutineBody", 
		"varDec", "className", "subroutineName", "varName", "statements", "statement", 
		"letStatement", "arrayIndexing", "ifStatement", "elseClause", "whileStatement", 
		"doStatement", "returnStatement", "expression", "term", "number", "string", 
		"varExpr", "unaryExpr", "arrayExpr", "subroutineCall", "qualifier", "expressionList", 
		"op", "unaryOp", "keywordConstant"
	};

	@Override
	public String getGrammarFileName() { return "Compiler.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ClazzContext extends ParserRuleContext {
		public ClassVarDecContext classVarDec(int i) {
			return getRuleContext(ClassVarDecContext.class,i);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public List<ClassVarDecContext> classVarDec() {
			return getRuleContexts(ClassVarDecContext.class);
		}
		public List<SubroutineDecContext> subroutineDec() {
			return getRuleContexts(SubroutineDecContext.class);
		}
		public SubroutineDecContext subroutineDec(int i) {
			return getRuleContext(SubroutineDecContext.class,i);
		}
		public ClazzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clazz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitClazz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClazzContext clazz() throws RecognitionException {
		ClazzContext _localctx = new ClazzContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_clazz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(T__1);
			setState(75); className();
			setState(76); match(T__25);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__7) {
				{
				{
				setState(77); classVarDec();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__22) | (1L << T__14))) != 0)) {
				{
				{
				setState(83); subroutineDec();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89); match(T__20);
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

	public static class ClassVarDecContext extends ParserRuleContext {
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public ScopeTypeContext scopeType() {
			return getRuleContext(ScopeTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ClassVarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVarDec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitClassVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVarDecContext classVarDec() throws RecognitionException {
		ClassVarDecContext _localctx = new ClassVarDecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classVarDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); scopeType();
			setState(92); type();
			setState(93); varList();
			setState(94); match(T__8);
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

	public static class VarListContext extends ParserRuleContext {
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); varName();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(97); match(T__37);
				setState(98); varName();
				}
				}
				setState(103);
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

	public static class ScopeTypeContext extends ParserRuleContext {
		public ScopeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitScopeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeTypeContext scopeType() throws RecognitionException {
		ScopeTypeContext _localctx = new ScopeTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scopeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__7) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(110);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(106); match(T__30);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); match(T__16);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(108); match(T__19);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(109); className();
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

	public static class SubroutineDecContext extends ParserRuleContext {
		public SubroutineKindContext subroutineKind() {
			return getRuleContext(SubroutineKindContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public SubroutineBodyContext subroutineBody() {
			return getRuleContext(SubroutineBodyContext.class,0);
		}
		public SubroutineNameContext subroutineName() {
			return getRuleContext(SubroutineNameContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public SubroutineDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineDec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitSubroutineDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineDecContext subroutineDec() throws RecognitionException {
		SubroutineDecContext _localctx = new SubroutineDecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subroutineDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); subroutineKind();
			setState(113); returnType();
			setState(114); subroutineName();
			setState(115); match(T__32);
			setState(116); parameterList();
			setState(117); match(T__13);
			setState(118); subroutineBody();
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

	public static class SubroutineKindContext extends ParserRuleContext {
		public SubroutineKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineKind; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitSubroutineKind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineKindContext subroutineKind() throws RecognitionException {
		SubroutineKindContext _localctx = new SubroutineKindContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_subroutineKind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__22) | (1L << T__14))) != 0)) ) {
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnType);
		try {
			setState(124);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(122); match(T__26);
				}
				break;
			case T__30:
			case T__19:
			case T__16:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); type();
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

	public static class ParameterListContext extends ParserRuleContext {
		public TypedVarContext typedVar(int i) {
			return getRuleContext(TypedVarContext.class,i);
		}
		public List<TypedVarContext> typedVar() {
			return getRuleContexts(TypedVarContext.class);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__19) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				setState(126); typedVar();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__37) {
					{
					{
					setState(127); match(T__37);
					setState(128); typedVar();
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class TypedVarContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TypedVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitTypedVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedVarContext typedVar() throws RecognitionException {
		TypedVarContext _localctx = new TypedVarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typedVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); type();
			setState(137); varName();
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

	public static class SubroutineBodyContext extends ParserRuleContext {
		public VarDecContext varDec(int i) {
			return getRuleContext(VarDecContext.class,i);
		}
		public List<VarDecContext> varDec() {
			return getRuleContexts(VarDecContext.class);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public SubroutineBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitSubroutineBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineBodyContext subroutineBody() throws RecognitionException {
		SubroutineBodyContext _localctx = new SubroutineBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_subroutineBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(T__25);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(140); varDec();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146); statements();
			setState(147); match(T__20);
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

	public static class VarDecContext extends ParserRuleContext {
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(T__27);
			setState(150); type();
			setState(151); varList();
			setState(152); match(T__8);
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(ID);
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

	public static class SubroutineNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public SubroutineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitSubroutineName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineNameContext subroutineName() throws RecognitionException {
		SubroutineNameContext _localctx = new SubroutineNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_subroutineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(ID);
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

	public static class VarNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(ID);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__31) | (1L << T__24) | (1L << T__15) | (1L << T__9))) != 0)) {
				{
				{
				setState(160); statement();
				}
				}
				setState(165);
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

	public static class StatementContext extends ParserRuleContext {
		public LetStatementContext letStatement() {
			return getRuleContext(LetStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(171);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(166); letStatement();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(167); ifStatement();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(168); whileStatement();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(169); doStatement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(170); returnStatement();
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

	public static class LetStatementContext extends ParserRuleContext {
		public ArrayIndexingContext arrayIndexing() {
			return getRuleContext(ArrayIndexingContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public LetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitLetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStatementContext letStatement() throws RecognitionException {
		LetStatementContext _localctx = new LetStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_letStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); match(T__24);
			setState(174); varName();
			setState(176);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(175); arrayIndexing();
				}
			}

			setState(178); match(T__10);
			setState(179); expression();
			setState(180); match(T__8);
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

	public static class ArrayIndexingContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayIndexingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndexing; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitArrayIndexing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexingContext arrayIndexing() throws RecognitionException {
		ArrayIndexingContext _localctx = new ArrayIndexingContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrayIndexing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(T__35);
			setState(183); expression();
			setState(184); match(T__39);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(T__31);
			setState(187); match(T__32);
			setState(188); expression();
			setState(189); match(T__13);
			setState(190); match(T__25);
			setState(191); statements();
			setState(192); match(T__20);
			setState(194);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(193); elseClause();
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

	public static class ElseClauseContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(T__21);
			setState(197); match(T__25);
			setState(198); statements();
			setState(199); match(T__20);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(T__36);
			setState(202); match(T__32);
			setState(203); expression();
			setState(204); match(T__13);
			setState(205); match(T__25);
			setState(206); statements();
			setState(207); match(T__20);
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

	public static class DoStatementContext extends ParserRuleContext {
		public SubroutineCallContext subroutineCall() {
			return getRuleContext(SubroutineCallContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(T__15);
			setState(210); subroutineCall();
			setState(211); match(T__8);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(T__9);
			setState(215);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__32) | (1L << T__28) | (1L << T__18) | (1L << T__6) | (1L << T__4) | (1L << T__2) | (1L << STRING) | (1L << INTEGER) | (1L << ID))) != 0)) {
				{
				setState(214); expression();
				}
			}

			setState(217); match(T__8);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); term();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__34) | (1L << T__33) | (1L << T__29) | (1L << T__11) | (1L << T__10) | (1L << T__5) | (1L << T__3) | (1L << T__0))) != 0)) {
				{
				{
				setState(220); op();
				setState(221); term();
				}
				}
				setState(227);
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

	public static class TermContext extends ParserRuleContext {
		public KeywordConstantContext keywordConstant() {
			return getRuleContext(KeywordConstantContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VarExprContext varExpr() {
			return getRuleContext(VarExprContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ArrayExprContext arrayExpr() {
			return getRuleContext(ArrayExprContext.class,0);
		}
		public SubroutineCallContext subroutineCall() {
			return getRuleContext(SubroutineCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_term);
		try {
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230); keywordConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231); varExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232); arrayExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(233); subroutineCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(234); match(T__32);
				setState(235); expression();
				setState(236); match(T__13);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(238); unaryExpr();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(CompilerParser.INTEGER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); match(INTEGER);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CompilerParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(STRING);
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

	public static class VarExprContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public VarExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarExprContext varExpr() throws RecognitionException {
		VarExprContext _localctx = new VarExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_varExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); varName();
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

	public static class UnaryExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unaryExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); unaryOp();
			setState(248); term();
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

	public static class ArrayExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ArrayExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExprContext arrayExpr() throws RecognitionException {
		ArrayExprContext _localctx = new ArrayExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrayExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); varName();
			setState(251); match(T__35);
			setState(252); expression();
			setState(253); match(T__39);
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

	public static class SubroutineCallContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SubroutineNameContext subroutineName() {
			return getRuleContext(SubroutineNameContext.class,0);
		}
		public QualifierContext qualifier() {
			return getRuleContext(QualifierContext.class,0);
		}
		public SubroutineCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitSubroutineCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineCallContext subroutineCall() throws RecognitionException {
		SubroutineCallContext _localctx = new SubroutineCallContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_subroutineCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(255); qualifier();
				setState(256); match(T__12);
				}
				break;
			}
			setState(260); subroutineName();
			setState(261); match(T__32);
			setState(262); expressionList();
			setState(263); match(T__13);
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

	public static class QualifierContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public QualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifierContext qualifier() throws RecognitionException {
		QualifierContext _localctx = new QualifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_qualifier);
		try {
			setState(267);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265); className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266); varName();
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__32) | (1L << T__28) | (1L << T__18) | (1L << T__6) | (1L << T__4) | (1L << T__2) | (1L << STRING) | (1L << INTEGER) | (1L << ID))) != 0)) {
				{
				setState(269); expression();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__37) {
					{
					{
					setState(270); match(T__37);
					setState(271); expression();
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__34) | (1L << T__33) | (1L << T__29) | (1L << T__11) | (1L << T__10) | (1L << T__5) | (1L << T__3) | (1L << T__0))) != 0)) ) {
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

	public static class UnaryOpContext extends ParserRuleContext {
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !(_la==T__34 || _la==T__2) ) {
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

	public static class KeywordConstantContext extends ParserRuleContext {
		public KeywordConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitKeywordConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordConstantContext keywordConstant() throws RecognitionException {
		KeywordConstantContext _localctx = new KeywordConstantContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_keywordConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__18) | (1L << T__6) | (1L << T__4))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u0120\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\7\2Q\n\2\f\2\16\2"+
		"T\13\2\3\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\7\4f\n\4\f\4\16\4i\13\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6q\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\5\t\177\n\t\3\n\3\n\3\n\7\n\u0084"+
		"\n\n\f\n\16\n\u0087\13\n\5\n\u0089\n\n\3\13\3\13\3\13\3\f\3\f\7\f\u0090"+
		"\n\f\f\f\16\f\u0093\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\7\21\u00a4\n\21\f\21\16\21\u00a7\13\21\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00ae\n\22\3\23\3\23\3\23\5\23\u00b3\n\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u00c5\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u00da\n\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\7\32\u00e2\n\32\f\32\16\32\u00e5\13\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00f2\n\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\5!\u0105\n"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\5\"\u010e\n\"\3#\3#\3#\7#\u0113\n#\f#\16#\u0116"+
		"\13#\5#\u0118\n#\3$\3$\3%\3%\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\7\4\2\31\31##\4\2\23\24"+
		"\34\34\t\2\4\4\b\t\r\r\37 %%\'\'**\4\2\b\b((\6\2\16\16\30\30$$&&\u0118"+
		"\2L\3\2\2\2\4]\3\2\2\2\6b\3\2\2\2\bj\3\2\2\2\np\3\2\2\2\fr\3\2\2\2\16"+
		"z\3\2\2\2\20~\3\2\2\2\22\u0088\3\2\2\2\24\u008a\3\2\2\2\26\u008d\3\2\2"+
		"\2\30\u0097\3\2\2\2\32\u009c\3\2\2\2\34\u009e\3\2\2\2\36\u00a0\3\2\2\2"+
		" \u00a5\3\2\2\2\"\u00ad\3\2\2\2$\u00af\3\2\2\2&\u00b8\3\2\2\2(\u00bc\3"+
		"\2\2\2*\u00c6\3\2\2\2,\u00cb\3\2\2\2.\u00d3\3\2\2\2\60\u00d7\3\2\2\2\62"+
		"\u00dd\3\2\2\2\64\u00f1\3\2\2\2\66\u00f3\3\2\2\28\u00f5\3\2\2\2:\u00f7"+
		"\3\2\2\2<\u00f9\3\2\2\2>\u00fc\3\2\2\2@\u0104\3\2\2\2B\u010d\3\2\2\2D"+
		"\u0117\3\2\2\2F\u0119\3\2\2\2H\u011b\3\2\2\2J\u011d\3\2\2\2LM\7)\2\2M"+
		"N\5\32\16\2NR\7\21\2\2OQ\5\4\3\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2"+
		"\2SX\3\2\2\2TR\3\2\2\2UW\5\f\7\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2"+
		"\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\26\2\2\\\3\3\2\2\2]^\5\b\5\2^_\5\n\6\2_`\5"+
		"\6\4\2`a\7\"\2\2a\5\3\2\2\2bg\5\36\20\2cd\7\5\2\2df\5\36\20\2ec\3\2\2"+
		"\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\7\3\2\2\2ig\3\2\2\2jk\t\2\2\2k\t\3\2"+
		"\2\2lq\7\f\2\2mq\7\32\2\2nq\7\27\2\2oq\5\32\16\2pl\3\2\2\2pm\3\2\2\2p"+
		"n\3\2\2\2po\3\2\2\2q\13\3\2\2\2rs\5\16\b\2st\5\20\t\2tu\5\34\17\2uv\7"+
		"\n\2\2vw\5\22\n\2wx\7\35\2\2xy\5\26\f\2y\r\3\2\2\2z{\t\3\2\2{\17\3\2\2"+
		"\2|\177\7\20\2\2}\177\5\n\6\2~|\3\2\2\2~}\3\2\2\2\177\21\3\2\2\2\u0080"+
		"\u0085\5\24\13\2\u0081\u0082\7\5\2\2\u0082\u0084\5\24\13\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\23\3\2\2\2\u008a\u008b\5\n\6\2\u008b\u008c\5\36\20\2\u008c"+
		"\25\3\2\2\2\u008d\u0091\7\21\2\2\u008e\u0090\5\30\r\2\u008f\u008e\3\2"+
		"\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\5 \21\2\u0095\u0096\7\26"+
		"\2\2\u0096\27\3\2\2\2\u0097\u0098\7\17\2\2\u0098\u0099\5\n\6\2\u0099\u009a"+
		"\5\6\4\2\u009a\u009b\7\"\2\2\u009b\31\3\2\2\2\u009c\u009d\7-\2\2\u009d"+
		"\33\3\2\2\2\u009e\u009f\7-\2\2\u009f\35\3\2\2\2\u00a0\u00a1\7-\2\2\u00a1"+
		"\37\3\2\2\2\u00a2\u00a4\5\"\22\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2"+
		"\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6!\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00ae\5$\23\2\u00a9\u00ae\5(\25\2\u00aa\u00ae\5,\27\2\u00ab"+
		"\u00ae\5.\30\2\u00ac\u00ae\5\60\31\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3"+
		"\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"#\3\2\2\2\u00af\u00b0\7\22\2\2\u00b0\u00b2\5\36\20\2\u00b1\u00b3\5&\24"+
		"\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5"+
		"\7 \2\2\u00b5\u00b6\5\62\32\2\u00b6\u00b7\7\"\2\2\u00b7%\3\2\2\2\u00b8"+
		"\u00b9\7\7\2\2\u00b9\u00ba\5\62\32\2\u00ba\u00bb\7\3\2\2\u00bb\'\3\2\2"+
		"\2\u00bc\u00bd\7\13\2\2\u00bd\u00be\7\n\2\2\u00be\u00bf\5\62\32\2\u00bf"+
		"\u00c0\7\35\2\2\u00c0\u00c1\7\21\2\2\u00c1\u00c2\5 \21\2\u00c2\u00c4\7"+
		"\26\2\2\u00c3\u00c5\5*\26\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		")\3\2\2\2\u00c6\u00c7\7\25\2\2\u00c7\u00c8\7\21\2\2\u00c8\u00c9\5 \21"+
		"\2\u00c9\u00ca\7\26\2\2\u00ca+\3\2\2\2\u00cb\u00cc\7\6\2\2\u00cc\u00cd"+
		"\7\n\2\2\u00cd\u00ce\5\62\32\2\u00ce\u00cf\7\35\2\2\u00cf\u00d0\7\21\2"+
		"\2\u00d0\u00d1\5 \21\2\u00d1\u00d2\7\26\2\2\u00d2-\3\2\2\2\u00d3\u00d4"+
		"\7\33\2\2\u00d4\u00d5\5@!\2\u00d5\u00d6\7\"\2\2\u00d6/\3\2\2\2\u00d7\u00d9"+
		"\7!\2\2\u00d8\u00da\5\62\32\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00dc\7\"\2\2\u00dc\61\3\2\2\2\u00dd\u00e3"+
		"\5\64\33\2\u00de\u00df\5F$\2\u00df\u00e0\5\64\33\2\u00e0\u00e2\3\2\2\2"+
		"\u00e1\u00de\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\63\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00f2\5\66\34\2\u00e7"+
		"\u00f2\58\35\2\u00e8\u00f2\5J&\2\u00e9\u00f2\5:\36\2\u00ea\u00f2\5> \2"+
		"\u00eb\u00f2\5@!\2\u00ec\u00ed\7\n\2\2\u00ed\u00ee\5\62\32\2\u00ee\u00ef"+
		"\7\35\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00f2\5<\37\2\u00f1\u00e6\3\2\2\2"+
		"\u00f1\u00e7\3\2\2\2\u00f1\u00e8\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00ea"+
		"\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\65\3\2\2\2\u00f3\u00f4\7,\2\2\u00f4\67\3\2\2\2\u00f5\u00f6\7+\2\2\u00f6"+
		"9\3\2\2\2\u00f7\u00f8\5\36\20\2\u00f8;\3\2\2\2\u00f9\u00fa\5H%\2\u00fa"+
		"\u00fb\5\64\33\2\u00fb=\3\2\2\2\u00fc\u00fd\5\36\20\2\u00fd\u00fe\7\7"+
		"\2\2\u00fe\u00ff\5\62\32\2\u00ff\u0100\7\3\2\2\u0100?\3\2\2\2\u0101\u0102"+
		"\5B\"\2\u0102\u0103\7\36\2\2\u0103\u0105\3\2\2\2\u0104\u0101\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\5\34\17\2\u0107\u0108\7"+
		"\n\2\2\u0108\u0109\5D#\2\u0109\u010a\7\35\2\2\u010aA\3\2\2\2\u010b\u010e"+
		"\5\32\16\2\u010c\u010e\5\36\20\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2"+
		"\2\u010eC\3\2\2\2\u010f\u0114\5\62\32\2\u0110\u0111\7\5\2\2\u0111\u0113"+
		"\5\62\32\2\u0112\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2"+
		"\u0114\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u010f"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118E\3\2\2\2\u0119\u011a\t\4\2\2\u011a"+
		"G\3\2\2\2\u011b\u011c\t\5\2\2\u011cI\3\2\2\2\u011d\u011e\t\6\2\2\u011e"+
		"K\3\2\2\2\25RXgp~\u0085\u0088\u0091\u00a5\u00ad\u00b2\u00c4\u00d9\u00e3"+
		"\u00f1\u0104\u010d\u0114\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}