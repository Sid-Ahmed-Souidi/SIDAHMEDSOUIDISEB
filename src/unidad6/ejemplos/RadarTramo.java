package unidad6.ejemplos;

import java.util.Scanner;

public class RadarTramo {


	public static Scanner entrada = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		 double distancia = entrada.nextDouble();  // metros 
		 double vel_max_permitida = entrada.nextDouble();//  km/ h
		 double tiempo = entrada.nextDouble(); // s
		 double vel_media = 0;
		boolean haSuperadoVelocidadMax ;
		double porcentajeSuperado;
		
		 if(distancia <0 || vel_max_permitida <0  || tiempo <=0 ) {
			 System.out.println("Error");
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
		 
		
	
		
		
		
		
	}

}
