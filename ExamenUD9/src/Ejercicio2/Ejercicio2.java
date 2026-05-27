package Ejercicio2;

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
	public static void main(String[] args) {
		// Usamos try-with-resources para asegurar el cierre del flujo
		try (FileReader fr = new FileReader("nota.txt")) {
			int caracter;
			while ((caracter = fr.read()) != -1) {
				System.out.println(caracter);
				;
			}
		} catch (IOException e) {
			System.out.println("Error al leer el archivo");
		}
	}
}
