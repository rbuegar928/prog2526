package ejerciciosProgUD4.ejercicio4_2;

public class Persona {
    // Atributos
    String nombre;
    String apellido;
    int edad;
    double estatura;
    
    //Constructores
    Persona (String nombre, String apellido, int edad, double estatura){
        this(nombre + apellido, edad, estatura);
        this.apellido = apellido;
    }
    Persona (String nombre, int edad, double estatura){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    Persona(String nombre){
        this.nombre = nombre;
    }
    Persona(){
        nombre = "anónimo";
        edad = 18;
        estatura = 1.70;
    }
    
    // Métodos
    void saludar(){
        System.out.println("Hola, mi nombre es" + nombre);
    }
    
    void cumplirAños(){
        edad = edad + 1;
    }
    
    void crecer(double incremento){
        estatura = estatura + incremento;
    }
    
    void cambiarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
}