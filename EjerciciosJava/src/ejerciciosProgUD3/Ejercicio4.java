package ejerciciosProgUD3;


public class Ejercicio4 {
    public static void main(String[] args) {

        short max = 32767;
        short min = -32768;

        short siguienteMax = (short) (max + 1);

        short anteriorMin = (short) (min - 1);

        System.out.println("Valor maximo de short: " + max);
        System.out.println("Valor minimo de short: " + min);

        System.out.println("Si incrementamos el maximo (32767 + 1) obtenemos: " + siguienteMax);
        System.out.println("Si decrementamos el minimo (-32768 - 1) obtenemos: " + anteriorMin);
    }
}
