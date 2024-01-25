package unidad6.ejemplos;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class EntidadBancaria {

	public static String[] ocultar1 ;
	public static int[] matriz = {1,2,3,4,5};
	public static final String dni = "12345678V";
	public static final String tarjetaBancaria = "1111222233334444";
	public static final String pasaporte = "A012345678900";
	public static final String fechaNacimiento = "06/05/2001";
	
	public static Random random = new Random();

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int numero1 = random.nextInt(9) +0;
		int numero2 = random.nextInt(9) +0;
		
		//  el bucle while seguira generando mientras el numero 1 y numero 2 sean iguales
			while(numero1 == numero2) {
			numero2 = random.nextInt(9) +0;
			
		}
			int numero3 = random.nextInt(9) +0;
			
		// el bucle while seguira generando mientras el numero3 sea igual a numero1 o numero3 sea igual a numero2 
			while(numero3== numero1 || numero3 ==numero2) {
				numero3 = random.nextInt(9) +0;
			}
			
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero3);
		

		claveSeguridad();
		inicioSesion();
		
	}
	private static void inicioSesion() {
		System.out.println("Elige tu documento");
		System.out.println("1 .DNI o tarjeta Bancaria");
		System.out.println("2. Pasaporte");
		int seleccion = entrada.nextInt();
		
			if(seleccion==1) {
				System.out.println("Introduzca el Dni o la tarjeta Bancaria");
				String dniOtarjeta = entrada.next();
				System.out.println("Introduzca fecha de nacimiento");
				String fecha = entrada.next();
				
				if((dniOtarjeta.equals(dni) || dniOtarjeta.equals(tarjetaBancaria)) && fecha.equals(fechaNacimiento)) {
					claveSeguridad();
				}else {
					System.out.println("Sus datos no son correctos");
				}
				
			}else if(seleccion==2) {
				System.out.println("Introduzca el pasaporte");
				String pasaporte1 = entrada.next();
				System.out.println("Introduzca  fecha de nacimiento");
				String fecha = entrada.next();

				if(pasaporte1.equals(pasaporte) && fecha.equals(fechaNacimiento)) {
					claveSeguridad();
				}else {
					System.out.println("Sus datos no son correctos");
				}
				
			}else {
				System.out.println("Seleccion incorrecta");
			}
		
	}
	private static void claveSeguridad() {
		int numero1 = random.nextInt(4) +0;
		int numero2 = random.nextInt(9) +0;
		//  el bucle while seguira generando mientras el numero 1 y numero 2 sean iguales
			while(numero1 == numero2) {
			numero2 = random.nextInt(9) +0;
		}
			int numero3 = random.nextInt(9) +0;
		// el bucle while seguira generando mientras el numero3 sea igual a numero1 o numero3 sea igual a numero2 
			while(numero3== numero1 || numero3 ==numero2) {
				numero3 = random.nextInt(9) +0;
			}
			
			for(int i = 0 ; i < matriz.length ; i ++) {
				 if(matriz[i] == numero1) {
					 System.out.print("X1");
				 }else {
					 System.out.print(matriz[i]);
					 
				 }
				 System.out.print(" | ");
				
			}
	
	}

}
