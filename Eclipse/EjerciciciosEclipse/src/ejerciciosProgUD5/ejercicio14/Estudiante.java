package ejerciciosProgUD5.ejercicio14;

public class Estudiante extends Persona{
	private Integer carnetId;
	private double notaMedia;
	
	
	public void esMatriculaHonor() {
		System.out.println("El estudiante con carnet " + carnetId + "es"
				+ " matrícula de honor con una nota media de " + notaMedia);
	}

}
