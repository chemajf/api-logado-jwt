package com.saga.demo.jwt.response;

import java.util.List;

public class Respuesta {

    private StandarResponse standarResponse;
    private List datas;

    public Respuesta() {
    }

    public Respuesta(StandarResponse standarResponse, List datas) {
        this.standarResponse = standarResponse;
        this.datas = datas;
    }

    public StandarResponse getStandarResponse() {
        return standarResponse;
    }

    public void setStandarResponse(StandarResponse standarResponse) {
        this.standarResponse = standarResponse;
    }

    public Respuesta standarResponse(StandarResponse standarResponse) {
        this.setStandarResponse(standarResponse);
        return this;
    }

    public List getDatas() {
        return datas;
    }

    public void setDatas(List datas) {
        this.datas = datas;
    }

    public Respuesta datas(List datas) {
        this.setDatas(datas);
        return this;
    }

}
