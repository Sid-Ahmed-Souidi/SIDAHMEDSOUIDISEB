package tareasFinales.tarea1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GestionVehiculo {
	
	
	public static Scanner entrada = new Scanner(System.in);
	public static int opcion ; 
	
	
	
	static ArrayList<Vehiculo> listaVehiculo = new ArrayList<Vehiculo>();

	public static void main(String[] args) {
		
		
		menu();
		
	}

	private static void menu() {
		
		
		do {
		System.out.println("1.Dar de alta vehiculo");
		System.out.println("2.Dar de baja vehiculo");
		System.out.println("3.Actualizar kilometraje");
		System.out.println("4.Muestra datos vehiculo");
		System.out.println("5.Mostrar listado vehiculo");
		System.out.println("6.Para salir ");
		 opcion = entrada.nextInt();
		
		if(opcion==1) {
			Vehiculo vehiculo = pedirDatos();
			darAltaVehiculo(vehiculo);
		}else if(opcion==2){
			darBajaVehiculo();
		}else if(opcion==3){
			actualizarKilometraje();
		}else if(opcion==4){
			mostrarDatosVehiculo();
		}else if(opcion==5){
			mostrarListadoVehiculo();
		}else if(opcion==6) {
			System.out.println("Salir...");
		}
		
		}while(opcion!=6);

		
	}

	private static void mostrarDatosVehiculo() {
		System.out.println("Introduce la matricula del vehiculo mostrar los datos");
		String matricula = entrada.next();
		for (Vehiculo vehiculo : listaVehiculo) {
			if(vehiculo.getMatricula().equals(matricula)) {
				System.out.println();
			System.out.println(vehiculo);
			System.out.println();
			}
		}
		
		
	}

	private static void mostrarListadoVehiculo() {
		System.out.println("Mostramos el listado de los vehiculos del parking");
		for (Vehiculo vehiculo : listaVehiculo) {
			System.out.println();
			System.out.println(vehiculo);
			System.out.println();
			
		}
		
	}

	private static void actualizarKilometraje() {

		System.out.println("Introduce la matricula del vehiculo que deseas actualizar el kilometraje");
		String matricula = entrada.next();
		for (Vehiculo vehiculo : listaVehiculo) {
			
			if(vehiculo.getMatricula().equals(matricula)) {
				System.out.println("Introduce el nuevo kilometraje");
				int kilometraje = entrada.nextInt();
				if(kilometraje> vehiculo.getKilometraje()) {
				vehiculo.setKilometraje(kilometraje); 
				}else {
					System.out.println("El kilometraje introducido es menor al antiguo kilometraje");
				}
				
			}
			
		}

	}

	private static void darBajaVehiculo() {
		System.out.println("Introduce la matricula del vehiculo");
		String matricula = entrada.next();
		
		for(int i = 0 ; i < listaVehiculo.size(); i++) {
			if(listaVehiculo.get(i).getMatricula().equals(matricula)) {
				listaVehiculo.remove(listaVehiculo.get(i));
				System.out.println("Vehiculo eliminado");
				System.out.println();
			}
		}
		
		/**
		for (Vehiculo vehiculo : listaVehiculo) {
			if(vehiculo.getMatricula().equals(matricula)) {
				listaVehiculo.remove(vehiculo);
				System.out.println("Vehiculo eliminado");
			}else {
				System.out.println("El vehiculo no esta en en parking");
			}
			
		}
		*/
		
	}

	
	private static void darAltaVehiculo(Vehiculo vehiculo) {
		
		System.out.println();
			System.out.println("Damos de alta el vehiculo");
			System.out.println();
			listaVehiculo.add(vehiculo);
		
	}

	private static Vehiculo pedirDatos() {
				
		System.out.println("Introduce la matricula del vehiculo");
		String matricula = entrada.next();
		String fecha = "";
		String marca = "";
		String modelo = "";
		int kilometrajeInicial = 0;
		
		System.out.println("Introduce la fecha del vehiculo");
		  fecha = entrada.next();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaMatriculacion = LocalDate.parse(fecha, formato);
		
		
		System.out.println("Introduce el kilometraje del vehiculo");
		 kilometrajeInicial = entrada.nextInt();
		
		System.out.println("Introduce la marca del vehiculo");
		marca = entrada.next();
		
		System.out.println("Introduce el modelo del vehiculo");
		 modelo = entrada.next();
		
		Vehiculo vehiculo = new Vehiculo(matricula,fechaMatriculacion , marca,modelo,kilometrajeInicial);
		for (Vehiculo vehiculo1  : listaVehiculo) {
			if(matricula.equals(vehiculo1.getMatricula())){
				System.out.println();
				System.out.println("El vehiculo ya existe");
				System.out.println();
				vehiculo = null;

			}
			
		}
			return vehiculo;

		
		
		}
	}

