package com.pfc.planGestion.repositorio.persistencia.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.pfc.planGestion.aplicacion.mapper.CategoriaEntityMapper;
import com.pfc.planGestion.dominio.modelo.Categoria;
import com.pfc.planGestion.dominio.repositorio.CategoriaRepository;
import com.pfc.planGestion.repositorio.persistencia.jpa.CategoriaJpaRepository;

@Repository
public class CategoriaRepositoryDao implements CategoriaRepository {
	
	private final CategoriaJpaRepository jpaRepository;
    private final CategoriaEntityMapper mapper;

    public CategoriaRepositoryDao(CategoriaJpaRepository jpaRepository, CategoriaEntityMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public List<Categoria> findAll() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Categoria> findByNombre(String nombre) {
        return jpaRepository.findByNombre(nombre)
                .map(mapper::toDomain);
    }

}
