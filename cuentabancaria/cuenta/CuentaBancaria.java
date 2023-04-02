package cuentabancaria.cuenta;

import cuentabancaria.titular.Titular;

public class CuentaBancaria {
	private Titular cliente;
	private int noCuenta;
	private double saldo;
	private String password;
	protected String tipo;
	
	/**
	 * @param cliente
	 * @param noCuenta
	 * @param saldo
	 * @param password
	 */
	public CuentaBancaria(Titular cliente, int noCuenta, double saldo, String password) {
		this.cliente = cliente;
		this.noCuenta = noCuenta;
		this.saldo = saldo;
		this.password = password;
	}

	/**
	 * @return the cliente
	 */
	public Titular getCliente() {
		return cliente;
	}
	

	/**
	 * @return the noCuenta
	 */
	public int getNoCuenta() {
		return noCuenta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	
	public void mostrarCuenta() {
		System.out.println("--------------------------");
		System.out.println("No. Cuenta: "+this.noCuenta);
		System.out.println("Saldo : $"+this.saldo);
		System.out.println("Tipo de cuenta : "+this.tipo);
		this.cliente.mostrarTitular();
		System.out.println("--------------------------");
	}
	
	/**
	 * 
	 * @param password
	 * @return
	 */
	public boolean verificarPassword(String password) {
		return this.password.equals(password) ? true : false;
	}
	
}
