package planetas.satelite;

public class Regular extends Satelite {
	
	public Regular(String nombre) {
		super(nombre);
		this.tipo = this.getClass().getName();
	}
	
	public Regular(String nombre, double masa, double volumen, double diametro) {
		super(nombre, masa, volumen, diametro);
		// TODO Auto-generated constructor stub
		this.tipo = this.getClass().getName();
	}

	@Override
	public String orbitar() {
		return "Yo orbito de manera: " + this.tipo;
	}

}
