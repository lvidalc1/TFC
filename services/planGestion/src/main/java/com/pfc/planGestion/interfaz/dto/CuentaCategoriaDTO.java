package com.pfc.planGestion.interfaz.dto;

public class CuentaCategoriaDTO {
	private int idCuentaCat;
	private String numCuenta;
	private String nombretitular;
	private String nombreCategoria;
    private Double presupuesto;
    private String frecuencia;
	
	public CuentaCategoriaDTO() {}
	
	public CuentaCategoriaDTO(int idCuentaCat, String numCuenta, String nombretitular, String nombreCategoria, Double presupuesto, String frecuencia) {
		this.idCuentaCat=idCuentaCat;
		this.numCuenta=numCuenta;
		this.nombretitular=nombretitular;
		this.nombreCategoria=nombreCategoria;
		this.presupuesto=presupuesto;
		this.frecuencia=frecuencia;
	}
	
	public int getIdCuentaCat() {
        return idCuentaCat;
    }
    public void setIdCuentaCat(int idCuentaCat) {
        this.idCuentaCat = idCuentaCat;
    }

    public String getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    public String getNombretitular() {
        return nombretitular;
    }
    public void setNombretitular(String nombretitular) {
        this.nombretitular = nombretitular;
    }
    
    public String getNombreCategoria() {
        return nombreCategoria;
    }
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public String getFrecuencia() {
    	return frecuencia;
    }
    public void setFrecuencia(String frecuencia) {
    	this.frecuencia=frecuencia;
    }
	

}
