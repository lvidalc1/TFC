package com.pfc.planGestion.interfaz.dto;

public class CuentaDTO {
	private String iban;
	private String numCuenta;
	private UsuarioDTO titular;
	private Double saldo;
	
	public CuentaDTO() {}
	
	public CuentaDTO(String iban, String numCuenta, UsuarioDTO titular, Double saldo) {
		this.iban=iban;
		this.numCuenta=numCuenta;
		this.titular=titular;
		this.saldo=saldo;
	}

	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban=iban;
	}
	
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta=numCuenta;
	}
	
	public UsuarioDTO getTitular() {
		return titular;
	}
	public void setTitular(UsuarioDTO titular) {
		this.titular=titular;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo=saldo;
	}

}
