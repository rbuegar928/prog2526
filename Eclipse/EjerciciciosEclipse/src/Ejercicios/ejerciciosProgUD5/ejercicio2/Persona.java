package ejerciciosProgUD5.ejercicio2;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private double estatura;
    DiaDeLaSemana dia;
    Sexo sexo;

    public Persona(String nombre, String apellido, int edad, double estatura, DiaDeLaSemana dia, Sexo sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
        this.dia = dia;
        this.sexo = sexo; 
    }

    public void cumplirAños() {
        edad++;
    }

    public void crecer(double incremento) {
        estatura += incremento;
    }

    public enum Sexo {
        MASCULINO, FEMENINO, NO_BINARIO
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + ", Edad: " + edad + ", Estatura: " + estatura +
               ", Dia: " + dia + ", Sexo: " + sexo;
    }

 // Get y Set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public DiaDeLaSemana getDia() {
		return dia;
	}

	public void setDia(DiaDeLaSemana dia) {
		this.dia = dia;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
}