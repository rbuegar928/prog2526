package ejerciciosProgUD10.Ejercicio5;

import java.io.Serializable;

import javax.persistence.Embeddable;

// Es para embeber artista, es decir, no tendrá una tabla propia en la base de datos y sus campos se 
// almacenarán como columnas de la entidad que la contenga, por ejemplo eventoMusical
@Embeddable
public class Artista implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nombre;
    private String pais;

    public Artista() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}