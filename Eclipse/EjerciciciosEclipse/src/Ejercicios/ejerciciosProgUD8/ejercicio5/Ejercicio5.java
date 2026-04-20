package ejerciciosProgUD8.ejercicio5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio5 {
	public static void main(String[] args) {
		// Conjunto vacío
		Set<Integer> Enteros = new HashSet<>();
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
		boolean esSubconjunto = Enteros.containsAll(Primos);
		System.out.println("¿Es subconjunto? " + esSubconjunto);
		
		// Lista final con los valores del conjunto
		final List<Integer> lista = new ArrayList<>(Enteros);
				
		System.out.println(lista);
				
		// No es inmutable porque final solo impide cambiar la referencia, hace que se pueda modificar pero no reasignar
				
		// Podemos modificar su contenido:
		lista.add(10);
		lista.remove(0);
				
		System.out.println(lista);
	}

}
