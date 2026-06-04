package ejerciciosProgUD6.ejercicio1;

public class Perro extends Animal implements Corredor {

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }

    @Override
    public void moverse() {
        System.out.println("El perro se mueve");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Soy un perro");
    }

    @Override
    public void correr() {
        System.out.println("El perro corre");
    }
}