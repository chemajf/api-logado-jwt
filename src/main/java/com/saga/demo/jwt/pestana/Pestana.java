package com.saga.demo.jwt.pestana;

import java.util.List;
import java.util.Map;

public class Pestana {

    private String nombre = "";
    private String identificador = "";
    private int orden;
    private List listaTipoDato;
    private String action = "";
    private Map<String, String> params;

    public Pestana() {
    }

    public Pestana(String nombre, String identificador, int orden, List listaTipoDato, String action, Map<String, String> params) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.orden = orden;
        this.listaTipoDato = listaTipoDato;
        this.action = action;
        this.params = params;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pestana nombre(String nombre) {
        this.setNombre(nombre);
        return this;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Pestana identificador(String identificador) {
        this.setIdentificador(identificador);
        return this;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public Pestana orden(int orden) {
        this.setOrden(orden);
        return this;
    }

    public List getListaTipoDato() {
        return listaTipoDato;
    }

    public void setListaTipoDato(List listaTipoDato) {
        this.listaTipoDato = listaTipoDato;
    }

    public Pestana listaTipoDato(List listaTipoDato) {
        this.setListaTipoDato(listaTipoDato);
        return this;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Pestana action(String action) {
        this.setAction(action);
        return this;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public Pestana params(Map<String, String> params) {
        this.setParams(params);
        return this;
    }

}
