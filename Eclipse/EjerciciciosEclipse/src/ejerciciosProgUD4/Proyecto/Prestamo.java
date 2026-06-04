package ejerciciosProgUD4.Proyecto;

public class Prestamo {

    Libro libro;
    Usuario usuario;
    int diasPrestamo;

    Prestamo(Libro libro, Usuario usuario, int diasPrestamo) {
        // Declaracion de la clase prestamo
        this.libro = libro;
        this.usuario = usuario;
        this.diasPrestamo = diasPrestamo;
        this.libro.cambiarEstado(EstadoPrestamo.PRESTADO);
    }

    void mostrarDetalle() {
        // Metodo que muestra toda la informacion del prestamo
        System.out.println("Detalles del Prestamo: ");
        usuario.mostrarDatos();
        libro.mostrarInformacion();
        System.out.println("Días de prestamo: " + diasPrestamo);
    }

    void marcarRetraso() {
        // Metodo que marca el préstamo como retrasado
        libro.cambiarEstado(EstadoPrestamo.RETRASADO);
    }
}