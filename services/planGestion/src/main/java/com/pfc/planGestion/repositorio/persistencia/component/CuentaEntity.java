package com.pfc.planGestion.repositorio.persistencia.component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuentas")

public class CuentaEntity {
	@Id
	private String iban;
	private String numCuenta;
	@ManyToOne
	@JoinColumn(name = "nif_usuario")
	private UsuarioEntity titular;
	// un usuario puede tener varias cuentas

	private Double saldo;

	public CuentaEntity() {

	}

	public CuentaEntity(String iban, String numCuenta, UsuarioEntity titular, Double saldo) {
		this.iban = iban;
		this.numCuenta = numCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public UsuarioEntity getTitular() {
		return titular;
	}

	public void setTitular(UsuarioEntity titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
