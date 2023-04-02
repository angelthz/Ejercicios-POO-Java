package vehiculos.vehiculo;

import vehiculos.motor.Motor;
import vehiculos.pedales.Pedal;
import vehiculos.pintura.Pintura;

public class Deportivo extends Vehiculo{
	
	private String tipo;
	
	/**
	 * @param fabricante
	 * @param anio
	 * @param noPuertas
	 * @param noAsientos
	 * @param color
	 * @param motor
	 */
	public Deportivo(String fabricante, int anio, int noPuertas, int noAsientos, Pintura color, Motor motor) {
		super(fabricante, anio, noPuertas, noAsientos, color, motor);
		this.tipo = this.getClass().getSimpleName();
	}

	

}
