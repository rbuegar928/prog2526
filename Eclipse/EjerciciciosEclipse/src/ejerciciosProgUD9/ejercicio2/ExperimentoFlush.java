package ejerciciosProgUD9.ejercicio2;

import java.io.FileWriter;

public class ExperimentoFlush {
    public static void main(String[] args) throws Exception {
        // Creamos el escritor hacia un archivo
        FileWriter escritor = new FileWriter("prueba.txt");
        
        // Escribimos algo
        escritor.write("¿Donde está mi texto?");
        
        escritor.close();
        
        System.out.println("He escrito en el archivo... ¿o no?");
        
        // El programa se queda esperando aquí para que no termine
       Thread.sleep(10000); // Espera 10 segundos
        
        // No hemos puesto ni flush() ni close()
        // Para arregrarlo solo tenemos que añadir el close, que hace también un flush.
    }
}
