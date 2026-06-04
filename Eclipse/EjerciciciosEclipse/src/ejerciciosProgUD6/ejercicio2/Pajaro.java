package ejerciciosProgUD6.ejercicio2;

class Pajaro extends AnimalBase implements Volador {

    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Pío pío");
    }

    @Override
    public void comer() {
        System.out.println("El pájaro está comiendo semillas...");
    }

    @Override
    public void volar() {
        System.out.println("El pájaro está volando...");
    }
}