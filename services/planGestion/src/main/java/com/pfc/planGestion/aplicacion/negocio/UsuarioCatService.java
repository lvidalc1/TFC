package com.pfc.planGestion.aplicacion.negocio;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.pfc.planGestion.aplicacion.mapper.UsuarioCatDTOMapper;
import com.pfc.planGestion.dominio.modelo.UsuarioCat;
import com.pfc.planGestion.dominio.repositorio.UsuarioCatRepository;
import com.pfc.planGestion.interfaz.dto.UsuarioCatDTO;

@Service
public class UsuarioCatService {
	private UsuarioCatRepository usuarioCatRepository;
	
	private UsuarioCatDTOMapper usuarioCatDTOMapper;

    public UsuarioCatService(UsuarioCatRepository usuarioCatRepository,
    		UsuarioCatDTOMapper usuarioCatDTOMapper) {
        this.usuarioCatRepository = usuarioCatRepository;
        this.usuarioCatDTOMapper = usuarioCatDTOMapper;
    }

    //listar todas las relaciones cuenta-categoría
    public List<UsuarioCatDTO> findAll() {
        return usuarioCatRepository.findAll().stream().map(usuarioCatDTOMapper::toDTO).collect(Collectors.toList());
    }

    //consultar por frecuencia
    public List<UsuarioCatDTO> findByFrecuencia(String frecuencia) {
        return usuarioCatRepository.findByFrecuencia(frecuencia).stream().map(usuarioCatDTOMapper::toDTO).collect(Collectors.toList());
    }

    
  //consultar por id de categoria
    public List<UsuarioCatDTO> findByIdCategoria(long idCategoria) {
        return usuarioCatRepository.findByIdCategoria(idCategoria).stream().map(usuarioCatDTOMapper::toDTO).collect(Collectors.toList());
    }
    
    //guardar presupuesto
    public void guardarPresupuesto(UsuarioCatDTO dto) {
        UsuarioCat usuarioCat = usuarioCatDTOMapper.toDomain(dto);
        
        Optional<UsuarioCat> existente = usuarioCatRepository.findByNifAndIdCategoria(usuarioCat.getNif(), usuarioCat.getIdCategoria());

        if (existente.isPresent()) {
            UsuarioCat actualizado = existente.get();
            actualizado.setPresupuesto(usuarioCat.getPresupuesto());
            actualizado.setFrecuencia(usuarioCat.getFrecuencia());
            usuarioCatRepository.save(actualizado);
        } else {
            usuarioCatRepository.save(usuarioCat);
        }


        usuarioCatRepository.save(usuarioCat);

        
        usuarioCatRepository.save(usuarioCat);
    }


}
