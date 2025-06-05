package com.pfc.planGestion.interfaz.dto;

public class LoginDTO {
	
	private String nif;
	private String pin;

	public LoginDTO(String nif, String pin) {
		this.nif = nif;
		this.pin = pin;
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
}

//url postman para login Get-> http://localhost:8082/login?nif='12345678A'&pin='123456'

