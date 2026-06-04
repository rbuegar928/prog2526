package ejerciciosProgUD3;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un numero (0 para salir): ");
            numero = sc.nextInt(); // Leer el número introducido por el usuario

            if (numero != 0) {
                if (numero % 2 == 0) {
                    System.out.println("El numero " + numero + " es par.");
                } else {
                    System.out.println("El numero " + numero + " es impar.");
                }

                if (numero > 0) {
                    System.out.println("El numero " + numero + " es positivo.");
                } else if (numero < 0) {
                    System.out.println("El numero " + numero + " es negativo.");
                }

                int cuadrado = numero * numero;
                System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
            }

        } while (numero != 0);

        System.out.println("El programa ha terminado.");
    }
}