package com.pfc.planGestion.interfaz.dto;

import com.pfc.planGestion.dominio.modelo.Categoria;

public class CategoriaDTO {
	private int idCat;
    private String nombre;
    
    public CategoriaDTO() {}

    public CategoriaDTO(Categoria categoria) {
        this.idCat = categoria.getIdCat();
        this.nombre = categoria.getNombre();
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
