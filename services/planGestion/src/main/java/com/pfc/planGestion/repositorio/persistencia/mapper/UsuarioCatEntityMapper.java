package com.pfc.planGestion.repositorio.persistencia.mapper;

import org.springframework.stereotype.Component;

import com.pfc.planGestion.dominio.modelo.UsuarioCat;
import com.pfc.planGestion.repositorio.persistencia.entity.CategoriaEntity;
import com.pfc.planGestion.repositorio.persistencia.entity.UsuarioCatEntity;
import com.pfc.planGestion.repositorio.persistencia.entity.UsuarioEntity;

@Component
public class UsuarioCatEntityMapper {
	public UsuarioCat toDomain(UsuarioCatEntity entity) {
        if (entity == null) return null;
        
        //extraer el iban de la cuenta (CuentaEntity con getIban())
        String nif = null;
        if (entity.getUsuario() != null) {
            nif = entity.getUsuario().getNif();
        }

        //extraer idCategoria de CategoriaEntity
        long idCategoria = 0;
        if (entity.getCategoria() != null) {
            idCategoria = entity.getCategoria().getIdCat();
        }

        return new UsuarioCat(
            entity.getIdUsuarioCat(),
            nif,
            idCategoria,
            entity.getPresupuesto(),
            entity.getFrecuencia()
        );
    }

    public UsuarioCatEntity toEntity(UsuarioCat domain) {
        if (domain == null) return null;

        UsuarioCatEntity entity = new UsuarioCatEntity();
        entity.setIdUsuarioCat(domain.getIdUsuarioCat());

        //crear solo la referencia con el id para no cargar toda la entidad
        if (domain.getNif() != null) {
            UsuarioEntity usuarioEntity = new UsuarioEntity();
            usuarioEntity.setNif(domain.getNif());
            entity.setUsuario(usuarioEntity);
        }

        if (domain.getIdCategoria() != 0) {
            CategoriaEntity categoriaEntity = new CategoriaEntity();
            categoriaEntity.setIdCat(domain.getIdCategoria());
            entity.setCategoria(categoriaEntity);
        }

        entity.setPresupuesto(domain.getPresupuesto());
        entity.setFrecuencia(domain.getFrecuencia());

        return entity;
    }

}
