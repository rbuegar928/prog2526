package ejerciciosProgUD3;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número decimal: ");
        float numero = sc.nextFloat();
        
        if (numero != 0 && Math.abs(numero) < 1) {
            System.out.println("El número " + numero + " es casi cero.");
        } else {
            System.out.println("El número " + numero + " NO es casi cero.");           
        }
    }
}