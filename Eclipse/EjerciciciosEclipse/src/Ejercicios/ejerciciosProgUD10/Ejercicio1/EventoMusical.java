package ejerciciosProgUD10.Ejercicio1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import ejerciciosProgUD10.ejercicio2.Artista;

@Entity
public class EventoMusical implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "SecuaenciaDe10en10", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SecuaenciaDe10en10", allocationSize = 10)
	private Long id;
	private String nombreEvento;
    private Date fecha;
    private BigDecimal recaudacion;
    private GeneroMusical Genero;
    private List<Artista> artistas;
    @Transient
    private int control;
    
    public enum GeneroMusical{
    	ROCK, POP, CLASICO
    }
    
    
    
    public EventoMusical() {
    	
    }
    
	public EventoMusical(String nombreEvento, Date fecha, BigDecimal recaudacion, GeneroMusical Genero) {
		super();
		this.nombreEvento = nombreEvento;
		this.fecha = fecha;
		this.recaudacion = recaudacion;
		this.Genero = Genero;
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
}
