package com.pfc.planGestion.repositorio.persistencia.component;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movimientos")

public class MovimientoEntity {
	@Id
	private int idMov;
	@Column(name = "fecha")
	private LocalDateTime fecha;
	private Double importe;
	private Double reintegro;
	private Double saldoActual;
	@Column(name = "iban")
	private String iban;
	
	public MovimientoEntity() {}
	
	public MovimientoEntity(int idMov, LocalDateTime fecha, Double importe, Double reintegro, Double saldoActual, String iban) {
		this.idMov=idMov;
		this.fecha=fecha;
		this.importe=importe;
		this.reintegro=reintegro;
		this.saldoActual=saldoActual;
		this.iban=iban;
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
	
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe=importe;
	}
	
	public Double getReintegro() {
		return reintegro;
	}
	public void setReintegro(Double reintegro) {
		this.reintegro=reintegro;
	}
	
	public Double getSaldoActual() {
		return saldoActual;
	}
	public void setSaldoActual(Double saldoActual) {
		this.saldoActual=saldoActual;
	}
	
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban=iban;
	}
}
