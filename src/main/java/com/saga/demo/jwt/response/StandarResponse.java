package com.saga.demo.jwt.response;

import com.saga.demo.jwt.util.RandomUtil;

public class StandarResponse {

    private String tipo;
    private String texto;

    public StandarResponse() {
    }

    public StandarResponse(String tipo, String texto) {
        this.tipo = tipo;
        this.texto = texto;
    }

    public static StandarResponse getStandarResponseOk() {
        return new StandarResponse().tipo("OK").texto("Respuesta correcta");
    }

    public static StandarResponse getStandarResponseError() {
        return new StandarResponse().tipo("ERROR").texto("Ha habido un problema: " + RandomUtil.getInstance().nextString());
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public StandarResponse tipo(String tipo) {
        this.setTipo(tipo);
        return this;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public StandarResponse texto(String texto) {
        this.setTexto(texto);
        return this;
    }


}
