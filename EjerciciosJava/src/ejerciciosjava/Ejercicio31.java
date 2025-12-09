package ejerciciosjava;

import java.util.Scanner; 

public class Ejercicio31 {
    public static void variosSaludos(int numero){
        int i = 0;
        do{
            System.out.println("Hola");
            i =  i + 1;
        }while (i < numero*2);
        
    }
    public static void main (String[] args) {
    System.out.println("Introduzca el n�mero de veces que quiere reproducir el saludo: ");
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    variosSaludos(numero);
    }
}