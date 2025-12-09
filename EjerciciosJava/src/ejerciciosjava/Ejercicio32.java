package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio32 {
    public static int mayorMenor(int num1, int num2){
        int maximo;
        if (num1<num2){
        maximo = num2;
        }
        else{
        maximo = num1;
        }
        return(maximo);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num2 = sc.nextInt();
        System.out.println("El número mayor es " + mayorMenor(num1, num2));
    }
}