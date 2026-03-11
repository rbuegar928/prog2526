package ejerciciosProgUD5.ejercicio9;

public class Main {

    public static void main(String[] args) {

        Circulo c = new Circulo("Circulo", 3);
        Rectangulo r = new Rectangulo("Rectangulo", 4, 5);

        c.mostrarInformacion();
        System.out.println();
        r.mostrarInformacion();
    }
}