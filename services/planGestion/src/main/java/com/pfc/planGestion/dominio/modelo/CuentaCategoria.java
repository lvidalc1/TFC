package com.pfc.planGestion.dominio.modelo;

import java.math.BigDecimal;

public class CuentaCategoria {
	private  int idCuentaCat;
	private String ibanCuenta;
	private int idCategoria;
	private BigDecimal presupuesto;
	private String frecuencia;
	
	public CuentaCategoria() {}
	
	public CuentaCategoria(int idCuentaCat, String ibanCuenta, int idCategoria, BigDecimal presupuesto, String frecuencia) {
		this.idCuentaCat=idCuentaCat;
		this.ibanCuenta=ibanCuenta;
		this.presupuesto=presupuesto;
		this.frecuencia=frecuencia;
	}
	
	public int getIdCuentaCat() {
        return idCuentaCat;
    }
    public void setIdCuentaCat(int idCuentaCat) {
        this.idCuentaCat = idCuentaCat;
    }

    public String getIbanCuenta() {
        return ibanCuenta;
    }
    public void setIbanCuenta(String ibanCuenta) {
        this.ibanCuenta = ibanCuenta;
    }
    
    public int getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public BigDecimal getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(BigDecimal presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public String getFrecuencia() {
    	return frecuencia;
    }
    public void setFrecuencia(String frecuencia) {
    	this.frecuencia=frecuencia;
    }

}
