package Examenes.tercerExamen.Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;


public class ejercicio1 {
	
	static ArrayList<Direccion> listaDirecciones = new ArrayList<Direccion>();

	public static void main(String[] args) {

	String[] direcciones = { "2001:0db8:85a3:0a1b:0000:8a2e:0370:7334 # 25GB | 45",
			"2001:0db8:85a3:0f5b:0000:8a2e:0370:7335 # 50GB | 78",
			"2001:0db8:85a3:0a8f:0000:8a2e:0370:7336 # 30GB | 63",
			"2001:0db8:85a3:0a1b:0000:8a2e:0370:7337 # 40GB | 32",
			"2001:0db8:85a3:0f5b:0000:8a2e:0370:7338 # 35GB | 88",
			"2001:0db8:85a3:0c6a:0000:8a2e:0370:7339 # 45GB | 22",
			"2001:0db8:85a3:0a8f:0000:8a2e:0370:7340 # 55GB | 50",
			"2001:0db8:85a3:0a1b:0000:8a2e:0370:7341 # 60GB | 75",
			"2001:0db8:85a3:0f5b:0000:8a2e:0370:7342 # 20GB | 18",
			"2001:0db8:85a3:0c6a:0000:8a2e:0370:7343 # 70GB | 95",
			"2001:0db8:85a3:0f5b:0000:8a2e:0370:7344 # 65GB | 40",
			"2001:0db8:85a3:0c6a:0000:8a2e:0370:7345 # 75GB | 60",
			"2001:0db8:85a3:0c6a:0000:8a2e:0370:7346 # 80GB | 12",
			"2001:0db8:85a3:0f5b:0000:8a2e:0370:7347 # 15GB | 30",
			"2001:0db8:85a3:0a1b:0000:8a2e:0370:7348 # 25GB | 70",
			"2001:0db8:85a3:0f5b:0000:8a2e:0370:7349 # 50GB | 85",
			"2001:0db8:85a3:0a1b:0000:8a2e:0370:7350 # 10GB | 10",
			"2001:0db8:85a3:0c6a:0000:8a2e:0370:7351 # 90GB | 55",
			"2001:0db8:85a3:0a1b:0000:8a2e:0370:7352 # 85GB | 42",
			"2001:0db8:85a3:0a8f:0000:8a2e:0370:7353 # 95GB | 20",

	};
	crearDirecciones(direcciones);
	direccionMayorTrafico(listaDirecciones);
	direccionMenorConexion(listaDirecciones);
	promedioGeneradoTrafico(listaDirecciones);
	traficoGeneradoSubred(listaDirecciones);
	promedioConexionesTotales(listaDirecciones);
	listado50mas(listaDirecciones);
	ordenarAscYDesc(listaDirecciones);
	}

	
	
	private static void ordenarAscYDesc(ArrayList<Direccion> listaDirecciones2) {
		ComparatorTraficoDireccion comparadorTrafico = new ComparatorTraficoDireccion();
		Collections.sort(listaDirecciones2 ,comparadorTrafico);
		System.out.println("De forma ascendiente ");
		System.out.println(listaDirecciones2);
		System.out.println();
        Collections.sort(listaDirecciones2, comparadorTrafico.reversed());
		System.out.println("De forma descendiente ");
		System.out.println(listaDirecciones2);
		

		
	}



	private static void listado50mas(ArrayList<Direccion> listaDirecciones2) {
		for (Direccion direccion : listaDirecciones2) {
			if(direccion.getConxion()>50 && direccion.getTrafico()>50) {
				System.out.println("Direcciones con conexiones y traficos mayores a 50 " +direccion);
			}
			
		}
	}



	private static void promedioConexionesTotales(ArrayList<Direccion> listaDirecciones2) {
		int contador = 0;
		int totalConexiones = 0 ; 
		for (Direccion direccion : listaDirecciones2) {
			contador += direccion.getConxion();
			totalConexiones++;
		
		}		
		int promedio = contador / totalConexiones;

		System.out.println("El promedio de conexiones por todas las direcciones es de "+promedio);

		
	}
	
	
	private static void traficoGeneradoSubred(ArrayList<Direccion> listaDirecciones2) {
		int contador0a1b = 0;
		int contador0a8f = 0;
		int contador0c6a = 0;
		int contador0f5b = 0;
		
		for (Direccion direccion : listaDirecciones2) {
			String subred = (direccion.getDireccion()).substring(15,19);
			if(subred.equals("0a1b")) {
				contador0a1b+= direccion.getTrafico();
				
			}else if(subred.equals("0f5b")) {
				contador0f5b+= direccion.getTrafico();
				
			}else if(subred.equals("0c6a")) {
				contador0c6a+= direccion.getTrafico();
				
			}else if(subred.equals("0a8f")) {
				contador0a8f+= direccion.getTrafico();
				
			}
			
		}
		System.out.println("Total trafico subred 0a1b "+contador0a1b);
		System.out.println("Total trafico subred 0f5b "+contador0f5b);
		System.out.println("Total trafico subred 0c6a "+contador0c6a);
		System.out.println("Total trafico subred 0a8f "+contador0a8f);


		}
		
	



	
	private static void promedioGeneradoTrafico(ArrayList<Direccion> listaDirecciones2) {
		int totalTrafico = 0; 
		int totalDirecciones = 0;
		for (Direccion direccion : listaDirecciones2) {
			totalTrafico+=direccion.getTrafico();
			totalDirecciones++;
			
		}
		System.out.println("El promedio de trafico de todas las conexiones es de"+totalTrafico/totalDirecciones);

		
		
	}

	private static void direccionMenorConexion(ArrayList<Direccion> listaDirecciones2) {
			int comparador = 10000; 
		for (Direccion direccion : listaDirecciones2) {
			if(direccion.getConxion()<comparador){
				comparador = direccion.getConxion();
				
			}
		}
		for (Direccion direccion : listaDirecciones2) {
			if(direccion.getConxion()==comparador){
				System.out.println("la direccion con menor conexion es "+direccion);
				
			}
			
		}
	}

	private static void direccionMayorTrafico(ArrayList<Direccion> listaDirecciones2) {
		
		int direccionMayor = 0 ;
		
		for (Direccion direccion : listaDirecciones2) {
			if(direccion.getTrafico()>direccionMayor) {
				direccionMayor = direccion.getTrafico();
			}			
		}
		System.out.println(direccionMayor);
		
		for (Direccion direccion : listaDirecciones2) {
			if(direccion.getTrafico()==direccionMayor) {
				System.out.println("La direccion con mayor trafico es "+direccion);
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

	private static void crearDirecciones(String[] direcciones) {
		String datos[] = null;
		for(int i = 0 ; i <direcciones.length ; i++ ) {
			 datos = direcciones[i].split(",");
			 for(int j = 0 ; j < datos.length ; j++) {
				 
				 String ipv6 = datos[j].substring(0,39);
				String traficoString = datos[j].substring(42 ,44);
				int trafico =  Integer.parseInt(traficoString);
				String conexionString= datos[j].substring(49 ,51);
				int conexion =  Integer.parseInt(conexionString);
				
				Direccion direccion = new Direccion(ipv6 ,trafico, conexion);
				System.out.println(direccion);
				listaDirecciones.add(direccion);
				 
			 }
			
		}

		
	}

}
