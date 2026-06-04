package ejerciciosProgUD9.ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuál es tu nombre?");
		String nombre = sc.nextLine();

		System.out.println("¿Cuántos años crees que vivirás?");
		int anios = sc.nextInt();

		System.out.println("Hola " + nombre + ", los astros dicen que morirás a los " + (anios + 10) + " por culpa de un café frío");
		
		sc.close();

	}

}
