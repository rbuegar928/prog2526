package ejerciciosProgUD5.ejercicio13;

import java.util.Scanner;

public class Calculadora {

    static Scanner sc = new Scanner(System.in);
    
    private static double resultado;
    
    private static final double PI = 3.14;

    public static void menu() {

        System.out.println("Introduzca la opción que quiere elegir: ");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");

        int opcion = sc.nextInt();

        System.out.print("Introduce el primer número: ");
        double n1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double n2 = sc.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + Operaciones.Sumar(n1, n2));
                break;

            case 2:
                System.out.println("El resultado de la resta es: " + Operaciones.Restar(n1, n2));
                break;

            case 3:
                System.out.println("El resultado de la multiplicación es: " + Operaciones.Multiplicar(n1, n2));
                break;

            case 4:
                if (n2 != 0) {
                    System.out.println("El resultado de la división es: " + Operaciones.Dividir(n1, n2));
                } else {
                    System.out.println("Error, no se puede dividir entre 0");
                }
                break;

            default:
                System.out.println("Opción no válida");
        }
    }

    public static void main(String[] args) {
        menu();
    }
}