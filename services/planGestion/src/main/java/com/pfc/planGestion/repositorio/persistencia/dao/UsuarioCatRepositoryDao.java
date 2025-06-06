package com.pfc.planGestion.repositorio.persistencia.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.pfc.planGestion.dominio.modelo.UsuarioCat;
import com.pfc.planGestion.dominio.repositorio.UsuarioCatRepository;
import com.pfc.planGestion.repositorio.persistencia.jpa.UsuarioCatJpaRepository;
import com.pfc.planGestion.repositorio.persistencia.mapper.UsuarioCatEntityMapper;

@Repository

public class UsuarioCatRepositoryDao implements UsuarioCatRepository {
	
	private final UsuarioCatJpaRepository jpaRepository;
    private final UsuarioCatEntityMapper mapper;

    public UsuarioCatRepositoryDao(UsuarioCatJpaRepository jpaRepository, UsuarioCatEntityMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public List<UsuarioCat> findAll() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<UsuarioCat> findById(long id) {
        return jpaRepository.findById(id)
                .map(mapper::toDomain);
    }


    @Override
    public List<UsuarioCat> findByIdCategoria(long idCategoria) {
        return jpaRepository.findByCategoria_IdCat(idCategoria).stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }


    public List<UsuarioCat> findByFrecuencia(String frecuencia) {
        return jpaRepository.findByFrecuencia(frecuencia).stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

}
