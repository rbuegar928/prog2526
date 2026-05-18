package ejerciciosProgUD9.ejercicio14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GuardarMochila {
	 public static void main(String[] args) {

	        ArrayList<Item> mochila = new ArrayList<>();

	        mochila.add(new Item("Espada", 3.5, 300));
	        mochila.add(new Item("Poción", 0.5, 75));
	        mochila.add(new Item("Escudo", 5.0, 170));
	        mochila.add(new Item("Mapa", 0.2, 30));
	        mochila.add(new Item("Oro", 0.5, 1500));
	        
	        try {
	        	FileOutputStream fichero = new FileOutputStream("mochila.bin");
	        	ObjectOutputStream guardar = new ObjectOutputStream(fichero);
	        	guardar.writeObject(mochila);
	        	guardar.close();
	        	System.out.println("Mochila guardada.");
	        }catch (IOException e) {
	        	System.out.println("Error!: " + e);
	        }
	 	}
}
