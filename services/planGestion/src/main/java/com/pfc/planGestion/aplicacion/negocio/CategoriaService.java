package com.pfc.planGestion.aplicacion.negocio;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pfc.planGestion.dominio.modelo.Categoria;
import com.pfc.planGestion.dominio.repositorio.CategoriaRepository;

@Service
public class CategoriaService {
	
	private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> buscarPorNombre(String nombre) {
        return categoriaRepository.findByNombre(nombre);
    }
}
