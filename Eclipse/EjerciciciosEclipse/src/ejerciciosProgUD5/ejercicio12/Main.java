package ejerciciosProgUD5.ejercicio12;

public class Main {

    public static void main(String[] args) {

        Perro perro = new Perro("Firulais", 3);
        Gato gato = new Gato("Michi", 6);
        Pajaro pajaro = new Pajaro("Piolin", 1);

        perro.mostrarInformacion();
        perro.hacerSonido();
        System.out.println(perro.moverse());

        System.out.println();

        gato.mostrarInformacion();
        gato.hacerSonido();
        System.out.println(gato.moverse());

        System.out.println();

        pajaro.mostrarInformacion();
        pajaro.hacerSonido();
        System.out.println(pajaro.moverse());
    }
}