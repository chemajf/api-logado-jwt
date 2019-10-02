package com.saga.demo.jwt.util;

import java.util.ArrayList;
import java.util.List;

public class Apellidos {

    private static final List<String> APELLIDOS = new ArrayList<>();
    private static Apellidos apellidos = null;

    private Apellidos() {
        fillApellidos();
    }

    public static Apellidos getInstance() {
        if (apellidos != null) {
            return apellidos;
        } else {
            return new Apellidos();
        }
    }

    public List<String> getApellidos() {
        return APELLIDOS;
    }

    private static void fillApellidos() {
        APELLIDOS.add("Garcia");
        APELLIDOS.add("Rodriguez");
        APELLIDOS.add("Gonzalez");
        APELLIDOS.add("Fernandez");
        APELLIDOS.add("Lopez");
        APELLIDOS.add("Martinez");
        APELLIDOS.add("Sanchez");
        APELLIDOS.add("Perez");
        APELLIDOS.add("Gomez");
        APELLIDOS.add("Martin");
        APELLIDOS.add("Jimenez");
        APELLIDOS.add("Ruiz");
        APELLIDOS.add("Hernandez");
        APELLIDOS.add("Diaz");
        APELLIDOS.add("Moreno");
        APELLIDOS.add("Muñoz");
        APELLIDOS.add("Alvarez");
        APELLIDOS.add("Romero");
        APELLIDOS.add("Alonso");
        APELLIDOS.add("Gutierrez");
        APELLIDOS.add("Navarro");
        APELLIDOS.add("Torres");
        APELLIDOS.add("Dominguez");
        APELLIDOS.add("Vazquez");
        APELLIDOS.add("Ramos");
        APELLIDOS.add("Gil");
        APELLIDOS.add("Ramirez");
        APELLIDOS.add("Serrano");
        APELLIDOS.add("Blanco");
        APELLIDOS.add("Molina");
        APELLIDOS.add("Morales");
        APELLIDOS.add("Suarez");
        APELLIDOS.add("Ortega");
        APELLIDOS.add("Delgado");
        APELLIDOS.add("Castro");
        APELLIDOS.add("Ortiz");
        APELLIDOS.add("Rubio");
        APELLIDOS.add("Marin");
        APELLIDOS.add("Sanz");
        APELLIDOS.add("Nuñez");
        APELLIDOS.add("Iglesias");
        APELLIDOS.add("Medina");
        APELLIDOS.add("Cortes");
        APELLIDOS.add("Garrido");
        APELLIDOS.add("Castillo");
        APELLIDOS.add("Santos");
        APELLIDOS.add("Lozano");
        APELLIDOS.add("Guerrero");
        APELLIDOS.add("Cano");
        APELLIDOS.add("Prieto");
        APELLIDOS.add("Mendez");
        APELLIDOS.add("Cruz");
        APELLIDOS.add("Calvo");
        APELLIDOS.add("Herrera");
        APELLIDOS.add("Gallego");
        APELLIDOS.add("Flores");
        APELLIDOS.add("Marquez");
        APELLIDOS.add("Leon");
        APELLIDOS.add("Peña");
        APELLIDOS.add("Vidal");
        APELLIDOS.add("Cabrera");
        APELLIDOS.add("Campos");
        APELLIDOS.add("Vega");
        APELLIDOS.add("Fuentes");
        APELLIDOS.add("Carrasco");
        APELLIDOS.add("Diez");
        APELLIDOS.add("Reyes");
        APELLIDOS.add("Caballero");
        APELLIDOS.add("Nieto");
        APELLIDOS.add("Aguilar");
        APELLIDOS.add("Santana");
        APELLIDOS.add("Pascual");
        APELLIDOS.add("Herrero");
        APELLIDOS.add("Montero");
        APELLIDOS.add("Hidalgo");
        APELLIDOS.add("Lorenzo");
        APELLIDOS.add("Gimenez");
        APELLIDOS.add("Ibañez");
        APELLIDOS.add("Ferrer");
        APELLIDOS.add("Santiago");
        APELLIDOS.add("Duran");
        APELLIDOS.add("Vargas");
        APELLIDOS.add("Benitez");
        APELLIDOS.add("Mora");
        APELLIDOS.add("Arias");
        APELLIDOS.add("Vicente");
        APELLIDOS.add("Carmona");
        APELLIDOS.add("Crespo");
        APELLIDOS.add("Roman");
        APELLIDOS.add("Soto");
        APELLIDOS.add("Pastor");
        APELLIDOS.add("Saez");
        APELLIDOS.add("Velasco");
        APELLIDOS.add("Moya");
        APELLIDOS.add("Soler");
        APELLIDOS.add("Parra");
        APELLIDOS.add("Rojas");
        APELLIDOS.add("Esteban");
        APELLIDOS.add("Bravo");
        APELLIDOS.add("Gallardo");
    }
}
