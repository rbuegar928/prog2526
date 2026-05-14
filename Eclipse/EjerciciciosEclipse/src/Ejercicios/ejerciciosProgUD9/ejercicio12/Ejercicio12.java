package ejerciciosProgUD9.ejercicio12;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio12 {

    public static void main(String[] args) {
    	// Nombramos el fichero
        File fichero = new File("abecedario.txt");

        try {

            // Si el fichero existe, lo elimina
            if (fichero.exists()) {
                fichero.delete();
            }
            
            fichero.createNewFile();

            // Acceso aleatorio
	        RandomAccessFile raf = new RandomAccessFile(fichero, "rw");

            // Introducir la cadena "defg"
            raf.writeBytes("defg");

            // Imprimir contenido del fichero
            raf.seek(0);
            String contenido = raf.readLine();
            System.out.println("Contenido: " + contenido);

            // Añadir al principio "abc"
            raf.seek(0);

            // Guardar contenido actual
            byte[] datos = new byte[(int) raf.length()];
            raf.readFully(datos);

            // Volver al inicio y escribir "abc"
            raf.seek(0);
            raf.writeBytes("abc");
            raf.write(datos);

            // Añadir al final "hij"
            raf.seek(raf.length());
            raf.writeBytes("hij");

            // Sustituir vocales por "*"
            raf.seek(0);

            byte[] datosFinales = new byte[(int) raf.length()];
            raf.readFully(datosFinales);

            String texto = new String(datosFinales);

            texto = texto.replaceAll("[aeiouAEIOU]", "*");

            // Reescribir el fichero
            raf.setLength(0);
            raf.seek(0);
            raf.writeBytes(texto);

            // Mostrar contenido final
            raf.seek(0);
            String resultado = raf.readLine();

            System.out.println("Contenido final: " + resultado);

            raf.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
}
