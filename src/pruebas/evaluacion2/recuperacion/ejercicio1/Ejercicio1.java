package pruebas.evaluacion2.recuperacion.ejercicio1;

import java.util.ArrayList;

import ejercicio3.Paquete;

public class Ejercicio1 {
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
		
		extraerDatos(direcciones);
		mostrarMayorTrafico(listaDirecciones);
		mostrarMenorConexion(listaDirecciones);
		promedioDirecciones(listaDirecciones);
		traficoGeneradoSubred(listaDirecciones);
		sumatorioConexionesTotales(listaDirecciones);
		filtradoDatos(listaDirecciones);

		
		
		
	}
	
	
	





	private static void filtradoDatos(ArrayList<Direccion> listaDirecciones2) {
		for (Direccion direccion : listaDirecciones2) {
			if(direccion.getTrafico()>50 && direccion.getConxion()>50) {
				System.out.println();
				System.out.println("Estas direcciones son las que tienen mas de 50GB trafico y 50 conexiones");
				System.out.println();
				System.out.println(direccion);
				
			}
		
		}			
	}




	private static void sumatorioConexionesTotales(ArrayList<Direccion> listaDirecciones2) {
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
		
		int subred0a1b = 0;
		int subred0f5b = 0;
		int subred0c6a = 0;
		int subred0a8f = 0;

		for (Direccion direccion : listaDirecciones2) {
			String subred = direccion.getDireccion().substring(15 ,19);	
			System.out.println("Subred "+subred);
			if(subred.equals("0a1b")) {
				subred0a1b+= direccion.getTrafico();
				
			}else if(subred.equals("0f5b")) {
				subred0f5b+= direccion.getTrafico();
				
			}else if(subred.equals("0c6a")) {
				subred0c6a+= direccion.getTrafico();
				
			}else if(subred.equals("0a8f")) {
				subred0a8f+= direccion.getTrafico();
				
			}
		
		}
		
		System.out.println("Trafico de la subred 0a1b es de"+subred0a1b);
		System.out.println("Trafico de la subred 0f5b es de "+subred0f5b);
		System.out.println("Trafico de la subred 0c6a es de"+subred0c6a);
		System.out.println("Trafico de la subred 0a8f es de"+subred0a8f);

		
		
		

		
	}




	private static void promedioDirecciones(ArrayList<Direccion> listaDirecciones2) {
		int contador = 0;
		int totalDirecciones = 0 ; 
		for (Direccion direccion : listaDirecciones2) {
			contador += direccion.getTrafico();
			totalDirecciones++;
		
		}
		int promedio = contador / totalDirecciones;
		System.out.println("El promedio de trafico por todas las direcciones es de "+promedio);
		
		
	}
	
	
	

	private static void mostrarMenorConexion(ArrayList<Direccion> listaDirecciones2) {
		
		int contador = 1000;
		for (Direccion direccion : listaDirecciones2) {
			if(direccion.getConxion() < contador) {
			contador = direccion.getConxion();
			}
		}
		
		for (Direccion direccion : listaDirecciones2) {
			if(direccion.getConxion() == contador) {
			System.out.println("La direccion con menor conexion es de "+direccion.getDireccion()+" con un trafico de "+contador);
			}
		}	
		
		
	}

	private static void mostrarMayorTrafico(ArrayList<Direccion> listaDirecciones2) {
	
		int contador = 0;
		for (Direccion direccion : listaDirecciones2) {
			if(direccion.getTrafico() > contador) {
			contador = direccion.getTrafico();
			}
		}
		
		for (Direccion direccion : listaDirecciones2) {
			if(direccion.getTrafico() == contador) {
			System.out.println("La direccion con mayor trafico es de "+direccion.getDireccion()+" con un trafico de "+contador);
			}
		}				
		
	}

	private static void extraerDatos(String[] direcciones) {
		String ciclos[] = null;
		for(int i =0 ; i< direcciones.length; i++) {
			ciclos = direcciones[i].split(",");
			for(int j = 0 ; j < ciclos.length ; j++) {
			//System.out.println(ciclos[j]);
			String cadenaipv6 = ciclos[j].substring(0 ,39);
			
			String traficoString = ciclos[j].substring(42 ,44);
			int trafico =  Integer.parseInt(traficoString);
			String conexionString= ciclos[j].substring(49 ,51);
			int conexion =  Integer.parseInt(conexionString);

			
			
			Direccion direccion = new Direccion(cadenaipv6,trafico, conexion);
			System.out.println(direccion);
			listaDirecciones.add(direccion);
			
			
			}
		}
		
		
		
	}

	

}


