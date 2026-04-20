package ejerciciosProgUD8.ejercicio8;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // 1. Conjunto con árbol binario (TreeSet)
        Set<Integer> numeros = new TreeSet<>();

        // 2. Añadir números
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);

        // 3. Recorrer e imprimir ordenado
        for (Integer n : numeros) {
            System.out.println(n);
        }

        // 4. Conjunto de nombres
        Set<String> alumnos = new TreeSet<>();

        // Añadir nombres en orden aleatorio
        alumnos.add("Emilio");
        alumnos.add("Adolfo");
        alumnos.add("Carlos");

        // 5. Recorrer e imprimir ordenado alfabéticamente
        System.out.println("Alumnos ordenados:");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}