package com.pfc.planGestion.dominio.modelo;


public class Categoria {
    private long idCat;
    private String nombre;

    public Categoria() {
    }

    public Categoria(long idCat, String nombre) {
        this.idCat = idCat;
        this.nombre = nombre;
    }

    public long getIdCat() {
        return idCat;
    }
    public void setIdCat(long idCat) {
        this.idCat = idCat;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
