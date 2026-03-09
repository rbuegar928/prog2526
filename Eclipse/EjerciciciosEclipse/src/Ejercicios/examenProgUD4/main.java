package examenProgUD4;

import examenProgUD4.ExamenUD4.TipoVehiculo;
import examenProgUD4.ExamenUD4.Vehiculo;

public class main {

	public static void main(String[] args) {
		Vehiculo v1 = new Vehiculo("5682HYR", "Honda", 2023, 1235.99, TipoVehiculo.MOTO);
		Vehiculo v2 = new Vehiculo("3936HDF", "Porshe", 2015, 45000, TipoVehiculo.COCHE);
		Vehiculo v3 = new Vehiculo("9242VFE", "Peugeot", 2019, 30000, TipoVehiculo.FURGONETA);
		Vehiculo v4 = new Vehiculo();
		
		
	v1.mostrarDatos();
	v2.mostrarDatos();
	v3.mostrarDatos();
	v4.mostrarDatos();
	v2.esAntiguo();
}	
}