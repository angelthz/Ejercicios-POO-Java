package planetas.planeta;

import java.util.ArrayList;

import planetas.satelite.Satelite;

public class Rocoso extends Planeta {
	
	private String tipo;
	
	public Rocoso(String nombre, double masa, double volumen, double diametro, double distanciaSol, boolean observable,
			ArrayList<Satelite> satelites) {
		super(nombre, masa, volumen, diametro, distanciaSol, observable, satelites);
		this.tipo = this.getClass().getName();
	}

	@Override
	public String getTipo() {
		return this.tipo;
	}
}
