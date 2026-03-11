package ejerciciosProgUD5.ejercicio9;

public class Figura {

    String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public double calcularArea() {
        return 0;
    }

    public void mostrarInformacion() {
        System.out.println("Figura: " + nombre);
        System.out.println("Area: " + calcularArea());
    }
}
