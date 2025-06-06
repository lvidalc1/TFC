package com.pfc.planGestion.aplicacion.mapper;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.pfc.planGestion.dominio.modelo.Movimiento;
import com.pfc.planGestion.interfaz.dto.MovimientoDTO;

@Component
public class MovimientoDTOMapper {
	
	private CuentaDTOMapper cuentaDTOMapper;
	
	public MovimientoDTOMapper(CuentaDTOMapper cuentaDTOMapper) {
		this.cuentaDTOMapper=cuentaDTOMapper;
	}
	
	//convertir de entidad a dominio
	public Movimiento toDomain(MovimientoDTO dto) {
        if (dto == null) return null;

        return new Movimiento(
        		dto.getIdMov(),
        		dto.getFecha(),
        		dto.getImporte() != null ? new BigDecimal(dto.getImporte()) : null,
				dto.getReintegro() != null ? new BigDecimal(dto.getReintegro()) : null,
        		new BigDecimal(dto.getSaldoActual()),
        		cuentaDTOMapper.toDomain(dto.getCuenta())
        );
    }
	
	//convertir de dominio a entidad
	public MovimientoDTO toDTO(Movimiento movimiento) {
        if (movimiento == null) return null;

        return new MovimientoDTO(
            movimiento.getIdMov(),
            movimiento.getFecha(),
            movimiento.getImporte() != null ? movimiento.getImporte().doubleValue() : null,
            movimiento.getReintegro() != null ? movimiento.getReintegro().doubleValue() : null,
            movimiento.getSaldoActual().doubleValue(),
            cuentaDTOMapper.toDTO(movimiento.getIban())
        );
    }

}
