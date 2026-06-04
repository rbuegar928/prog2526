package ejerciciosProgUD6.ejercicio1;

public class Pajaro extends Animal implements Volador {

    @Override
    public void hacerSonido() {
        System.out.println("Pio pio!");
    }

    @Override
    public void moverse() {
        System.out.println("El pajaro se mueve");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Soy un pajaro");
    }

    @Override
    public void volar() {
        System.out.println("El pajaro vuela");
    }
}