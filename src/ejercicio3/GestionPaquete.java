package ejercicio3;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class GestionPaquete {
	
	public static Contenedores almacen = new Contenedores();
	
	//lo cambio a mapa
	static ArrayList<Paquete> listaPaquete = new ArrayList<Paquete>();
	static ArrayList<Paquete> plasencia = new ArrayList<Paquete>();
	static ArrayList<Paquete> coria = new ArrayList<Paquete>();
	static ArrayList<Paquete> caceres = new ArrayList<Paquete>();
	static ArrayList<Paquete> merida = new ArrayList<Paquete>();
	static ArrayList<Paquete> don_benito = new ArrayList<Paquete>();
	static ArrayList<Paquete> badajoz = new ArrayList<Paquete>();
	static ArrayList<Paquete> zafra = new ArrayList<Paquete>();
	static ArrayList<Paquete> navalmoral = new ArrayList<Paquete>();


	public static void main(String[] args) {

		// Llamamos al almcacen 
		
	   
		// Trabajamos con el almacen 
		
		
		 crearPaquete();
		 acortarNombre(listaPaquete);
		 listarPaqueteZona(listaPaquete);
		 System.out.println("#####Paquetes Plasencia#####");
		 mostrarPaquetesPorZona(plasencia);
		 System.out.println("#######Paquetes coria######");
		 mostrarPaquetesPorZona(coria);
		 System.out.println("########Paquetes caceres####");
		 mostrarPaquetesPorZona(caceres);
		 System.out.println("######Paquetes merida########");
		 mostrarPaquetesPorZona(merida);
		 System.out.println("#######Paquetes don benito######");
		 mostrarPaquetesPorZona(don_benito);
		 System.out.println("#######Paquetes badajoz#########");
		 mostrarPaquetesPorZona(badajoz);
		 System.out.println("#######Paquetes zafra#########");
		 mostrarPaquetesPorZona(zafra);
		 System.out.println("#######Paquetes navalmoral#######");
		 mostrarPaquetesPorZona(navalmoral);
		 listarPaquetesLocales(navalmoral);
		 System.out.println();
		 mostrarCantidadUrgentes(listaPaquete);
		 System.out.println();
		 System.out.println("APLICACIÓN DE COSTE");
		 System.out.println();
		 aplicarCoste(listaPaquete);


		
		
		
	}


	private static void aplicarCoste(ArrayList<Paquete> listaPaquete2) {
        DecimalFormat df = new DecimalFormat("#.##");
		for (Paquete paquete : listaPaquete2) {
			String nombreIde = paquete.getIde().substring(5,9);
			if(nombreIde.equals("NAVA")) {
				if(paquete.getPeso()<2) {
					double coste = paquete.getPeso()* 0.02;
					System.out.println("El paquete local "+paquete.getIde()+" tiene un coste de"+df.format(coste));
				}else if(paquete.getPeso()>2) {
					double coste = paquete.getPeso()* 0.4;
					System.out.println("El paquete local "+paquete.getIde()+" tiene un coste de"+df.format(coste));
				}
			}else if(nombreIde.equals("CACE")){
				if(paquete.getPeso()<2) {
					double coste = paquete.getPeso()* 0.02 +1;
					System.out.println("El paquete externo "+paquete.getIde()+" tiene un coste de"+df.format(coste));
				}else if(paquete.getPeso()>2) {
					double coste = paquete.getPeso()* 0.4 +1;
					System.out.println("El paquete externo "+paquete.getIde()+" tiene un coste de"+df.format(coste));
				}
				
			}else if(nombreIde.equals("CORI")){
				if(paquete.getPeso()<2) {
					double coste = paquete.getPeso()* 0.02 +1.5;
					System.out.println("El paquete externo "+paquete.getIde()+" tiene un coste de"+df.format(coste));
				}else if(paquete.getPeso()>2) {
					double coste = paquete.getPeso()* 0.4 +1.5;
					System.out.println("El paquete externo "+paquete.getIde()+" tiene un coste de"+df.format(coste));
				}
				
			}else if(nombreIde.equals("PLAS")){
				if(paquete.getPeso()<2) {
					double coste = paquete.getPeso()* 0.02 +1.25;
					System.out.println("El paquete externo "+paquete.getIde()+" tiene un coste de"+df.format(coste));
				}else if(paquete.getPeso()>2) {
					double coste = paquete.getPeso()* 0.4 +1.25;
					System.out.println("El paquete externo "+paquete.getIde()+" tiene un coste de"+df.format(coste));
				}
				
			}else if(nombreIde.equals("MERI") || nombreIde.equals("DON_")){
				if(paquete.getPeso()<2) {
					double coste = paquete.getPeso()* 0.02 +2;
					System.out.println("El paquete externo "+paquete.getIde()+" tiene un coste de"+df.format(coste));
				}else if(paquete.getPeso()>2) {
					double coste = paquete.getPeso()* 0.4 +2;
					System.out.println("El paquete externo "+paquete.getIde()+" tiene un coste de"+df.format(coste));
				}
				
			}else if(nombreIde.equals("BADA")){
				if(paquete.getPeso()<2) {
					double coste = paquete.getPeso()* 0.02 +2.25;
					System.out.println("El paquete externo "+paquete.getIde()+" tiene un coste de"+df.format(coste));
				}else if(paquete.getPeso()>2) {
					double coste = paquete.getPeso()* 0.4 +2.25;
					System.out.println("El paquete externo "+paquete.getIde()+" tiene un coste de"+df.format(coste));
				}
			
			}else if(nombreIde.equals("ZAFR")){
				if(paquete.getPeso()<2) {
					double coste = paquete.getPeso()* 0.02 +2.5;
					System.out.println("El paquete externo "+paquete.getIde()+" tiene un coste de"+df.format(coste));
				}else if(paquete.getPeso()>2) {
					double coste = paquete.getPeso()* 0.4 +2.5;
					System.out.println("El paquete externo "+paquete.getIde()+" tiene un coste de"+df.format(coste));
				}
			}
		}
		
	}


	private static void mostrarCantidadUrgentes(ArrayList<Paquete> listaPaquete2) {
		int noUrgentes =0;
		 int cantUrgentes = 0; 
		for (Paquete paquete : listaPaquete2) {
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaPaquete = LocalDate.parse(paquete.getFecha() , formato);
			LocalDate fechaReferencia = LocalDate.of(2024, 03, 15);
			long diasDeDiferencia = ChronoUnit.DAYS.between(fechaReferencia,fechaPaquete);
	        if(diasDeDiferencia> 5) {
	        	cantUrgentes ++;
	        }else {
	        	noUrgentes ++;
	        }
		}		
        System.out.println("El total de paquetes urgentes es de "+cantUrgentes);
        System.out.println("El total de paquetes  NO urgentes es de "+noUrgentes);
	}


	private static void listarPaquetesLocales(ArrayList<Paquete> navalmoral2) {

		for (Paquete paquete : navalmoral2) {
			if(paquete.getPeso()<=2 && paquete.getPeso()>=1) {
				System.out.println("El paquete "+paquete.getIde()+" con peso"+paquete.getPeso()+" se le asigna la empresa de reparto NAVALSEAR");
			}
				if(paquete.getPeso()<1) {
					System.out.println("El paquete "+paquete.getIde()+" con peso"+paquete.getPeso()+" se le asigna la empresa de reparto NAVALEXPRESS");
				}	
				if(paquete.getPeso()>2) {
					System.out.println("El paquete "+paquete.getIde()+" con peso"+paquete.getPeso()+" se le asigna la empresa de reparto NAVALMAZON");
				}	
			
		}
		
	}


	private static void crearPaquete() {
	 for (int i = 0; i < almacen.FECHA.length; i++) {
		 
		 String fecha = almacen.FECHA[i];
		 String ide = almacen.IDE_PAQUETE[i];
		 double peso = almacen.PESO_PAQUETE[i];
		 
		 
		 añadirPaquete(crearPaquete(fecha , ide , peso));
		 //mostrarListaPaquete(listaPaquete);
	}
		
		
	}
   
	
	private static void mostrarPaquetesPorZona(ArrayList<Paquete> listaZona) {
		for (Paquete paquete : listaZona) {
			System.out.println("Ide: "+paquete.getIde()+" Peso: "+paquete.getPeso());
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaPaquete = LocalDate.parse(paquete.getFecha() , formato);
			LocalDate fechaReferencia = LocalDate.of(2024, 03, 15);
			System.out.println(fechaReferencia);
			System.out.println(fechaPaquete);
			long diasDeDiferencia = ChronoUnit.DAYS.between(fechaReferencia,fechaPaquete);
	        if(diasDeDiferencia>=5) {
	        	System.out.println("PAQUETE URGENTE");

	        }
		}
	}


	
	//Aqui litamos los paquetes por la zona 
	private static void listarPaqueteZona(ArrayList<Paquete> listaPaquete2) {
		for (Paquete paquete : listaPaquete2) {
			String nombreIde = paquete.getIde().substring(5,9);
			System.out.println(paquete.getIde());
			System.out.println(nombreIde);
			if(nombreIde.equals("PLAS")) {
				plasencia.add(paquete);
				
			}else if(nombreIde.equals("ZAFR")) {
				zafra.add(paquete);
				
			}else if(nombreIde.equals("CACE")) {
				caceres.add(paquete);
				
			}else if(nombreIde.equals("BADA")) {
				badajoz.add(paquete);
				
			}else if(nombreIde.equals("CORI")) {
				coria.add(paquete);
				
			}else if(nombreIde.equals("NAVA")) {
				navalmoral.add(paquete);
				
			}else if(nombreIde.equals("MERI")) {
				merida.add(paquete);
				
			}else if(nombreIde.equals("DON ")) {
				don_benito.add(paquete);
				
			}
	
		}
				
	}

 // acortamos el ide 
	private static void acortarNombre(ArrayList<Paquete> listaPaquete2) {
		for (Paquete paquete : listaPaquete2) {
			paquete.setIde(paquete.getIde().substring(0,9));
			System.out.println(paquete.getIde());
			
			
		}		
	}


	// y añadimos los paquetes creados en una lista donde van a estar todos los paquetes
	private static void añadirPaquete(Paquete paquete) {
		listaPaquete.add(paquete);
	}


	// creamos paquete con los campos correspondiente
	private static Paquete crearPaquete(String fecha, String ide, double peso) {
		Paquete paquete = new  Paquete(ide, peso, fecha);
		return paquete;
		
	}


}
