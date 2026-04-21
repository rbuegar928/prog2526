package ejerciciosProgUD8.ejercicio10;

import java.util.Set;
import java.util.TreeSet;

import Comunes.Persona;

public class Main {

	public static void main(String[] args) {
		
        Persona p1 = new Persona("Julio", "Jiménez", 23);
        Persona p2 = new Persona("Kiko", "Marín", 34);
        Persona p3 = new Persona("Adolfo", "Domínguez", 51);
        Persona p4 = new Persona("Juan", "López", 15);
        Persona p5 = new Persona("Ernesto", "Suárez", 36);

        // Por edad
        Set<Persona> listaEdad = new TreeSet<>(new ComparadorEdad());
	    listaEdad.add(p1);
	    listaEdad.add(p2);
        listaEdad.add(p3);
        listaEdad.add(p4);
        listaEdad.add(p5);

        System.out.println("Ordenadas por edad:");
        for (Persona p : listaEdad) {
            System.out.println(p);
        }

        // Por apellido
        Set<Persona> listaApellido = new TreeSet<>(new ComparadorApellido());
        listaApellido.add(p1);
        listaApellido.add(p2);
        listaApellido.add(p3);
        listaApellido.add(p4);
        listaApellido.add(p5);

        System.out.println("Ordenadas por apellido:");
        for (Persona p : listaApellido) {
            System.out.println(p);
        }

        Set<Persona> listaEntera = new TreeSet<>(new ComparadorEntero());
        listaEntera.add(p1);
        listaEntera.add(p2);
        listaEntera.add(p3);
        listaEntera.add(p4);
        listaEntera.add(p5);
        
        System.out.println("Ordenadas por todo:");
        for (Persona p : listaEntera) {
            System.out.println(p);
        }
        
	    }
	}