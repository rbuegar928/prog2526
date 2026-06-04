package ejerciciosProgUD5.ejercicio12;

public abstract class Animal {

    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " Edad: " + edad);
    }

    public abstract void hacerSonido();

    public abstract String moverse();
}