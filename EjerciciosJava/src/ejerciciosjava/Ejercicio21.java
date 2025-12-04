package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero del mes (1-12): ");
        int mes = sc.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Numero de mes invalido");
        } else if (mes == 2) {
            System.out.println("El mes tiene 28 o 29 dias");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("El mes tiene 30 dias");
        } else {
            System.out.println("El mes tiene 31 dias");
        }
    }
}