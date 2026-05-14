package ejerciciosProgUD9.ejercicio3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Introduzca su nombre y pulse Intro al acabar: ");
		String nombre = sc.nextLine(); // ponemos nextLine y no solo next poruqe el next solo lee la primera palabra,
									   // así que lo dejamos así por si es por ejemplo un nombre compuesto
		System.out.println("Hola " + nombre + "!");
		sc.close();
		}
	}
