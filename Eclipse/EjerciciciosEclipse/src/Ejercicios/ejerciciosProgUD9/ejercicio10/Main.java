package ejerciciosProgUD9.ejercicio10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		
		try {
            // Crear el archivo
            String nombreFichero ="C:\\Users\\08_1DAW_Alum\\Desktop\\GitProg\\prog2526\\Eclipse\\EjerciciciosEclipse\\src\\Ejercicios\\ejerciciosProgUD9\\ejercicio10\\Ejercicio10.txt\"";
			File file = new File(nombreFichero);
			if (file.exists()){
				FileWriter fw = new FileWriter(file, true);
				fw.write("hola!");
				fw.close();
				FileReader fr = new FileReader(file);
				int unByte;
				while ((unByte = fr.read()) != 1) {
					System.out.println(unByte);
				}fr.close();
			}else {
				System.out.println("No exites el fichero.");
			}
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
