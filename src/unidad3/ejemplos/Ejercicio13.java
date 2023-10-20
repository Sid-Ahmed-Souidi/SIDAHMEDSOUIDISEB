package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int dia ;
		int mes ;
		int anyo;
		int meses31 ;
		int meses30 ; 
				
		System.out.println("Introduzca el dia");
		dia = entrada.nextInt();
		System.out.println("Introduzca el mes");
		mes = entrada.nextInt();
		System.out.println("Introduzca el año");
		anyo = entrada.nextInt();
	/**	13. Crea un programa llamado ComprobarFecha, que pida una fecha formada
		por tres valores numéricos (día, mes y año),
		y determine si la fecha corresponde a un valor válido.
		Pista: se debe tener presente el valor de los días en función
		de los meses y de los años. Es decir:
		Los meses 1, 3, 5, 7, 8, 10 y 12 tienen 31 días. 	
		Los meses 4, 6, 9 y 11 tienen 30 días. 	
		El mes 2 tiene 28 días, excepto cuando el año es divisible por 4,
		 que tiene 29 días.*/
		
		if(((mes==1&&mes==3&&mes==5&&mes==7&&mes==8&&mes==10&&mes==12) && (dia > 0 && mes <=31)) && ((mes==4&&mes==6&&mes==9&&mes==11) && (dia > 0 && mes <=30))) {
				System.out.println("La fecha es correcta");
			}else {
				System.out.println("La fecha es incorrecta");
			}
			

			
		}
		
		
	
		
	}

}
