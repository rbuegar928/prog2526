package ejerciciosProgUD5.ejercicio8;

public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double precioHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double precioHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
    }


    public double calcularSalario() {
        return horasTrabajadas * precioHora;
    }
}
