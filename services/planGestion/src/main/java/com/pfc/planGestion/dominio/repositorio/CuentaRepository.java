package com.pfc.planGestion.dominio.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfc.planGestion.repositorio.persistencia.component.CuentaEntity;

public interface CuentaRepository extends JpaRepository<CuentaEntity, String>{
	List<CuentaEntity> findByTitularNif(String nif);

}