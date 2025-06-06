package com.pfc.planGestion.repositorio.persistencia.mapper;

import org.springframework.stereotype.Component;

import com.pfc.planGestion.dominio.modelo.Movimiento;
import com.pfc.planGestion.repositorio.persistencia.entity.MovimientoEntity;

@Component
public class MovimientoEntityMapper {
	
	private CuentaEntityMapper cuentaEntityMapper;
	
	public MovimientoEntityMapper(CuentaEntityMapper cuentaEntityMapper) {
		this.cuentaEntityMapper=cuentaEntityMapper;
	}
	
	//convertir de entidad a dominio
	public Movimiento toDomain(MovimientoEntity entity) {
        if (entity == null) return null;

        return new Movimiento(
            entity.getIdMov(),
            entity.getFecha(),
            entity.getImporte(),
            entity.getReintegro(),
            entity.getSaldoActual(),
            cuentaEntityMapper.toDomain(entity.getIban())
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
            cuentaEntityMapper.toEntity(movimiento.getIban())
        );
    }

}
