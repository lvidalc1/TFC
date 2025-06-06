package com.pfc.planGestion.repositorio.persistencia.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario_categoria")
public class UsuarioCatEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_uc")
	private long idUsuarioCat;
	@ManyToOne
    @JoinColumn(name = "nif_usuario")
	private UsuarioEntity usuario;
	@ManyToOne
    @JoinColumn(name = "id_categoria")
	private CategoriaEntity categoria;
	@Column(name="presupuesto")
	private BigDecimal presupuesto;
	@Column(name="frecuencia")
	private String frecuencia;
	
	public UsuarioCatEntity() {}
	
	public UsuarioCatEntity(long idUsuarioCat, UsuarioEntity usuario, CategoriaEntity categoria, BigDecimal presupuesto, String frecuencia) {
		this.idUsuarioCat = idUsuarioCat;
	    this.usuario = usuario;
	    this.categoria = categoria;
	    this.presupuesto = presupuesto;
	    this.frecuencia = frecuencia;
	}
	
	public long getIdUsuarioCat() {
        return idUsuarioCat;
    }
    public void setIdUsuarioCat(long idUsuarioCat) {
        this.idUsuarioCat = idUsuarioCat;
    }
    
    public CategoriaEntity getCategoria() {
        return categoria;
    }
    public UsuarioEntity getUsuario()
    {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario)
    {
        this.usuario = usuario;
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
