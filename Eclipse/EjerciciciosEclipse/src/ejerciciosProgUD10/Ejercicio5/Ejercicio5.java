package ejerciciosProgUD10.Ejercicio5;

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
        // Creamos unm nuevo evento con todos sus campos
        EventoMusical evento = new EventoMusical(
                "BahiaSound",
                new Date(2926, 7, 12),
                new BigDecimal("12500.50"),
                GeneroMusical.POP
        );
        // Imprimo el evento creado
        System.out.println(evento);

        // Ejercicio 2
        // Creamos el evento musical conciertoEstopa como evento vacío
        EventoMusical conciertoEstopa = new EventoMusical();
        
        // Creamos el artista Estopa y añadimos todos sus datos con getters y setters
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

         // Ejercicio 4
         // Creamos la conexión con la base de datos de ObjectDB
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventos.odb");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        // Guardamos los eventos en la base de datos
        em.persist(evento);
        em.persist(conciertoEstopa2);
        // Confirmamos cambios
        em.getTransaction().commit();

        // Ejercicio 5

        // Imprime el primer evento que insertaste en el ejercicio anterior utilizando el identificador (nos coge el del primero por que es el que se llama evento).
        EventoMusical eventoBuscado = em.find(EventoMusical.class, evento.getId());

        System.out.println(eventoBuscado);

        // Query estática
        // Buscamos u evento que se llame RockFest
        TypedQuery<EventoMusical> queryEstatica = em.createQuery("SELECT e FROM EventoMusical e WHERE e.nombre = 'RockFest'",EventoMusical.class);
        // Guardamos en eventoEstatica el resultado para luego imprimirlo
        List<EventoMusical> eventoEstatica = queryEstatica.getResultList();

        System.out.println(eventoEstatica);

        // Query dinámica
        // Hacemos una búsqueda por nombre, el cuál indico más abajo
        TypedQuery<EventoMusical> queryDinamica = em.createQuery("SELECT e FROM EventoMusical e WHERE e.nombre = :nombre",EventoMusical.class);
        
        String nombreEvento = "RockFest";
        queryDinamica.setParameter("nombre", nombreEvento);
        // Guardamos en eventoDinamica el resultado para luego imprimirlo
        List<EventoMusical> eventoDinamica = queryDinamica.getResultList();

        System.out.println(eventoDinamica);

        em.close();
        emf.close();


        }
}