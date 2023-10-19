package unidad3.ejemplos;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcion;
		int anyo ;
		int calculo ; 
		int calculo2;
		
		do {
			
			System.out.println("-------MENU--------");
			System.out.println("1.Calcular si el año es bisiesto");
			System.out.println("2.Sair");
			opcion = entrada.nextInt();
			
			if(opcion==1) {
				System.out.println("Introduzca un año");
				anyo = entrada.nextInt();
				//para saber si un año es bisiesto que sea divisible por 4 y no por 100
				//divisible por 400
				
				calculo2 = anyo % 400 ; 
				calculo = anyo % 4 ; 
					
				if(calculo2 == 0 || (calculo == 0 && anyo  % 100 != 0)) 	{
						System.out.println("El año "+anyo+" bisiesto");
				}
				
				
			}else if (opcion==2) {
				System.out.println("Gracias. Hasta la proxima");
				
			}
			else {
				System.out.println("La opcion no es valida .Intentalo de nuevo");
			}
				
		}while(opcion!=2);

		
	}
	
}