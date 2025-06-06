package com.pfc.planGestion.repositorio.persistencia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="usuarios")
@Entity
public class UsuarioEntity {
	//esta anotacion id, marca el campo nif como clave primaria
	@Id
	@Column(name = "nif")
	private String nif;
	@Column(name = "pin")
	private String pin;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apel1")
	private String apel1;
	@Column(name = "apel2")
	private String apel2;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "correo")
	private String correo;
	
	public UsuarioEntity() {
		
	}
	
	public UsuarioEntity(String nif, String pin, String nombre, String apel1, String apel2, String direccion, String correo) {
		this.nif = nif;
		this.pin = pin;
		this.nombre=nombre;
		this.apel1=apel1;
		this.apel2=apel2;
		this.direccion=direccion;
		this.correo=correo;
	}

	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getApel1() {
		return apel1;
	}
	public void setApel1(String apel1) {
		this.apel1=apel1;
	}
	
	public String getApel2() {
		return apel2;
	}
	public void setApel2(String apel2) {
		this.apel2=apel2;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo=correo;
	}
	
}
