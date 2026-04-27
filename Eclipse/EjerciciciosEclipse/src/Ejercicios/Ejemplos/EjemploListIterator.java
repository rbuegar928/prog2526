package Ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EjemploListIterator {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("dadada");
		l.add("ahkfa");
		l.add("llvs");
		
		ListIterator lit = l.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());    // para hacerlo para atras solo cambiamos lnext por previous
		}
	}

}
