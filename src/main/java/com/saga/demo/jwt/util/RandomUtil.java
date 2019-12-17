package com.saga.demo.jwt.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.saga.demo.jwt.archivo.DescargaFichero;
import com.saga.demo.jwt.elementos.Enlace;

import java.io.IOException;
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
            String uri = (acc[i].equalsIgnoreCase("consultas")) ? "/consultas" : this.nextOneString();
            acciones.add(new Enlace().value(acc[i]).uri(uri).blank(true));
        }
        return acciones;
    }

    public String nextColorClas() {
        ColorClass colorClass = ColorClass.getInstance();
        return colorClass.getColorClass().get(nextInt(colorClass.getColorClass().size() - 1));
    }

    private String nextOneString() {
        return this.nextString().split(" ")[0];
    }

    public String nextColorJson() {
        if (this.nextInt(100) % 2 == 0) {
            return "\"color\":\"" + this.nextColorClas() + "\"";
        } else {
            return "";
        }
    }

    public void dormir(int max) {
        int i = nextInt(max);
        while (i == 0)
            i = nextInt(max);
        System.out.println("Dormimos " + i);
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String archivosDeDescarga() {
        List<DescargaFichero> l = new ArrayList<>();
        l.add(new DescargaFichero().tipo("pdf").titulo("El PDF de la tabla").url("https://www.odfenergia.es/wp-content/uploads/2016/10/518046-elEconomista.pdf"));
        l.add(new DescargaFichero().tipo("xls").titulo("El XLS de la tabla").url("https://www.odfenergia.es/wp-content/uploads/2018/06/Condiciones-Generales_ODF_E.pdf"));
//        System.out.println(l.toString());
        JsonNode jsonNode = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            jsonNode = objectMapper.readTree(l.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonNode.toString();
    }
}
