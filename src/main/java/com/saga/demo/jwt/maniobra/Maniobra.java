package com.saga.demo.jwt.maniobra;

import com.saga.demo.jwt.horario.CacheHorario;
import com.saga.demo.jwt.horario.HorarioCompuesto;
import com.saga.demo.jwt.horario.Horarios;
import com.saga.demo.jwt.limite.LimiteBasico;
import com.saga.demo.jwt.limite.Limites;
import com.saga.demo.jwt.sonda.SondaBasico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Objeto general con <b>TODOS</b> los atributos de las maniobras
 */
public class Maniobra {

    private int tipo;

//    MANIOBRAS DE CLIMA: 4 Y 6

    //    TIPO 4
    Horarios horario = null;
    String dmHorario = "";
    Limites limites = null;
    String dmLimites = "";
    public int sonda1 = 0;
    public int sonda2 = 0;
    public int sonda3 = 0;
    String dmSondas = "";
    CacheHorario cacheHorario = null;

    //    TIPO 6
//    Horarios horario = null;
//    String dmHorario = "";
//    Limites limites = null;
//    String dmLimites = "";
//    public int sonda1 = 0;
//    String dmSondas = "";
    String alarmaGeneral = "";
    String alarmaFiltroSucio = "";
    String numeroEsclavo = "";
    String dmTablaEstado = "";
    String[] tablaEstado = new String[12];
    Map traduccionTablaEstado = new TreeMap();
//    CacheHorario cacheHorario = null;

//    MANIOBRAS DE ALUMBRADO Y FUERZA

    //    TIPO 1
    String confirmacion = "";
    String estadoAlarma = "";
    int offSetInvertido = 11;
//    Horarios horario = null;
//    String dmHorario = "";
//    CacheHorario cacheHorario = null;

    //    TIPO 2
//    String confirmacion = "";
    String dmHorarioCompuesto = "";
    HorarioCompuesto horarioC1 = null;
    HorarioCompuesto horarioC2 = null;
    HorarioCompuesto horarioC3 = null;

    //    TIPO 3
//    String confirmacion = "";
    String dentroHorario = "";
    String dmDentroHorario = "";
    String fueraHorario = "";
    String dmFueraHorario = "";

//    TIPO 5
//    sin atributos

//    TIPO 8
//    sin atributos

//    TIPO 9
//    sin atributos

//    TIPO 10
//    sin atributos

//    TIPO 11
//    sin atributos

    //    TIPO 12
//    Horarios horario = null;
//    String dmHorario = "";
    int numLimites = 2;
    List<LimiteBasico> limites_ = new ArrayList();
    //    String dmLimites = "";
    int numSondas = 3;
    List<SondaBasico> sondas = new ArrayList();
    //    String dmSondas = "";
    String alarma = "";
    //    String numeroEsclavo = "";
//    String dmTablaEstado = "";
//    String[] tablaEstado = new String[12];
//    Map traduccionTablaEstado = new TreeMap();
//    CacheHorario cacheHorario = null;
    int sizeSondas = 2;
    boolean leerTabla = false;

}
