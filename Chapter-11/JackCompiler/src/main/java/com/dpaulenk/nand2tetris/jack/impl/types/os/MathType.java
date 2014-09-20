package com.dpaulenk.nand2tetris.jack.impl.types.os;

import com.dpaulenk.nand2tetris.jack.impl.types.JackType;
import com.dpaulenk.nand2tetris.jack.impl.types.Subroutine;

import static com.dpaulenk.nand2tetris.jack.impl.types.SubroutineKind.FUNCTION;
import static com.dpaulenk.nand2tetris.jack.impl.types.TypeTable.INT;

public class MathType extends JackType {
    public MathType() {
        super("Math");

        defineSubroutine(new Subroutine("abs", FUNCTION, INT, INT));
        defineSubroutine(new Subroutine("sqrt", FUNCTION, INT, INT));
        defineSubroutine(new Subroutine("multiply", FUNCTION, INT, INT, INT));
        defineSubroutine(new Subroutine("divide", FUNCTION, INT, INT, INT));
        defineSubroutine(new Subroutine("min", FUNCTION, INT, INT, INT));
        defineSubroutine(new Subroutine("max", FUNCTION, INT, INT, INT));
    }
}
