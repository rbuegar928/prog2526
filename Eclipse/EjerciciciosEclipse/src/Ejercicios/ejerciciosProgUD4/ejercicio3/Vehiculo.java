package ejerciciosProgUD4.ejercicio3;

public class Vehiculo {
	String matricula;
	String marca;
	int anioFabricacion;
	double precio;
	TipoVehiculo tipo;
	
	Vehiculo (String matricula, String marca, int anioFabricacion, double precio, TipoVehiculo tipo){
		this.matricula = matricula;
		this.marca = marca;
		this.anioFabricacion = anioFabricacion;
		this.precio = precio;
		this.tipo = tipo;
	}
	void mostrarInformacion() {
		System.out.println("Vehículo con matrícula " + matricula + ", de la marca" + marca + ", con anio de fabricación");
		System.out.println(anioFabricacion + "con precio " + precio + "es un/una " + tipo);
	}
	boolean esAntiguo() {
	    return (2026 - anioFabricacion) > 10;
	}
	void aplicarDescuento(double porcentaje) {
		this.precio = precio - (precio*porcentaje); 
	}
	public static void main(String[] args){
		
	}
}
