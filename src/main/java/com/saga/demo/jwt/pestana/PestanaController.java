package com.saga.demo.jwt.pestana;

import com.saga.demo.jwt.response.Respuesta;
import com.saga.demo.jwt.response.StandarResponse;
import com.saga.demo.jwt.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PestanaController {

    @GetMapping(value = {"/pestanas", "/pestanas/"})
    public Respuesta buscador(@RequestParam("apartado") String apartado) {
        List<Pestana> res = new ArrayList<>();
        if (StringUtils.isNotEmpty(apartado)) {
            if (apartado.equalsIgnoreCase("oficina")) {
                res.add(new Pestana().nombre("Individual").identificador("ListadoOficinas").orden(2).listaTipoDato(null).action("#listado").params(null));
                res.add(new Pestana().nombre("Grupos").identificador("GruposOficinas").orden(3).listaTipoDato(null).action("#grupos").params(null));
                res.add(new Pestana().nombre("Mapa").identificador("MapaOficinas").orden(1).listaTipoDato(null).action("#mapa").params(null));
            } else if (apartado.equalsIgnoreCase("consultas")) {
                res.add(new Pestana().nombre("Consumo").identificador("ConsultasConsumo").orden(2).listaTipoDato(null).action("#").params(null));
                res.add(new Pestana().nombre("Intensidad").identificador("ConsultasIntensidad").orden(2).listaTipoDato(null).action("#").params(null));
                res.add(new Pestana().nombre("Potencia").identificador("ConsultasPotencia").orden(2).listaTipoDato(null).action("#").params(null));
                res.add(new Pestana().nombre("Voltaje").identificador("ConsultasVoltaje").orden(2).listaTipoDato(null).action("#").params(null));
                res.add(new Pestana().nombre("Sondas").identificador("ConsultasSondas").orden(2).listaTipoDato(null).action("#").params(null));
                res.add(new Pestana().nombre("Historico").identificador("ConsultasHistorico").orden(2).listaTipoDato(null).action("#").params(null));
                res.add(new Pestana().nombre("Resumen de Lecturas").identificador("ConsultasResumenLecturas").orden(2).listaTipoDato(null).action("#").params(null));
                res.add(new Pestana().nombre("Comparativa").identificador("ConsultasComparativa").orden(2).listaTipoDato(null).action("#").params(null));
            }
        }
        return new Respuesta().datas(res).standarResponse(StandarResponse.getStandarResponseOk());
    }
}
