package vehiculos.motor;

import vehiculos.combustible.Combustible;

public abstract class Motor {
	private String fabricante;
	private int hp;
	private int rpmMax;
	private int rpmMin;
	private int rpmActual;
	private int velMax;
	private int velMin;
	private int velActual;
	private boolean estado;
	protected Combustible tipoCombustible;
	/**
	 * @param fabricante
	 * @param hp
	 * @param rpmMax
	 * @param velMax
	 * @param tipoCombustible
	 */
	public Motor(String fabricante, int hp, int rpmMax,  int velMax, Combustible combustible) {
		this.fabricante = fabricante;
		this.hp = hp;
		this.rpmMax = rpmMax;
		this.velMax = velMax;
		this.rpmMin = 0;
		this.rpmActual = 0;
		this.velMin = 0;
		this.velActual = 0;
		this.estado = false;
		this.tipoCombustible = combustible;

	}
	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}
	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}
	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
	/**
	 * @return the tipoCombustible
	 */
	public Combustible getTipoCombustible() {
		return tipoCombustible;
	}
	/**
	 * @param tipoCombustible the tipoCombustible to set
	 */
	public void setTipoCombustible(Combustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	/**
	 * @return the rmpMax
	 */
	public int getRmpMax() {
		return rpmMax;
	}
	/**
	 * @param rmpMax the rmpMax to set
	 */
	public void setRmpMax(int rmpMax) {
		this.rpmMax = rmpMax;
	}
	/**
	 * @return the rpmMin
	 */
	public int getRpmMin() {
		return rpmMin;
	}
	/**
	 * @param rpmMin the rpmMin to set
	 */
	public void setRpmMin(int rpmMin) {
		this.rpmMin = rpmMin;
	}
	/**
	 * @return the rpmActual
	 */
	public int getRpmActual() {
		return rpmActual;
	}
	/**
	 * @param rpmActual the rpmActual to set
	 */
	public void setRpmActual(int rpmActual) {
		this.rpmActual = rpmActual;
	}
	/**
	 * @return the velMax
	 */
	public int getVelMax() {
		return velMax;
	}
	/**
	 * @param velMax the velMax to set
	 */
	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}
	/**
	 * @return the velMin
	 */
	public int getVelMin() {
		return velMin;
	}
	/**
	 * @param velMin the velMin to set
	 */
	public void setVelMin(int velMin) {
		this.velMin = velMin;
	}
	/**
	 * @return the velActual
	 */
	public int getVelActual() {
		return velActual;
	}
	/**
	 * @param velActual the velActual to set
	 */
	public void setVelActual(int velActual) {
		this.velActual = velActual;
	}
	
	/**
	 * Enciende el motor
	 * 
	 */
	public void encederMotor() {
		this.estado = true;
	}
	
	/**
	 * Apaga el motor
	 * 
	 */
	public void apagarMotor() {
		this.estado = false;
	}
	/**
	 * Muestra el estado del motor 
	 * @return: true = encendido/ false:apagado
	 */
	public boolean getEstado() {
		return this.estado;
	}
	
	/**
	 * Acelera el motor y aumenta la velocidad actual
	 * @param aceleracion
	 */
	public  void acelerarMotor(int aceleracion) {
		this.velActual = aceleracion;
	}
	
	/**
	 * Desacelera el motor y comienza a disminuir la velocidad actual
	 */
	public  void desacelerar(int desaceleracion) {
		this.velActual = desaceleracion;
	}
}
