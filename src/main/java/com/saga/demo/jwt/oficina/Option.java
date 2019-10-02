package com.saga.demo.jwt.oficina;

public class Option {

    private String nombre;
    private String valor;

    public Option() {
    }

    public Option(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Option nombre(String nombre) {
        this.setNombre(nombre);
        return this;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Option valor(String valor) {
        this.setValor(valor);
        return this;
    }

}
