package com.pfc.planGestion.repositorio.persistencia.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfc.planGestion.repositorio.persistencia.entity.UsuarioCatEntity;

public interface UsuarioCatJpaRepository extends JpaRepository<UsuarioCatEntity, Long> {

    List<UsuarioCatEntity> findByCategoria_IdCat(long idCategoria);

    List<UsuarioCatEntity> findByFrecuencia(String frecuencia);

}
