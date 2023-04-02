package planetas.unidadesastronomicas;

public class AstronomicUnit {
	/**
	 * UA in metric standar distance KM
	 */
	public static final double KM_UA = 149597870;
	
	/**
	 * Converst an AU (Astronimic Unit) into KM Value
	 * @param ua a double number that represents a Astronomic Unit
	 * @return an astronomic unit in km
	 */
	public static final double uaToKm(double ua) {
		return ua * AstronomicUnit.KM_UA;
	}
	
	/**
	 * Converts a KM value in AU (Astronomic Unit)
	 * @param km a double number that represents a distance in km
	 * @return a km value in astronomic unit
	 */
	public static final double kmToUA(double km) {
		return AstronomicUnit.KM_UA / km;
	}

}
