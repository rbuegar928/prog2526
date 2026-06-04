package ejerciciosProgUD10.Ejercicio3;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import ejerciciosProgUD10.Ejercicio1.EventoMusical.GeneroMusical;
import ejerciciosProgUD10.ejercicio2.Artista;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Ejercicio 1
        // Declaro unm nuevo evento con todos sus campos
        EventoMusical evento = new EventoMusical(
                "BahiaSound",
                new Date(2926, 7, 12),
                new BigDecimal("12500.50"),
                GeneroMusical.POP
        );
        // Imprimo el evento creado
        System.out.println(evento);

        // Ejercicio 2
        // Creamos el evento musical conciertoEstopa
        EventoMusical conciertoEstopa = new EventoMusical();
        
        // Creamos el artista Estopa y añadimos todo a su concierto con getters y setters
        Artista estopa = new Artista();
        estopa.setNombre("Estopa");
        estopa.setPais("España");
		estopa.getNombre();
		estopa.getPais();

        // Ejercicio 3
        // Creamos 
        EventoMusical conciertoEstopa2 = new EventoMusical("Puro Latino", new Date(2026, 7, 12), new BigDecimal (10000), GeneroMusical.POP);
        // Añadimos estopa al concierto que tenemos con datos
		conciertoEstopa.agregarArtista(estopa);
         }
}