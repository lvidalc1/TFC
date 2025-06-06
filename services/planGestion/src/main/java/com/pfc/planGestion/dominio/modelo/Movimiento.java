package com.pfc.planGestion.dominio.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Movimiento {
	private long idMov;
	private LocalDateTime fecha;
	private BigDecimal importe;
	private BigDecimal reintegro;
	private BigDecimal saldoActual;
	private Cuenta iban;
	
	public Movimiento() {}
	
	public Movimiento(long idMov, LocalDateTime fecha, BigDecimal importe, BigDecimal reintegro, BigDecimal saldoActual, Cuenta iban) {
		this.idMov=idMov;
		this.fecha=fecha;
		this.importe=importe;
		this.reintegro=reintegro;
		this.saldoActual=saldoActual;
		this.iban=iban;
	}
	
	public long getIdMov() {
		return idMov;
	}
	public void setIdMov(long idMov) {
		this.idMov=idMov;
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha=fecha;
	}
	
	public BigDecimal getImporte() {
		return importe;
	}
	public void setImporte(BigDecimal importe) {
		this.importe=importe;
	}
	
	public BigDecimal getReintegro() {
		return reintegro;
	}
	public void setReintegro(BigDecimal reintegro) {
		this.reintegro=reintegro;
	}
	
	public BigDecimal getSaldoActual() {
		return saldoActual;
	}
	public void setSaldoActual(BigDecimal saldoActual) {
		this.saldoActual=saldoActual;
	}
	
	public Cuenta getIban() {
		return iban;
	}
	public void setIban(Cuenta iban) {
		this.iban=iban;
	}
}

