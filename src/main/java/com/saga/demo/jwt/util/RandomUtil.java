package com.saga.demo.jwt.util;

import com.saga.demo.jwt.elementos.Enlace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomUtil extends Random {

    //    private static final Random RANDOM = new Random();
    private static RandomUtil randomUtil;

    private RandomUtil() {
    }

    public static RandomUtil getInstance() {
        if (randomUtil == null) {
            return new RandomUtil();
        } else {
            return randomUtil;
        }
    }

    public double nextDoubleLatLon() {
        return Double.parseDouble(((nextInt(99999) % 2 == 0) ? "" : "-") + (nextInt(10)) + "." + (nextInt(9999999)));
    }

    public String nextIntegerInString(int bound) {
        return nextInt(bound) + "";
    }

    public String nextString() {
        Strings strings = Strings.getInstance();
        return strings.getStrings().get(nextInt(strings.getStrings().size() - 1));
    }

    public String nextNombre() {
        if (nextInt(100) % 2 == 0)
            return nextNombreMasculino();
        else
            return nextNombreFemenino();
    }

    public String nextNombreCompleto() {
        if (nextInt(100) % 2 == 0)
            return nextNombreMasculino() + " " + nextApellido() + " " + nextApellido();
        else
            return nextNombreFemenino() + " " + nextApellido() + " " + nextApellido();
    }

    public String nextNombreMasculino() {
        NombresMas nombresMas = NombresMas.getInstance();
        return nombresMas.getNombres().get(nextInt(nombresMas.getNombres().size() - 1));
    }

    public String nextNombreFemenino() {
        NombresFem nombresFem = NombresFem.getInstance();
        return nombresFem.getNombres().get(nextInt(nombresFem.getNombres().size() - 1));
    }

    public String nextApellido() {
        Apellidos apellidos = Apellidos.getInstance();
        return apellidos.getApellidos().get(nextInt(apellidos.getApellidos().size() - 1));
    }

    public String nextProvincia() {
        Provincias provincias = Provincias.getInstance();
        return provincias.getProvincias().get(nextInt(provincias.getProvincias().size() - 1));
    }

    public List<String> nextListString(int tam) {
        List<String> listString = new ArrayList<>();
        for (int i = 0; i < tam; i++) {
            listString.add(this.nextString());
        }
        return listString;
    }

    public List<Enlace> acciones() {
        List<Enlace> acciones = new ArrayList<>();
        String[] acc = new String[3];
        acc[0] = "Consultas";
        acc[1] = "Eventos";
        acc[2] = "Control Inmótico";
        int tam = this.nextInt(4);
        tam = tam == 4 ? 3 : tam;
        for (int i = 0; i < tam; i++) {
            acciones.add(new Enlace().value(acc[i]).uri(this.nextOneString()).blank(this.nextBoolean()));
        }
        return acciones;
    }

    private String nextOneString() {
        return this.nextString().split(" ")[0];
    }
}
