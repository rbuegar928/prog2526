package ejerciciosProgUD8.ejercicio14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

public class ComparativaMaps {

    public static void main(String[] args) {

        HashMap<String, Integer> aleatorio = new HashMap<>();
        LinkedHashMap<String, Integer> insercion = new LinkedHashMap<>();
        TreeMap<String, Integer> alfabetico = new TreeMap<>();

        aleatorio.put("Zoe", 85);
        aleatorio.put("Bernat", 92);
        aleatorio.put("Ana", 78);
        aleatorio.put("Mario", 88);

        insercion.putAll(aleatorio); // metemos todo lo que esta dentro de aleatorio, ya que queremmos las mismas personas
        insercion.putAll(aleatorio);
        
        mostrarMapa(aleatorio, "HashMap");
        mostrarMapa(insercion, "LinkedHashMap");
        mostrarMapa(alfabetico, "TreeMap");
    }

    private static void mostrarMapa(Map<String, Integer> mapa, String tipo) {
    	System.out.println("Mostrando: " + tipo);
        Iterator<Entry<String, Integer>> it = mapa.entrySet().iterator();

        while (it.hasNext()) {
        	Entry<String, Integer>participante = it.next();
            System.out.println(participante);
        }
    }
}