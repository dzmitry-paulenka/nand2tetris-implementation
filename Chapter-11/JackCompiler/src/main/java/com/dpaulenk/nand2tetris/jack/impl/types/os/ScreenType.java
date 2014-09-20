package com.dpaulenk.nand2tetris.jack.impl.types.os;

import com.dpaulenk.nand2tetris.jack.impl.types.JackType;
import com.dpaulenk.nand2tetris.jack.impl.types.Subroutine;

import static com.dpaulenk.nand2tetris.jack.impl.types.SubroutineKind.FUNCTION;
import static com.dpaulenk.nand2tetris.jack.impl.types.TypeTable.*;

public class ScreenType extends JackType {
    public ScreenType() {
        super("Screen");

        defineSubroutine(new Subroutine("clearScreen", FUNCTION, VOID));
        defineSubroutine(new Subroutine("setColor", FUNCTION, VOID, BOOLEAN));
        defineSubroutine(new Subroutine("drawPixel", FUNCTION, VOID, INT, INT));
        defineSubroutine(new Subroutine("drawLine", FUNCTION, VOID, INT, INT, INT, INT));
        defineSubroutine(new Subroutine("drawRectangle", FUNCTION, VOID, INT, INT, INT, INT));
        defineSubroutine(new Subroutine("drawCircle", FUNCTION, VOID, INT, INT, INT));
    }
}
