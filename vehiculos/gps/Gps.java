package vehiculos.gps;

public class Gps {
	public static float calcularTiempoLlegada(float distancia, float velActual) {
		return distancia / (float) velActual;
	}
}
