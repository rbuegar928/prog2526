package ejerciciosProgUD5.ejercicio12;

public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro está ladrando.");
    }

    @Override
    public String moverse() {
        return "El perro se está moviendo.";
    }
}