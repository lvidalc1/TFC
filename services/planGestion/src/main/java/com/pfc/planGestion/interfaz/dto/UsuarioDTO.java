package com.pfc.planGestion.interfaz.dto;

import com.pfc.planGestion.dominio.modelo.Usuario;

public class UsuarioDTO {
	private String nif;
	private String nombre;
	private String apel1;
	private String apel2;
	private String direccion;
	private String correo;
	
	public UsuarioDTO() {}
	
	public UsuarioDTO(Usuario usuario) {
		this.nif=usuario.getNif();
		this.nombre=usuario.getNombre();
		this.apel1=usuario.getApel1();
		this.apel2=usuario.getApel2();
		this.direccion=usuario.getDireccion();
		this.correo=usuario.getCorreo();
	}
	
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
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
/*en el DTO, se declaran los atributos otra vez, pero solo los necesarios para enviar o recibir datos, 
 * sin incluir anotaciones JPA.
 * Los setters y getters se vuelven a escribir, porque el DTO es una clase diferente a la entidad, con su propia estrcutura.
 * En DTO no hay que indicar claves primarias o foranes, ya que no representa una base de datos, solo datos planos para comunicar backend con frontend.*/
