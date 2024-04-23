package practicaEntidadBancaria;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class GestionTarjetaBancaria {
	 public static int[] claveSeguridad = {1,2,3,4,5};
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		EntidadBancaria entidad = new EntidadBancaria();
		
		
		System.out.println("Elige tu documento");
		System.out.println("1.DNI o Tarjeta de residencia");
		System.out.println("2.Pasaporte");
		int seleccion = entrada.nextInt();
		if(seleccion==1) {
			System.out.println("Introduzca DNI o Tarjeta de residencia");
			String documento = entrada.next();
			entidad.setDni(documento);
			if(entidad.getDni()!=null) {
				generarPosiciones(claveSeguridad);
				
			}
			
		}else if(seleccion==2) {
				System.out.println("Introduzca Pasaporte");
				String documento = entrada.next();
				entidad.setPasaporte(documento);
				if(entidad.getPasaporte()!=null) {
					generarPosiciones(claveSeguridad);
					
				}
				
			}else {
				System.out.println("Debe seleccionar alguna de las opciones disponibles");
			}

}

	private static void generarPosiciones(int[] claveSeguridad) {
		Random random = new Random();
		int min = 0;
        int max = 4;
        int posicion1 = random.nextInt(max - min + 1) + min;
        int posicion2 = random.nextInt(max - min + 1) + min;
        int posicion3 = random.nextInt(max - min + 1) + min;
        
        while(posicion1==posicion2) {
        	posicion2 = random.nextInt(max - min + 1) + min;
        	
        }
        while(posicion3==posicion1 || posicion3==posicion2) {
        	posicion3 = random.nextInt(max - min + 1) + min;
        }
        
       System.out.println(posicion1);
       System.out.println(posicion2);
       System.out.println(posicion3);
        inciarSesion(posicion1,posicion2,posicion3);
        
		
		

		
	}

	private static void inciarSesion(int posicion1, int posicion2, int posicion3) {
		for(int i = 0 ; i < claveSeguridad.length ; i++) {
			if(posicion1==i){
				System.out.print(" *1 ");
			}else if(posicion2==i) {
				System.out.print(" *2 ");
			}else  if(posicion3==i) {
				System.out.print(" *3 ");
			}
			else{
				System.out.print(" * ");
				
			}
		}
		System.out.println();
		introducirClave(posicion1 , posicion2,posicion3);
	}

	private static void introducirClave(int posicion1, int posicion2, int posicion3) {
		  System.out.println("Introduce la posición del primer número:");
	        int pos1 = entrada.nextInt();
	        System.out.println("Introduce la posición del segundo número:");
	        int pos2 = entrada.nextInt();
	        System.out.println("Introduce la posición del tercer número:");
	        int pos3 = entrada.nextInt();
	        if(claveSeguridad[posicion1]==pos1 && claveSeguridad[posicion2]==pos2 && claveSeguridad[posicion3]==pos3) {
	        	for(int i = 0; i<claveSeguridad.length;i++) {
	        		System.out.print(claveSeguridad[i]);
	        		
	        	}
	        	System.out.println();
	        	System.out.println("Ha iniciado correctamente sesion");
	        
	        
	        }
	}

	


}