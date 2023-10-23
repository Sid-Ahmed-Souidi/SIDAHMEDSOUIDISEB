package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/**	13. Crea un programa llamado ComprobarFecha, que pida una fecha formada
		por tres valores numéricos (día, mes y año),
		y determine si la fecha corresponde a un valor válido.
		Pista: se debe tener presente el valor de los días en función
		de los meses y de los años. Es decir:
		Los meses 1, 3, 5, 7, 8, 10 y 12 tienen 31 días. 	
		Los meses 4, 6, 9 y 11 tienen 30 días. 	
		El mes 2 tiene 28 días, excepto cuando el año es divisible por 4,
		 que tiene 29 días.*/
		
		int anyo;
		int mes;
		int dia;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un dia");
		dia = entrada.nextInt();
		System.out.println("Introduzca un mes");
		mes = entrada.nextInt();
		System.out.println("Introduzca un año");
		anyo = entrada.nextInt();
		
		switch(dia) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 : 
			if(dia>0 && dia <=31) {
			System.out.println("La fecha"+dia+"/"+mes+"/"+anyo+" es valida");	
			}
			break;
		case 2 :
			if(dia> 0 && dia <= 28) {
				System.out.println("La fecha"+dia+"/"+mes+"/"+anyo+" ES valida");
				}
		case 4 :
		case 6 :
		case 9 :
		case 11:
			if(dia>0 && dia <=30)
				System.out.println("La fecha"+dia+"/"+mes+"/"+anyo+" es valida");
			break;
		default:
			System.out.println("La fecha"+dia+"/"+mes+"/"+anyo+"  NO es valida");
		
		
	}

 }

}