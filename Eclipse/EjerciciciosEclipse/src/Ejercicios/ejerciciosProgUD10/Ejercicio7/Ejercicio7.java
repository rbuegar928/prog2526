package ejerciciosProgUD10.Ejercicio7;

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

        // Ejercicio 6

        // Cambiale el nombre al primer evento para ponerlo en mayúsculas utilizando el identificador.

        em.getTransaction().begin();
        // Cogemos evento como el evento que vamos a modificar
        EventoMusical eventoModificar = em.find(EventoMusical.class, evento.getId());
        // Ponemos el nombre que tiene evento en mayúsculas
        eventoModificar.setNombre(eventoModificar.getNombre().toUpperCase());

        em.getTransaction().commit();

        System.out.println(eventoModificar);


        // Cambia ahora el nombre al segundo evento para ponerlo también en mayúsculas utilizando JPQL.
        
        // Con una query estática
        em.getTransaction().begin();
        // Ejecuta esta línea sobre el evento que se llama 'Puro Latino'
        int filasActualizadas = em.createQuery("UPDATE EventoMusical e SET e.nombre = UPPER(e.nombre) WHERE e.nombre = 'Puro Latino'").executeUpdate();

        em.getTransaction().commit();

        System.out.println("Filas actualizadas: " + filasActualizadas);

        // Con una query dinámica
        String nombreEventoModificar = "PURO LATINO";

        em.getTransaction().begin();

        int filasActualizadasDinamica = em.createQuery("UPDATE EventoMusical e SET e.nombre = UPPER(e.nombre) WHERE e.nombre = :nombre").setParameter("nombre", nombreEventoModificar).executeUpdate();

        em.getTransaction().commit();

        System.out.println("Filas actualizadas: " + filasActualizadasDinamica);

        // Ejercicio 7

        // Elimina de la base de datos el primer evento, pero antes haz una copia
        // con otro id diferente. Realiza el borrado utilizando el identificador.

        em.getTransaction().begin();
        // Cogemos el evento primero
        EventoMusical eventoOriginal = em.find(EventoMusical.class, evento.getId());
        // Creamos la copia con los datos del original, con todo excepto el Id
        EventoMusical copiaEvento = new EventoMusical(
                eventoOriginal.getNombre(),
                eventoOriginal.getFecha(),
                eventoOriginal.getRecaudacion(),
                eventoOriginal.getGenero());
        // Guardamos la copia
        em.persist(copiaEvento);
        // Borramos el original
        em.remove(eventoOriginal);

        em.getTransaction().commit();

        System.out.println("Evento eliminado y copia creada.");

        // Elimino el segundo con una query estática

        em.getTransaction().begin();
        //Elimino el eventoq ue se llama puro latino
        int filasEliminadas = em.createQuery("DELETE FROM EventoMusical e WHERE e.nombre = 'PURO LATINO'").executeUpdate();

        em.getTransaction().commit();

        System.out.println("Filas eliminadas: " + filasEliminadas);

        // Con una query dinámica
        // Aquí elimino mediante el parámetro nombreEliminar
        String nombreEliminar = "PURO LATINO";

        em.getTransaction().begin();

        int filasEliminadasDinamica = em.createQuery("DELETE FROM EventoMusical e WHERE e.nombre = :nombre").setParameter("nombre", nombreEliminar).executeUpdate();

        em.getTransaction().commit();

        System.out.println("Filas eliminadas: " + filasEliminadasDinamica);

        }
}