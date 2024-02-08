package unidad6.ejemplos.Tarea2;

import java.util.Scanner;

public class Actividad2 {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

		Garaje garaje1 = new Garaje();
		
		Coche coche1 = new Coche("Seat","León" );
		Coche coche2 = new Coche("bmw","M4");
		
		
		
		int i = 0 ;
		while(i < 2) {
			System.out.println("Que tipo de averia es para el coche 1");
			String averia = entrada.nextLine();
			garaje1.aceptarCoche(coche1, averia);	
			if(averia.equals("aceite")) {
				coche1.getTipoMotor().setLitrosAceite(coche1.getTipoMotor().getLitrosAceite()+10) ;
				
			}
			System.out.println("Que tipo de averia es para el coche 2");
			String averia2 = entrada.nextLine();
			garaje1.aceptarCoche(coche2, averia2);	
			if(averia2.equals("aceite")) {
				coche2.getTipoMotor().setLitrosAceite(coche2.getTipoMotor().getLitrosAceite()+10) ;
				
			}
			i++;
	}
				
		System.out.println("Información de coche 1:");
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Litros de aceite: " + coche1.getTipoMotor().getLitrosAceite());

        System.out.println("Información de coche 2:");
        System.out.println("Marca: " + coche2.getMarca());
        System.out.println("Modelo: " + coche2.getModelo());
        System.out.println("Litros de aceite: " + coche2.getTipoMotor().getLitrosAceite());
	}
	
}
