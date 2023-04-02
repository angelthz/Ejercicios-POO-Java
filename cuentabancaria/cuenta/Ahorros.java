package cuentabancaria.cuenta;

import cuentabancaria.titular.Titular;

public class Ahorros extends CuentaBancaria {

	public Ahorros(Titular cliente, int noCuenta, double saldo, String password) {
		super(cliente, noCuenta, saldo, password);
		super.tipo = this.getClass().getSimpleName();
	}
	

}
