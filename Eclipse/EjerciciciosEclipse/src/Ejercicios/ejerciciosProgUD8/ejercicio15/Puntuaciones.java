package ejerciciosProgUD8.ejercicio15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Puntuaciones {

    public static void main(String[] args) {

        List<Integer> puntuaciones = new ArrayList<>();
        puntuaciones.add(450);
        puntuaciones.add(1200);
        puntuaciones.add(300);
        puntuaciones.add(800);
        puntuaciones.add(1500);
        puntuaciones.add(100);
        // puntuaciones.addAll(Arrays.asList("450, 1200, 300 800, 1500, 100"))
        
        System.out.println(puntuaciones);

        Collections.sort(puntuaciones);
        System.out.println(puntuaciones);

        int max = Collections.max(puntuaciones);
        int min = Collections.min(puntuaciones);

        System.out.println("Puntuación máxima: " + max);
        System.out.println("Puntuación mínima: " + min);

        Collections.shuffle(puntuaciones);
        System.out.println(puntuaciones);
    }
}