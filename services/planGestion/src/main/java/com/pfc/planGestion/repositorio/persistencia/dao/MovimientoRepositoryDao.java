package com.pfc.planGestion.repositorio.persistencia.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfc.planGestion.dominio.modelo.Movimiento;
import com.pfc.planGestion.dominio.repositorio.MovimientoRepository;
import com.pfc.planGestion.repositorio.persistencia.jpa.MovimientoJpaRepository;
import com.pfc.planGestion.repositorio.persistencia.mapper.MovimientoEntityMapper;

@Repository
public class MovimientoRepositoryDao implements MovimientoRepository {
	private final MovimientoJpaRepository jpaRepository;
    private final MovimientoEntityMapper mapper;

    @Autowired
    public MovimientoRepositoryDao(MovimientoJpaRepository jpaRepository, MovimientoEntityMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public Movimiento save(Movimiento movimiento) {
        return mapper.toDomain(
            jpaRepository.save(
                mapper.toEntity(movimiento)
            )
        );
    }

    @Override
    public List<Movimiento> findAll() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Movimiento> findById(long idMov) {
        return jpaRepository.findById(idMov)
                .map(mapper::toDomain);
    }

    @Override
    public List<Movimiento> findByCuenta_Iban(String iban) {
        return jpaRepository.findByIban_Iban(iban).stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(long idMov) {
        jpaRepository.deleteById(idMov);
    }

}
