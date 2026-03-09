package ejerciciosProgUD5.ejercicio4;

class ContadorObjetos {
	private static int totalObjetos = 0;
	
	ContadorObjetos (){
		totalObjetos += 1;
	}
	static void mostrarTotalObjetos() {
		System.out.println(totalObjetos);
	}
}
