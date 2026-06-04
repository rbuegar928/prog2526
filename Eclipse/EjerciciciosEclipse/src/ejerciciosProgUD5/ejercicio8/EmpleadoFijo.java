package ejerciciosProgUD5.ejercicio8;

public class EmpleadoFijo extends Empleado {

    private double salarioMensual;

    public EmpleadoFijo(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

   
    public double calcularSalario() {
        return salarioMensual;
    }
}
