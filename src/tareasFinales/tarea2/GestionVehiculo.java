package tareasFinales.tarea2;

import java.util.Scanner;

public class GestionVehiculo {

	
	public static Scanner entrada = new Scanner(System.in);
	public static int  opcion ; 
	public static void main(String[] args) {
		
		//registrarVehiculo
		
		//pedir los datos
		//crear un vehiculo
		//hacer uso de la función registrarVehiculo de la clase RegistroVehiculo

		crearVehiculo();
		System.out.println("Introduce la matricula del vehiculo");
		String matricula = entrada.next();
		RegistroVehiculos.buscarVehiculo(matricula);
		RegistroVehiculos.mostrarVehiculo();
		
		
		
	}

	private static void crearVehiculo() {

		
		do {
			System.out.println("1.Alquiler de un Coche ");
			System.out.println("1.Alquiler de un MicroBus ");
			System.out.println("1.Alquiler de un Furgoneta ");
			System.out.println("1.Alquiler de un Camion ");
			System.out.println("5.Salir");
			 opcion = entrada.nextInt();
			
			switch(opcion) {
			
			case 1 : 
				System.out.println("Introduce el numero de plazas del coche");
				int  numPlazas = entrada.nextInt();
				System.out.println("Introduce el numero de matricula del coche");
				String  matricula = entrada.next();

				Coche coche = new Coche(matricula ,numPlazas );
				RegistroVehiculos.registrarVehiculos(coche)	;		
			case 2: 
				
				System.out.println("Introduce el numero de plazas del microbus");
				  numPlazas = entrada.nextInt();
				System.out.println("Introduce el PMA  del microbus");
				  matricula = entrada.next();

				Microbus microbus = new Microbus(matricula ,numPlazas );
				RegistroVehiculos.registrarVehiculos(microbus);	
				
			case 3:
				
				System.out.println("Introduce la matricula de  la furgoneta");
				  matricula = entrada.next();
				  System.out.println("Introduce el PMA  de la furgoneta");
				  double pma = entrada.nextDouble();

				Furgoneta furgoneta = new Furgoneta(matricula ,pma );
				RegistroVehiculos.registrarVehiculos(furgoneta);	
				
				
				case 4:
				
				System.out.println("Introduce la matricula del camion");
				  matricula = entrada.next();
				  System.out.println("Introduce el PMA  del camion ");
				   pma = entrada.nextDouble();

				Camion  camion = new Camion(matricula ,pma );
				RegistroVehiculos.registrarVehiculos(camion);
				
				case 5 :
					System.out.println("Saliendo...");
			
			}
			
		}while(opcion!=5);
		
		
	}
	
	
	

}
