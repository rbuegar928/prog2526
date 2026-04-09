package biblioteca.model;

public class Libro extends ItemBiblioteca{
	private String autor;
	private int numeroPaginas;
	
	public Libro(int id, String titulo, int anioPublicacion, String autor, int numeroPaginas) {
		super(id, titulo, anioPublicacion);
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String obtenerDescripcion() {
		return "El id que corresponde a este libro es " + id + " ,su titulo es "
				+ titulo + " ,se publicó en el año " + anioPublicacion + " ,su autor es "
				+ autor + "y esta formado por " + numeroPaginas + "paginas.";
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	//meter array de autores
}
