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
        // Declaro unm nuevo evento con todos sus campos
        EventoMusical evento = new EventoMusical(
                "BahiaSound",
                new Date(2926, 7, 12),
                new BigDecimal("12500.50"),
                GeneroMusical.POP
        );
        // Imprimo el evento creado
        System.out.println(evento);
         }
}