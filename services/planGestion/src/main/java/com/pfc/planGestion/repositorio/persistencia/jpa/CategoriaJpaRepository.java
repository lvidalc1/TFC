package com.pfc.planGestion.repositorio.persistencia.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfc.planGestion.repositorio.persistencia.entity.CategoriaEntity;

public interface CategoriaJpaRepository extends JpaRepository<CategoriaEntity, Long> {
	CategoriaEntity findByNombre(String nombre);

}
//se usa esta clase intermedia, para desacoplar el repositorio JPA del dominio.
//de esta manera, la interfaz CategoriaRepository se mantiene en el dominio sin depender directamente de JPA
