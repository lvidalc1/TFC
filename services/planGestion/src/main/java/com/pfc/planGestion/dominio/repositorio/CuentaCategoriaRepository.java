package com.pfc.planGestion.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.pfc.planGestion.dominio.modelo.CuentaCategoria;

public interface CuentaCategoriaRepository {
    List<CuentaCategoria> findAll();
    Optional<CuentaCategoria> findById(int id);
    List<CuentaCategoria> findByFrecuencia(String frecuencia);
    List<CuentaCategoria> findByIdCategoria(int idCategoria);

}
