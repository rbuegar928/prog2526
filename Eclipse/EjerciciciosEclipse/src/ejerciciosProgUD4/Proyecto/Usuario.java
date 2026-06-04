package ejerciciosProgUD4.Proyecto;

public class Usuario {
    String dni;
    String nombre;
    int edad;

    Usuario(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    void mostrarDatos() {
        // Metodo que muestra por pantalla los datos del usuario
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
