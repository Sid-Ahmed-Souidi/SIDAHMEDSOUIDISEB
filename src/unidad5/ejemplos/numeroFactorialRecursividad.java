package unidad5.ejemplos;

public class numeroFactorialRecursividad {

    public static void main(String[] args) {
        int numero = 5;
        long resultado = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }

    // Función recursiva para calcular el factorial
    public static long calcularFactorial(int n) {
        // Caso base
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Caso recursivo: n! = n * (n-1)!
            return n * calcularFactorial(n - 1);
        }
    }

}
