import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio5 {
	public static void main(String[] args) {
		List<Integer> numeros = new LinkedList<>();
		numeros.add(13);
		numeros.add(42);
		numeros.add(54);
		numeros.add(2);
		numeros.add(84);
		numeros.add(46);
		numeros.add(94);
		numeros.add(21);
		numeros.add(45);
		numeros.add(11);
		System.out.println(numeros); // Imprimimos para ver la lista inicial
		
		Iterator<Integer> it = numeros.iterator();
		while(it.hasNext()) {
			int valor = (it.next());
			if (valor < 42) {    // eliminamos el numero si es menor a 42 por ejemplo
				numeros.remove(valor);
				System.out.println(numeros);// Imprimo para ver como se van eliminando
			}
		}
		System.out.println(numeros); // Imprimo para ver la lista al final
	}
}
