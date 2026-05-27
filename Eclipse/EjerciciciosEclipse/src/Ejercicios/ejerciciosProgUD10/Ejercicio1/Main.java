package ejerciciosProgUD10.Ejercicio1;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ejerciciosProgUD10.Ejercicio1.EventoMusical.GeneroMusical;
import ejerciciosProgUD10.ejercicio2.Artista;

public class Main {

    public static void main(String[] args) {
    	// Ejercicio 1
        EventoMusical evento = new EventoMusical(
                "BahiaSound",
                new Date(2926, 7, 12),
                new BigDecimal("12500.50"),
                GeneroMusical.POP
        );

        System.out.println(evento);
        //Ejercicio 2
        Artista Estopa = new Artista();
        Estopa.setNombre("Estopa");
        Estopa.setPais("España");
        evento.agregarArtista(Estopa);
        
        // Ejercicio 4
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventos.odb");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(evento);
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
}