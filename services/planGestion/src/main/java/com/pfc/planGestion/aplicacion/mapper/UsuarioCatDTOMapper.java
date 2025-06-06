package com.pfc.planGestion.aplicacion.mapper;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.pfc.planGestion.dominio.modelo.UsuarioCat;
import com.pfc.planGestion.interfaz.dto.UsuarioCatDTO;

@Component
public class UsuarioCatDTOMapper {
	public UsuarioCat toDomain(UsuarioCatDTO dto) {
        if (dto == null) return null;

        return new UsuarioCat(
            dto.getIdUsuarioCat(),
            dto.getNif(),
            dto.getCategoria(),
            new BigDecimal(dto.getPresupuesto()),
            dto.getFrecuencia()
        );
    }

    public UsuarioCatDTO toDTO(UsuarioCat domain) {
        if (domain == null) return null;

        UsuarioCatDTO dto = new UsuarioCatDTO();
        dto.setIdUsuarioCat(domain.getIdUsuarioCat());
        dto.setNif(domain.getNif());
        dto.setCategoria(domain.getIdCategoria());
        dto.setPresupuesto(domain.getPresupuesto().doubleValue());
        dto.setFrecuencia(domain.getFrecuencia());

        return dto;
    }

}
