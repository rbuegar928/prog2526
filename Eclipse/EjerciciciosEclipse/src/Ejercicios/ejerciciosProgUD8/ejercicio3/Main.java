package ejerciciosProgUD8.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
		nombres.add("Manuel");
		nombres.add("Fran");
		nombres.add("Dani");
		nombres.add("Antonio");
		nombres.add("Dani");
		
		imprimir(nombres);
		
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		nombres.add(nombre);
		
		imprimir(nombres);
		
		System.out.println("Introrduzca nombre a eliminar: ");
		String eliminarNombre = sc.nextLine();
		if (nombres.remove(eliminarNombre)) {
			System.out.println("Nombre elminado!");
		} else {
			System.out.println("Nombre no encontrado");
		}
		
		System.out.println("Número total de nombres: " + nombres.size());
		
	}
	
	private static void imprimir (List<String> lista) {
		for (String string : lista) {
			System.out.println(string);
		}
	}

}