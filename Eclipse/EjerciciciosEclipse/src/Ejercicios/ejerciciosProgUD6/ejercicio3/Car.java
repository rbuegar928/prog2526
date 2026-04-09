package ejerciciosProgUD6.ejercicio3;

public class Car extends Vehicle {
	
	private int numberOfDoors;

	@Override
	public double calculateSpeed() {
		return 0;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

}