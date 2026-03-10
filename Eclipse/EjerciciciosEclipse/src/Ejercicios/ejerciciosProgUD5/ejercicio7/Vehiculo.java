package ejerciciosProgUD5.ejercicio7;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int anio;
	
	Vehiculo(String marca, String modelo, int anio){
		this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
	}
	
	public void mostrarDetalles() {
		System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
	}
	
	public void Mover() {
		System.out.println("El vehículo se está movimiendo");
	}
	
	public String getMarca() {
		return marca; 
	}
}