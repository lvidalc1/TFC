package com.pfc.planGestion.repositorio.persistencia.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="movimientos")
public class MovimientoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mov")
	private long idMov;
	@Column(name = "fecha")
	private LocalDateTime fecha;
	@Column(name = "importe")
	private BigDecimal importe;
	@Column(name = "reintegro")
	private BigDecimal reintegro;
	@Column(name = "saldoActual")
	private BigDecimal saldoActual;
	@ManyToOne
	@JoinColumn(name = "iban_cuenta")
	private CuentaEntity iban;
//	@ManyToOne
//    @JoinColumn(name = "id_categoria")
//	private CategoriaEntity nombreCategoria;
	
	public MovimientoEntity() {}
	
	public MovimientoEntity(long idMov, LocalDateTime fecha, BigDecimal importe, BigDecimal reintegro, BigDecimal saldoActual, CuentaEntity iban) {
		this.idMov=idMov;
		this.fecha=fecha;
		this.importe=importe;
		this.reintegro=reintegro;
		this.saldoActual=saldoActual;
		this.iban=iban;
//		this.nombreCategoria=nombreCategoria;
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
	
	public CuentaEntity getIban() {
		return iban;
	}
	public void setIban(CuentaEntity iban) {
		this.iban=iban;
	}
	
//	public CategoriaEntity getNombreCategoria() {
//		return nombreCategoria;
//	}
//	public void setNombreCategoria(CategoriaEntity nombreCategoria) {
//		this.nombreCategoria=nombreCategoria;
//	}
}
