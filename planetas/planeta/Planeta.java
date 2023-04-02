package planetas.planeta;

import java.util.ArrayList;

import planetas.satelite.Satelite;
import planetas.unidadesastronomicas.AstronomicUnit;

public abstract class Planeta {
	private	String nombre;
	private double masa;
	private double volumen;
	private double diametro;
	private double distanciaSol;
	private boolean observable;
	private ArrayList <Satelite> satelites;
	
	/**
	 * @param nombre
	 * @param masa
	 * @param volumen
	 * @param diametro
	 * @param distanciaSol
	 * @param observable
	 * @param satelites
	 */
	public Planeta(String nombre, double masa, double volumen, double diametro, double distanciaSol, boolean observable,
			ArrayList<Satelite> satelites) {
		this.nombre = nombre;
		this.masa = masa;
		this.volumen = volumen;
		this.diametro = diametro;
		this.distanciaSol = distanciaSol;
		this.observable = observable;
		this.satelites = satelites;
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
	 * @return the distanciaSol
	 */
	public double getDistanciaSol() {
		return distanciaSol;
	}

	/**
	 * @return the observable
	 */
	public boolean isObservable() {
		return observable;
	}

	/**
	 * @return the satelites
	 */
	public ArrayList<Satelite> getSatelites() {
		return satelites;
	}
	
	public void describePlaneta() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Masa: " + this.masa);
		System.out.println("Volumen: " + this.volumen);
		System.out.println("Diametro: " + this.diametro);
		System.out.println("Distancia al sol en KM: " + this.distanciaSol);
		System.out.println("Es observable: " + this.observable);
		
		System.out.println("Lista de satelites: ");
		for(Satelite sat : this.satelites) {
			System.out.println("    " + sat.getNombre());
		}
	}
	
	/**
	 * Retorna un mensaje diciendo que tipo de planeta es
	 * @return Una cadena de texto
	 */
	public String soyUnPlaneta() {
		return this.distanciaSol <= (AstronomicUnit.uaToKm(3.4)) ? "Soy interior" : "Soy exterior"; 
	}
	
	public double getDensidad() {
		return this.masa * this.volumen;
	}
	
	/**
	 * Muestra el tipo de planeta que es
	 * @return un string con el tipo de planeta
	 */
	public abstract String getTipo();
	
}
