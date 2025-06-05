package com.pfc.planGestion.aplicacion.mapper;

import org.springframework.stereotype.Component;

import com.pfc.planGestion.dominio.modelo.Movimiento;
import com.pfc.planGestion.repositorio.persistencia.component.MovimientoEntity;

@Component
public class MovimientoEntityMapper {
	
	//convertir de entidad a dominio
	public Movimiento toDomain(MovimientoEntity entity) {
        if (entity == null) return null;

        return new Movimiento(
            entity.getIdMov(),
            entity.getFecha(),
            entity.getImporte(),
            entity.getReintegro(),
            entity.getSaldoActual(),
            entity.getIban()
        );
    }
	
	//convertir de dominio a entidad
	public MovimientoEntity toEntity(Movimiento movimiento) {
        if (movimiento == null) return null;

        return new MovimientoEntity(
            movimiento.getIdMov(),
            movimiento.getFecha(),
            movimiento.getImporte(),
            movimiento.getReintegro(),
            movimiento.getSaldoActual(),
            movimiento.getIban()
        );
    }

}
