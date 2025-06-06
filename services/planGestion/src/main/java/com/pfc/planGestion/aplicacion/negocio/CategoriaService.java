package com.pfc.planGestion.aplicacion.negocio;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.pfc.planGestion.aplicacion.mapper.CategoriaDTOMapper;
import com.pfc.planGestion.dominio.repositorio.CategoriaRepository;
import com.pfc.planGestion.interfaz.dto.CategoriaDTO;

@Service
public class CategoriaService {
	
	private CategoriaRepository categoriaRepository;
	
	private CategoriaDTOMapper categoriaDTOMapper;

    public CategoriaService(CategoriaRepository categoriaRepository, CategoriaDTOMapper categoriaDTOMapper) {
        this.categoriaRepository = categoriaRepository;
        this.categoriaDTOMapper = categoriaDTOMapper;
    }

    public List<CategoriaDTO> listarCategorias() {
        return categoriaRepository.findAll().stream().map(categoriaDTOMapper::toDTO).collect(Collectors.toList());
    }

    public CategoriaDTO buscarPorNombre(String nombre) {
        return categoriaDTOMapper.toDTO(categoriaRepository.findByNombre(nombre));
    }
}
