package com.saga.demo.jwt.util;

import java.util.ArrayList;
import java.util.List;

public class NombresFem {
    private static final List<String> NOMBRES_FEM = new ArrayList<>();
    private static NombresFem nombresFem = null;

    private NombresFem() {
        fillNombresFemeninos();
    }

    public static NombresFem getInstance() {
        if (nombresFem != null) {
            return nombresFem;
        } else {
            return new NombresFem();
        }
    }

    public List<String> getNombres() {
        return NOMBRES_FEM;
    }

    private static void fillNombresFemeninos() {
        NOMBRES_FEM.add("Maria Carmen");
        NOMBRES_FEM.add("Maria");
        NOMBRES_FEM.add("Carmen");
        NOMBRES_FEM.add("Josefa");
        NOMBRES_FEM.add("Ana Maria");
        NOMBRES_FEM.add("Isabel");
        NOMBRES_FEM.add("Maria Pilar");
        NOMBRES_FEM.add("Maria Dolores");
        NOMBRES_FEM.add("Laura");
        NOMBRES_FEM.add("Maria Teresa");
        NOMBRES_FEM.add("Ana");
        NOMBRES_FEM.add("Cristina");
        NOMBRES_FEM.add("Maria Angeles");
        NOMBRES_FEM.add("Marta");
        NOMBRES_FEM.add("Francisca");
        NOMBRES_FEM.add("Antonia");
        NOMBRES_FEM.add("Maria Isabel");
        NOMBRES_FEM.add("Maria Jose");
        NOMBRES_FEM.add("Lucia");
        NOMBRES_FEM.add("Dolores");
        NOMBRES_FEM.add("Sara");
        NOMBRES_FEM.add("Paula");
        NOMBRES_FEM.add("Elena");
        NOMBRES_FEM.add("Maria Luisa");
        NOMBRES_FEM.add("Pilar");
        NOMBRES_FEM.add("Raquel");
        NOMBRES_FEM.add("Rosa Maria");
        NOMBRES_FEM.add("Concepcion");
        NOMBRES_FEM.add("Manuela");
        NOMBRES_FEM.add("Mercedes");
        NOMBRES_FEM.add("Maria Jesus");
        NOMBRES_FEM.add("Beatriz");
        NOMBRES_FEM.add("Julia");
        NOMBRES_FEM.add("Rosario");
        NOMBRES_FEM.add("Nuria");
        NOMBRES_FEM.add("Juana");
        NOMBRES_FEM.add("Silvia");
        NOMBRES_FEM.add("Teresa");
        NOMBRES_FEM.add("Encarnacion");
        NOMBRES_FEM.add("Irene");
        NOMBRES_FEM.add("Alba");
        NOMBRES_FEM.add("Patricia");
        NOMBRES_FEM.add("Montserrat");
        NOMBRES_FEM.add("Andrea");
        NOMBRES_FEM.add("Rocio");
        NOMBRES_FEM.add("Rosa");
        NOMBRES_FEM.add("Monica");
        NOMBRES_FEM.add("Alicia");
        NOMBRES_FEM.add("Maria Mar");
        NOMBRES_FEM.add("Angela");
        NOMBRES_FEM.add("Sonia");
        NOMBRES_FEM.add("Sandra");
        NOMBRES_FEM.add("Marina");
        NOMBRES_FEM.add("Susana");
        NOMBRES_FEM.add("Natalia");
        NOMBRES_FEM.add("Yolanda");
        NOMBRES_FEM.add("Margarita");
        NOMBRES_FEM.add("Maria Josefa");
        NOMBRES_FEM.add("Claudia");
        NOMBRES_FEM.add("Eva");
        NOMBRES_FEM.add("Maria Rosario");
        NOMBRES_FEM.add("Inmaculada");
        NOMBRES_FEM.add("Maria Mercedes");
        NOMBRES_FEM.add("Ana Isabel");
        NOMBRES_FEM.add("Esther");
        NOMBRES_FEM.add("Carla");
        NOMBRES_FEM.add("Sofia");
        NOMBRES_FEM.add("Noelia");
        NOMBRES_FEM.add("Veronica");
        NOMBRES_FEM.add("Angeles");
        NOMBRES_FEM.add("Nerea");
        NOMBRES_FEM.add("Carolina");
        NOMBRES_FEM.add("Maria Victoria");
        NOMBRES_FEM.add("Eva Maria");
        NOMBRES_FEM.add("Maria Rosa");
        NOMBRES_FEM.add("Miriam");
        NOMBRES_FEM.add("Ines");
        NOMBRES_FEM.add("Lorena");
        NOMBRES_FEM.add("Amparo");
        NOMBRES_FEM.add("Ana Belen");
        NOMBRES_FEM.add("Maria Concepcion");
        NOMBRES_FEM.add("Maria Elena");
        NOMBRES_FEM.add("Victoria");
        NOMBRES_FEM.add("Daniela");
        NOMBRES_FEM.add("Maria Antonia");
        NOMBRES_FEM.add("Catalina");
        NOMBRES_FEM.add("Lidia");
        NOMBRES_FEM.add("Consuelo");
        NOMBRES_FEM.add("Maria Nieves");
        NOMBRES_FEM.add("Celia");
        NOMBRES_FEM.add("Alejandra");
        NOMBRES_FEM.add("Martina");
        NOMBRES_FEM.add("Olga");
        NOMBRES_FEM.add("Gloria");
        NOMBRES_FEM.add("Emilia");
        NOMBRES_FEM.add("Ainhoa");
        NOMBRES_FEM.add("Luisa");
        NOMBRES_FEM.add("Fatima");
        NOMBRES_FEM.add("Maria Soledad");
        NOMBRES_FEM.add("Aurora");
    }
}
