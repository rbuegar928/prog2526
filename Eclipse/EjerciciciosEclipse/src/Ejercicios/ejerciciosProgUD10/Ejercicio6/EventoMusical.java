package ejerciciosProgUD10.Ejercicio6;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;
//Lo ponemos como entidad para poder almacenar eventos musicales en la base de datos.
// Implementa Serializable para permitir la serialización de objetos.
@Entity
public class EventoMusical implements Serializable {

	// Esto es poruqe siempre hay qu eponerlo ocn el serializabe
	private static final long serialVersionUID = 1L;
	// Clave primaria de la entidad.
	// Ponemos que se genere automáticamente con una secuencia  de 10 en 10
	@Id
	@GeneratedValue(generator = "SecuenciaDe10en10", strategy = GenerationType.SEQUENCE)
	//Secuencia de 10 en 10
	@SequenceGenerator(name = "SecuenciaDe10en10", allocationSize = 10)
	private Long id;
	private String nombre;
	private Date fecha;
	private BigDecimal recaudacion;
	private GeneroMusical genero;
	@ElementCollection
	private List<Artista> artistas;
	@Transient // Trnsient es para que no lo serialice
	private int control;
	
	public enum GeneroMusical {
		POP, JAZZ, ROCK
	}
	
	
	public EventoMusical() {
		
	}
	
	public EventoMusical(String nombre, Date fecha, BigDecimal recaudacion, GeneroMusical genero) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.recaudacion = recaudacion;
		this.genero = genero;
		// Lo añadimos porque nos lo pide la actividad 4
		artistas = new ArrayList<>();
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Artista> getArtistas() {
		return artistas;
	}

	public void setArtistas(List<Artista> artistas) {
		this.artistas = artistas;
	}

	public int getControl() {
		return control;
	}

	public void setControl(int control) {
		this.control = control;
	}

	public String getNombreEvento() {
		return nombreEvento;
	}
	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getRecaudacion() {
		return recaudacion;
	}
	public void setRecaudacion(BigDecimal recaudacion) {
		this.recaudacion = recaudacion;
	}
	public GeneroMusical getGenero() {
		return Genero;
	}

	public void setGenero(GeneroMusical genero) {
		this.Genero = genero;
	}
	public void agregarArtista(Artista artista) {
		artistas.add(artista);
	}
	@Override
	public String toString() {
		return "EventoMusical: " + nombreEvento + ", fecha: " + fecha + ", recaudacion: " + recaudacion;

}