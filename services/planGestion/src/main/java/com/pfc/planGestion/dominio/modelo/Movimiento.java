package com.pfc.planGestion.dominio.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;
//import java.time.LocalDateTime;

@Entity
@Table(name="movimientos")

public class Movimiento {
	@Id
	private int idMov;
	private Timestamp fecha;//la fecha no puede ser el id, pq se pueden realizar movimientos en la misma hora
//	private LocalDateTime fecha;
//	private Double ingresos;
//	private Double gastos;
	private Double importe;//en vez de ingresos y gastos, un solo importe y que este sea positivo o negativo dependiendo de si es un ingreso o gasto
	private Double saldoAnterior;
	private Double saldoActual;
	private String IBAN;
	
	public Movimiento() {}
	
	public Movimiento(int idMov, Timestamp fecha, Double importe, Double saldoAnterior, Double saldoActual, String IBAN) {
		this.idMov=idMov;
		this.fecha=fecha;
		this.importe=importe;
		this.saldoAnterior=saldoAnterior;
		this.saldoActual=saldoActual;
		this.IBAN=IBAN;
	}
	
	public int getIdMov() {
		return idMov;
	}
	public void setIdMov(int idMov) {
		this.idMov=idMov;
	}
	
	public Timestamp getFecha() {
		return fecha;
	}
	public void setFecha(Timestamp fecha) {
		this.fecha=fecha;
	}
	
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe=importe;
	}
	
	public Double getSaldoAnterior() {
		return saldoAnterior;
	}
	public void setSaldoAnterior(Double saldoAnterior) {
		this.saldoAnterior=saldoAnterior;
	}
	
	public Double getSaldoActual() {
		return saldoActual;
	}
	public void setSaldoActual(Double saldoActual) {
		this.saldoActual=saldoActual;
	}
	
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String IBAN) {
		this.IBAN=IBAN;
	}
}

