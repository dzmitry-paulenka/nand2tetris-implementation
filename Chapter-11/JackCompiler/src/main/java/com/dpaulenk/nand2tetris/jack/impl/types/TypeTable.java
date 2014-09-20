package com.dpaulenk.nand2tetris.jack.impl.types;

import com.dpaulenk.nand2tetris.jack.impl.types.os.*;

import java.util.HashMap;
import java.util.Map;

public class TypeTable {
    public static final JackType INT = new JackType("int");
    public static final JackType CHAR = new JackType("char");
    public static final JackType BOOLEAN = new JackType("boolean");
    public static final JackType VOID = new JackType("void");
    public static final JackType STRING = new StringType();
    public static final JackType ARRAY = new ArrayType();

    public static final TypeTable instance = new TypeTable();

    private final Map<String, JackType> typeMap = new HashMap<>();

    private TypeTable() {
        define(INT);
        define(CHAR);
        define(BOOLEAN);
        define(VOID);
        define(STRING);
        define(ARRAY);
        define(new MathType());
        define(new KeyboardType());
        define(new MemoryType());
        define(new OutputType());
        define(new ScreenType());
        define(new SysType());
    }

    public JackType define(JackType type) {
        if (typeMap.containsKey(type.name)) {
            throw new IllegalStateException("Type '" + type.name + "' is already defined");
        }

        typeMap.put(type.name, type);
        return type;
    }

    public JackType get(String typeName) {
        JackType type = typeMap.get(typeName);
        if (type == null) {
            throw new IllegalStateException("Type not found: " + typeName);
        }
        return type;
    }

    public JackType getOrNull(String typeName) {
        return typeMap.get(typeName);
    }
}
