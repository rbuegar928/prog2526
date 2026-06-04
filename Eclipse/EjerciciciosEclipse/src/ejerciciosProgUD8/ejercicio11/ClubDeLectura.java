package ejerciciosProgUD8.ejercicio11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ClubDeLectura {
	private Set<String> Biblioteca = new HashSet<>();
	
	public void agregarLibros (String libro) {
		Biblioteca.add(libro);
	}

	public void mostrarBiblioteca() {
		Iterator<String> it = Biblioteca.iterator();
		while (it.hasNext()) {
			String libro = it.next();
			System.out.println(libro);
		}
	}
}