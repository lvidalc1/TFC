package com.pfc.planGestion.repositorio.persistencia.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.pfc.planGestion.dominio.modelo.Cuenta;
import com.pfc.planGestion.dominio.repositorio.CuentaRepository;
import com.pfc.planGestion.repositorio.persistencia.jpa.CuentaJpaRepository;
import com.pfc.planGestion.repositorio.persistencia.mapper.CuentaEntityMapper;

@Repository
public class CuentaRepositoryDao implements CuentaRepository {
	
	private CuentaJpaRepository jpaRepository;
	
	private CuentaEntityMapper cuentaEntityMapper;
	
	public CuentaRepositoryDao(CuentaJpaRepository jpaRepository, CuentaEntityMapper cuentaEntityMapper) {
		this.jpaRepository=jpaRepository;
		this.cuentaEntityMapper=cuentaEntityMapper;
	}

	@Override
	public List<Cuenta> findByTitularNif(String nif) {
		return jpaRepository.findByTitularNif_nif(nif).stream()
				.map(cuentaEntityMapper::toDomain).collect(Collectors.toList());
	}

	@Override
	public Cuenta save(Cuenta cuenta) {
		return cuentaEntityMapper.toDomain(jpaRepository.save(cuentaEntityMapper.toEntity(cuenta)));
	}

	@Override
	public void deleteById(String iban) {
		jpaRepository.deleteById(iban);
	}

}
