package com.saga.demo.jwt.sonda;

import com.saga.demo.jwt.conexion.DatosConexion;
import com.saga.demo.jwt.identificador.Identificador;

public class SondaBasico {
    boolean correcto = false;
    DatosConexion datosConexion = null;
    String beginningAddress = "";
    double valor = 0.0D;
    Identificador identificador;
    private int tipoRedondeo = 7;
    private int decimales = 2;
}
