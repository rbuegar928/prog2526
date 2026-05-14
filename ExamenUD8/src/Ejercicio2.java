import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Set<Integer> sinDuplicados = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		// Pedimos 5 códigos para añadir a nuestro Set
		System.out.println("Introduzca 5 códigos separados por espacios: ");
		
		Integer codigo = sc.nextInt();
		Integer codigo2 = sc.nextInt();
		Integer codigo3 = sc.nextInt();
		Integer codigo4 = sc.nextInt();
		Integer codigo5 = sc.nextInt();

		sinDuplicados.add(codigo);
		sinDuplicados.add(codigo2);
		sinDuplicados.add(codigo3);
		sinDuplicados.add(codigo4);
		sinDuplicados.add(codigo5);
		
		System.out.println(sinDuplicados);
	}
	
}
