package com.pfc.planGestion.repositorio.persistencia.mapper;

import org.springframework.stereotype.Component;

import com.pfc.planGestion.dominio.modelo.Cuenta;
import com.pfc.planGestion.repositorio.persistencia.entity.CuentaEntity;

@Component
public class CuentaEntityMapper {

	private final UsuarioEntityMapper usuarioMapper;

	public CuentaEntityMapper(UsuarioEntityMapper usuarioMapper) {
		this.usuarioMapper = usuarioMapper;
	}

	public Cuenta toDomain(CuentaEntity entity) {
		if (entity == null)
			return null;

		return new Cuenta(
				entity.getIban(), 
				entity.getNumCuenta(), 
				usuarioMapper.toDomain(entity.getTitular()),
				entity.getSaldo());
	}

	public CuentaEntity toEntity(Cuenta cuenta) {
		if (cuenta == null)
			return null;

		return new CuentaEntity(
				cuenta.getIban(), 
				cuenta.getNumCuenta(), 
				usuarioMapper.toEntity(cuenta.getTitular()),
				cuenta.getSaldo());
	}
}