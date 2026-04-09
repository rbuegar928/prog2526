package biblioteca.app;

import biblioteca.model.Libro;
import biblioteca.model.Revista;
import biblioteca.util.ContadorItems;

public class Main {

	public static void main(String[] args) {
		Libro l = new Libro(1, "Señor Oscuro", 2020, "Paco Jiménez", 321);
		Revista r = new Revista(2, "Centrímetos Cúbicos", 2025, 1, "Semanal");
		Libro i = new Libro(3, "Robin Hood", 2001, "Manolo El Del Bar", 581);
		Revista e = new Revista(4, "Cómo lo hacen", 2016, 16, "BiSemanal");
		
        System.out.println(l);
        System.out.println(l.obtenerDescripcion());

        System.out.println(i);
        System.out.println(i.obtenerDescripcion());

        System.out.println(r);
        System.out.println(r.obtenerDescripcion());
        
        System.out.println(e);
        System.out.println(e.obtenerDescripcion());

        System.out.println("Total de items creados: " + ContadorItems.getTotalItems());

	}

}
