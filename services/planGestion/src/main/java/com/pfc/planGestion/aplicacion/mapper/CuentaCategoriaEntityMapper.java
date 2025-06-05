package com.pfc.planGestion.aplicacion.mapper;

import org.springframework.stereotype.Component;

import com.pfc.planGestion.dominio.modelo.CuentaCategoria;
import com.pfc.planGestion.repositorio.persistencia.component.CategoriaEntity;
import com.pfc.planGestion.repositorio.persistencia.component.CuentaCategoriaEntity;
import com.pfc.planGestion.repositorio.persistencia.component.CuentaEntity;

@Component
public class CuentaCategoriaEntityMapper {
	public CuentaCategoria toDomain(CuentaCategoriaEntity entity) {
        if (entity == null) return null;
        
        //extraer el iban de la cuenta (CuentaEntity con getIban())
        String ibanCuenta = null;
        if (entity.getCuenta() != null) {
            ibanCuenta = entity.getCuenta().getIban();
        }

        //extraer idCategoria de CategoriaEntity
        int idCategoria = 0;
        if (entity.getCategoria() != null) {
            idCategoria = entity.getCategoria().getIdCat();
        }

        return new CuentaCategoria(
            entity.getIdCuentaCat(),
            ibanCuenta,
            idCategoria,
            entity.getPresupuesto(),
            entity.getFrecuencia()
        );
    }

    public CuentaCategoriaEntity toEntity(CuentaCategoria domain) {
        if (domain == null) return null;

        CuentaCategoriaEntity entity = new CuentaCategoriaEntity();
        entity.setIdCuentaCat(domain.getIdCuentaCat());

        //crear solo la referencia con el id para no cargar toda la entidad
        if (domain.getIbanCuenta() != null) {
            CuentaEntity cuentaEntity = new CuentaEntity();
            cuentaEntity.setIban(domain.getIbanCuenta());
            entity.setCuenta(cuentaEntity);
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
