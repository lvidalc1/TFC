package com.pfc.planGestion.dominio.repositorio;

import com.pfc.planGestion.dominio.modelo.Categoria;

import java.util.List;
import java.util.Optional;


public interface CategoriaRepository {
	List<Categoria> findAll();
	Optional<Categoria> findByNombre(String nombre);
}
