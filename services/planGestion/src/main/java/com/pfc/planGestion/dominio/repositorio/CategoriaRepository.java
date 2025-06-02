package com.pfc.planGestion.dominio.repositorio;

import com.pfc.planGestion.dominio.modelo.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    //buscar por nombre y presupuesto exactos
    Optional<Categoria> findByNombreAndPresupuesto(String nombre, Double presupuesto);

    //buscar por presupuesto mayor a un valor
    List<Categoria> findByPresupuestoGreaterThan(Double cantidad);

    //buscar por nombre que contiene cierta palabra, sin distinguir mayúsculas
    List<Categoria> findByNombreContainingIgnoreCase(String palabra);
}
