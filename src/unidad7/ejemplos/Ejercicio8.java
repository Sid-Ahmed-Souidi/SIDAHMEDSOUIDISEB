package unidad7.ejemplos;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class Ejercicio8 {
	
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Introduce el mes para saber el numero de dias que tiene (1-12)");
		int numeroMes = entrada.nextInt();
		
		
		Month mes = Month.of(numeroMes);
		
		
		int diasMes = mes.maxLength();
		
		System.out.println("Este mes "+mes+" tiene un total de "+diasMes+" dias");
	}

}
