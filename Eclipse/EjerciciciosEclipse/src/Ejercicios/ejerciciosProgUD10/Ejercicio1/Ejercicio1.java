package ejerciciosProgUD10.Ejercicio1;

import java.math.BigDecimal;
import java.sql.Date;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Ejercicio 1
        // Declaro unm nuevo evento con todos sus campos
        EventoMusical evento = new EventoMusical(
                "BahiaSound",
                new Date(2926, 7, 12),
                new BigDecimal("12500.50")
        );
        // Imprimo el evento creado
        System.out.println(evento);
         }
}