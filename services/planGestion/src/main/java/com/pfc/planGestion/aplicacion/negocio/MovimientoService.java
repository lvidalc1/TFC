package com.pfc.planGestion.aplicacion.negocio;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pfc.planGestion.dominio.modelo.Movimiento;
import com.pfc.planGestion.dominio.repositorio.MovimientoRepository;

@Service
public class MovimientoService {
	private final MovimientoRepository movimientoRepository;

	public MovimientoService(MovimientoRepository movimientoRepository) {
		this.movimientoRepository = movimientoRepository;
	}

	public List<Movimiento> obtenerTodos() {
		return movimientoRepository.findAll();
	}

	public Optional<Movimiento> obtenerPorId(int id) {
		return movimientoRepository.findById(id);
	}

	public List<Movimiento> obtenerPorCuenta_Iban(String iban) {
		return movimientoRepository.findByCuenta_Iban(iban);
	}

	public Movimiento guardarMovimiento(Movimiento movimiento) {
		boolean importeValido = movimiento.getImporte() != null;
		boolean reintegroValido = movimiento.getReintegro() != null;
		if (importeValido == reintegroValido) {
			throw new IllegalArgumentException("Debe hacer o un importe o un reintegro");
			// Debe hacer o un importe o un reintegro pero no ambos ni ninguno
		}
		return movimientoRepository.save(movimiento);
	}

//    public void eliminarMovimiento(int id) {
//        movimientoRepository.deleteById(id);
//    }

}
