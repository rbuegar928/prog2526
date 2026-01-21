package ejerciciosProgUD5.ejercicio2;

import ejerciciosProgUD5.ejercicio2.Persona.Sexo;

public class Ciudad {
    public static void main(String[] args){
        Persona persona1 = new Persona("Emilio", "Roca", 19, 1.80, DiaDeLaSemana.MARTES, Sexo.MASCULINO);
		Persona persona2 = new Persona("Alberto", "Gomez", 38, 1.90, DiaDeLaSemana.MARTES, Sexo.MASCULINO);
		Persona persona3 = new Persona("Paco", "Martínez", 23, 1.92, DiaDeLaSemana.MARTES, Sexo.MASCULINO);
		
		System.out.println("Personas creadas:");
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
		
		persona3.setNombre("Juan"); // Modificamos el nombre de Paco para que se llame Juan
		System.out.println("Se actualizo el nombre de la persona a: " + persona3.getNombre());
		
		persona1.cumplirAños(); // Utilizamos metodo para que la persona1 tenga 1 año mas
		persona2.setEdad(42);   // Utilizamos metodo set para actualizar la edad a 42
		persona3.crecer(0.14);	// Utilizamos metodo para que persona3 aumente su estatura
		
		System.out.println("\nPersonas actualizadas:");
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
		
		
}
}