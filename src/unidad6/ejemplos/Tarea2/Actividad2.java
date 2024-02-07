package unidad6.ejemplos.Tarea2;

import java.util.Scanner;

public class Actividad2 {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

		Garaje garaje1 = new Garaje();
		
		Coche coche1 = new Coche("Seat","León");
		Coche coche2 = new Coche("bmw","M4");
		

		int i =0;
		while(i < 2) {
			System.out.println("Que tipo de averia es");
			String averia = entrada.nextLine();
			Garaje.aceptarCoche(coche1 ,averia);
			double precioAveria =  (Math.random()*20000+1000);
			if(averia.equals("aceite")) {
				coche1.getTipoMotor().setLitrosAceite(10);
				
				
			}i++;
			
		}
		
		
		
		
		

		
		
	}

}
