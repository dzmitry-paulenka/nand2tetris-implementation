// This file is part of www.nand2tetris.org
// and the book "The Elements of Computing Systems"
// by Nisan and Schocken, MIT Press.
// File name: projects/04/Fill.asm

// Runs an infinite loop that listens to the keyboard input. 
// When a key is pressed (any key), the program blackens the screen,
// i.e. writes "black" in every pixel. When no key is pressed, the
// program clears the screen, i.e. writes "white" in every pixel.

(LOOP)
  @SCREEN
  D=A

  @R1
  M=D
(CONT)
  @KBD
  D=M

  @WHITE
  D;JEQ

  @R0
  M=0
  M=M-1

  @FILL
  0;JMP

(WHITE)
  @R0
  M=0

(FILL)

  @R0
  D=M

  @R1
  A=M
  M=D

  @R1
  M=M+1

  @KBD
  D=A

  @R1
  D=D-M

  @CONT
  D;JNE

  @LOOP
  D;JMP
