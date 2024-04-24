package pruebas.evaluacion2.recuperacion.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	
	 static final String  usuario  = "Sid";
	 static final String  contraseña  = "1234abc";

	 static final int tamaño  = 4;
	 static int[] colegio1 =  new int[tamaño];
	 static int[] colegio2 =  new int[tamaño];
	 static int[] colegio3 =  new int[tamaño];
	 
	 

	public static void main(String[] args) {
		
		
		inicioSesion();
		
		
		
		
		

		
		
			
		
		
	}

	private static void mostrarVotos(int[] colegio12) {

		for (int i : colegio12) {
			System.out.print(" "+colegio12[i]+" ");
			
		}
		System.out.println();
		
		
	}

	private static void inicioSesion() {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el nombre usuario");
		String usu = entrada.next();
		System.out.println("Introduce la constraseña");
		String con = entrada.next();
		if(usuario.equals(usu)|| contraseña.equals(con)) {
			System.out.println("Has iniciado sesion");
			System.out.println();
			System.out.println("Primer Colegio Electoral ");
			votacion(colegio1);
			System.out.println("Segundo Colegio Electoral ");
			votacion(colegio2);
			System.out.println("Tercer Colegio Electoral ");
			votacion(colegio3);
			System.out.println("Votos del primer colegio electoral");
			mostrarVotos(colegio1);
			System.out.println("Votos del segundo colegio electoral");
			mostrarVotos(colegio2);
			System.out.println("Votos del tercer colegio electoral");
			mostrarVotos(colegio3);
			calculoVotacion(colegio1,colegio2,colegio3);
			
			
		}
		else {
			System.out.println("Usuario o contraseña no son correctos");
		}
		
		
		

		
	}

	private static void calculoVotacion(int[] colegio12, int[] colegio22, int[] colegio32) {
		int contador = 0 ; 
		System.out.println("El porcentaje de votos de las elecciones");
		for (int i : colegio12) {
			contador +=colegio12[i] ;
				
			
		}
		for (int i : colegio22) {
			contador +=colegio12[i] ;

			
		}
		for (int i : colegio32) {
			contador +=colegio12[i] ;
			
		}
		
		System.out.println("El total de votos de las elecciones es de "+contador);
		
		
	}

	private static void votacion(int[] colegio12) {
		Scanner entrada = new Scanner(System.in);

		
			System.out.println("Que partido deseas votar");
			System.out.println("1.Partido Unión Civica");
			System.out.println("2.Movimiento Renovacion Nacional");
			System.out.println("3.Alianza Democratica Independiente");
			System.out.println("4.Igualdad Progresista Ciudadana");
			System.out.println("5.Salir");
			int seleccion = entrada.nextInt();
			
				if(seleccion==1) {
					colegio12[0] +=1;
					
				}
				else if(seleccion==2) {
					colegio12[1] +=1;


				}else if(seleccion==3) {
					colegio12[2] +=1;


				}else if(seleccion==4) {
					colegio12[3] +=1;


				}else if(seleccion==5) {
					System.out.println("Saliendo de la votacion");
					
				}
			
				
		}
		
		
	}


