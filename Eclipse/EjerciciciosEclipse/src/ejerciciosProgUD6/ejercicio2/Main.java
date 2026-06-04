package ejerciciosProgUD6.ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		Perro p1 = new Perro("p1");
		Gato g1 = new Gato("g1");
		Perro p2 = new Perro("p2");
		Vaca v1 = new Vaca("v1");
		Vaca v2 = new Vaca("v2");
		
		
		Animal[] animales = new Animal[5];
		animales[1] = p1;
		animales[2] = v1;
		animales[3] = g1;
		animales[4] = p2;
		animales[5] = v2;
		
		for(Animal animal:animales) {
			AnimalBase animalBase = (Perro)animal;
			animal.hacerSonido();
			animal.comer();
		}

	}

}
