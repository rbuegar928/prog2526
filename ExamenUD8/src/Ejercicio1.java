import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
	public static void main(String[] args) {
		List<String>Pacientes = new ArrayList<>();  // Elijo arrayList porque es la que tiene 
		   											// acceso directo al paciente por su índice y guarda por orden de llegada
		Pacientes.add("Paco");
		Pacientes.add("Emilio");
		Pacientes.add("Manolo");
		Pacientes.add("Adolfo");
		Pacientes.add("Juan");
		
		// Pruebo el método
		System.out.println(devolverNombreDePaciente(Pacientes, 3));
	}
	
	public static String devolverNombreDePaciente(List Pacientes, int n) {
		return (String) (Pacientes.get(n));	
	}
}
