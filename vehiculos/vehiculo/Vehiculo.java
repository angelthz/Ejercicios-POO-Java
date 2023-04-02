package vehiculos.vehiculo;

import vehiculos.gps.Gps;
import vehiculos.motor.Motor;
import vehiculos.pedales.Acelerador;
import vehiculos.pedales.Freno;
import vehiculos.pedales.Pedal;
import vehiculos.pintura.Pintura;

public class Vehiculo {
	private String fabricante;
	private int anio;
	private int noPuertas;
	private int noAsientos;
	private Pintura color;
	private Motor motor;
	private Pedal acelerador;
	private Pedal freno;
	
	
	/**
	 * @param fabricante
	 * @param anio
	 * @param noPuertas
	 * @param noAsientos
	 * @param color
	 * @param motor
	 */
	public Vehiculo(String fabricante, int anio, int noPuertas, int noAsientos, Pintura color, Motor motor) {
		super();
		this.fabricante = fabricante;
		this.anio = anio;
		this.noPuertas = noPuertas;
		this.noAsientos = noAsientos;
		this.color = color;
		this.motor = motor;
		this.acelerador = new Acelerador();
		this.freno = new Freno();
	}


	/**
	 * @param fabricante
	 * @param anio
	 * @param noPuertas
	 * @param noAsientos
	 * @param color
	 * @param motor
	 */
	/*public Vehiculo(String fabricante, int anio, short noPuertas, short noAsientos, Color color, Motor motor) {
		this.fabricante = fabricante;
		this.anio = anio;
		this.noPuertas = noPuertas;
		this.noAsientos = noAsientos;
		this.color = color;
		this.motor = motor;
		this.acelerador = new Acelerador();
		this.freno = new Freno();
	}*/


	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}


	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}


	/**
	 * @return the noPuertas
	 */
	public int getNoPuertas() {
		return noPuertas;
	}


	/**
	 * @return the noAsientos
	 */
	public int getNoAsientos() {
		return noAsientos;
	}


	/**
	 * @return the color
	 */
	public Pintura getColor() {
		return color;
	}


	/**
	 * @return the motor
	 */
	public Motor getMotor() {
		return motor;
	}


	/**
	 * @return the acelerador
	 */
	public Pedal getAcelerador() {
		return acelerador;
	}


	/**
	 * @return the freno
	 */
	public Pedal getFreno() {
		return freno;
	}
	
	/**
	 * Enciende el motor del auto
	 */
	public void encederAuto() {
		this.motor.encederMotor();
	}
	
	/**
	 * Apaga el motor del auto
	 */
	public void apagarAuto() {
		this.motor.apagarMotor();
	}
	
	/**
	 * Presiona el acelerador del auto
	 * @param presion
	 */
	public void presionarAcelerador(int presion) {
		if(this.motor.getEstado()) {
			this.acelerador.setPresion(presion);
			this.acelerador.presionar(motor);
			System.out.println("Velocidad actual: " + motor.getVelActual() +"Km/h");
		}
		else {
			System.out.println("El auto esta apagado");
		}
	}
	
	/**
	 * Deja de soltar el acelerador
	 */
	public void soltarAcelerador() {
		if(this.motor.getEstado()) {
			this.acelerador.soltar(motor);
			System.out.println("Velocidad actual: " + motor.getVelActual() +"Km/h");
		}
		else {
			System.out.println("El auto esta apagado");
		}
	}
	
	/**
	 * Presiona el freno del auto
	 * @param presion
	 */
	public void presionarFreno(int presion) {
		if(this.motor.getEstado()) {
			this.freno.setPresion(presion);
			this.freno.presionar(motor);
			System.out.println("Velocidad actual: " + motor.getVelActual() +"Km/h");
		}
		else {
			System.out.println("El auto esta apagado");
		}
	}
	/**
	 * Deja de presionar el freno
	 */
	public void soltarFreno() {
		if(this.motor.getEstado()) {
			this.freno.soltar(motor);
			System.out.println("Velocidad actual: " + motor.getVelActual() +"Km/h");
		}
		else {
			System.out.println("El auto esta apagado");
		}
	}
	
	
	public void mostrarVelocidad() {
		System.out.println(motor.getVelActual() + " Km/h");
	}
	/**
	 * Usa el gps para calcular tu tiempo de llegada
	 * @param distancia a recorrer
	 */
	public void usarGps(float distancia) {
		if(motor.getEstado() && motor.getVelActual() > 0)
			System.out.println("Tiempo estimado: " + Gps.calcularTiempoLlegada(distancia, motor.getVelActual()) );
		else {
			System.out.println("El auto esta apagado o aun no esta en marcha");
		}
	}
	
	
	public void describeVehiculo() {
		System.out.println("Marca: " + this.fabricante);
		System.out.println("Año: " + this.anio);
		System.out.println("Num. de Puertas: " + this.noPuertas);
		System.out.println("Num. de Asientos: " + this.noAsientos);
		System.out.println("Color: " + this.color);
		System.out.println("Motor: " + this.motor.getFabricante());
	}
	
}
