// Generated from D:/Work/!GitHub/nand2tetris-implementation/Chapter-08/HackVM/src/main/java/com/dpaulenk/nand2tetris/vmtranslator\VMTranslator.g4 by ANTLR 4.4.1-dev
package com.dpaulenk.nand2tetris.vmtranslator.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VMTranslatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VMTranslatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(@NotNull VMTranslatorParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(@NotNull VMTranslatorParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#stackConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackConst(@NotNull VMTranslatorParser.StackConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#regSegment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegSegment(@NotNull VMTranslatorParser.RegSegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#segment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment(@NotNull VMTranslatorParser.SegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#functional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctional(@NotNull VMTranslatorParser.FunctionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(@NotNull VMTranslatorParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#stackStatic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackStatic(@NotNull VMTranslatorParser.StackStaticContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow(@NotNull VMTranslatorParser.FlowContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#xreturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXreturn(@NotNull VMTranslatorParser.XreturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#stackSegs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackSegs(@NotNull VMTranslatorParser.StackSegsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#memory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemory(@NotNull VMTranslatorParser.MemoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull VMTranslatorParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(@NotNull VMTranslatorParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull VMTranslatorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#stackOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackOp(@NotNull VMTranslatorParser.StackOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(@NotNull VMTranslatorParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#stackRegs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackRegs(@NotNull VMTranslatorParser.StackRegsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMTranslatorParser#newLineOrComments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLineOrComments(@NotNull VMTranslatorParser.NewLineOrCommentsContext ctx);
}