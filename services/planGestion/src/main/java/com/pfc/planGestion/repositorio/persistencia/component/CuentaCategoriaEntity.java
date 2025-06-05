package com.pfc.planGestion.repositorio.persistencia.component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cuentaCategorias")

public class CuentaCategoriaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private  int idCuentaCat;
	private String ibanCuenta;
	private int idCategoria;
	private Double presupuesto;
	private String frecuencia;
	
	public CuentaCategoriaEntity() {}
	
	public CuentaCategoriaEntity(int idCuentaCat, String ibanCuenta, int idCategoria, Double presupuesto, String frecuencia) {
		
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
