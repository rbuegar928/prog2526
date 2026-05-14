package Ejemplos;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
BufferedOutputStream sirve para escribir datos en un archivo o flujo de salida de forma más eficiente.

Normalmente, cuando escribes bytes en un archivo usando un FileOutputStream, cada escritura puede implicar acceso directo al disco, 
lo cual es más lento. BufferedOutputStream añade un búfer en memoria: guarda temporalmente los datos y los escribe todos juntos 
cuando el búfer se llena o cuando haces flush() o close().

¿Qué ventajas tiene?
Menos accesos al disco y por tanto mejor rendimiento.
*/

public class EjemploBufferedOutputStream {
	 public static void main(String[] args) {

		 try {
	            // Crear el archivo
	            FileOutputStream archivo = new FileOutputStream("hola.txt");

	            // Añadir buffer al archivo
	            BufferedOutputStream buffer = new BufferedOutputStream(archivo);

	            // Escribir texto
	            buffer.write("Hola".getBytes());

	            // Cerrar buffer
	            buffer.close();

	            System.out.println("Texto guardado");

	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
		 }
	 }
