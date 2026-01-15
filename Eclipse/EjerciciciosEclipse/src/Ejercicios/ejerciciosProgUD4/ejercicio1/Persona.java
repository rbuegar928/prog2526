package ejerciciosProgUD4.ejercicio1;

public class Persona {
    // Atributos
    String nombre;
    String apellido;
    int edad;
    double estatura;
    DiaDeLaSemana dia;
    Sexo sexo;
    
    //Constructores
    Persona (String nombre, String apellido, int edad, double estatura, DiaDeLaSemana dia, Sexo sexo){
        this(nombre + apellido, edad, estatura);
        this.apellido = apellido;
        this.dia = dia;
        this.sexo = sexo;
    }
    Persona (String nombre, String apellido, int edad, double estatura, DiaDeLaSemana dia){
        this(nombre + apellido, edad, estatura);
        this.apellido = apellido;
        this.dia = dia;
    }
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
        nombre = "an�nimo";
        edad = 18;
        estatura = 1.70;
    }
    
    // M�todos
    void saludar(){
        System.out.println("Hola, mi nombre es" + nombre);
    }
    
    void cumplirAnyos(){
        edad = edad + 1;
    }
    
    void crecer(double incremento){
        estatura = estatura + incremento;
    }
    
    void cambiarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    public enum Sexo {
    	MASCULINO, FEMENINO, NO_BINARIO;
    }
}