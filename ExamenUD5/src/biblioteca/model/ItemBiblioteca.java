package biblioteca.model;

public abstract class ItemBiblioteca {
	protected int id;
	protected String titulo;
	protected int anioPublicacion;
	
	ItemBiblioteca(int id, String titulo, int anioPublicacion){
		this.id = id;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
	}
	
	// getters y setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getanioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	public abstract String obtenerDescripcion();
	
	@Override
    public String toString() {
        return "Id: " + id + ", titulo: " + titulo + ", año de publicacion: " + anioPublicacion;
    }
}
