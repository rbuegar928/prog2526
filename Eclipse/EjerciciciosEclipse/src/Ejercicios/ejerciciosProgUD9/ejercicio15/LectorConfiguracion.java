package ejerciciosProgUD9.ejercicio15;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class LectorConfiguracion {
    public static void main(String[] args) {
        try {
            //TODO: 1. Crear la factoría y el constructor de documentos
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            //TODO: 2. Parsear el archivo XML
            File file = new File("config.xml");
            
            Document document = builder.parse(file);
            System.out.println("Documento parseado!");

            // Opcional pero recomendado: Normaliza el árbol XML
            //documento.getDocumentElement().normalize();

            //TODO: 3. Obtener el elemento raíz (<configuracion>)
           
            //TODO: 4. Obtener los hijos de <base-datos>
            // NodeList listaBaseDatos =
            // Tomamos el primero
            // Node nodoBaseDatos =
            //TODO: 5. Vamos a ver sus hijos directos
            // NodeList hijos =
            // System.out.println("\nNúmero de hijos detectados: " + _____);
            
            System.out.println("--- Listando hijos ---");
           //TODO: Mostrar todos los nodos


                System.out.println("Hijo " + i + " -> Tipo: " + hijo.getNodeType() + " | Nombre: " + hijo.getNodeName());
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

