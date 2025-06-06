package com.pfc.planGestion.repositorio.persistencia.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.pfc.planGestion.dominio.modelo.Categoria;
import com.pfc.planGestion.dominio.repositorio.CategoriaRepository;
import com.pfc.planGestion.repositorio.persistencia.jpa.CategoriaJpaRepository;
import com.pfc.planGestion.repositorio.persistencia.mapper.CategoriaEntityMapper;

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
                .collect(Collectors.toList());
    }

    @Override
    public Categoria findByNombre(String nombre) {
        return mapper.toDomain(jpaRepository.findByNombre(nombre));
    }

}
