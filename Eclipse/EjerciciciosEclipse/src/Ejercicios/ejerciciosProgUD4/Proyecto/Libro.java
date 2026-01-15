package ejerciciosProgUD4.Proyecto;

public class Libro {
    // Declaracion de la clase Libro
    String isbn;
    String titulo;
    String autor;
    int anioPublicacion;
    EstadoPrestamo estado;

    Libro(String isbn, String titulo, String autor, int anioPublicacion, EstadoPrestamo estado) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.estado = estado;
    }

    void mostrarInformacion() {
        // Metodo que muestra toda la informacion del libro

        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Estado: " + estado);
    }

    boolean esAntiguo() {
        // Metodo que indica si el libro tiene mas de 20 años
        int anioActual = 2026;
        return (anioActual - anioPublicacion) > 20;
    }

    void cambiarEstado(EstadoPrestamo nuevoEstado) {
        // Metodo que cambia el estado del libro
        this.estado = nuevoEstado;
        // Asigna el nuevo estado del libro sobreescribiendo el viejo
    }
}