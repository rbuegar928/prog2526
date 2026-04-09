package ejerciciosProgUD6.ejercicio2;

class Vaca extends AnimalBase {

    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Muuu");
    }

    @Override
    public void comer() {
        System.out.println("La vaca está comiendo hierba...");
    }
}