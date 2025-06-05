package com.pfc.planGestion.repositorio.persistencia.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfc.planGestion.repositorio.persistencia.component.CuentaCategoriaEntity;

public interface CuentaCategoriaJpaRepository extends JpaRepository<CuentaCategoriaEntity, Integer> {

    List<CuentaCategoriaEntity> findByCategoria_IdCat(int idCategoria);

    List<CuentaCategoriaEntity> findByFrecuencia(String frecuencia);

}
