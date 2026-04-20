package ejerciciosProgUD8.ejercicio9;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import Comunes.Persona;

public class Main {
    public static void main(String[] args) {

        SortedSet<Persona> personas = new TreeSet<>();

        Persona toni = new Persona("Toni", "Kroos", 39);
        Persona luka = new Persona("Luka", "Modric", 41);
        Persona casemiro = new Persona("Carlos Enrique", "Casemiro", 37);
        Persona repetido = new Persona("Toni", "Kroos", 39);

        personas.add(toni);
        personas.add(luka);
        personas.add(casemiro);
        personas.add(repetido);

        System.out.println("TreeSet (ordenado, sin repetidos):");
        System.out.println(personas);

        System.out.println("¿Toni y repetido son iguales?");
        System.out.println(toni.equals(repetido));

        System.out.println("HashCodes:");
        System.out.println(toni.hashCode());
        System.out.println(repetido.hashCode());

        Set<Persona> insercion = new LinkedHashSet<>(personas);

        System.out.println("LinkedHashSet (orden de inserción):");
        System.out.println(insercion);
    }
}