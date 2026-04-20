package Comunes;

public class Persona implements Comparable{
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(String nombre, String apellido, int edad){
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.edad = edad;
    }

    public Persona(String nombre, int edad){
  		this.nombre = nombre;
   		this.edad = edad;
    }
    public Persona(String nombre){
    	this.nombre = nombre;
    }
    public Persona(int edad){
    	this.edad = edad;
    }

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
    public String toString() {
        return " - Persona: " + nombre + " - Apellido: " + apellido + " - Edad: " + edad;
    }
    @Override
    public boolean equals(Object obj) {
    	return (this.nombre== ((Persona)obj).nombre && this.edad== ((Persona)obj).edad);    	
    }

	@Override
	public int compareTo(Object p) {
		String nombreP1 = this.getNombre();
		String nombreP2 = ((Persona)p).getNombre();
		return nombreP1.compareTo(nombreP2);
	} 
    
}