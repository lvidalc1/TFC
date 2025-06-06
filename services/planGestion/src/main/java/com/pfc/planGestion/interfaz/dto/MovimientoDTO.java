package com.pfc.planGestion.interfaz.dto;

import java.time.LocalDateTime;

public class MovimientoDTO {
	private long idMov;
    private LocalDateTime fecha;
    private Double importe;
    private Double reintegro;
    private Double saldoActual;
    private CuentaDTO cuenta;
    
    public MovimientoDTO() {}

    public MovimientoDTO(long idMov, LocalDateTime fecha, Double importe, Double reintegro, Double saldoActual, CuentaDTO cuenta) {
        this.idMov=idMov;
    	this.fecha = fecha;
        this.importe = importe;
        this.reintegro=reintegro;
        this.saldoActual = saldoActual;
        this.cuenta=cuenta;
    }
    
	
	public long getIdMov() {
		return idMov;
	}

	public void setIdMov(long idMov) {
		this.idMov = idMov;
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

	public CuentaDTO getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaDTO cuenta) {
		this.cuenta = cuenta;
	}
	

}
