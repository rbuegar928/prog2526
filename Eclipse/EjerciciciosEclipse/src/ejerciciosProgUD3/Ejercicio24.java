package ejerciciosProgUD3;

import java.util.Scanner;

public class Ejercicio24 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        int edadMaxima = 0;
        int edadMinima = 1000;

        System.out.println("Introduce las edades de los alumnos(-1 para terminar): ");

       do {
            System.out.print("Introduzca una edad: ");
            edad = scanner.nextInt();

            if (edad == -1) {
                break; 
            }

            if (edad < 0) {
                System.out.println("Edad no válida. Intentalo de nuevo.");
            }

            if (edad > edadMaxima) {
                edadMaxima = edad;
            }
            if (edad < edadMinima) {
                edadMinima = edad;
            }
       }while (edad != -1);

        if (edadMaxima <= 0) {
            System.out.println("No se ingresaron edades.");
        } else {
            System.out.println("Edad máxima: " + edadMaxima);
            System.out.println("Edad mínima: " + edadMinima);
        }
    }
}