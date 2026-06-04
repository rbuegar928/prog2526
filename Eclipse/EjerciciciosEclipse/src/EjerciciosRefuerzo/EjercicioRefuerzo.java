package EjerciciosRefuerzo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EjercicioRefuerzo {

    public static void main(String[] args) {

        List<String> alumnos = new ArrayList<>(Arrays.asList(
                "Ra�l Miami", "Carrero Oriyinal", "Perales", "Decarex Fake", "Anto�ito",
                "Copet's", "Ra�h Malo", "Atalay", "Pinar", "Oscah", "Jhonas", "Hoce Mari")
        );
        
        Collections.shuffle(alumnos);

        List<String> equipo1 = new ArrayList<>();
        List<String> equipo2 = new ArrayList<>();

        for (int i = 0; i < alumnos.size(); i++) {
            if (i % 2 == 0) {
                equipo1.add(alumnos.get(i));
            } else {
                equipo2.add(alumnos.get(i));
            }
        }

        System.out.println("Equipo 1: "+equipo1);

        System.out.println("Equipo 2: "+equipo2);
        
    }
}