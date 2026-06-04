package ejerciciosProgUD9.ejercicio14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RecuperarMochila {

	public static void main(String[] args) {

		try {
            FileInputStream fichero = new FileInputStream("mochila.bin");
            ObjectInputStream recuperar = new ObjectInputStream(fichero);

            ArrayList<Item> mochila = (ArrayList<Item>) recuperar.readObject();

            recuperar.close();

            int valorTotal = 0;

            System.out.println("Contenido de la mochila:");

            for (Item item : mochila) {
                System.out.println(item);
                valorTotal += item.getValor();
            }

            System.out.println("Valor total: " + valorTotal);

        } catch (IOException e) {
            System.out.println("Error!: " + e);

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + e);
        }
    }
}