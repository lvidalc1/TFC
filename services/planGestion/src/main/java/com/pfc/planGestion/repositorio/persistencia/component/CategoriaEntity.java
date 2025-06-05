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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idCat")
	private int idCat;
	@Column(name="nombre")
    private String nombre;
    
    public CategoriaEntity() {}

    public CategoriaEntity(int idCat, String nombre) {
        this.idCat = idCat;
        this.nombre = nombre;
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

}
