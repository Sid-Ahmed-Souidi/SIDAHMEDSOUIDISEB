package Examenes.tercerExamen.Ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class GestionVotos {
	
	public static Scanner entrada =  new Scanner(System.in);
	public static final String usuario = "sid";
	public static final String contraseña = "1234";
	public static final int FILAS = 3;
	public static final int COLUMNAS = 4;
	public static final String PartidoUnionCivica = "Partido Unión Cívica";
	public static final String MovimientoRenovacionNacional = "Movimiento Renovación Nacional";
	public static final String AlianzaDemocraticaIndependiente = "Alianza Democrática Independiente";
	public static final String IgualdadProgresistaCiudadana = "Igualdad Progresista Ciudadana";
	public static String siglasPUC = "";
	public static String siglasMRN = "";
	public static  String siglasADI = "";
	public static  String siglasIPC = "";
	public static int  seleccion ;



	static int[][] votaciones = new int[FILAS][COLUMNAS];

	
	public static void main(String[] args) {

		
		verificacion();
		
		
	}


	private static void verificacion() {
		System.out.println("Introduzca el usuario");
		String loginUsuario = entrada.next();
		System.out.println("Introduzca la contraseña");
		String loginContraseña = entrada.next();
		for(USUARIO_CONTRASEÑA usuario :USUARIO_CONTRASEÑA.values()) {
			if(usuario.getUsername().equals(loginUsuario)&&usuario.getPassword().equals(loginContraseña)) {
				asignarSiglas();
				realizarVotos();
				mostrarVotos();
				calculosVotosPartidos();
				calculosVotosColegio();
			}
		}		
		
		
	}
	

	private static void calculosVotosColegio() {
		int colegio1  = 0;
		int colegio2  = 0;
		int colegio3  = 0;
		int maximo = colegio1;
		
		for(int i = 0 ; i < votaciones.length; i++) {
			colegio1 += votaciones[0][i];
		}
		for(int i = 0 ; i < votaciones.length; i++) {
			colegio2 += votaciones[1][i];
		}
		for(int i = 0 ; i < votaciones.length; i++) {
			colegio3 += votaciones[2][i];
		}
		
		System.out.println("colegio electorial 1 "+colegio1);
		System.out.println("colegio electorial 2 "+colegio2);
		System.out.println("colegio electorial 3 "+colegio3);
		
		  if (colegio2 > maximo) {
	            maximo = colegio2;
	        }
	        if (colegio3 > maximo) {
	            maximo = colegio3;
	            
	 
	        if(colegio1==maximo) {
	        	System.out.println("el colegio 1  es el que tiene mas votaciones  "+colegio1);
	        }
	        if(colegio2==maximo) {
	        	System.out.println("el colegio2 es el que tiene mas votaciones  "+colegio2);
	        }
	        if(colegio3==maximo) {
	        	System.out.println("el colegio3 es el que tiene mas votaciones  "+colegio3);
	        	
	        }
	        }
	       
		


		
	}


	/**
	 * Cálculo y Visualización de Resultados:
		El sistema debe ser capaz de calcular y presentar los resultados totales de cada partido
		 político, así como los resultados específicos por cada colegio electoral.	
		Debe identificar y mostrar claramente cuáles son los partidos más votados
		 a nivel general y en cada colegio.
		 public static String siglasPUC = "";
	public static String siglasMRN = "";
	public static  String siglasADI = "";
	public static  String siglasIPC = "";
	 */
	private static void calculosVotosPartidos() {
		int totalvotosPUC  = 0;
		int totalvotosMRN  = 0;
		int totalvotosADI  = 0;
		int totalvotosIPC  = 0;
		int maximo = totalvotosPUC;

		for(int i = 0 ; i < votaciones.length ; i++) {
			totalvotosPUC += votaciones[i][0];
		}
		System.out.println("El total de votos de PUC ES de "+totalvotosPUC);
		for(int i = 0 ; i < votaciones.length ; i++) {
			totalvotosMRN += votaciones[i][1];
		}
		System.out.println("El total de votos de MRN ES de "+totalvotosMRN);
		for(int i = 0 ; i < votaciones.length ; i++) {
			totalvotosADI += votaciones[i][2];
		}
		System.out.println("El total de votos de ADI ES de "+totalvotosADI);
		for(int i = 0 ; i < votaciones.length ; i++) {
			totalvotosIPC += votaciones[i][3];
		}
		System.out.println("El total de votos de IPC ES de "+totalvotosIPC);
		
		  
	        if (totalvotosMRN > maximo) {
	            maximo = totalvotosMRN;
	        }
	        if (totalvotosADI > maximo) {
	            maximo = totalvotosADI;
	            
	        }if (totalvotosIPC > maximo) {
	            maximo = totalvotosIPC;
	        }
	        if(totalvotosPUC==maximo) {
	        	System.out.println("el partido PUC es el que tiene mas votaciones  "+totalvotosPUC);
	        }
	        if(totalvotosMRN==maximo) {
	        	System.out.println("el partido MRN es el que tiene mas votaciones  "+totalvotosMRN);
	        }
	        if(totalvotosADI==maximo) {
	        	System.out.println("el partido ADI es el que tiene mas votaciones  "+totalvotosADI);
	        }
	        if(totalvotosIPC==maximo) {
	        	System.out.println("el partido IPC es el que tiene mas votaciones  "+totalvotosIPC);
	        }
	        
		
		
		
	}


	private static void mostrarVotos() {
		System.out.println("TOTAL DE VOTOS ");
	        for (int i = 0; i < votaciones.length; i++) {
	            for (int j = 0; j < votaciones[i].length; j++) {
	                System.out.print(votaciones[i][j] + " ");
	            }
	            System.out.println();  
	        }
	}


	private static void realizarVotos() {
	
	do {
	System.out.println("Seleccione el colegio electoral donde pasara los votos");
	System.out.println("1.Colegio electoral 1");
	System.out.println("2.Colegio electoral 2");
	System.out.println("3.Colegio electoral 3");
	System.out.println("3.Saliendo ...");

	 seleccion = entrada.nextInt();
	switch(seleccion) {
	
	case 1: 
		introducirVotos( 0 ,votaciones );
		break;
	case 2:
		introducirVotos(1 , votaciones);
		break;
	case 3 :
		introducirVotos(2 , votaciones);
		break;
	case 4 :
		System.out.println("Saliendo de la realizacion de los votos");
	}
	
	}while(seleccion!=4);
	}
	


	
	/**
	 	public static String siglasPUC = "";
	public static String siglasMRN = "";
	public static  String siglasADI = "";
	public static  String siglasIPC = "";* 
	 * @param i
	 * @param votaciones2
	 */
private static void introducirVotos(int i, int[][] votaciones2) {
	Random random = new Random();
	System.out.println("Introduce en que partido quieres introducir  votos");
	System.out.println("1."+siglasPUC);
	System.out.println("2."+siglasMRN);
	System.out.println("3."+siglasADI);
	System.out.println("4."+siglasIPC);
	int partido = entrada.nextInt();
	partido--;
	votaciones2[i][partido] = random.nextInt(20) + 1;
		
	}


/**
	public static final String PartidoUnionCivica = "Partido Unión Cívica";
	public static final String MovimientoRenovacionNacional = "Movimiento Renovación Nacional";
	public static final String IgualdadProgresistaCiudadana = "Igualdad Progresista Ciudadana";
	public static final String siglasPUC = "";
	public static final String siglasMRN = "";
	public static final String siglasIPC = "";
		public static final String AlianzaDemocraticaIndependiente = "Alianza Democrática Independiente";

*/
	private static void asignarSiglas() {
		siglasPUC = PartidoUnionCivica.substring(0,1)+PartidoUnionCivica.substring(8,9)+
				PartidoUnionCivica.substring(14,15);
		siglasMRN = MovimientoRenovacionNacional.substring(0,1)+MovimientoRenovacionNacional.substring(11,12)+
				MovimientoRenovacionNacional.substring(22,23);
		siglasADI = AlianzaDemocraticaIndependiente.substring(0,1)+AlianzaDemocraticaIndependiente.substring(8,9)+
				AlianzaDemocraticaIndependiente.substring(20,21);
		siglasIPC = IgualdadProgresistaCiudadana.substring(0,1)+IgualdadProgresistaCiudadana.substring(9,10)+
				IgualdadProgresistaCiudadana.substring(21,22);
		
		System.out.println("siglasPUC " + siglasPUC);
		System.out.println("siglasMRN  "+siglasMRN);
		System.out.println("siglasIPC "+ siglasIPC);
		System.out.println("siglasADI "+ siglasADI);


		
		
	}

}
