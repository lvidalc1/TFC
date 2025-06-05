package com.pfc.planGestion.dominio.modelo;

import java.math.BigDecimal;

public class Cuenta {
	private String iban;
	private String numCuenta;
	private Usuario titular;
	//un usuario puede tener varias cuentas
	private BigDecimal saldo;

	public Cuenta() {}

	public Cuenta(String iban, String numCuenta, Usuario titular, BigDecimal saldo) {
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
	
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo=saldo;
	}

}
