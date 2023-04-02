package planetas.satelite;

public class Irregular extends Satelite{
	
	public Irregular(String nombre) {
		super(nombre);
		this.tipo = this.getClass().getName();
	}
	
	public Irregular(String nombre, double masa, double volumen, double diametro) {
		super(nombre, masa, volumen, diametro);
		// TODO Auto-generated constructor stub
		this.tipo = this.getClass().getName();
	}

	@Override
	public String orbitar() {
		return "Yo orbito de manera: " + this.tipo;
	}

}
