package com.pfc.planGestion.interfaz.dto;

import com.pfc.planGestion.dominio.modelo.Cuenta;
import com.pfc.planGestion.dominio.modelo.Usuario;

public class CuentaDTO {
	private String iban;
	private String numCuenta;
	private Usuario titular;
	private Double saldo;
	
	public CuentaDTO() {}
	
	public CuentaDTO(Cuenta cuenta) {
		this.iban=cuenta.getIban();
		this.numCuenta=cuenta.getNumCuenta();
		this.titular=cuenta.getTitular();
		this.saldo=cuenta.getSaldo().doubleValue();
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
