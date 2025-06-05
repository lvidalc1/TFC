package com.pfc.planGestion.repositorio.persistencia.component;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cuenta_categoria")

public class CuentaCategoriaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idCc")
	private int idCuentaCat;
	@ManyToMany
    @JoinColumn(name = "iban_cuenta")
	private CuentaEntity cuenta;
	@ManyToMany
    @JoinColumn(name = "id_categoria")
	private CategoriaEntity categoria;
	@Column(name="presupuesto")
	private BigDecimal presupuesto;
	@Column(name="frecuencia")
	private String frecuencia;
	
	public CuentaCategoriaEntity() {}
	
	public CuentaCategoriaEntity(int idCuentaCat, CuentaEntity cuenta, CategoriaEntity categoria, BigDecimal presupuesto, String frecuencia) {
		this.idCuentaCat = idCuentaCat;
	    this.cuenta = cuenta;
	    this.categoria = categoria;
	    this.presupuesto = presupuesto;
	    this.frecuencia = frecuencia;
	}
	
	public int getIdCuentaCat() {
        return idCuentaCat;
    }
    public void setIdCuentaCat(int idCuentaCat) {
        this.idCuentaCat = idCuentaCat;
    }

    public CuentaEntity getCuenta() {
        return cuenta;
    }
    public void setCuenta(CuentaEntity cuenta) {
        this.cuenta = cuenta;
    }
    
    public CategoriaEntity getCategoria() {
        return categoria;
    }
    public void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
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
