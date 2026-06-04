package ejerciciosProgUD9.ejercicio9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	 public static void main(String[] args) {

	        File file = new File("notas.txt");

	        if (file.exists()) {
	            System.out.println(file.getName());
	            System.out.println(file.getAbsolutePath());
	        } else {
	            System.out.println("El archivo no existe.");
	            try {
	            if(file.createNewFile()) {
	            	System.out.println(file.getName());
	            	System.out.println(file.getAbsolutePath());
	            	FileWriter fw = new FileWriter(file);
	            	fw.write("Hola");
	            	fw.close();
	            }
	        }catch (IOException  e) {
	        	e.printStackTrace();
	        	}
	        }
	  }
}