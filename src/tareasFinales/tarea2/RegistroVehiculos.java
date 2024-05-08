package tareasFinales.tarea2;

import java.util.ArrayList;

public class RegistroVehiculos {
	
	
	static ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

	
	private int numVehiculos;
	

	
	public static boolean registrarVehiculos(Vehiculo vehiculo) {
		
		if(vehiculo instanceof Vehiculo) {
			System.out.println("El vehiculo esta registrado");
			listaVehiculos.add(vehiculo);
			return true;
			
		}
		
		System.out.println("El vehiculo no esta registrado");
		return false;
		
		
		
			
		}
		
		public static void buscarVehiculo(String matricula) {
		
		for (Vehiculo vehiculo : listaVehiculos) {
			if(vehiculo.getNumMatricula().equals(matricula)) {
				System.out.println();
				System.out.println("Vehiculo encontrado");
				System.out.println();
				System.out.println(vehiculo);
			}else {
				System.out.println("Vehiculo no encontrado");
			}
		}
	}
		
		public static void mostrarVehiculo() {
			
			for (Vehiculo vehiculo : listaVehiculos) {
				System.out.println(vehiculo);
				
			}
			
		}
		
	}
	

	

