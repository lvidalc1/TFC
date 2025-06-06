package com.pfc.planGestion.dominio.repositorio;

import java.util.List;

import com.pfc.planGestion.dominio.modelo.Categoria;


public interface CategoriaRepository {
	List<Categoria> findAll();
	Categoria findByNombre(String nombre);
}
