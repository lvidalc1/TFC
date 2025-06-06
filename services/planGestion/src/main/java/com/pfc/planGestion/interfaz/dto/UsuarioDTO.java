package com.pfc.planGestion.interfaz.dto;

public class UsuarioDTO {
	private String nif;
	private String pin;
	private String nombre;
	private String apel1;
	private String apel2;
	private String direccion;
	private String correo;
	
	public UsuarioDTO() {}
	
	public UsuarioDTO(String nif, String pin, String nombre, String apel1, String apel2, String direccion, String correo) {
		this.nif=nif;
		this.pin=pin;
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
/*en el DTO, se declaran los atributos otra vez, pero solo los necesarios para enviar o recibir datos, 
 * sin incluir anotaciones JPA.
 * Los setters y getters se vuelven a escribir, porque el DTO es una clase diferente a la entidad, con su propia estrcutura.
 * En DTO no hay que indicar claves primarias o foranes, ya que no representa una base de datos, solo datos planos para comunicar backend con frontend.*/
