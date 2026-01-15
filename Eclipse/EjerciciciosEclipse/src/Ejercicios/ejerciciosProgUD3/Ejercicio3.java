package ejerciciosProgUD3;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
     System.out.print("Introduce el anio actual: ");
        int anioActual = sc.nextInt();

     System.out.print("Introduce tu anio de nacimiento: ");
        int anioNacimiento = sc.nextInt();
        
    int edad = anioActual - anioNacimiento;
    
    System.out.println("Tu edad es: " + edad + " anios.");
}
}