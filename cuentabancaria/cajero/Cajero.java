package cuentabancaria.cajero;

import cuentabancaria.cuenta.CuentaBancaria;

public class Cajero {
	private	boolean sesionStatus;
	private  CuentaBancaria cuenta;
	
	public Cajero() {
		this.sesionStatus = false;
		this.cuenta = null;
	}
	
	public void iniciarSesion(CuentaBancaria cuenta, String password) {
		if(cuenta.verificarPassword(password)) {
			sesionStatus = true;
			this.cuenta = cuenta;
			System.out.println("😀 Bienvenido al sistema 😀");
		}
		else {
			sesionStatus = false;
			System.out.println("Contraseña incorrecta intenta de nuevo. 😨");
		}
	}
	
	public  void cerrarSesion() {
		if(sesionStatus) {
			sesionStatus = false;
			this.cuenta = null;
			System.out.println("Se ha cerrado la sesion. 🙂");
		}
		else
			System.out.println("No ha iniciado sesion con ninguna cuenta.");
	}
	
	public void realizarDeposito(double cantidad) {
		if(sesionStatus && cantidad>0) {
			this.cuenta.setSaldo(this.cuenta.getSaldo() + cantidad);
			System.out.println("Se han depositado: "+cantidad);
		}
		else {
			System.out.println("Hubo un error, intente iniciar sesion o ingrese una cantidad de dinero correcta.");
		}
		
	}
	
	public  void realizarRetiro(double cantidad) {
		if(sesionStatus && cuenta.getSaldo()>=cantidad) {
			this.cuenta.setSaldo(this.cuenta.getSaldo()-cantidad);
			System.out.println("Se han retirado: $"+cantidad);
		}
		else {
			System.out.println("Hubo un error, intente iniciar sesion o ingrese una cantidad de dinero correcta.");
		}
	}
	
	public void mostrarSaldo() {
		if(sesionStatus) {
			System.out.println("--------------------------");
			System.out.println("Cliente: "+this.cuenta.getCliente().getNombre());
			System.out.println("Tipo de cuenta: "+this.cuenta.getTipo());
			System.out.println("Saldo disponible: $"+this.cuenta.getSaldo());
			System.out.println("--------------------------");
		}
		else {
			System.out.println("Hubo un error, intente iniciar sesion o ingrese una cantidad de dinero correcta.");
		}
	}
}
