package unidad4.ejemplos;

import java.util.Scanner;

public class CreditoBiblioteca {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el nombre del alumno");
		String alumno = entrada.next();
		System.out.println("Introduzca la nota media de sus calificaciones");
		double  nota = entrada.nextDouble();

		calcularCredito(alumno,nota);

	}

public static void calcularCredito(String alumno , double nota) {
	double credito = nota * 10 ;
	System.out.println("EL alumno "+alumno+" con una calificación de "+nota+" recibe un credito de "+credito+"euros");

}

}
