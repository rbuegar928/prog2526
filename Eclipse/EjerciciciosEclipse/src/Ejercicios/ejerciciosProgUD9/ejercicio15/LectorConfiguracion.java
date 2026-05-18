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

            // 2. Parsear el archivo XML
            File file = new File("config.xml");
            Document documento = builder.parse(file);

            // Opcional pero recomendado: Normaliza el árbol XML
            documento.getDocumentElement().normalize();

            // 3. Obtener el elemento raíz (<configuracion>)
            Element raiz = documento.getDocumentElement();

            System.out.println("Elemento raíz: " + raiz.getNodeName());

            // 4. Obtener los hijos de <base-datos>
            NodeList hijosBaseDatos = raiz.getElementsByTagName("base-datos");

            // Tomamos el primero
            Node primeroBaseDatos = hijosBaseDatos.item(0);

            // 5. Vamos a ver sus hijos directos
            NodeList hijos = primeroBaseDatos.getChildNodes();

            System.out.println("\nNúmero de hijos detectados: " + hijos.getLength());

            System.out.println("--- Listando hijos ---");

            // Mostrar todos los nodos
            for (int i = 0; i < hijos.getLength(); i++) {

                Node hijo = hijos.item(i);

                System.out.println("Hijo " + i + " -> Tipo: " + hijo.getNodeType() + " | Nombre: " + hijo.getNodeName());
            
        } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

