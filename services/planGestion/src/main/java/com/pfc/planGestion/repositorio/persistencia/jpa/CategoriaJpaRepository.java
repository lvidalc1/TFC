package com.pfc.planGestion.repositorio.persistencia.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfc.planGestion.repositorio.persistencia.component.CategoriaEntity;

public interface CategoriaJpaRepository extends JpaRepository<CategoriaEntity, Integer> {
	Optional<CategoriaEntity> findByNombre(String nombre);

}
//se usa esta clase intermedia, para desacoplar el repositorio JPA del dominio.
//de esta manera, la interfaz CategoriaRepository se mantiene en el dominio sin depender directamente de JPA
