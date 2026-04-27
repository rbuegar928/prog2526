package ejerciciosProgUD8.ejercicio13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Map <String, Integer> InventarioFruteria = new HashMap<>();
		InventarioFruteria.put("Manzanas", 50);
		InventarioFruteria.put("Plátanos", 20);
		InventarioFruteria.put("Naranjas", 35);
		InventarioFruteria.put("Peras", 12);
		
		System.out.println("Número de naranjas que hay: ");
		System.out.println(InventarioFruteria.get("Naranjas"));
		
		InventarioFruteria.put("Manzanas", 100);
		
		if (InventarioFruteria.containsKey("Mangos")){
			System.out.println(InventarioFruteria.get("Mangos"));
		}else {
			System.out.println("Producto no encontrado");
		}
		
		System.out.println(InventarioFruteria);   // Imprimimos el map directamente
		
		for (String clave : InventarioFruteria.keySet()) {     // Imprimimos con el bucle
			System.out.println("Clave: " + clave + ", Cantidad: " + InventarioFruteria.get(clave));
		}
	}

}
