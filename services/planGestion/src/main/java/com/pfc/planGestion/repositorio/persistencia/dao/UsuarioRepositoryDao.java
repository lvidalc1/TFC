package com.pfc.planGestion.repositorio.persistencia.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfc.planGestion.aplicacion.mapper.UsuarioEntityMapper;
import com.pfc.planGestion.dominio.modelo.Usuario;
import com.pfc.planGestion.dominio.repositorio.UsuarioRepository;
import com.pfc.planGestion.repositorio.persistencia.jpa.UsuarioJpaRepository;

@Repository
public class UsuarioRepositoryDao implements UsuarioRepository {

    private final UsuarioJpaRepository jpaRepository;
    private final UsuarioEntityMapper mapper;

    @Autowired    
    public UsuarioRepositoryDao(UsuarioJpaRepository jpaRepository, UsuarioEntityMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public Optional<Usuario> findByNifAndPin(String nif, String pin) {
        return jpaRepository.findByNifAndPin(nif, pin).map(mapper::toDomain);
    }

    @Override
    public List<Usuario> findAll() {
        return jpaRepository.findAll().stream().map(mapper::toDomain).collect(Collectors.toList());
    }

    @Override
    public boolean existsById(String nif) {
        return jpaRepository.existsById(nif);
    }

    @Override
    public void save(Usuario usuario) {
        jpaRepository.save(mapper.toEntity(usuario));
    }

    @Override
    public void deleteById(String nif) {
        jpaRepository.deleteById(nif);
    }
}
//pasar de usuarioEntity a usuario