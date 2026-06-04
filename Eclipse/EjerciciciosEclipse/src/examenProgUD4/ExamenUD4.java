package examenProgUD4;

public class ExamenUD4 {

	public enum TipoVehiculo{
		COCHE, MOTO, FURGONETA
	}
	
	public class Vehiculo{
		String matricula;
		String marca;
		int anioFabricacion;
		double precioDia;
		TipoVehiculo tipo;
	
	Vehiculo(){
		
	}
	Vehiculo (String matricula, String marca, int anioFabricacion, float precioDia, TipoVehiculo tipo) {
		this.matricula = matricula;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.precioDia = precioDia;
        this.tipo = tipo;
		
	}
	public void mostrarDatos() {
		System.out.println("La matrícula del coche es " + matricula);
		System.out.println("La marca del coche es " + marca);
		System.out.println("El año de fabricación del coche es " + anioFabricacion);
		System.out.println("El precio del día del coche es " + precioDia);
		System.out.println("El coche es de tipo " + tipo);
	}
	public boolean esAntiguo() {
		int anioActual = 2026;
		if ((anioActual - anioFabricacion)>10) {
			return true;
		}
		else {
			return false;
		}
	}
}
}