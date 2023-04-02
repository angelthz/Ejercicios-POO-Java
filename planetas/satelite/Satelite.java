package planetas.satelite;

public abstract class Satelite implements Orbitar{
	private String nombre;
	private double masa;
	private double volumen;
	private double diametro;
	protected String tipo;
	
	public Satelite(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @param masa
	 * @param volumen
	 * @param diametro
	 */
	public Satelite(String nombre, double masa, double volumen, double diametro) {
		this.nombre = nombre;
		this.masa = masa;
		this.volumen = volumen;
		this.diametro = diametro;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the masa
	 */
	public double getMasa() {
		return masa;
	}
	/**
	 * @return the volumen
	 */
	public double getVolumen() {
		return volumen;
	}
	/**
	 * @return the diametro
	 */
	public double getDiametro() {
		return diametro;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	
	
}
