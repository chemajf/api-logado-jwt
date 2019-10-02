package com.saga.demo.jwt.limite;

import com.saga.demo.jwt.conexion.DatosConexion;
import com.saga.demo.jwt.identificador.Identificador;

public class LimiteBasico {
    boolean correcto = false;
    DatosConexion datosConexion = null;
    String beginningAddress = "";
    double valorBajo = 0.0D;
    double valorAlto = 0.0D;
    Identificador identificador;
    private int tipoRedondeo = 7;
    private int decimales = 2;
}
