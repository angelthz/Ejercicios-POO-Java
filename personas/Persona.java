package personas;

public class Persona {
	private String nombre;
	private String apellido;
	private String curp;
	private int anioNacimiento;
	private String pais;
	private char genero;
	
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param curp
	 * @param anioNacimiento
	 */
	public Persona(String nombre, String apellido, String curp, int anioNacimiento, String pais, char genero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.curp = curp;
		this.anioNacimiento = anioNacimiento;
		this.pais = pais;
		this.genero = genero;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}


	/**
	 * @return the curp
	 */
	public String getCurp() {
		return curp;
	}


	/**
	 * @return the anioNacimiento
	 */
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	/**
	 * Muestra los datos de la persona
	 */
	public void showPersona() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("CURP: " + this.curp);
		System.out.println("Año de nacimiento: " + this.anioNacimiento);
		System.out.println("Pais: " +  this.pais);
		System.out.println("Genero: " + this.genero);
	}
	
	
	
}
