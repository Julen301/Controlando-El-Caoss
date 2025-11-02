package app;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("=== Calculadora Básica ===");
        int a = 10;
        int b = 5;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo (resto): " + (a % b));
        System.out.println("Potencia: " + Math.pow(a, b));

    }
}