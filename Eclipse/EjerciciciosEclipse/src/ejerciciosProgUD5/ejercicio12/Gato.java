package ejerciciosProgUD5.ejercicio12;

public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato está maullando.");
    }

    @Override
    public String moverse() {
        return "El gato se está moviendo.";
    }
}