package vehiculos.pedales;

import vehiculos.motor.Motor;

public class Freno extends Pedal {
	
	/**
	 * Frena el motor
	 */
	@Override
	public void presionar(Motor m) {
		int vel = m.getVelActual();
		this.estado = true;
		
		if(vel != m.getVelMin()) {
			vel -= presion;
			m.desacelerar(vel);
		}
	}
}
