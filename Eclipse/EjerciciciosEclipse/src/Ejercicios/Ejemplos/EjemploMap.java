package Ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploMap {

	public static void main(String[] args) {
		Map <Integer, String> m = new HashMap<>();
		m.put(123, "Teclado");
		m.put(234, "Monitor");
		m.put(456, "Torre");
		m.put(567, "Ratón");
		System.out.println(m);
		System.out.println(m.get(123));
		System.out.println(m.get(1));
		m.replace(567, "Silla");
		System.out.println(m);
		m.remove(567);
		System.out.println(m);
		
		Set <Integer> claves = m.keySet();
		
		for (Integer K : claves) {
			System.out.println(m.get(K));
		}
	}

}
