package pruebas.evaluacion3.pruebafinal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.neodatis.odb.ODB;

import certificados.CertificadoDAO;

public class GestionCitas {
	
	
public static Scanner entrada= new Scanner(System.in);	

static Properties propiedades = new Properties();
	
	static String url = "";
	static String usuario=  "";
	static String password = "";
	static public AppCRUD appcrud = new AppCRUD();
	static public ODB odb;
	
	
	static List<Reserva> listaCitas = new ArrayList<Reserva>();
	static List<Pago> listaPagos = new ArrayList<Pago>();
	static int seleccion; 

	public static void main(String[] args) {
		
		
	
		cargarConfiguracion();
		  url = propiedades.getProperty("url");
		  usuario = propiedades.getProperty("usuario"); 
		  password = propiedades.getProperty("password");
		
		  
		 do {
		 System.out.println("----MENU-------");
		 System.out.println("1.Crear Cita");
		 System.out.println("2.Mostrar las Cita");
		 System.out.println("3.Mostrar los  pagos");
		 System.out.println("4.Salir...");
		 seleccion = entrada.nextInt();
		 
		 switch(seleccion) {
		 
		 case 1: 
				crearCita();
				break;
		 case 2:
			 
			 mostrarCitas();
			 
			 break;
		 
		 case 3:
			 mostrarJusticicantes();
			 break;
	
			 
			 
			 
		 case 5: 
			 System.out.println("Saliendo...");
			 
		 }
		 
		 }while(seleccion!=4);
		
		
		
		
		
		
	}



	private static void mostrarJusticicantes() {
		
		ReservaDAO reservaDAO= new ReservaDAO(url , usuario,password);	
		reservaDAO.leerReserva();
	}



	private static void mostrarCitas() {
		ReservaDAO reservaDAO= new ReservaDAO(url , usuario,password);	
		reservaDAO.leerReserva();
		reservaDAO.crearDirectorios(listaCitas);


		
	}

	private static void crearCita() {
	
		System.out.println("Introduce el documento");
		String dni = entrada.next();
		System.out.println("Introduce la fecha");
		String fecha = entrada.next();
		System.out.println("Introduce la hora");
		String hora = entrada.next();
		Random aleatorio = new Random(System.currentTimeMillis());
		int cita = aleatorio.nextInt(1000000);
		String citaString = String.valueOf(cita);
		System.out.println("Realizar pago");
		String estadoPago = seleccionarPago();
		String tipoTramite = tipoTramite();
		System.out.println("Introduce el numero de telefono");
		String telefono = entrada.next();
		System.out.println("Introduce el numero de email");
		String email = entrada.next();
		
		
		Reserva reserva = new Reserva(dni,fecha,hora,citaString ,estadoPago , tipoTramite ,telefono ,email );
		listaCitas.add(reserva);
		Justificante justificante = new Justificante(citaString , fecha , hora , tipoTramite);
		
		ReservaDAO reservaDAO= new ReservaDAO(url , usuario,password);	
		reservaDAO.insertarReserva(reserva);
		
		
		
		
		
	}
	
	
	

	private static String tipoTramite() {
		System.out.println("Indica el tipo de tramite");
		System.out.println("1.DNI");
		System.out.println("2.Pasaporte");
		int seleccion = entrada.nextInt();
		if(seleccion==1) {
			return "DNI";
		}else if(seleccion==2) {
			return "Pasaporte";
		}
		return "";
		
	}

	private static String seleccionarPago() {
		System.out.println("1.Excento de pago");
		System.out.println("2.Pagar el pago");
		System.out.println("3.Mantener pendiente");
		int seleccion = entrada.nextInt();
		String estadoPago = "";
		if(seleccion==1) {
			estadoPago= "excento";
			Pago pago = new Pago("0", estadoPago);
			 odb =appcrud.insertarPagosBOO(pago);
			 System.out.println("¿Quieres mostrar los pagos?");
			 String mostrar = entrada.next();
			 if(mostrar.equals("Si") || mostrar.equals("si")) {
				 appcrud.leerPagosBOO(odb);
			 }
			return estadoPago;

		}
		if(seleccion==2) {
			String   numero = formaPago();
			estadoPago = "pagado";
			Pago pago = new Pago(numero, estadoPago);
			  odb =appcrud.insertarPagosBOO(pago);
				 System.out.println("¿Quieres mostrar los pagos?");
				 String mostrar = entrada.next();
				 if(mostrar.equals("Si") || mostrar.equals("si")) {
					 appcrud.leerPagosBOO(odb);
				 }return estadoPago;

		}
		if(seleccion==3) {
			estadoPago= "pendiente";
			Pago pago = new Pago("0", estadoPago);
			  odb =appcrud.insertarPagosBOO(pago);
				 System.out.println("¿Quieres mostrar los pagos?");
				 String mostrar = entrada.next();
				 if(mostrar.equals("Si") || mostrar.equals("si")) {
					 appcrud.leerPagosBOO(odb);
				 }
			  
			return estadoPago;

		}
		return estadoPago;
		
		
		
	}


		
		
		
		
		
	

	private static String  formaPago() {
		System.out.println("Indica la forma de pago");
		System.out.println("1.IBAN");
		System.out.println("2.Tarjeta de credito");
		int seleccion = entrada.nextInt();
		if(seleccion==1) {
			System.out.println("Introduzca el numero correspondiente del IBAN");
			String  numero = entrada.next(); 
			return numero;
		}
		else if(seleccion==2) {
			System.out.println("Introduzca el numero correspondiente de la tarjeta");
			String numero = entrada.next(); 
			return numero;
	
		}
		return "0";
		

		
	}

	public static void cargarConfiguracion() {
		// carga los datos del ficherpo de propiedades
		FileInputStream fis;
		try {

			fis = new FileInputStream("ficheros" + File.separator + "reservas" +  File.separator + "conexion2.properties");
			propiedades.load(fis);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
