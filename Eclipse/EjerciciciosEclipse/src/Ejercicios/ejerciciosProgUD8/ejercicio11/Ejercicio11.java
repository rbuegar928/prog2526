package ejerciciosProgUD8.ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		ClubDeLectura clubDeLecturaUbrique = new ClubDeLectura();
		ClubDeLectura club1daw = new ClubDeLectura();
		club1daw.agregarLibros("El Señor de Los Anillos");
		club1daw.agregarLibros("Hércules");
		clubDeLecturaUbrique.agregarLibros("El Rey León");
		System.out.println("-----Club 1 daw-----");
		club1daw.mostrarBiblioteca();
		System.out.println("-----Club de lectura de Ubrique-----");
		clubDeLecturaUbrique.mostrarBiblioteca();
	}

}
