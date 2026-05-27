package ejerciciosProgUD10.Ejercicio1;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Ejercicio1 {

    public static void main(String[] args) {

        EventoMusical evento = new EventoMusical(
                "BahiaSound",
                LocalDate.of(2026, 6, 15),
                new BigDecimal("12500.50")
        );

        System.out.println(evento);
    }
}