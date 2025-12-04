package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        long numero = sc.nextLong();
        
        do while (numero != 0){
        if (numero % 2 == 0) {
            System.out.println("El numero es par.");
        } else if (numero % 2 != 0){
            System.out.println("El numero no es par.");  
        }
        if (numero  > 0){
            System.out.println("El numero es positivo.");
        } else if (numero  < 0){
            System.out.println("El numero es negativo.");
        } 
        long cuadrado = (numero*numero);
            System.out.println("El cuadrado es: " + cuadrado);

    }
    }
}
