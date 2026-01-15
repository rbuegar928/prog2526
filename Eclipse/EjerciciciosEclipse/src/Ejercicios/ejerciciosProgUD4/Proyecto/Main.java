package ejerciciosProgUD4.Proyecto;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("111-AAA", "El Principito", "Antoine de Saint-Exupery", 1943, EstadoPrestamo.DISPONIBLE);
        Libro libro2 = new Libro("222-BBB", "El Codigo Da Vinci", "Dan Brown", 2003, EstadoPrestamo.DISPONIBLE);
        Libro libro3 = new Libro("333-CCC", "El viejo y el mar", "Emest Hemingway", 1952, EstadoPrestamo.PRESTADO);

        Usuario usuario1 = new Usuario("12345678A", "Raul Bueno", 18);
        Usuario usuario2 = new Usuario("12345678B", "Aday Trandafir", 18);

        System.out.println("Información del libro: ");
        libro1.mostrarInformacion();
        // Llama al metodo mostrarInformacion() del libro1 para mostrar su informacion
        
        System.out.println("¿Es antiguo? " + libro1.esAntiguo());
        // Llama al metodo esAntiguo() y muestra si el libro tiene mas de 20 años

        Prestamo prestamo1 = new Prestamo(libro1, usuario1, 15);
        // Se crea un prestamo asociando el libro1 con el usuario1 durante 15 dias y el estado se convierte en prestado

        System.out.println("-----------------------------------------------------");
        
        System.out.println("Información del libro tras el préstamo: ");
        libro1.mostrarInformacion();
        // Muestra la informacion del libro para comprobar que el estado ha cambiado

        System.out.println("-----------------------------------------------------");
        
        prestamo1.mostrarDetalle();
        // Muestra los detalles del prestamo
        
        prestamo1.marcarRetraso();
        // Marca el préstamo como retrasado y pone el estado del libro en RETRASADO

        System.out.println("-----------------------------------------------------");
        
        System.out.println("Información del libro tras marcar retraso: ");
        libro1.mostrarInformacion();
        // Muestra la información del libro con el estado RETRASADO
    }
}