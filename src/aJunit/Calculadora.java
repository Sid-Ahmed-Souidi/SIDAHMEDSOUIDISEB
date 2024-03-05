
package aJunit;

public class Calculadora {

		 public boolean esPrimo(int n) {
		 if (n <= 1) {
		 return false;
		 }
		 for (int i = 2; i <= Math.sqrt(n); i++) {
		 if (n % i == 0) {
		 return false;
		 }
		 }
		 return true;
		 }
		 public int maximoComunDivisor(int a, int b) {
		 while (b != 0) {
		 int temp = b;
		 b = a % b;
		 a = temp;
		 }
		 return a;
		 }
		 public double potencia(double base, int exponente) {
		 return Math.pow(base, exponente);
		
		 }
		
	
}
