package ejerciciosProgUD9.ejercicio13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import comunes.Persona;

public class Ejercicio13 {

	public static void main(String[] args) {
		Persona anonimo = new Persona("Florentino", "Pérez", 79);
			try {
				FileOutputStream fichero = new FileOutputStream("persona.dat");
				ObjectOutputStream out = new ObjectOutputStream(fichero);
				
				out.writeObject(anonimo);
				
				out.close();
				
				System.out.println("Persona guardada.");
				
			} catch (IOException e) {
				System.out.println("Error!: " + e);
			}
	}

}
