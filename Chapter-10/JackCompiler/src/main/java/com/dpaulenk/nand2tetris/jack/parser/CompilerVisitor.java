// Generated from D:/Work/!GitHub/nand2tetris-implementation/Chapter-10/JackCompiler/src/main/java/com/dpaulenk/nand2tetris/jack\Compiler.g4 by ANTLR 4.4.1-dev
package com.dpaulenk.nand2tetris.jack.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CompilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CompilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull CompilerParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull CompilerParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#subroutineCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineCall(@NotNull CompilerParser.SubroutineCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull CompilerParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#elseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseClause(@NotNull CompilerParser.ElseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifier(@NotNull CompilerParser.QualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull CompilerParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#arrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(@NotNull CompilerParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#scopeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeType(@NotNull CompilerParser.ScopeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(@NotNull CompilerParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull CompilerParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull CompilerParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#keywordConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordConstant(@NotNull CompilerParser.KeywordConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(@NotNull CompilerParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(@NotNull CompilerParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(@NotNull CompilerParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#letStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStatement(@NotNull CompilerParser.LetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(@NotNull CompilerParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#arrayIndexing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexing(@NotNull CompilerParser.ArrayIndexingContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#subroutineType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineType(@NotNull CompilerParser.SubroutineTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#subroutineBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineBody(@NotNull CompilerParser.SubroutineBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(@NotNull CompilerParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(@NotNull CompilerParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(@NotNull CompilerParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull CompilerParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull CompilerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#typedVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedVar(@NotNull CompilerParser.TypedVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#subroutineDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineDec(@NotNull CompilerParser.SubroutineDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#subroutineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineName(@NotNull CompilerParser.SubroutineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(@NotNull CompilerParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull CompilerParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull CompilerParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#classVarDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVarDec(@NotNull CompilerParser.ClassVarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#clazz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClazz(@NotNull CompilerParser.ClazzContext ctx);
}