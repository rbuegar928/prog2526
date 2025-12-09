package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);
        int numero;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        do {
            System.out.print("Introduce un numero entero: ");
            numero = sc.nextInt();

            if (numero >= a && numero <= b) {
                System.out.println("El numero está dentro del rango.");
            }
            else {
                System.out.println("El numero está fuera del rango.");
            }

        } while (numero < a || numero > b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Numero introducido: " + numero);
    }
}