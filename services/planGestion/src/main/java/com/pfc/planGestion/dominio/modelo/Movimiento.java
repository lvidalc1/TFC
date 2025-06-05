package com.pfc.planGestion.dominio.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.pfc.planGestion.repositorio.persistencia.component.CuentaEntity;

public class Movimiento {
	private int idMov;
	private LocalDateTime fecha;
	private BigDecimal importe;
	private BigDecimal reintegro;
	private BigDecimal saldoActual;
	private CuentaEntity iban;
//	private String nombreTitular;
//	private String nombreCategoria;
	
	public Movimiento() {}
	
	public Movimiento(int idMov, LocalDateTime fecha, BigDecimal importe, BigDecimal reintegro, BigDecimal saldoActual, CuentaEntity iban) {
		this.idMov=idMov;
		this.fecha=fecha;
		this.importe=importe;
		this.reintegro=reintegro;
		this.saldoActual=saldoActual;
		this.iban=iban;
//		this.nombreTitular=nombreTitular;
//		this.nombreCategoria=nombreCategoria;
	}
	
	public int getIdMov() {
		return idMov;
	}
	public void setIdMov(int idMov) {
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
	
	public CuentaEntity getIban() {
		return iban;
	}
	public void setIban(CuentaEntity iban) {
		this.iban=iban;
	}
	
//	public String getNombreTitular() {
//		return nombreTitular;
//	}
//	public void setNombreTitular(String nombreTitular) {
//		this.nombreTitular=nombreTitular;
//	}
	
//	public String getNombreCategoria() {
//		return nombreCategoria;
//	}
//	public void setNombreCategoria(String nombreCategoria) {
//		this.nombreCategoria=nombreCategoria;
//	}
}

