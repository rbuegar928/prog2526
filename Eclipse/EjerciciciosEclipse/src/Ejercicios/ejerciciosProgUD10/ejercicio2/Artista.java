package ejerciciosProgUD10.ejercicio2;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Artista implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nombre;
    private String pais;

    public Artista() {

    }

    public Artista(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public Long getId() {
        return id;
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