package com.pfc.planGestion.repositorio.persistencia.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfc.planGestion.repositorio.persistencia.component.UsuarioEntity;

public interface UsuarioJpaRepository extends JpaRepository<UsuarioEntity, String>{
	Optional<UsuarioEntity> findByNifAndPin(String nif, String pin);
}
