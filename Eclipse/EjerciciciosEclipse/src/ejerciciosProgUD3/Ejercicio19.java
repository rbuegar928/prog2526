package ejerciciosProgUD3;

import java.util.Scanner;

public class Ejercicio19 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        float num1 = sc.nextFloat();

        System.out.println("Introduce el segundo numero:");
        float num2 = sc.nextFloat();

        System.out.println("Introduce el tercer numero:");
        float num3 = sc.nextFloat();

        float mayor, medio, menor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
            }
        }

        System.out.println("Los numeros ordenados de mayor a menor son: " + mayor + " > " + medio + " > " + menor);
    }
}