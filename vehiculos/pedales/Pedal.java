package vehiculos.pedales;

import vehiculos.motor.Motor;

public abstract class Pedal {
	protected boolean  estado;
	protected int presion;
	
	public Pedal() {
		this.estado = false;
		this.presion = 0;
	}
	
	/**
	 * Establece el nivel de presion aplicado al pedal
	 * @param presion
	 */
	public void setPresion(int presion) {
		this.presion = presion;
	}
	
	/*
	 * Se encarga de acelerar el motor
	 */
	public  abstract void presionar(Motor m);
	
	/*
	 * Mantiene la velocidad estable al dejar de presionar el acelerador
	 */
	public  void soltar(Motor m) {
		int vel = m.getVelActual();
		this.estado = false;
		m.setVelActual(vel);
	};

}
