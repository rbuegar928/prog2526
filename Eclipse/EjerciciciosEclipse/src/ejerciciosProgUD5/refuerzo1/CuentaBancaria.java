package ejerciciosProgUD5.refuerzo1;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	static private int totalCuentas = 0;

	CuentaBancaria(String titular, double saldo){
		this.titular = titular;
		this.saldo = saldo;
		totalCuentas += 1;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	void mostrarDatos() {
		System.out.println("El titular de la cuenta es " + titular);
		System.out.println("EEl saldo de la cuenta es " + saldo);
	}
	void ingresar(double cantidad) {
		if(cantidad>0) {
			saldo = saldo + cantidad;
		}
		else {
			System.out.println("No se puede ingresar una cantidad igualo menor que 0");
		}
	}
	static void getTotalCuentas() {
		System.out.println(totalCuentas);
	}
}
