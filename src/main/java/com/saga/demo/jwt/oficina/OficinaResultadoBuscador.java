package com.saga.demo.jwt.oficina;

import java.util.List;

public class OficinaResultadoBuscador {

    private int p;
    private int max;
    private int paginas;
    private List<Oficina> oficinas;
    private int tam;
    private String mensaje = "";
    private boolean verMensaje;

    public OficinaResultadoBuscador() {
    }

    public OficinaResultadoBuscador(int p, int max, int paginas, List<Oficina> oficinas, int tam, String mensaje, boolean verMensaje) {
        this.p = p;
        this.max = max;
        this.paginas = paginas;
        this.oficinas = oficinas;
        this.tam = tam;
        this.mensaje = mensaje;
        this.verMensaje = verMensaje;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public OficinaResultadoBuscador p(int p) {
        this.setP(p);
        return this;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public OficinaResultadoBuscador max(int max) {
        this.setMax(max);
        return this;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public OficinaResultadoBuscador paginas(int paginas) {
        this.setPaginas(paginas);
        return this;
    }

    public List<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(List<Oficina> oficinas) {
        this.oficinas = oficinas;
    }

    public OficinaResultadoBuscador oficinas(List<Oficina> oficinas) {
        this.setOficinas(oficinas);
        return this;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public OficinaResultadoBuscador tam(int tam) {
        this.setTam(tam);
        return this;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public OficinaResultadoBuscador mensaje(String mensaje) {
        this.setMensaje(mensaje);
        return this;
    }

    public boolean getVerMensaje() {
        return verMensaje;
    }

    public void setVerMensaje(boolean verMensaje) {
        this.verMensaje = verMensaje;
    }

    public OficinaResultadoBuscador verMensaje(boolean verMensaje) {
        this.setVerMensaje(verMensaje);
        return this;
    }

}
