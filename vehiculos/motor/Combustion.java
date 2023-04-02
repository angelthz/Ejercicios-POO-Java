package vehiculos.motor;

import vehiculos.combustible.Combustible;

public class Combustion extends Motor {
	
	private int cilindrada;
	private float litros;
	
	public Combustion(String fabricante, int hp, int rpmMax, int velMax, Combustible combustible) {
		super(fabricante, hp, rpmMax, velMax, combustible);
		this.cilindrada = cilindrada;
		this.litros = litros;
		this.tipoCombustible = combustible;
	}

	/**
	 * @return the cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * @return the litros
	 */
	public float getLitros() {
		return litros;
	}
	
	
}
