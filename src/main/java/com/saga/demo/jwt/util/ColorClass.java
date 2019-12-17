package com.saga.demo.jwt.util;

import java.util.ArrayList;
import java.util.List;

public class ColorClass {


    private static ColorClass provincias;
    private static final List<String> COLOR_CLASS = new ArrayList<>();

    private ColorClass() {
        fillColorClass();
    }

    public static ColorClass getInstance() {
        if (provincias == null) {
            return new ColorClass();
        } else {
            return provincias;
        }
    }

    private static void fillColorClass() {
        COLOR_CLASS.add("azul_corporativo");
        COLOR_CLASS.add("azul_corporativo_5");
        COLOR_CLASS.add("azul_corporativo_10");
        COLOR_CLASS.add("azul_corporativo_13");
        COLOR_CLASS.add("azul_corporativo_17");
        COLOR_CLASS.add("azul_corporativo_20");
        COLOR_CLASS.add("azul_corporativo_30");
        COLOR_CLASS.add("azul_corporativo_40");
        COLOR_CLASS.add("azul_corporativo_50");
        COLOR_CLASS.add("azul_corporativo_60");
        COLOR_CLASS.add("azul_oscuro");
        COLOR_CLASS.add("gris");
        COLOR_CLASS.add("azul");
        COLOR_CLASS.add("azul_80");
        COLOR_CLASS.add("azul_20");
        COLOR_CLASS.add("naranja");
        COLOR_CLASS.add("naranja_80");
        COLOR_CLASS.add("naranja_20");
        COLOR_CLASS.add("verde");
        COLOR_CLASS.add("rojo");
        COLOR_CLASS.add("amarillo");
    }

    public List<String> getColorClass() {
        return COLOR_CLASS;
    }
}
