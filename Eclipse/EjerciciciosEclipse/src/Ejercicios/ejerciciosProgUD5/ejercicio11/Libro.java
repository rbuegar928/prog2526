package ejerciciosProgUD5.ejercicio11;

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;


    public Libro(String titulo, String autor, String isbn, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }
    
    public void setTitulo(String titulo) {
    	this.titulo = titulo;
    }
    public String getTitulo() {
    	return titulo;
    }
    public void setAutor(String autor) {
    	this.autor = autor;
    }
    public String getAutor() {
    	return autor;
    }
    public void setIsbn(String isbn) {
    	this.isbn = isbn;
    }
    public String getIsbn() {
    	return isbn;
    }
    public int getAnioPublicacion() {
    	return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
    	this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor +
               ", Año: " + anioPublicacion + ", ISBN: " + isbn;
    }

    @Override
    public boolean equals(Object obj) {
    	return (this.isbn== ((Libro)obj).isbn);
    }
}