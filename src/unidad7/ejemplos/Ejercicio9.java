package unidad7.ejemplos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio9 {
	
	public static int seleccion ;
	
	public static Scanner entrada = new Scanner(System.in);
	public static String fechaEntrada ;
	public static String fechaFinal ;
	public static LocalDate fechaEntrada1;
	public static LocalDate fechaFinal1;
	public static int diferencia;
	public static void main(String[] args) {
		
		embutidoSeleccionado();
		introducirFecha();
		calcularDiferencia();
		calcularCuracion();
		
	}

	private static void calcularCuracion() {
		
		switch(seleccion) {
		
		case 1:
			System.out.println("El producto seleccionado es el Salchichon");
			if(diferencia >= 250 && diferencia < 300) {
				System.out.println("El Salchichon esta en fase de curaccion total , pero no ha llegado al maximo de 300 dias de curacion");
			}if(diferencia >= 300) {
				System.out.println("El Salchichon ha llegado al maximo de 300 dias de curacion");
			}else {
				System.out.println("El Salchichon esta en fase de curacción parcial");
			}
			break;
		case 2:
			System.out.println("El producto seleccionado es el chorizo");
			if(diferencia >= 250 && diferencia < 300) {
				System.out.println("El chorizo esta en fase de curaccion total , pero no ha llegado al maximo de 300 dias de curacion");
			}if(diferencia >= 300) {
				System.out.println("El chorizo ha llegado al maximo de 300 dias de curacion");
			}else {
				System.out.println("El chorizo esta en fase de curacción parcial");
			}
			break;
		case 3:
			System.out.println("El producto seleccionado es el paleta");
			if(diferencia >= 250 && diferencia < 300) {
				System.out.println("El paleta esta en fase de curaccion total , pero no ha llegado al maximo de 300 dias de curacion");
			}if(diferencia >= 300) {
				System.out.println("El paleta ha llegado al maximo de 300 dias de curacion");
			}else {
				System.out.println("El paleta esta en fase de curacción parcial");
			}
			break;
		case 4:
			System.out.println("El producto seleccionado es el jamon");
			if(diferencia >= 250 && diferencia < 300) {
				System.out.println("El jamon esta en fase de curaccion total , pero no ha llegado al maximo de 300 dias de curacion");
			}if(diferencia >= 300) {
				System.out.println("El jamon ha llegado al maximo de 300 dias de curacion");
			}else {
				System.out.println("El jamon esta en fase de curacción parcial");
			}
			break;
		}
	}

	private static void embutidoSeleccionado() {
		System.out.println("Indica que embutido quieres calcular su nivel de curación");
		System.out.println("1.Salchichon");
		System.out.println("1.Chorizo");
		System.out.println("1.Paleta");
		System.out.println("1.Jamon");
		seleccion = entrada.nextInt();
	}

	private static void calcularDiferencia() {
		 diferencia = (int) Math.abs(ChronoUnit.DAYS.between(fechaEntrada1, fechaFinal1));
		System.out.println("los dias que lleva en curacion el producto "+diferencia);
	}

	
	private static void introducirFecha() {
		System.out.println("Introduce la fecha de inicio de curación del producto (formato yyyy-MM-dd)");
		 fechaEntrada = entrada.next();
		System.out.println("Introduce la fecha final de curación del producto (formato yyyy-MM-dd)");
		fechaFinal = entrada.next();
		
		 fechaEntrada1 = LocalDate.parse(fechaEntrada , DateTimeFormatter.ISO_LOCAL_DATE);
		 fechaFinal1 = LocalDate.parse(fechaFinal , DateTimeFormatter.ISO_LOCAL_DATE);
	
	}

}
