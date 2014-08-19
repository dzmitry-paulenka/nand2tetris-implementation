// Generated from D:/Work/!GitHub/nand2tetris-implementation/Chapter-06/Assembler/src/main/java/com/dpaulenk/nand2tetris/assembler\Assembler.g4 by ANTLR 4.4.1-dev
package com.dpaulenk.nand2tetris.assembler.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblerParser}.
 */
public interface AssemblerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(@NotNull AssemblerParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(@NotNull AssemblerParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(@NotNull AssemblerParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(@NotNull AssemblerParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#consts}.
	 * @param ctx the parse tree
	 */
	void enterConsts(@NotNull AssemblerParser.ConstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#consts}.
	 * @param ctx the parse tree
	 */
	void exitConsts(@NotNull AssemblerParser.ConstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull AssemblerParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull AssemblerParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#cinstr}.
	 * @param ctx the parse tree
	 */
	void enterCinstr(@NotNull AssemblerParser.CinstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#cinstr}.
	 * @param ctx the parse tree
	 */
	void exitCinstr(@NotNull AssemblerParser.CinstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#jump}.
	 * @param ctx the parse tree
	 */
	void enterJump(@NotNull AssemblerParser.JumpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#jump}.
	 * @param ctx the parse tree
	 */
	void exitJump(@NotNull AssemblerParser.JumpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull AssemblerParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull AssemblerParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#dest}.
	 * @param ctx the parse tree
	 */
	void enterDest(@NotNull AssemblerParser.DestContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#dest}.
	 * @param ctx the parse tree
	 */
	void exitDest(@NotNull AssemblerParser.DestContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#labelWithInstruction}.
	 * @param ctx the parse tree
	 */
	void enterLabelWithInstruction(@NotNull AssemblerParser.LabelWithInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#labelWithInstruction}.
	 * @param ctx the parse tree
	 */
	void exitLabelWithInstruction(@NotNull AssemblerParser.LabelWithInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(@NotNull AssemblerParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(@NotNull AssemblerParser.AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull AssemblerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull AssemblerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#ainstr}.
	 * @param ctx the parse tree
	 */
	void enterAinstr(@NotNull AssemblerParser.AinstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#ainstr}.
	 * @param ctx the parse tree
	 */
	void exitAinstr(@NotNull AssemblerParser.AinstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(@NotNull AssemblerParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(@NotNull AssemblerParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#newLineOrComments}.
	 * @param ctx the parse tree
	 */
	void enterNewLineOrComments(@NotNull AssemblerParser.NewLineOrCommentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#newLineOrComments}.
	 * @param ctx the parse tree
	 */
	void exitNewLineOrComments(@NotNull AssemblerParser.NewLineOrCommentsContext ctx);
}