package com.pfc.planGestion.aplicacion.mapper;

import org.springframework.stereotype.Component;

import com.pfc.planGestion.dominio.modelo.Categoria;
import com.pfc.planGestion.interfaz.dto.CategoriaDTO;

@Component
public class CategoriaDTOMapper {
	
	//para pasar de entidad a dominio
	//convierte de CategoriaEntity, es decir, lo que viene de la base de datos, al modelo de negocio Categoria
	public Categoria toDomain(CategoriaDTO dto) {
        if (dto == null) return null;

        return new Categoria(
            dto.getIdCat(),
            dto.getNombre()
        );
    }
	
	//para pasar de dominio a entidad
	//convierte de Categoria, lo que se recibe internamente, a CategoriaEntity, para guaradr en la base de datos
	public CategoriaDTO toDTO(Categoria categoria) {
        if (categoria == null) return null;

        return new CategoriaDTO(
            categoria.getIdCat(),
            categoria.getNombre()
        );
    }
}
