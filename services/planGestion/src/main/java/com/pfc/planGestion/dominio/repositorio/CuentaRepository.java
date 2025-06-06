package com.pfc.planGestion.dominio.repositorio;

import java.util.List;

import com.pfc.planGestion.dominio.modelo.Cuenta;

public interface CuentaRepository {
	List<Cuenta> findByTitularNif(String nif);
	
	Cuenta save(Cuenta cuenta);
	
	void deleteById(String iban);

}