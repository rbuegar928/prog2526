package ejerciciosProgUD5.ejercicio8;

public class EmpleadoPorHoras extends Empleado{


	private double horasTrabajadas;
	private double precioHora;
	
	public EmpleadoPorHoras(String nombre, double horaTrabajadas, double precioHora) {
		super(nombre);
		this.horasTrabajadas = horaTrabajadas;
		this.precioHora = precioHora;
	}
	

	public double calcularSalario() {
		return horasTrabajadas * precioHora;
	}


	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}
	
}
