package cuentabancaria.titular;

public class Titular {
	private String nombre;
	private String apellido;
	private String rfc;
	/**
	 * @param nombre
	 * @param apellido
	 * @param rfc
	 */
	public Titular(String nombre, String apellido, String rfc) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rfc = rfc;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the rfc
	 */
	public String getRfc() {
		return rfc;
	}
	/**
	 * @param rfc the rfc to set
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
	public void mostrarTitular() {
		System.out.println("   Nombre: "+this.nombre);
		System.out.println("   Apellido: "+this.nombre);
		System.out.println("   RFC: "+this.nombre);
	}
	
}
