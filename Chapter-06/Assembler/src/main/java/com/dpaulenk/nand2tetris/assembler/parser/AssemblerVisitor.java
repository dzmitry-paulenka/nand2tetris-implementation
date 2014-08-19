// Generated from D:/Work/!GitHub/nand2tetris-implementation/Chapter-06/Assembler/src/main/java/com/dpaulenk/nand2tetris/assembler\Assembler.g4 by ANTLR 4.4.1-dev
package com.dpaulenk.nand2tetris.assembler.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AssemblerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AssemblerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(@NotNull AssemblerParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(@NotNull AssemblerParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#consts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsts(@NotNull AssemblerParser.ConstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(@NotNull AssemblerParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#cinstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCinstr(@NotNull AssemblerParser.CinstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#jump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump(@NotNull AssemblerParser.JumpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(@NotNull AssemblerParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#dest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDest(@NotNull AssemblerParser.DestContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#labelWithInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelWithInstruction(@NotNull AssemblerParser.LabelWithInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress(@NotNull AssemblerParser.AddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull AssemblerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#ainstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAinstr(@NotNull AssemblerParser.AinstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(@NotNull AssemblerParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#newLineOrComments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLineOrComments(@NotNull AssemblerParser.NewLineOrCommentsContext ctx);
}