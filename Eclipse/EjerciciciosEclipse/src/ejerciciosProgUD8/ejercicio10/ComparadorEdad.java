package ejerciciosProgUD8.ejercicio10;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Persona> {
    public int compare(Persona p1, Persona p2) {
        return Integer.compare(p1.getEdad(), p2.getEdad());
    }
}