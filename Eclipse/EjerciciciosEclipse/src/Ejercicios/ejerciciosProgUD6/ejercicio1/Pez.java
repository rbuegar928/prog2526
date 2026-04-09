package ejerciciosProgUD6.ejercicio1;

public class Pez extends Animal implements Nadador {

    @Override
    public void hacerSonido() {
        System.out.println("Glu glu!");
    }

    @Override
    public void moverse() {
        System.out.println("El pez se mueve");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Soy un pez");
    }

    @Override
    public void nadar() {
        System.out.println("El pez nada");
    }
}