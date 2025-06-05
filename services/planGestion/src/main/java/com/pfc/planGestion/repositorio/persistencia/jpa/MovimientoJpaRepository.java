package com.pfc.planGestion.repositorio.persistencia.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfc.planGestion.repositorio.persistencia.component.MovimientoEntity;

public interface MovimientoJpaRepository extends JpaRepository<MovimientoEntity, Integer>  {
	List<MovimientoEntity> findByIban_Iban(String iban);

}
