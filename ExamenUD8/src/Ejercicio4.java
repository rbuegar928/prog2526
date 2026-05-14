
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio4 implements Comparable{
	public static void main(String[] args) {
		Set<Producto>Productos = new TreeSet<>();
		// Este es el set en el que después habrá que meter los productos

	}
	
	public class Producto{
		private int id;
		private double precio;
		
		public Producto(int id, double precio) {
			super();
			this.id = id;
			this.precio = precio;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
	}

	public int compararPrecio(Producto p1, Producto p2) {
		if (p1.getPrecio() == p2.getPrecio()) {
			return 0;
		} else if (p1.getPrecio() > p2.getPrecio()) {
			return 1;
		} else {
			return -1;
		}
		
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
