package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		//realizar constantes "final double VALOR_HORA_A para como las 12.5 / "
		int horas ;
		double horasExtras;
		double cobroDoble;
		double cobroTriple;
		double cobroTotal;
		double menos8 ;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca las horas trabajadas  :");
		horas = entrada.nextInt();
		
		if(horas > 40) {
				horasExtras = horas - 40 ;
				if(horasExtras <= 8) {	
					cobroDoble = horasExtras * 25 ;
					System.out.println("La cantidad de dinero recibido por las horas extras son de :"+cobroDoble);
					cobroTotal = cobroDoble + (40 * 12.5);
					System.out.println("El cobro total de las horas trabajadas es de :"+cobroTotal);
				}else if(horasExtras > 8) {
					horasExtras = horasExtras - 8 ;
					cobroDoble = 8 * 25;
					System.out.println("La cantidad de dinero por las primeras 8 horas"+cobroDoble);
					cobroTriple =  horasExtras * 37.5 ;
					System.out.println("La cantidad de dinero recibido por las horas extras son de :"+cobroTriple);
					cobroTotal = cobroTriple + cobroDoble + (40 * 12.5);
					System.out.println("El cobro total de las horas trabajadas es de :"+cobroTotal);
			
				}
		
		}else if(horas <=40){
			cobroTotal= horas * 12.5 ;
			System.out.println("Cobro total de su trabajo sin horas extras son de  :"+cobroTotal);
			
		}
			
	}

}
