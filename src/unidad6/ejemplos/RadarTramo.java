package unidad6.ejemplos;

import java.util.Scanner;

public class RadarTramo {

	public static double[] matriz = new double[100];
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		 double distancia;
		 double vel_max_permitida ;
		 double tiempo ;
		 double vel_media = 0;
		boolean haSuperadoVelocidadMax ;
		double porcentajeSuperado;
		
		do {
		//System.out.println("Introduce la distancia");
		// distancia = entrada.nextDouble();  // metros 
		// System.out.println("Introduce la velocidad maxima permitida");
		 // vel_max_permitida = entrada.nextDouble();//  km/ h
		 //System.out.println("Introduce el tiempo");
		  //tiempo = entrada.nextDouble(); // s
		  
		 for(int i = 0 ; i < matriz.length ; i++) {
				System.out.println("Introduce la distancia");
				 distancia = entrada.nextDouble();  // metros 
				 System.out.println("Introduce la velocidad maxima permitida");
				  vel_max_permitida = entrada.nextDouble();//  km/ h
				 System.out.println("Introduce el tiempo");
				  tiempo = entrada.nextDouble(); // s
			 if(distancia != 0 && vel_max_permitida != 0 && tiempo !=0) {
				 matriz[i] = distancia;
				 i++;
				 matriz[i] = vel_max_permitida;
				 i++;
				 matriz[i] = tiempo;
				 i++;
						
			 }for(double  numeros :  matriz) {
				 System.out.println(numeros);
				 
			 }
				 
		 } 
		  if(distancia <0 || vel_max_permitida <0  || tiempo <=0 ) {
				 System.out.println("Salir");
			 }else {
				
				 vel_max_permitida = vel_max_permitida/3.6; // kilometros horas a metros por segundos
				 //Calcular la velocidad media
				 vel_media = distancia/ tiempo;
				 haSuperadoVelocidadMax = vel_media >vel_max_permitida;
				 porcentajeSuperado = ((vel_media-vel_max_permitida) /vel_max_permitida)*100;
				 
				 if(!haSuperadoVelocidadMax) {
					 System.out.println("Ok");
					 
				 }else if(porcentajeSuperado<20){
					 System.out.println("MULTA");
					 
				 }else {
					 System.out.println("PUNTOS");
				 }
		}
		}while(!(distancia==0 && vel_max_permitida ==0 && tiempo ==0)  );
		  
		 
		
		

	}
	
}
