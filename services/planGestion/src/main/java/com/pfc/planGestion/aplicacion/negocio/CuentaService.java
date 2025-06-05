package com.pfc.planGestion.aplicacion.negocio;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.pfc.planGestion.aplicacion.mapper.CuentaEntityMapper;
import com.pfc.planGestion.dominio.modelo.Cuenta;
import com.pfc.planGestion.dominio.repositorio.CuentaRepository;
import com.pfc.planGestion.repositorio.persistencia.component.CuentaEntity;

@Service
public class CuentaService {
	private final CuentaRepository cuentaRepository;
	private final CuentaEntityMapper mapper;
	
	public CuentaService(CuentaRepository cuentaRepository, CuentaEntityMapper mapper) {
		this.cuentaRepository=cuentaRepository;
		this.mapper = mapper; 
	}
	
	public List<Cuenta> listarCuentasPorTitular(String nif){
		List<CuentaEntity> entidades = cuentaRepository.findByTitularNif(nif);
		return entidades.stream()
	            .map(mapper::toDomain)
	            .collect(Collectors.toList());
	}
	
	public Cuenta registrarCuenta(Cuenta cuenta) {
		CuentaEntity entity = mapper.toEntity(cuenta);
		entity = cuentaRepository.save(entity);
		return mapper.toDomain(entity);
	}
	
	public void eliminarCuenta(String iban) {
		cuentaRepository.deleteById(iban);
	}
}
