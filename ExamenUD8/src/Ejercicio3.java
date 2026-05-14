import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {
	public static void main(String[] args) {
		Map<String, Integer> palabras = new HashMap<>();
		
		palabras.put("Hola", 12);
		palabras.put("tal", 9);
		palabras.put("cual", 17);
		System.out.println(palabras);
		palabras.put("cual", 23);// Si insertamos una clave que ya existe lo que pasa es que "machaca" al
		System.out.println(palabras);//dato anterior, poniendo el nuevo lo vemos por los print del map antes y ahora
	}

}
