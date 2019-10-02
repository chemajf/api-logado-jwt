package com.saga.demo.jwt.oficina;

import com.saga.demo.jwt.elementos.Enlace;

import java.util.List;

public class Oficina {

    private int id;
    private String codigo;
    private boolean conectado;
    private boolean activa;
    private String direccion;
    private String provincia;
    private String localidad;
    private String entidad;
    private String nombre;
    private double lat;
    private double lon;
    private List<Enlace> acciones;

    public Oficina() {
    }

    public Oficina(int id, String codigo, boolean conectado, boolean activa, String direccion, String provincia, String localidad, String entidad, String nombre, double lat, double lon, List<Enlace> acciones) {
        this.id = id;
        this.codigo = codigo;
        this.conectado = conectado;
        this.activa = activa;
        this.direccion = direccion;
        this.provincia = provincia;
        this.localidad = localidad;
        this.entidad = entidad;
        this.nombre = nombre;
        this.lat = lat;
        this.lon = lon;
        this.acciones = acciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Oficina id(int id) {
        this.setId(id);
        return this;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Oficina codigo(String codigo) {
        this.setCodigo(codigo);
        return this;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public Oficina conectado(boolean conectado) {
        this.setConectado(conectado);
        return this;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public Oficina activa(boolean activa) {
        this.setActiva(activa);
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Oficina direccion(String direccion) {
        this.setDireccion(direccion);
        return this;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Oficina provincia(String provincia) {
        this.setProvincia(provincia);
        return this;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Oficina localidad(String localidad) {
        this.setLocalidad(localidad);
        return this;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public Oficina entidad(String entidad) {
        this.setEntidad(entidad);
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Oficina nombre(String nombre) {
        this.setNombre(nombre);
        return this;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public Oficina lat(double lat) {
        this.setLat(lat);
        return this;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public Oficina lon(double lon) {
        this.setLon(lon);
        return this;
    }

    public List<Enlace> getAcciones() {
        return acciones;
    }

    public void setAcciones(List<Enlace> acciones) {
        this.acciones = acciones;
    }

    public Oficina acciones(List<Enlace> acciones) {
        this.setAcciones(acciones);
        return this;
    }

    @Override
    public String toString() {
        return "Oficina{" +
                "id:" + id +
                ", codigo:'" + codigo + '\'' +
                ", conectado:" + conectado +
                ", activa:" + activa +
                ", direccion:'" + direccion + '\'' +
                ", provincia:'" + provincia + '\'' +
                ", localidad:'" + localidad + '\'' +
                ", entidad:'" + entidad + '\'' +
                ", nombre:'" + nombre + '\'' +
                ", lat:" + lat +
                ", lon:" + lon +
                ", acciones:" + acciones +
                '}';
    }
}
