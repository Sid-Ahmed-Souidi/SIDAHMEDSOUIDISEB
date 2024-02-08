package unidad6.ejemplos.Tarea2;

import java.util.Scanner;

public class Actividad2 {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

		Garaje garaje1 = new Garaje();
		
		Coche coche1 = new Coche("Seat","León");
		Coche coche2 = new Coche("bmw","M4");
		

			System.out.println("Que tipo de averia es");
			String averia = entrada.nextLine();
			Garaje.aceptarCoche(coche1 ,averia);
			double precioAveria =  (Math.random()*8+0);
			coche1.acumulaAveria(precioAveria);
			if(averia.equals("aceite")) {
				coche1.getTipoMotor().setLitrosAceite(10);
				
			}
			System.out.println("Que tipo de averia es");
			averia = entrada.nextLine();
			Garaje.aceptarCoche(coche1 ,averia);
			 precioAveria =  (Math.random()*8+0);
			coche1.acumulaAveria(precioAveria);
			if(averia.equals("aceite")) {
				coche1.getTipoMotor().setLitrosAceite(10);
				
			}


				
			System.out.println("Tipo del motor del coche"+coche1.getTipoMotor());
	
			
			

	}
	
}
