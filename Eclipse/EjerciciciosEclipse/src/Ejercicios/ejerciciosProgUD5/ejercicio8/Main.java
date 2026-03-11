package ejerciciosProgUD5.ejercicio8;

public class Main {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado [5];
		
		empleado[0] = new EmpleadoFijo("Joaquin", 2000);
		empleado[1] = new EmpleadoPorHoras("Juan", 80, 15);
		empleado[2] = new EmpleadoFijo("Paula", 2000);
		empleado[3] = new EmpleadoPorHoras("Adolfo", 80, 15 );
		empleado[4] = new EmpleadoPorHoras("Francisco", 80, 15 );
	
	for (Empleado e : empleados) {
		System.out.println("Nombre" + e.getNombre());
	}
	}

}
