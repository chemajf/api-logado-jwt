package com.saga.demo.jwt.oficina;


import com.saga.demo.jwt.elementos.Enlace;
import com.saga.demo.jwt.util.RandomUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class OficinaController {

    private static final List<Oficina> OFICINAS = new ArrayList<>();
    private static final RandomUtil RANDOM_UTIL = RandomUtil.getInstance();

    private void fillOficinas() {
        RandomUtil randomUtil = RandomUtil.getInstance();

        Oficina oficina = new Oficina(RANDOM_UTIL.nextInt(100), RANDOM_UTIL.nextInt(9999) + "", true, true, "Calle del Arca 25, bajo derecha", "Sevilla", "Sevilla", "", "Oficina de Chema", randomUtil.nextDoubleLatLon(), randomUtil.nextDoubleLatLon(), RANDOM_UTIL.acciones());
        OFICINAS.add(oficina);

        oficina = new Oficina(RANDOM_UTIL.nextInt(100), RANDOM_UTIL.nextInt(9999) + "", true, true, "Avenida del Mercurio 15, puerta 2, primera planta, módulo 4", "Medrid", "Alcalá de Henares", "", "Oficina de las Cosas", randomUtil.nextDoubleLatLon(), randomUtil.nextDoubleLatLon(), RANDOM_UTIL.acciones());
        OFICINAS.add(oficina);

        oficina = new Oficina(RANDOM_UTIL.nextInt(100), RANDOM_UTIL.nextInt(9999) + "", false, true, "Calle Juan Ramón Jiménez, 1", "Sevilla", "Alcalá de Guadaira", "", "Morgüllis", randomUtil.nextDoubleLatLon(), randomUtil.nextDoubleLatLon(), RANDOM_UTIL.acciones());
        OFICINAS.add(oficina);

        oficina = new Oficina(RANDOM_UTIL.nextInt(100), RANDOM_UTIL.nextInt(9999) + "", true, true, "Calle Alta, 11", "Sevilla", "Brenes", "", "Casa Paco", randomUtil.nextDoubleLatLon(), randomUtil.nextDoubleLatLon(), RANDOM_UTIL.acciones());
        OFICINAS.add(oficina);

        oficina = new Oficina(RANDOM_UTIL.nextInt(100), RANDOM_UTIL.nextInt(9999) + "", true, false, "Avd. de la Constitución S/N", "Sevilla", "Gines", "", "Otökhann Incommükhgf", randomUtil.nextDoubleLatLon(), randomUtil.nextDoubleLatLon(), RANDOM_UTIL.acciones());
        OFICINAS.add(oficina);

        oficina = new Oficina(RANDOM_UTIL.nextInt(100), RANDOM_UTIL.nextInt(9999) + "", true, true, "Calle Calderon de la Barca", "Sevilla", "Sevilla", "", "Lamparo Lamparas", randomUtil.nextDoubleLatLon(), randomUtil.nextDoubleLatLon(), RANDOM_UTIL.acciones());
        OFICINAS.add(oficina);

        oficina = new Oficina(RANDOM_UTIL.nextInt(100), RANDOM_UTIL.nextInt(9999) + "", true, true, "Calle de la Constitución de Curkigstantinopla", "Kahjfsderrmi", "Güeghrlagher", "", "Otökhann Incommükhgf", randomUtil.nextDoubleLatLon(), randomUtil.nextDoubleLatLon(), RANDOM_UTIL.acciones());
        OFICINAS.add(oficina);
    }

    @GetMapping(value = {"/oficina/buscador", "/oficina/buscador/"})
    public OficinaResultadoBuscador buscador(@RequestParam("p") int p) {
        OFICINAS.clear();
        for (int i = 0; i < 5; i++) {
            List<Enlace> acciones = RANDOM_UTIL.acciones();
            OFICINAS.add(new Oficina()
                    .id(RANDOM_UTIL.nextInt(100))
                    .codigo(RANDOM_UTIL.nextIntegerInString(9999))
                    .conectado(RANDOM_UTIL.nextBoolean())
                    .activa(RANDOM_UTIL.nextBoolean())
                    .direccion(RANDOM_UTIL.nextString())
                    .provincia(RANDOM_UTIL.nextProvincia())
                    .localidad(RANDOM_UTIL.nextString())
                    .entidad(RANDOM_UTIL.nextString())
                    .nombre(RANDOM_UTIL.nextString())
                    .lat(RANDOM_UTIL.nextDoubleLatLon())
                    .lon(RANDOM_UTIL.nextDoubleLatLon())
                    .acciones(acciones)
            );
        }
        return new OficinaResultadoBuscador().p(p).max(5).paginas(11).oficinas(OFICINAS).tam(52).mensaje("Listado de Oficinas").verMensaje(false);
    }

    @GetMapping(value = {"/oficinas/", "/oficinas"})
    public List<Oficina> getOficina() {
        fillOficinas();
        return OFICINAS;
    }

    @GetMapping(value = {"/oficinas/{id}", "/oficinas/{id}/"})
    public Oficina getOficina(@PathVariable("id") String id) {
        return new Oficina(4, "3001", true, true, "Calle del Arca 25, bajo derecha", "Sevilla", "Sevilla", "", "Oficina de Chema", 37.34798, -6.0392166, RANDOM_UTIL.acciones());
    }

    @GetMapping(value = {"/oficinas/identificadores/consumo/{idOficina}", "/oficina/identificadores/consumo/{idOficina}"})
    public List<Option> identificadoresConsumo(@PathVariable("idOficina") String idOficina) {
        List<Option> res = new ArrayList<>();
        res.add(new Option().nombre("5245 -Energía activa Kwh III").valor("9733"));
        res.add(new Option().nombre("5244 -Energía activa Kwh III").valor("3809"));
        res.add(new Option().nombre("5248 -Energía reactiva capacitiva KvarhC III").valor("3814"));
        return res;
    }
}
