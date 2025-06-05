package com.pfc.planGestion.repositorio.persistencia.component;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name="usuarios")
@Entity
public class UsuarioEntity {
	@Id//esta anotacion id, marca el campo nif como clave primaria
	private String nif;
	private String pin;
	private String nombre;
	private String apel1;
	private String apel2;
	private String direccion;
	private String correo;
	

	@OneToMany(mappedBy = "titular")
	private List<CuentaEntity> cuentas;//las entidades JPA deben referirse solo a otras entidades JPA, no a modelos de dominio
	
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
	
	//getters y setters para Cuentas de usuario
	
	public List<CuentaEntity> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<CuentaEntity> cuentas) {
        this.cuentas = cuentas;
    }
	
}
