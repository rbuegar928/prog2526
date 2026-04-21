package ejerciciosProgUD8.ejercicio10;

import java.util.Comparator;

import Comunes.Persona;

public class ComparadorApellido implements Comparator<Persona> {
    public int compare(Persona p1, Persona p2) {
        if (p1.getApellido().equals(p2.getApellido())) {
        	return 0;
        } else {
        	return -1;
        }
    }
}