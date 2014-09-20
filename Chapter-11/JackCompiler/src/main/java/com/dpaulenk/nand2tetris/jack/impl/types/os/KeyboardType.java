package com.dpaulenk.nand2tetris.jack.impl.types.os;

import com.dpaulenk.nand2tetris.jack.impl.types.JackType;
import com.dpaulenk.nand2tetris.jack.impl.types.Subroutine;

import static com.dpaulenk.nand2tetris.jack.impl.types.SubroutineKind.FUNCTION;
import static com.dpaulenk.nand2tetris.jack.impl.types.TypeTable.*;

public class KeyboardType extends JackType {
    public KeyboardType() {
        super("Keyboard");

        defineSubroutine(new Subroutine("keyPressed", FUNCTION, CHAR));
        defineSubroutine(new Subroutine("readChar", FUNCTION, CHAR));
        defineSubroutine(new Subroutine("readLine", FUNCTION, STRING, STRING));
        defineSubroutine(new Subroutine("readInt", FUNCTION, INT, STRING));
    }
}
