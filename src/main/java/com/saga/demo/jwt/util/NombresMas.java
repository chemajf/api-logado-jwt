package com.saga.demo.jwt.util;

import java.util.ArrayList;
import java.util.List;

public class NombresMas {
    private static final List<String> NOMBRES_MAS = new ArrayList<>();
    private static NombresMas nombresMas = null;

    private NombresMas() {
        fillNombresMas();
    }

    public static NombresMas getInstance() {
        if (nombresMas == null) {
            return new NombresMas();
        } else {
            return nombresMas;
        }
    }

    public List<String> getNombres() {
        return NOMBRES_MAS;
    }

    private static void fillNombresMas() {
        NOMBRES_MAS.add("Antonio");
        NOMBRES_MAS.add("Jose");
        NOMBRES_MAS.add("Manuel");
        NOMBRES_MAS.add("Francisco");
        NOMBRES_MAS.add("David");
        NOMBRES_MAS.add("Juan");
        NOMBRES_MAS.add("Jose Antonio");
        NOMBRES_MAS.add("Javier");
        NOMBRES_MAS.add("Daniel");
        NOMBRES_MAS.add("Jose Luis");
        NOMBRES_MAS.add("Francisco Javier");
        NOMBRES_MAS.add("Carlos");
        NOMBRES_MAS.add("Jesus");
        NOMBRES_MAS.add("Alejandro");
        NOMBRES_MAS.add("Miguel");
        NOMBRES_MAS.add("Jose Manuel");
        NOMBRES_MAS.add("Rafael");
        NOMBRES_MAS.add("Miguel Angel");
        NOMBRES_MAS.add("Pedro");
        NOMBRES_MAS.add("Angel");
        NOMBRES_MAS.add("Pablo");
        NOMBRES_MAS.add("Jose Maria");
        NOMBRES_MAS.add("Sergio");
        NOMBRES_MAS.add("Fernando");
        NOMBRES_MAS.add("Luis");
        NOMBRES_MAS.add("Jorge");
        NOMBRES_MAS.add("Alberto");
        NOMBRES_MAS.add("Juan Carlos");
        NOMBRES_MAS.add("Alvaro");
        NOMBRES_MAS.add("Juan Jose");
        NOMBRES_MAS.add("Adrian");
        NOMBRES_MAS.add("Diego");
        NOMBRES_MAS.add("Raul");
        NOMBRES_MAS.add("Juan Antonio");
        NOMBRES_MAS.add("Ivan");
        NOMBRES_MAS.add("Enrique");
        NOMBRES_MAS.add("Ruben");
        NOMBRES_MAS.add("Ramon");
        NOMBRES_MAS.add("Oscar");
        NOMBRES_MAS.add("Vicente");
        NOMBRES_MAS.add("Andres");
        NOMBRES_MAS.add("Juan Manuel");
        NOMBRES_MAS.add("Joaquin");
        NOMBRES_MAS.add("Santiago");
        NOMBRES_MAS.add("Eduardo");
        NOMBRES_MAS.add("Victor");
        NOMBRES_MAS.add("Mario");
        NOMBRES_MAS.add("Roberto");
        NOMBRES_MAS.add("Jaime");
        NOMBRES_MAS.add("Francisco Jose");
        NOMBRES_MAS.add("Marcos");
        NOMBRES_MAS.add("Ignacio");
        NOMBRES_MAS.add("Alfonso");
        NOMBRES_MAS.add("Jordi");
        NOMBRES_MAS.add("Ricardo");
        NOMBRES_MAS.add("Salvador");
        NOMBRES_MAS.add("Hugo");
        NOMBRES_MAS.add("Emilio");
        NOMBRES_MAS.add("Guillermo");
        NOMBRES_MAS.add("Gabriel");
        NOMBRES_MAS.add("Marc");
        NOMBRES_MAS.add("Julio");
        NOMBRES_MAS.add("Julian");
        NOMBRES_MAS.add("Gonzalo");
        NOMBRES_MAS.add("Jose Miguel");
        NOMBRES_MAS.add("Tomas");
        NOMBRES_MAS.add("Mohamed");
        NOMBRES_MAS.add("Agustin");
        NOMBRES_MAS.add("Martin");
        NOMBRES_MAS.add("Jose Ramon");
        NOMBRES_MAS.add("Nicolas");
        NOMBRES_MAS.add("Felix");
        NOMBRES_MAS.add("Joan");
        NOMBRES_MAS.add("Ismael");
        NOMBRES_MAS.add("Cristian");
        NOMBRES_MAS.add("Samuel");
        NOMBRES_MAS.add("Aitor");
        NOMBRES_MAS.add("Hector");
        NOMBRES_MAS.add("Juan Francisco");
        NOMBRES_MAS.add("Josep");
        NOMBRES_MAS.add("Mariano");
        NOMBRES_MAS.add("Lucas");
        NOMBRES_MAS.add("Jose Carlos");
        NOMBRES_MAS.add("Iker");
        NOMBRES_MAS.add("Domingo");
        NOMBRES_MAS.add("Sebastian");
        NOMBRES_MAS.add("Alfredo");
        NOMBRES_MAS.add("Alex");
        NOMBRES_MAS.add("Cesar");
        NOMBRES_MAS.add("Felipe");
        NOMBRES_MAS.add("Jose Angel");
        NOMBRES_MAS.add("Jose Ignacio");
        NOMBRES_MAS.add("Victor Manuel");
        NOMBRES_MAS.add("Rodrigo");
        NOMBRES_MAS.add("Luis Miguel");
        NOMBRES_MAS.add("Jose Francisco");
        NOMBRES_MAS.add("Juan Luis");
        NOMBRES_MAS.add("Gregorio");
        NOMBRES_MAS.add("Xavier");
        NOMBRES_MAS.add("Albert");
    }
}
