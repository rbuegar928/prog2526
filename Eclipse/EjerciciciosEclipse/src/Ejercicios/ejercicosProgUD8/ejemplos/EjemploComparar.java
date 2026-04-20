package ejercicosProgUD8.ejemplos;

import java.util.SortedSet;
import java.util.TreeSet;

import Comunes.Persona;

public class EjemploComparar {
	public static void main(String [] args) {
		SortedSet<Persona> personas = new TreeSet<>();
		personas.add(new Persona ("Fran"));
		personas.add(new Persona ("Fna"));
		System.out.println(personas);
	}
}
