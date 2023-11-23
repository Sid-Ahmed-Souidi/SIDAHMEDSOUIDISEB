package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio31 {
	
	static Scanner entrada = new Scanner(System.in);
	
	static double [] notas = new  double[4] ;
	static double nota ;
	static double promedio ;
	public static void main(String[] args) {
		
	pedirNotas();
	mostrarNotas();
	notaAlta();
	notaBaja();
	promedioNota();
	determinarPuntos();
	}

	private static void determinarPuntos() {
		double diferenciaPuntos;
		if(promedio >= 5.0) {
			diferenciaPuntos = promedio - 5.0;
			System.out.println("Este es el total por cuantos puntos aprobó :"+diferenciaPuntos);
		}if(promedio < 5.0) {
			System.out.println("El alumno esta aprobado con una nota de: "+promedio);
			diferenciaPuntos =  5.0 - promedio;
			System.out.println("Este es el total por cuantos puntos desaprobó :"+diferenciaPuntos);
		}
		
		
	}

	private static void promedioNota() {
		int sumatorio = 0;
		for(int i= 0 ;i < notas.length ; i++ ) {
		 sumatorio += notas[i];
			
		}
		promedio = sumatorio / notas.length;
		System.out.println("El promedio es de :"+promedio);
	
		
	}

	private static void notaBaja() {
	double notaMenor = 10;
		
		for(int i= 0 ;i < notas.length ; i++ ) {
			 if(notas[i] < notaMenor) {
				 notaMenor = notas[i];
			 }			
		}		
		 System.out.println("La nota mas baja de las 4 notas es de :"+notaMenor);

	}

	private static void notaAlta() {
	double notaMayor = 0;
		
		for(int i= 0 ;i < notas.length ; i++ ) {
			 if(notas[i] > notaMayor) {
				 notaMayor = notas[i];
			 }			
		}
		 System.out.println("La nota mas alta de las 4 notas es de :"+notaMayor);

		
	}

	private static void mostrarNotas() {
		for(int i = 0 ; i < notas.length ; i++) {
			System.out.println(notas[i]);
			
		}
		
	}

	private static void pedirNotas() {
		for(int i = 0 ; i < notas.length ; i ++) {
			System.out.println("Introduce la"+(i+1)+"ª nota");
			nota = entrada.nextDouble();
			notas[i] = nota;
			
			
		}
	}
	
	

}
