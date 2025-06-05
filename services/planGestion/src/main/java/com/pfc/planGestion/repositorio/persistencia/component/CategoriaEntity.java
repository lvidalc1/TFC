package com.pfc.planGestion.repositorio.persistencia.component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")

public class CategoriaEntity {
	@Id
	@Column(name="id")
	private int idCat;
    private String nombre;
    private Double presupuesto;
    private String frecuencia;
    
    public CategoriaEntity() {}

    public CategoriaEntity(int idCat, String nombre, Double presupuesto, String frecuencia) {
        this.idCat = idCat;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.frecuencia = frecuencia;
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
