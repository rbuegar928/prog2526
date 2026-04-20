package ejerciciosProgUD8.ejercicio7;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // 1. Crear conjunto vacío de cadenas
        Set<String> alumnos = new LinkedHashSet<>();

        // 2. Agregar nombres
        alumnos.add("Paco");
        alumnos.add("Luis");
        alumnos.add("Carlos");
        alumnos.add("Juan");

        // 3. Imprimir conjunto
        System.out.println(alumnos); 
        // Imprime los valores

        // 4. Añadir duplicado
        boolean añadido = alumnos.add("Paco");

        // 5. Añadir null
        alumnos.add(null);

        // Mostrar contenido actualizado
        System.out.println(alumnos);

        // 6. Recorrer en orden de inserción poniedno "D." a cada uno delante
        for (String alumno : alumnos) {
            System.out.println("D. " + alumno);
        }

        // Comparación con HashSet
        Set<String> alumnosHash = new HashSet<>();
        alumnos.add("Paco");
        alumnos.add("Luis");
        alumnos.add("Carlos");
        alumnos.add("Juan");
        alumnosHash.add(null);

        System.out.println("Contenido HashSet:");
        System.out.println(alumnosHash);
        // . Recorrer en orden de inserción poniedno "D." a cada uno delante
        for (String alumno : alumnosHash) {
            System.out.println("D. " + alumno);
        }
    }
}