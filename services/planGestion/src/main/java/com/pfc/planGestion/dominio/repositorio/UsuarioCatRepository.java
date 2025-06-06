package com.pfc.planGestion.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.pfc.planGestion.dominio.modelo.UsuarioCat;

public interface UsuarioCatRepository {
    List<UsuarioCat> findAll();
    Optional<UsuarioCat> findById(long id);
    List<UsuarioCat> findByFrecuencia(String frecuencia);
    List<UsuarioCat> findByIdCategoria(long idCategoria);
	void save(UsuarioCat usuarioCat);

}
