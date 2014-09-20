package com.dpaulenk.nand2tetris.jack.impl.types.os;

import com.dpaulenk.nand2tetris.jack.impl.types.JackType;
import com.dpaulenk.nand2tetris.jack.impl.types.Subroutine;

import static com.dpaulenk.nand2tetris.jack.impl.types.SubroutineKind.FUNCTION;
import static com.dpaulenk.nand2tetris.jack.impl.types.SubroutineKind.METHOD;
import static com.dpaulenk.nand2tetris.jack.impl.types.TypeTable.*;

public class StringType extends JackType {
    public StringType() {
        super("String");

        defineSubroutine(new Subroutine("new", FUNCTION, this, INT));
        defineSubroutine(new Subroutine("dispose", METHOD, VOID));
        defineSubroutine(new Subroutine("length", METHOD, INT));
        defineSubroutine(new Subroutine("charAt", METHOD, CHAR, INT));
        defineSubroutine(new Subroutine("setCharAt", METHOD, VOID, INT, CHAR));
        defineSubroutine(new Subroutine("appendChar", METHOD, this, CHAR));
        defineSubroutine(new Subroutine("eraseLastChar", METHOD, VOID));
        defineSubroutine(new Subroutine("intValue", METHOD, INT));
        defineSubroutine(new Subroutine("setInt", METHOD, VOID, INT));
        defineSubroutine(new Subroutine("backSpace", FUNCTION, CHAR));
        defineSubroutine(new Subroutine("doubleQuote", FUNCTION, CHAR));
        defineSubroutine(new Subroutine("newLine", FUNCTION, CHAR));
    }
}
