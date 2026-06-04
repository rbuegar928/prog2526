package ejerciciosProgUD5.ejercicio12;

public class Pajaro extends Animal {

    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pájaro está piando.");
    }

    @Override
    public String moverse() {
        return "El pájaro está volando.";
    }
}