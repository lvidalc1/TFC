package com.pfc.planGestion.interfaz.dto;

public class UsuarioCatDTO {
	private long idUsuarioCat;
	private String nif;
	private long categoria;
    private Double presupuesto;
    private String frecuencia;
	
	public UsuarioCatDTO() {}
	
	public UsuarioCatDTO(long idUsuarioCat, String nif, long categoria, Double presupuesto, String frecuencia) {
		this.idUsuarioCat=idUsuarioCat;
		this.nif=nif;
		this.categoria=categoria;
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

    public long getCategoria() {
		return categoria;
	}

	public void setCategoria(long categoria) {
		this.categoria = categoria;
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
