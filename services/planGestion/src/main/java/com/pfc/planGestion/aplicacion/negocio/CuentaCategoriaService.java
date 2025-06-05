package com.pfc.planGestion.aplicacion.negocio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfc.planGestion.dominio.modelo.CuentaCategoria;
import com.pfc.planGestion.dominio.repositorio.CuentaCategoriaRepository;

@Service

public class CuentaCategoriaService {
	private final CuentaCategoriaRepository cuentaCategoriaRepository;

    public CuentaCategoriaService(CuentaCategoriaRepository cuentaCategoriaRepository) {
        this.cuentaCategoriaRepository = cuentaCategoriaRepository;
    }

    //listar todas las relaciones cuenta-categoría
    public List<CuentaCategoria> findAll() {
        return cuentaCategoriaRepository.findAll();
    }

    //consultar por frecuencia
    public List<CuentaCategoria> findByFrecuencia(String frecuencia) {
        return cuentaCategoriaRepository.findByFrecuencia(frecuencia);
    }

    
  //consultar por id de categoria
    public List<CuentaCategoria> findByIdCategoria(int idCategoria) {
        return cuentaCategoriaRepository.findByIdCategoria(idCategoria);
    }

}
