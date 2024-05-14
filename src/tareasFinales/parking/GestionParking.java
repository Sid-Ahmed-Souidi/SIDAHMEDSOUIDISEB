package tareasFinales.parking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionParking {

	
    public static List<Vehiculo> parking  = new ArrayList<Vehiculo>();
  
    public static Scanner entrada = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		
			VehiculoResidente vehiculo = new VehiculoResidente("645362 LWH");
		
			
			
			
			menu();
			


		
	}


	private static void menu() {
		
		System.out.println("1.hora de entrada");	
		System.out.println("2.hora de salida");
		System.out.println("3.Dar de alta vehiculo oficial");
		System.out.println("4.Dar de alta vehiculo residente");
		System.out.println("5.Dar de alta vehiculo no residente");
		System.out.println("6.Inicia el mes");
		System.out.println("7.Pagos de residentes");
		int opcion = entrada.nextInt();
	
		
		do {
			
			switch(opcion){
			
			case 1:
			System.out.println("hora entrada");
			buscarVehiculo(parking);
			
			
			break;
			case 2:
				System.out.println("hora salida");
				
				break;
				
			case 3:
				System.out.println("introduce la matricula del vehiculo");
				String matricula = entrada.next();
				Vehiculo matricula1 = new VehiculoOficial(matricula);
				parking.add(matricula1);
				break;
			case 4:
				System.out.println("introduce la matricula del vehiculo");
				matricula = entrada.next();
				VehiculoResidente matricula2 = new VehiculoResidente(matricula);
				parking.add(matricula2);
				break;
			case 5:
				System.out.println("introduce la matricula del vehiculo");
				matricula = entrada.next();
				
				VehiculoNoResidente matricula3 = new VehiculoNoResidente(matricula);
				parking.add(matricula3);
				break;
				
			case 6:
				System.out.println("inicioMes");
				break;
				
			case 7 :
				System.out.println("Pagos de residentes");
				break;
				
			case 8 :
				System.out.println("Saliendo...");
				break;
			
			
			}
			
			
			
	
		}while(opcion!=8);

		
	}


	private static void buscarVehiculo(List<Vehiculo> parking2) {

				for (Vehiculo vehiculo : parking2) {
					System.out.println(vehiculo);
					
					}
					
				System.out.println("Introduce la matricula");
				String matricula = entrada.next();
				for (Vehiculo vehiculo : parking2) {
					if(vehiculo.getMatricula().equals(matricula)) {
						vehiculo.getCobroMinuto();
						
					}
				
					
					
					
				}

					
		
	}
	
	
	
}
