package unidad5.ejemplos;

public class SumaRecursividad {

	public static void main(String[] args) {
		 int n = 6;
	        int suma = sumaNaturales(n);

	        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
	   

	}
	 private static int sumaNaturales(int n) {
	        // Caso base
	        if (n == 0) {
	            return 0;
	        } else {
	            // Caso recursivo
	            return n + sumaNaturales(n - 1);
	        }

	}

}