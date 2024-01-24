package unidad6.ejemplos;

import java.util.Random;
import java.util.Scanner;

public class EntidadBancaria {

	public static int[] ocultar1 = new int[5];
	public static int[] matriz = {1,2,3,4,5};
	public static final String dni = "12345678V";
	public static final String tarjetaBancaria = "1111222233334444";
	public static final String pasaporte = "A012345678900";
	public static final String fechaNacimiento = "06/05/2001";
	
	public static Random random = new Random();

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int numero1 = random.nextInt(9) +0;
		System.out.println("N1  ="+numero1);
		int numero2 = random.nextInt(9) +0;
		System.out.println("n2 ="+numero2);
		if(numero1 != numero2) {
			
			
		}
		if(numero1 == numero2) {
			numero2 = random.nextInt(9) +0;
			System.out.println(" n2if ="+numero2);
		}
		
		 int numero3 = random.nextInt(9) +0;
		 System.out.println("n3 ="+numero3);
		 if(numero2 == numero3 || numero1 == numero3) {
			 numero3 = random.nextInt(9) +0;
			 System.out.println("n3if ="+numero3);
		 }
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
		int numero1 = random.nextInt(9) +0;
		int numero2 = random.nextInt(9) +0;
		do {
		numero2 = random.nextInt(9) +0;
		}while(numero1 != numero2);
		int numero3 = random.nextInt(9) +0;
		
		
	
	}

}
