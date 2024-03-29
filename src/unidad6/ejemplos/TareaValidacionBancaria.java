package unidad6.ejemplos;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TareaValidacionBancaria {
	//Esta matriz es la clave de seguridad.
	public static int[] matriz = {1,2,3,4,5};
	// Son los datos que deben coincidir en la iniciacion de sesion bancaria.
	public static final String dni = "12345678V";
	public static final String tarjetaBancaria = "1111222233334444";
	public static final String pasaporte = "A012345678900";
	public static final String fechaNacimiento = "06/05/2001";
	// Estos tres numeros son los numeros aletorios que van a ser generados 
	public static int numero1;
	public static int numero2;
	public static int numero3;
	
	public static Random random = new Random();

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
			
	
		inicioSesion();
		
	}
	
	//En esta funcion introducimos los supuestos numeros que hay en los asteriscos y si son correctos pues 
	// mostrara un mensaje de que ha iniciado sesion en la cuenta de lo contrario clave erronea.
	private static void introducirClave() {
		System.out.println("Introduzca el valor del primer asterisco");
		int asterisco1 = entrada.nextInt();
		System.out.println("Introduzca el valor del segundo asterisco");
		int asterisco2 = entrada.nextInt();
		System.out.println("Introduzca el valor del tercer asterisco");
		int asterisco3 = entrada.nextInt();
				if(asterisco1 == matriz[numero1] && asterisco2 == matriz[numero2] && asterisco3 == matriz[numero3]) {
					System.out.println("Has iniciado sesion en tu cuenta bancaria");
					
				}
				else {
					System.out.print("Clave errónea");
				}
	
			}
	
	
	// aqui realizamos el print de la clave tapando con los astericos elegidos aleatoriamente en la anterior funcion
	private static void ocultarClave() {
		
		for(int i = 0; i < matriz.length ; i++) {
			if(i == numero1) {
				System.out.print(" *1 ");
				
			}else if(i == numero2) {
				System.out.print(" *2 ");
				
			}else if(i == numero3) {
				System.out.print(" *3 ");
			}
			else {
				System.out.print(" - ");
			}
		}System.out.println( );
		
		
		
	}
	// en esta funcion aplicamos la primera parte del programa que es el inicio de sesion
	//con el pasaporte o con el (dni o numero de tarjeta Bancaria).
	// y con ella accedemos a las otras funciones como claveSefuridad , ocultarClave y introducir clave.
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
					ocultarClave();
					introducirClave();
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
					ocultarClave();
					introducirClave();
				}else {
					System.out.println("Sus datos no son correctos");
				}
				
			}else {
				System.out.println("Seleccion incorrecta");
			}
	}
	
	// en esta funcion generamos tres numeros aleatorios que van a ser las posiciones que va a tener que adivinar el usuario
	// a la hora de iniciar sesion
	private static void claveSeguridad() {
		 numero1 = random.nextInt(4) +0;
		 numero2 = random.nextInt(4) +0;
		//  el bucle while seguira generando mientras el numero 1 y numero 2 sean iguales
			while(numero1 == numero2) {
			numero2 = random.nextInt(4) +0;
		}
			 numero3 = random.nextInt(4) +0;
		// el bucle while seguira generando mientras el numero3 sea igual a numero1 o numero3 sea igual a numero2 
			while(numero3== numero1 || numero3 ==numero2) {
				numero3 = random.nextInt(4) +0;
			}

	}

}
