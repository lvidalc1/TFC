package com.pfc.planGestion.aplicacion.negocio;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.pfc.planGestion.aplicacion.mapper.CuentaDTOMapper;
import com.pfc.planGestion.dominio.modelo.Cuenta;
import com.pfc.planGestion.dominio.repositorio.CuentaRepository;
import com.pfc.planGestion.interfaz.dto.CuentaDTO;

@Service
public class CuentaService {
	private final CuentaRepository cuentaRepository;
	private final CuentaDTOMapper mapper;
	
	public CuentaService(CuentaRepository cuentaRepository, CuentaDTOMapper mapper) {
		this.cuentaRepository=cuentaRepository;
		this.mapper = mapper; 
	}
	
	public List<CuentaDTO> listarCuentasPorTitular(String nif){
		List<Cuenta> entidades = cuentaRepository.findByTitularNif(nif);
		return entidades.stream()
	            .map(mapper::toDTO)
	            .collect(Collectors.toList());
	}
	
	public CuentaDTO registrarCuenta(CuentaDTO cuentaDTO) {
		Cuenta cuenta = mapper.toDomain(cuentaDTO);
		cuenta = cuentaRepository.save(cuenta);
		return mapper.toDTO(cuenta);
	}
	
	public void eliminarCuenta(String iban) {
		cuentaRepository.deleteById(iban);
	}
}
