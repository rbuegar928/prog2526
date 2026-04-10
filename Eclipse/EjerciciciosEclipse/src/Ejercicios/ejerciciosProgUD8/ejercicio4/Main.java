package ejerciciosProgUD8.ejercicio4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// 1. Lista de notas (Double)
		ArrayList<Double> notas = new ArrayList<>();

		// 2. Array de notas de entrada (Strings)
		String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};
		
		// 3. Conversión (Parsing)
		for (String notaTexto : notasEntrada) {
			Double notaNumero = Double.valueOf(notaTexto);
		    notas.add(notaNumero);
		    }
		System.out.println("Notas: " + notas);

		// 4. Cálculo de la media (Unboxing automático)
		double suma = 0.0;
		for (Double nota : notas) {
			suma += nota;
			}
		double media = suma / notas.size();
		System.out.println("Nota media: " + media);
		
		// 5. Filtrado de aprobados (>= 5.0)
		ArrayList<Double> aprobados = new ArrayList<>();
		for (Double nota : notas) {
			if (nota >= 5.0) {
				aprobados.add(nota);
				}
			}
		System.out.println("Aprobados: " + aprobados);
		
	}
	
}
