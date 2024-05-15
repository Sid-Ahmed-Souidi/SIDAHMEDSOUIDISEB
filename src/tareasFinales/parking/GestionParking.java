package tareasFinales.parking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionParking {

	
    public static List<Vehiculo> parking  = new ArrayList<Vehiculo>();
  
    public static Scanner entrada = new Scanner(System.in);
    
    
    static int opcion ; 
	
	public static void main(String[] args) {		
		
			
			menu();
			


		
	}


	private static void menu() {
		
		
	
		
		do {
			System.out.println("1.hora de entrada");	
			System.out.println("2.hora de salida");
			System.out.println("3.Dar de alta vehiculo oficial");
			System.out.println("4.Dar de alta vehiculo residente");
			System.out.println("5.Dar de alta vehiculo no residente");
			System.out.println("6.Inicia el mes");
			System.out.println("7.Pagos de residentes");
			 opcion = entrada.nextInt();
		
			switch(opcion){
			
			case 1:
			System.out.println("hora entrada");
			introducirHoraEntrada(parking);
			
			break;
			case 2:
				System.out.println("hora salida");
				introducirHoraSalida(parking);
				mostrarVehiculo(parking);

				
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
			default:
		        System.out.println("Opción no válida");
		        break;
			
			
			}
			
		}while(opcion!=8);

		
	}


	private static void mostrarVehiculo(List<Vehiculo> parking2) {
		
	
		for (Vehiculo vehiculo : parking2) {
			//aqui comparamos si el vehiculo es de el tipo objeto vehiculo
			if(vehiculo instanceof VehiculoNoResidente) {
					System.out.println(vehiculo);
				
				
				
			}
		}
	
	
	}


	private static void introducirHoraSalida(List<Vehiculo> parking2) {
		
		System.out.println("Introduce la matricula");
		String matricula = entrada.next();
		for (Vehiculo vehiculo : parking2) {
			if(vehiculo.getMatricula().equals(matricula)) {
				Estancias.registrarSalida(vehiculo);
				
			} else { 
				System.out.println("El vehiculo no se encuentra en el parking");
					}
		
		}
	}


	private static void introducirHoraEntrada(List<Vehiculo> parking2) {
		
				System.out.println("Introduce la matricula");
				String matricula = entrada.next();
				for (Vehiculo vehiculo : parking2) {
					if(vehiculo.getMatricula().equals(matricula)) {
						Estancias.registrarEntrada();
						vehiculo.precioCobro();
						
					}else {
						System.out.println("El vehiculo no se encuentra en el parking");
					}
				
				}

					
		
	}
	
	
	
}
