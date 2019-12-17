package com.saga.demo.jwt.util;

import java.util.ArrayList;
import java.util.List;

public class Provincias {
    private static Provincias provincias;
    private static final List<String> PROVINCIAS = new ArrayList<>();

    private Provincias() {
        fillProvincias();
    }

    public static Provincias getInstance() {
        if (provincias == null) {
            return new Provincias();
        } else {
            return provincias;
        }
    }

    private static void fillProvincias() {
        PROVINCIAS.add("Albacete");
        PROVINCIAS.add("Alicante");
        PROVINCIAS.add("Almería");
        PROVINCIAS.add("Álava");
        PROVINCIAS.add("Asturias");
        PROVINCIAS.add("Ávila");
        PROVINCIAS.add("Badajoz");
        PROVINCIAS.add("Illes Balears");
        PROVINCIAS.add("Barcelona");
        PROVINCIAS.add("Bizkaia");
        PROVINCIAS.add("Burgos");
        PROVINCIAS.add("Cáceres");
        PROVINCIAS.add("Cádiz");
        PROVINCIAS.add("Cantabria");
        PROVINCIAS.add("Castellón");
        PROVINCIAS.add("Ciudad Real");
        PROVINCIAS.add("Córdoba");
        PROVINCIAS.add("A Coruña");
        PROVINCIAS.add("Cuenca");
        PROVINCIAS.add("Gipuzkoa");
        PROVINCIAS.add("Girona");
        PROVINCIAS.add("Granada");
        PROVINCIAS.add("Guadalajara");
        PROVINCIAS.add("Huelva");
        PROVINCIAS.add("Huesca");
        PROVINCIAS.add("Jaén");
        PROVINCIAS.add("León");
        PROVINCIAS.add("Lleida");
        PROVINCIAS.add("Lugo");
        PROVINCIAS.add("Madrid");
        PROVINCIAS.add("Málaga");
        PROVINCIAS.add("Murcia");
        PROVINCIAS.add("Navarra");
        PROVINCIAS.add("Ourense");
        PROVINCIAS.add("Palencia");
        PROVINCIAS.add("Las Palmas");
        PROVINCIAS.add("Pontevedra");
        PROVINCIAS.add("La Rioja");
        PROVINCIAS.add("Salamanca");
        PROVINCIAS.add("Santa Cruz de Tenerife");
        PROVINCIAS.add("Segovia");
        PROVINCIAS.add("Sevilla");
        PROVINCIAS.add("Soria");
        PROVINCIAS.add("Tarragona");
        PROVINCIAS.add("Teruel");
        PROVINCIAS.add("Toledo");
        PROVINCIAS.add("Valencia");
        PROVINCIAS.add("Valladolid");
        PROVINCIAS.add("Zamora");
        PROVINCIAS.add("Zaragoza");
        PROVINCIAS.add("Ceuta");
        PROVINCIAS.add("Melilla");
    }

    public List<String> getProvincias() {
        return PROVINCIAS;
    }
}
