package com.pfc.planGestion.dominio.modelo;

public class Cuenta {
	private String iban;
	private String numCuenta;
	private Usuario titular;
	//un usuario puede tener varias cuentas
	private Double saldo;

	public Cuenta() {}

	public Cuenta(String iban, String numCuenta, Usuario titular, Double saldo) {
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
	
	public Usuario getTitular() {
		return titular;
	}
	public void setTitular(Usuario titular) {
		this.titular=titular;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo=saldo;
	}

}
