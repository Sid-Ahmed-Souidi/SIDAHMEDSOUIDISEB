package unidad3.ejemplos;

import java.util.Scanner;

public class EJercicio14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int tipo ;
		double precio ; 
		String tipoCliente ; 
		

	do {	
		System.out.println("------PRECIO ANALISIS------");
		System.out.println("TIPO DE ANALISIS 1");
		System.out.println("TIPO DE ANALISIS 2");
		System.out.println("TIPO DE ANALISIS 3");
		System.out.println("SALIR 4");


		System.out.println("Introduce el tipo de analisis que quieras consultar el precio. ");
		tipo = entrada.nextInt();
		
		if(tipo == 1) {
			System.out.println("Es cliente afiliado Si/No");
			tipoCliente = entrada.next();
			if(tipoCliente.equals("Si") || tipoCliente.equals("si")) {
				System.out.println("El precio de afiliado es de 23.00$");
				
			}else if(tipoCliente.equals("No") || tipoCliente.equals("no")) {
				System.out.println("El precio de no afiliado es de 25.00$");
				break;
			}		
		}else if(tipo ==2) {
			System.out.println("Es cliente afiliado Si/No");
			tipoCliente = entrada.next();
				if(tipoCliente.equals("Si") || tipoCliente.equals("si")) {
					System.out.println("El precio de afiliado es de 33,12$");
					
				}else if(tipoCliente.equals("No") || tipoCliente.equals("no")) {
					System.out.println("El precio de no afiliado es de 36.00$");

				}	
			
		}else if(tipo ==3) {
			System.out.println("El precio del analisis = 50.00$");
			System.out.println("Es cliente afiliado Si/No");
			tipoCliente = entrada.next();
				if(tipoCliente.equals("Si") || tipoCliente.equals("si")) {
					System.out.println("El precio de afiliado es de 46.00$");
					
				}else if(tipoCliente.equals("No") || tipoCliente.equals("no")) {
					System.out.println("El precio de no afiliado es de 50.00");

				}	
		}else if(tipo ==4) {
			System.out.println("Gracias.Hasta la proxima.");
		}
		
		}while(tipo!=4);
	}

}
