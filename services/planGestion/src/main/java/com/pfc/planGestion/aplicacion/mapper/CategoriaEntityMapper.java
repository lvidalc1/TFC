package com.pfc.planGestion.aplicacion.mapper;

import org.springframework.stereotype.Component;

import com.pfc.planGestion.dominio.modelo.Categoria;
import com.pfc.planGestion.repositorio.persistencia.component.CategoriaEntity;

@Component
public class CategoriaEntityMapper {
	
	//para pasar de entidad a dominio
	//convierte de CategoriaEntity, es decir, lo que viene de la base de datos, al modelo de negocio Categoria
	public Categoria toDomain(CategoriaEntity entity) {
        if (entity == null) return null;

        return new Categoria(
            entity.getIdCat(),
            entity.getNombre()
        );
    }
	
	//para pasar de dominio a entidad
	//convierte de Categoria, lo que se recibe internamente, a CategoriaEntity, para guaradr en la base de datos
	public CategoriaEntity toEntity(Categoria categoria) {
        if (categoria == null) return null;

        return new CategoriaEntity(
            categoria.getIdCat(),
            categoria.getNombre()
        );
    }
}
