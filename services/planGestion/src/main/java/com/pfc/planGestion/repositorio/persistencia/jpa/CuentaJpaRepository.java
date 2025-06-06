package com.pfc.planGestion.repositorio.persistencia.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfc.planGestion.repositorio.persistencia.entity.CuentaEntity;

public interface CuentaJpaRepository extends JpaRepository<CuentaEntity, String> {
	List<CuentaEntity> findByTitularNif_nif(String nif);

}
