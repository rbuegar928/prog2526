package ejerciciosProgUD10.Ejercicio1;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

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

        // Ejercicio 2
        Artista estopa = new Artista();
        estopa.setNombre("Estopa");
        estopa.setPais("España");

        evento.agregarArtista(estopa);

        // Creamos un segundo evento para el ejercicio 5
        EventoMusical evento2 = new EventoMusical(
                "RockFest",
                new Date(2926, 8, 20),
                new BigDecimal("20000.00"),
                GeneroMusical.ROCK
        );

        // Ejercicio 4
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(
                "objectdb:$objectdb/db/eventos.odb"
        );

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(evento);
        em.persist(evento2);

        em.getTransaction().commit();

        // Ejercicio 5

        // Imprime el primer evento que insertaste en el ejercicio anterior utilizando el identificador.
        EventoMusical eventoBuscado = em.find(EventoMusical.class, evento.getId());

        System.out.println(eventoBuscado);

        // Query estática
        TypedQuery<EventoMusical> queryEstatica = em.createQuery("SELECT e FROM EventoMusical e WHERE e.nombreEvento = 'RockFest'",EventoMusical.class);

        List<EventoMusical> eventoEstatica = queryEstatica.getResultList();

        System.out.println(eventoEstatica);

        // Query dinámica

        TypedQuery<EventoMusical> queryDinamica = em.createQuery("SELECT e FROM EventoMusical e WHERE e.nombreEvento = :nombreEvento",EventoMusical.class);
        
        String nombreEvento = "RockFest";
        queryDinamica.setParameter("nombreEvento", nombreEvento);

        List<EventoMusical> eventoDinamica = queryDinamica.getResultList();

        System.out.println(eventoDinamica);

        em.close();
        emf.close();
    }
}