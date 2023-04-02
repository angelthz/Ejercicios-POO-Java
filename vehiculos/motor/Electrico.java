package vehiculos.motor;

import vehiculos.combustible.Combustible;

public class Electrico extends Motor{
	private int capacidadBateria;
	
	public Electrico(String fabricante, int hp, int rpmMax, int velMax, Combustible combustible) {
		super(fabricante, hp, rpmMax, velMax, combustible);
		this.tipoCombustible = Combustible.Electricidad;
	}
	
	/**
	 * @return the capacidadBateria
	 */
	public int getCapacidadBateria() {
		return capacidadBateria;
	}
	
	
}
