package planetas;

import java.util.ArrayList;

import planetas.planeta.Enano;
import planetas.planeta.Gaseoso;
import planetas.planeta.Planeta;
import planetas.planeta.Rocoso;
import planetas.satelite.Irregular;
import planetas.satelite.Regular;
import planetas.satelite.Satelite;
import planetas.unidadesastronomicas.AstronomicUnit;

public class DemoPlanetas {
	public static void main(String[] args) {
		ArrayList<Satelite> satelitesTierra = new ArrayList<Satelite>();
		ArrayList<Satelite> satelitesPluton = new ArrayList<Satelite>();
		ArrayList<Satelite> satelitesJupiter = new ArrayList<Satelite>();
		
		satelitesTierra.add(new Regular("Luna",
				Math.pow((7.349*10), 22), 
				Math.pow((2.1958*10), 10),
				3474.8));
		
		Rocoso tierra = new Rocoso("Tierra", 
				Math.pow((5.972*10), 24), 
				Math.pow((1.08*10), 21), 
				127242, 
				150000000, 
				false, 
				satelitesTierra);
		
		satelitesPluton.add(new Irregular("Caronte"));
		satelitesPluton.add(new Irregular("Nix"));
		satelitesPluton.add(new Irregular("Hidra"));
		satelitesPluton.add(new Irregular("Cerbero"));
		satelitesPluton.add(new Irregular("Estigia"));
		
		Enano pluton = new Enano("Pluton", 
				Math.pow((1.3*10), 22), 
				Math.pow((7.06*10), 9), 
				2376.6, 
				5913520000D, 
				false, 
				satelitesPluton); 
		
		satelitesJupiter.add(new Regular("Adrastrea"));
		satelitesJupiter.add(new Irregular("Amaltea"));
		satelitesJupiter.add(new Irregular("Ananke"));
		satelitesJupiter.add(new Irregular("Calisto"));
		satelitesJupiter.add(new Irregular("Carme"));
		satelitesJupiter.add(new Irregular("Elara"));
		satelitesJupiter.add(new Regular("Europa"));
		
		Gaseoso jupiter = new Gaseoso(
				"Jupiter",
				Math.pow((1.9*10), 27), 
				Math.pow((1.43*10), 15), 
				139822, 
				778330000, 
				true, 
				satelitesJupiter);
		
		ArrayList <Planeta> listaPlanetas = new ArrayList<Planeta>();
		listaPlanetas.add(tierra);
		listaPlanetas.add(jupiter);
		listaPlanetas.add(pluton);
		
		for(Planeta planeta : listaPlanetas) {
			planeta.describePlaneta();
			System.out.println();
		}
	}
}
