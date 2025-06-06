package com.pfc.planGestion.repositorio.persistencia.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfc.planGestion.repositorio.persistencia.entity.MovimientoEntity;

public interface MovimientoJpaRepository extends JpaRepository<MovimientoEntity, Long>  {
	List<MovimientoEntity> findByIban_Iban(String iban);

}
