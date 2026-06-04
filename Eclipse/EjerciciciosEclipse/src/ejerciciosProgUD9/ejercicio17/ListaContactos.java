package ejerciciosProgUD9.ejercicio17;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import comunes.Persona;

public class ListaContactos {

	public static void main(String[] args) {
		List<Persona> contactos = new ArrayList<>();
		contactos.add(new Persona( "Joaquín", "Calle Narváez n 12", "600111222"));
        contactos.add(new Persona("Luis", "Avenida Montserrat n 8", "666777888"));
        contactos.add(new Persona( "Adolfo", "Avenida Tigres n 3", "688444333"));
        contactos.add(new Persona( "Manuela", "Calle Pintores n 14", "611223344"));
        contactos.add(new Persona( "Paco", "Calle Fiestas n 1", "69987766"));
        
        try {
            // Inicializar el documento vacío
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.newDocument(); // Documento en blanco

            // 
            
            // Crear el elemento raíz <contactos>
            Element raiz = documento.createElement("contactos");

            // Añadirlo al documento
            documento.appendChild(raiz);

            // Crear el elemento <pantalla>
            Element persona = documento.createElement("persona");

            // Asignarle atributo
            persona.setAttribute("nombre", "Joaquín");
            persona.setAttribute("direccion", "Calle Narváez n 12");
            persona.setAttribute("telefono", "600111222");

            // Asignarle el texto interno
            persona.setTextContent("textoInternoDePantalla");
                     
            // ¡Crucial! Si no lo añades a la raíz, el nodo queda flotando en memoria
            raiz.appendChild(pantalla);

            // Crear el elemento <audio>, asignarle atributo y texto interno
            Element audio = documento.createElement("audio");
            audio.setAttribute("volumen", "80");
            audio.setTextContent("false");
            
            // Añadirlo al árbol en el lugar correcto
           
            raiz.appendChild(audio);
            
            // === FASE 3: El "Transformer" (Exportar memoria a archivo físico) ===
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            
            // Truco: Activar la indentación para que el XML no salga en una sola línea
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            // Definir el origen (nuestro árbol DOM) y el destino (el archivo de texto)
            DOMSource origen = new DOMSource(documento);
            StreamResult destino = new StreamResult(new File("juego_config.xml"));

            // Serializar el documento XML
            transformer.transform(origen, destino);
            
            System.out.println("¡Archivo XML generado con éxito de manera estructurada!");

        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
