package ProyectoTema3;

import java.util.Scanner;

public class ProyectoTema3 {


    // Funciones para las opereraciones

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static Double dividir(double a, double b) {
        return a / b;
    }

    public static Double raiz(double num) {
        return Math.sqrt(num);
    }

    public static double potencia(double base, double exp) {
        return Math.pow(base, exp);
    }

    public static long redondear(double num) {
        return Math.round(num);
    }

    public static Double modulo(double a, double b) {
        return a % b;
    }

    public static Double areaCirculo(double radio) {
        return 3.1416 * radio * radio;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcion;
        
        // Menu
        do {
            System.out.println("\nMenú Calculadora");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Raíz cuadrada");
            System.out.println("6. Potencia");
            System.out.println("7. Redondeo");
            System.out.println("8. Módulo");
            System.out.println("9. Área del círculo");
            System.out.println("0. Salir");
            System.out.println("Elige una opción: ");

            opcion = sc.next();

            double a, b, num, radio;

            // switch para los distintos casos de la calculadora
            switch (opcion) {
                // suma
                case "1":
                    System.out.println("Primer número: ");
                    a = sc.nextDouble();
                    System.out.println("Segundo número: ");
                    b = sc.nextDouble();
                    System.out.println("Resultado de la suma: " + sumar(a, b));
                    break;
                // restar
                    
                case "2":
                    System.out.println("Primer número: ");
                    a = sc.nextDouble();
                    System.out.println("Segundo número: ");
                    b = sc.nextDouble();
                    System.out.println("Resultado de la resta: " + restar(a, b));
                    break;
                    
                // multiplicacion
                case "3":
                    System.out.println("Primer número: ");
                    a = sc.nextDouble();
                    System.out.println("Segundo número: ");
                    b = sc.nextDouble();
                    System.out.println("Resultado de la multiplicación: " + multiplicar(a, b));
                    break;
                    
                // division
                case "4":
                    System.out.println("Primer número: ");
                    a = sc.nextDouble();
                    System.out.println("Segundo número: ");
                    b = sc.nextDouble();
                    System.out.println("Resultado de la division: " + dividir(a, b));
                    break;
                    
                // raiz
                case "5":
                    System.out.println("Número: ");
                    num = sc.nextDouble();
                    System.out.println("Resultado: " + raiz(num));
                    break;
                    
                // potencia
                case "6":
                    System.out.println("Base: ");
                    a = sc.nextDouble();
                    System.out.println("Exponente: ");
                    b = sc.nextDouble();
                    System.out.println("Resultado: " + potencia(a, b));
                    break;
                    
                // Redondeo
                case "7":
                    System.out.println("Número: ");
                    num = sc.nextDouble();
                    System.out.println("Resultado: " + redondear(num));
                    break;
                    
                // modulo
                case "8":
                    System.out.println("Primer número: ");
                    a = sc.nextDouble();
                    System.out.println("Segundo número: ");
                    b = sc.nextDouble();
                    System.out.println("Resultado: " + modulo(a, b));
                    break;

                // radio    
                case "9":
                    System.out.println("Radio: ");
                    radio = sc.nextDouble();
                    System.out.println("Área: " + areaCirculo(radio));
                    break;
                
                // salir de la calculadora
                case "0":
                    System.out.println("Cerrando calculadora");
                    break;
                    
                default:
                    System.out.println("Opción no encontrada, prueba otra vez.");
            }

        } while (opcion != "0");
    }
}
