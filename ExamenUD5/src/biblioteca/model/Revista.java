package biblioteca.model;

public class Revista extends ItemBiblioteca{
	private int numero;
	private String periodicidad;
	
	public Revista(int id, String titulo, int anioPublicacion, int numero, String periodicidad) {
		super(id, titulo, anioPublicacion);
		this.numero = numero;
		this.periodicidad = periodicidad;
	}
	
	@Override
	public String obtenerDescripcion() {
		return "El id que corresponde a esta revista es " + id + " ,su titulo es "
				+ titulo + " ,se publicó en el año " + anioPublicacion + " ,su numero es "
				+ numero + "y tiene una periodicidad de  " + periodicidad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}
	
}
