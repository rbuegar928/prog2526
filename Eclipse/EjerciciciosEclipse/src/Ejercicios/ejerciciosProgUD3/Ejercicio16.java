package ejerciciosProgUD3;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = sc.nextInt();

        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (numero >= a && numero <= b) {
            System.out.println("El numero esta dentro del rango.");
        }
        else {
            System.out.println("El numero esta fuera del rango.");
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Numero introducido: " + numero);
    }
}