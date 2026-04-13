package ejerciciosProgUD8.ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio5 {
	public static void main(String[] args) {
		// Conjunto vacío
		Set<Integer> Enteros = new HashSet<Integer>();
		// Agregar 5 primeros números naturales
		Enteros.add(0);
		Enteros.add(1);
		Enteros.add(2);
		Enteros.add(3);
		Enteros.add(4);
		// Imprime el conjunto
		System.out.println(Enteros); // Imprime los valores
		// Añadir números repetidos
		Enteros.add(1); // no permite duplicados
		System.out.println(Enteros);
		// Añadir nulo
		Enteros.add(null); // si permite nulos
		
		System.out.println(Enteros);
		
		// Conjunto numeros primos
		Set<Integer> Primos = new HashSet<Integer>();
		// Agregar 5 primeros números naturales
		Primos.add(2);
		Primos.add(3);
		
		// Comprobar si es subconjunto
	}

}
