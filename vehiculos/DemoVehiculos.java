package vehiculos;

import vehiculos.combustible.Combustible;
import vehiculos.motor.Combustion;
import vehiculos.motor.Motor;
import vehiculos.pintura.Pintura;
import vehiculos.vehiculo.Deportivo;
import vehiculos.vehiculo.Vehiculo;

public class DemoVehiculos {
	public static void main(String[] args) {
		Motor motorFe = new Combustion("Ferrari", 540, 9000, 380, Combustible.Diesel);
		
		Vehiculo ferrari812 = new Deportivo("Ferrari", 2023, 2, 2, Pintura.NEGRO, motorFe);
		
		ferrari812.describeVehiculo();
		ferrari812.encederAuto();
		ferrari812.presionarAcelerador(10);
		ferrari812.usarGps(250);
		
	}
}
