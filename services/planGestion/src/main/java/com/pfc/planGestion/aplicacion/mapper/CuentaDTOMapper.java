package com.pfc.planGestion.aplicacion.mapper;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.pfc.planGestion.dominio.modelo.Cuenta;
import com.pfc.planGestion.dominio.modelo.Usuario;
import com.pfc.planGestion.interfaz.dto.CuentaDTO;

@Component
public class CuentaDTOMapper {

	private final UsuarioDTOMapper usuarioDTOMapper;

	public CuentaDTOMapper(UsuarioDTOMapper usuarioDTOMapper) {
		this.usuarioDTOMapper = usuarioDTOMapper;
	}

	public Cuenta toDomain(CuentaDTO dto) {
		if (dto == null)
			return null;

		return new Cuenta(
				dto.getIban(), 
				dto.getNumCuenta(), 
				new Usuario(dto.getTitular().getNif(),
						null,
						dto.getTitular().getNombre(),
						dto.getTitular().getApel1(),
						dto.getTitular().getApel2(),
						dto.getTitular().getDireccion(),
						dto.getTitular().getCorreo()),
				new BigDecimal(dto.getSaldo()));
	}

	public CuentaDTO toDTO(Cuenta cuenta) {
		if (cuenta == null)
			return null;

		return new CuentaDTO(
				cuenta.getIban(), 
				cuenta.getNumCuenta(), 
				usuarioDTOMapper.toDTO(cuenta.getTitular()),
				cuenta.getSaldo().doubleValue());
	}
}