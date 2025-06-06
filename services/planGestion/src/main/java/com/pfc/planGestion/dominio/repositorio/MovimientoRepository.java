package com.pfc.planGestion.dominio.repositorio;

import java.util.List;
import java.util.Optional;


import com.pfc.planGestion.dominio.modelo.Movimiento;

public interface MovimientoRepository {
	Movimiento save(Movimiento movimiento);

    List<Movimiento> findAll();

    Optional<Movimiento> findById(long idMov);

    List<Movimiento> findByCuenta_Iban(String iban);

    void deleteById(long idMov);

}
