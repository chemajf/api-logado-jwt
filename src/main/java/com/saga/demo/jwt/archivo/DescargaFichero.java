package com.saga.demo.jwt.archivo;

public class DescargaFichero {

    private String titulo = "";
    private String url = "";
    private String tipo = "";

    public DescargaFichero() {
    }

    public DescargaFichero(String titulo, String url, String tipo) {
        this.titulo = titulo;
        this.url = url;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public DescargaFichero titulo(String titulo) {
        this.setTitulo(titulo);
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DescargaFichero url(String url) {
        this.setUrl(url);
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public DescargaFichero tipo(String tipo) {
        this.setTipo(tipo);
        return this;
    }

    @Override
    public String toString() {
        return "{\"titulo\":\"" + titulo + "\",\"url\":\"" + url + "\",\"tipo\":\"" + tipo + "\"}";
    }
}
