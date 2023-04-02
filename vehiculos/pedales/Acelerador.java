package vehiculos.pedales;

import vehiculos.motor.Motor;

public class Acelerador extends Pedal {
	/**
	 * Acelera el motor
	 */
	@Override
	public void presionar(Motor m) {
		int vel = m.getVelActual();
		this.estado = true;
		vel += this.presion;
		if(vel <= m.getVelMax()) {
			m.setVelActual(vel);
		}
		
	}


}
