package com.pfc.planGestion.dominio.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")

public class Categoria {
    @Id
    private int idCat;
    private String nombre;
    private Double presupuesto;
    private String frecuencia;

    public Categoria() {
    }

    public Categoria(int idCat, String nombre, Double presupuesto, String frecuencia) {
        this.idCat = idCat;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }

    public int getIdCat() {
        return idCat;
    }
    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public String getFrecuencia() {
    	return frecuencia;
    }
    public void setFrecuencia(String frecuencia) {
    	this.frecuencia=frecuencia;
    }
}
