package ejerciciosProgUD5.ejercicio8;

public class EmpleadoFijo extends Empleado{


	private double salarioMensual;
	
	// Constructor
	public EmpleadoFijo(String nombre, double salarioMensual) {
		super(nombre);
		this.salarioMensual = salarioMensual;
	}
	
	public double calcularSalario() {
		return salarioMensual;
	}

	public double getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
}
