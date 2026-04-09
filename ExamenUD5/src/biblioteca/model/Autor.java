package biblioteca.model;

public class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre() {
    	this.nombre =nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad() {
    	this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "El nombre del autor es " + nombre + ", y su nacionalidad es " + nacionalidad;
    }
}
