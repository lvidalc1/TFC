package com.pfc.planGestion.aplicacion.negocio;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.pfc.planGestion.aplicacion.mapper.MovimientoDTOMapper;
import com.pfc.planGestion.dominio.repositorio.MovimientoRepository;
import com.pfc.planGestion.interfaz.dto.MovimientoDTO;

@Service
public class MovimientoService {
	private MovimientoRepository movimientoRepository;
	
	private MovimientoDTOMapper movimientoDTOMapper;

	public MovimientoService(MovimientoRepository movimientoRepository, MovimientoDTOMapper movimientoDTOMapper) {
		this.movimientoRepository = movimientoRepository;
		this.movimientoDTOMapper = movimientoDTOMapper;
	}

	public List<MovimientoDTO> obtenerTodos() {
		return movimientoRepository.findAll().stream().map(movimientoDTOMapper::toDTO).collect(Collectors.toList());
	}

	public Optional<MovimientoDTO> obtenerPorId(long id) {
		return Optional.of(movimientoDTOMapper.toDTO(movimientoRepository.findById(id).get()));
	}

	public List<MovimientoDTO> obtenerPorCuenta_Iban(String iban) {
		return movimientoRepository.findByCuenta_Iban(iban).stream().map(movimientoDTOMapper::toDTO).collect(Collectors.toList());
	}

	public MovimientoDTO guardarMovimiento(MovimientoDTO movimiento) {
		boolean importeValido = movimiento.getImporte() != null;
		boolean reintegroValido = movimiento.getReintegro() != null;
		if (importeValido == reintegroValido) {
			throw new IllegalArgumentException("Debe hacer o un importe o un reintegro");
			// Debe hacer o un importe o un reintegro pero no ambos ni ninguno
		}
		return movimientoDTOMapper.toDTO(movimientoRepository.save(movimientoDTOMapper.toDomain(movimiento)));
	}

}
