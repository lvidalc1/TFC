package com.pfc.planGestion.repositorio.persistencia.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.pfc.planGestion.aplicacion.mapper.CuentaCategoriaEntityMapper;
import com.pfc.planGestion.dominio.modelo.CuentaCategoria;
import com.pfc.planGestion.dominio.repositorio.CuentaCategoriaRepository;
import com.pfc.planGestion.repositorio.persistencia.jpa.CuentaCategoriaJpaRepository;

@Repository

public class CuentaCategoriaRepositoryDao implements CuentaCategoriaRepository {
	
	private final CuentaCategoriaJpaRepository jpaRepository;
    private final CuentaCategoriaEntityMapper mapper;

    public CuentaCategoriaRepositoryDao(CuentaCategoriaJpaRepository jpaRepository, CuentaCategoriaEntityMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public List<CuentaCategoria> findAll() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CuentaCategoria> findById(int id) {
        return jpaRepository.findById(id)
                .map(mapper::toDomain);
    }


    @Override
    public List<CuentaCategoria> findByIdCategoria(int idCategoria) {
        return jpaRepository.findByCategoria_IdCat(idCategoria).stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }


    public List<CuentaCategoria> findByFrecuencia(String frecuencia) {
        return jpaRepository.findByFrecuencia(frecuencia).stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

}
