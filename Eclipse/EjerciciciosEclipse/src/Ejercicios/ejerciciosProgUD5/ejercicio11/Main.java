package ejerciciosProgUD5.ejercicio11;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "1111", 1605);
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", "2222", 1943);
        Libro libro3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "1111", 1954);

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        System.out.println("libro1 == libro2: " + libro1.equals(libro2));
        System.out.println("libro1 == libro3: " + libro1.equals(libro3));
    }
}