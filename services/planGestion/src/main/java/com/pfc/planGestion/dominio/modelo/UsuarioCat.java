package com.pfc.planGestion.dominio.modelo;

import java.math.BigDecimal;

public class UsuarioCat {
	private  long idUsuarioCat;
	private String nif;
	private long idCategoria;
	private BigDecimal presupuesto;
	private String frecuencia;
	
	public UsuarioCat() {}
	
	public UsuarioCat(long idUsuarioCat, String nif, long idCategoria, BigDecimal presupuesto, String frecuencia) {
		this.idUsuarioCat=idUsuarioCat;
		this.nif=nif;
		this.presupuesto=presupuesto;
		this.frecuencia=frecuencia;
	}
	
	public long getIdUsuarioCat() {
        return idUsuarioCat;
    }
    public void setIdUsuarioCat(long idUsuarioCat) {
        this.idUsuarioCat = idUsuarioCat;
    }
    
    public String getNif()
    {
        return nif;
    }

    public void setNif(String nif)
    {
        this.nif = nif;
    }

    public long getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(long idCategoria) {
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
