package tareasFinales.parking;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
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
			introducirHoraEntrada();
			
			break;
			case 2:
				System.out.println("hora salida");
				introducirHoraSalida();
				
				break;
				
			case 3:
				System.out.println("introduce la matricula del vehiculo");
				parking.add(new VehiculoOficial(entrada.next()));
				break;
			case 4:
				System.out.println("introduce la matricula del vehiculo");
				parking.add(new  VehiculoResidente(entrada.next()));

				break;
			case 5:
				System.out.println("introduce la matricula del vehiculo");
				parking.add(new VehiculoNoResidente(entrada.next()));

				break;
				
			case 6:
				System.out.println("inicioMes");
				reiniciarMes();
				break;
				
			case 7 :
				System.out.println("Pagos de residentes");
				mostrarPagos();
				escribirPagos();
				
				
				
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


	private static void escribirPagos() {
				String nombreFichero = "ficheros1//parkingPagos.txt";
				try(BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreFichero))){
					escritor.write("Matricula"+"    ");
					escritor.write("Tiempo estacionado"+" ");
					escritor.write("Cantidad a pagar");
					escritor.newLine();
					  for (Vehiculo vehiculo : parking) {
			                escritor.write(vehiculo.getMatricula() + "     " + vehiculo.getTiempo() + "      " + Estancias.cobro(vehiculo) + "\n");
			            }
					
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
			
				
				
			}

		
	


	private static void mostrarPagos() {
	    for (Vehiculo vehiculo : parking) {
            System.out.println(vehiculo.getMatricula() + "     " + vehiculo.getTiempo() + "      " + Estancias.cobro(vehiculo));
        }
		
		
	}


	private static void reiniciarMes() {

		 for (Vehiculo vehiculo : parking) {
	            if (vehiculo instanceof VehiculoResidente || vehiculo instanceof VehiculoOficial) {
	                vehiculo.setTiempo(0);
	            }
	        }
	}





	private static void introducirHoraSalida() {
			// buscamos el vehiculo atraves de la matricula
		System.out.println("Introduce la matricula");
		boolean encontrado = false ;
		String matricula = entrada.next();
		for (Vehiculo vehiculo : parking) {
			if(vehiculo.getMatricula().equals(matricula)) {
				Estancias.registrarSalida(vehiculo);
				Estancias.cobro(vehiculo);
				encontrado = true;

			} 
		
		}
		if(encontrado==false) {
			System.out.println("Vehiculo no encontrado");
		}
	}


	private static void introducirHoraEntrada() {
		
				System.out.println("Introduce la matricula");
				String matricula = entrada.next();
				boolean encontrado = false ;
				for (Vehiculo vehiculo : parking) {
					if(vehiculo.getMatricula().equals(matricula)) {
						Vehiculo.setHoraEntrada(LocalTime.now());
						encontrado = true;
				
				
				}

				if(encontrado==false) {
					System.out.println("Vehiculo no encontrado");
				}	
		
	}
	
	
	
	}
	
}
