package ejerciciosProgUD5.ejercicio1;

class CuentaBancaria {
private String titular;
private double saldo;

public  String getTitular() {
	return titular;
}

public double getSaldo() {
	return saldo;
}

public void ingresar (double saldo) {
	if (this.saldo >= 0) {
		this.saldo = saldo + saldo;
		System.out.println("El dinero ha sido ingresado correctamente");
	}
	else {
		System.out.println("No se pueden realizar ingresos negativos, inténtelo de nuevo.");
	}
}

public void retirar (double saldo) {
	if (this.saldo >= saldo) {
		this.saldo = saldo - saldo;
		System.out.println("El dinero ha sido retirado correctamente");
	}
	else {
		System.out.println("No se puede retirar, no tienes tanto dinero.");
	}
}


}