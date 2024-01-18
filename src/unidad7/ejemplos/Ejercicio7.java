package unidad7.ejemplos;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejercicio7 {
	
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		 LocalDateTime fechaActual = LocalDateTime.now();

		 int dia = fechaActual.getDayOfMonth();
		 int mes = fechaActual.getMonthValue();
		 int años = fechaActual.getYear();
		 
		 System.out.println("Fecha actual :"+dia+":"+mes+":"+años);
		 
		 System.out.println("Introduce el numero de meses que quieres añadir a la fecha");
		 
		 int numeroMeses = entrada.nextInt();
		 
		 LocalDateTime nuevaFecha = fechaActual.plusMonths(numeroMeses);
		 
		 int dia1 = nuevaFecha.getDayOfMonth();
		 int mes1 = nuevaFecha.getMonthValue();
		 int años1 = nuevaFecha.getYear();
		 
		 System.out.println("Nueva fecha :"+dia1+":"+mes1+":"+años1);
		 
		 
		 entrada.close();
		
	}

}
