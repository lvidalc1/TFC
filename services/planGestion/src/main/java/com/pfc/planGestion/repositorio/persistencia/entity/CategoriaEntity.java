package com.pfc.planGestion.repositorio.persistencia.entity;

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
	@Column(name="id_cat")
	private long idCat;
	@Column(name="nombre")
    private String nombre;
    
    public CategoriaEntity() {}

    public CategoriaEntity(long idCat, String nombre) {
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
