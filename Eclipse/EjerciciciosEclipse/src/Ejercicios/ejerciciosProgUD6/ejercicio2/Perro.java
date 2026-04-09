package ejerciciosProgUD6.ejercicio2;

class Perro extends AnimalBase {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo pienso");
    }
}