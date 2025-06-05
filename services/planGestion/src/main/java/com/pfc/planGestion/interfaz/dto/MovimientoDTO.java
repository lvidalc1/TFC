package com.pfc.planGestion.interfaz.dto;

import java.time.LocalDateTime;

public class MovimientoDTO {
    private LocalDateTime fecha;
    private Double importe;
    private Double reintegro;
    private Double saldoActual;
//    private String nombreCategoria;
    
    public MovimientoDTO() {}

    public MovimientoDTO(LocalDateTime fecha, Double importe, Double reintegro, Double saldoActual) {
        this.fecha = fecha;
        this.importe = importe;
        this.reintegro=reintegro;
        this.saldoActual = saldoActual;
//		this.nombreCategoria=nombreCategoria;

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
	
//	public String getNombreCategoria() {
//		return nombreCategoria;
//	}
//	public void setNombreCategoria(String nombreCategoria) {
//		this.nombreCategoria=nombreCategoria;
//	}
	

}
