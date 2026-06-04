package ejerciciosProgUD8.ejercicio6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1
        System.out.println("1. Control de países");
        Set<String> paises = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un país: ");
            String pais = sc.nextLine();

            if (paises.contains(pais)) {
                System.out.println("¡Ese ya pasó por la frontera!");
            }
            paises.add(pais);
        }

        System.out.println("Número de países únicos: " + paises.size());

        // 2
        System.out.println("2. Ranking de videojuegos");
        TreeSet<String> juegos = new TreeSet<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un juego: ");
            String juego = sc.nextLine();
            juegos.add(juego);
        }

        System.out.println("Juegos ordenados alfabéticamente: ");
        for (String juego : juegos) {
            System.out.println(juego);
        }

        // 3
        System.out.println("3. Memoria de pez");
        LinkedHashSet<String> colores = new LinkedHashSet<>();

        colores.add("Azul");
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Amarillo");
        colores.add("Naranja");

        System.out.println("Colores en orden: ");
        for (String color : colores) {
            System.out.println(color);
        }
    }
}