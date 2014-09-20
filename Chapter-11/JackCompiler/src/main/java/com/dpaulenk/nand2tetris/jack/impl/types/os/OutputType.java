package com.dpaulenk.nand2tetris.jack.impl.types.os;

import com.dpaulenk.nand2tetris.jack.impl.types.JackType;
import com.dpaulenk.nand2tetris.jack.impl.types.Subroutine;

import static com.dpaulenk.nand2tetris.jack.impl.types.SubroutineKind.FUNCTION;
import static com.dpaulenk.nand2tetris.jack.impl.types.TypeTable.*;

public class OutputType extends JackType {
    public OutputType() {
        super("Output");

        defineSubroutine(new Subroutine("moveCursor", FUNCTION, VOID, INT, INT));
        defineSubroutine(new Subroutine("printChar", FUNCTION, VOID, CHAR));
        defineSubroutine(new Subroutine("printString", FUNCTION, VOID, STRING));
        defineSubroutine(new Subroutine("printInt", FUNCTION, VOID, INT));
        defineSubroutine(new Subroutine("println", FUNCTION, VOID));
        defineSubroutine(new Subroutine("backSpace", FUNCTION, VOID));
    }
}
