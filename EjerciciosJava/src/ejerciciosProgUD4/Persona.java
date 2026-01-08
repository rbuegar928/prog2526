package ejerciciosProgUD4;

public class Persona {
    // Atributos
    String nombre;
    int edad;
    double estatura;
    
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