package ejerciciosProgUD9.ejercicio13;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import comunes.Persona;

public class Ejercicio13Pt2 {

	public static void main(String[] args) throws ClassNotFoundException{
		try {
			FileInputStream fichero = new FileInputStream("perona.dat");
			ObjectInputStream in = new ObjectInputStream(fichero);
			
			Persona p = (Persona) in.readObject();
			
			in.close();
			
			System.out.println("Persona leída.");
			System.out.println(p);
		} catch (IOException e) {
			System.out.println("Error!: " + e);
		}
	}

}