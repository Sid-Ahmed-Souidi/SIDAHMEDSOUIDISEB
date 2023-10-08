package unidad2.ejemplos;

public class Ejercicio13 {

	public static void main(String[] args) {
	
	int A = 1;
	int B = 2;
	int C = 3;
	int D = 4;
	System.out.println("Valores iniciales");
	System.out.println("A="+A);
	System.out.println("B="+B);
	System.out.println("C="+C);
	System.out.println("D="+D);

	int tomarvalorBaC = C;
	int tomarvalorCaA = A;
	int tomarvalorAaD = D;
	int tomarvalorDaB = B;

	B = tomarvalorBaC;
	C = tomarvalorCaA;
	A = tomarvalorAaD;
	D = tomarvalorDaB;
	System.out.println("Valores finales");
	System.out.println("A="+A);
	System.out.println("B="+B);
	System.out.println("C="+C);
	System.out.println("D="+D);


	
	}

}
