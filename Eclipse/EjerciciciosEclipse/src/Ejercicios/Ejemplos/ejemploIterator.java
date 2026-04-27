package Ejemplos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ejemploIterator {
	public static void main (String [] args) {
		Set<String> s = new HashSet<>();
		s.add("Hola");
		s.add("Hola1");
		s.add("Hola2");
		s.add("Hola3");
		
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());// si queremos que salga ordenado es con linkedHashSet
		}
	}
}
