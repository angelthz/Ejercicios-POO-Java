package cuentabancaria;

import cuentabancaria.cajero.Cajero;
import cuentabancaria.cuenta.Ahorros;
import cuentabancaria.cuenta.Corriente;
import cuentabancaria.cuenta.CuentaBancaria;
import cuentabancaria.titular.Titular;

public class DemoCuentaBancaria {
	public static void main(String[] args) {
		//instanciamos los titulares
		Titular angel = new Titular("Angel", "Torres", "TOHA941120");
		Titular ana = new Titular("Ana","Gomez","GOTA991030");

		//instanciamos las cuentas bancarias
		CuentaBancaria cuentaAngel = new Corriente(angel, 1674879, 50.00, "2011");
		CuentaBancaria cuentaAna = new Ahorros(ana, 1563768, 1000.00, "kitten");
		
		//instanciamos un nuevo cajero
		Cajero cajero = new Cajero();
		
		//////
		//pruebas
		//mostramos los datos de la cuenta
		cuentaAngel.mostrarCuenta();
		//cuentaAna.mostrarCuenta();
		
		//pruebas del cajero
		
		//inicio de sesion
		cajero.iniciarSesion(cuentaAngel, "0000");
		cajero.iniciarSesion(cuentaAngel, "2011");
		
		//realizando deposito
		cajero.realizarDeposito(1200);
		cajero.mostrarSaldo();
		
		//realizando retiro
		cajero.realizarRetiro(2000);
		cajero.mostrarSaldo();
	}
}
