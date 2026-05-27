package ejerciciosProgUD10.Ejercicio1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class EventoMusical implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nombreEvento;
    private LocalDate fecha;
    private BigDecimal recaudacion;
    
    public EventoMusical() {
    	
    }
    
	public EventoMusical(String nombreEvento, LocalDate fecha, BigDecimal recaudacion) {
		super();
		this.nombreEvento = nombreEvento;
		this.fecha = fecha;
		this.recaudacion = recaudacion;
	}

	public String getNombreEvento() {
		return nombreEvento;
	}
	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getRecaudacion() {
		return recaudacion;
	}
	public void setRecaudacion(BigDecimal recaudacion) {
		this.recaudacion = recaudacion;
	}
	@Override
	public String toString() {
		return "EventoMusical: " + nombreEvento + ", fecha: " + fecha + ", recaudacion: " + recaudacion;
	}
}
