package com.dpaulenk.nand2tetris.jack.impl.types.os;

import com.dpaulenk.nand2tetris.jack.impl.types.JackType;
import com.dpaulenk.nand2tetris.jack.impl.types.Subroutine;

import static com.dpaulenk.nand2tetris.jack.impl.types.SubroutineKind.*;
import static com.dpaulenk.nand2tetris.jack.impl.types.TypeTable.*;

public class ArrayType extends JackType {
    public ArrayType() {
        super("Array");

        defineSubroutine(new Subroutine("new", FUNCTION, this, INT));
        defineSubroutine(new Subroutine("dispose", METHOD, VOID));
    }
}
