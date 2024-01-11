package unidad7.ejemplos;

import java.util.Random;
import java.util.Scanner;

public class TarjetaBancaria {
		public static Scanner entrada = new Scanner(System.in);
		public static Random random = new Random();

		
		  private static final String[] entidades = {
			        "Banco Santander", "BBVA ", "Banco Sabadell", "Bankia", "ING Direct", "Unicaja"
			    };
		  
		  private static final String[] marcas = {
			        "Visa", "MasterCard", "American Express", "Discover", "Diners Club", "JCB", "UnionPay", "Salama", "Vargas"
			    };
		  private static final String[] nombres = {
			        "Juan", "Paco", "Pedro", "Mohamed", "Luis", "Sergio", "Carlos", "Samuel", "Miguel", "Elena"
			    };

		  private static final String[] apellidos = {
			        "Garcia", "Lopez", "Rodriguez", "De Paz", "Martinez", "Flores", "Angustias", "Salama", "Vargas", "De la llave"
			    };
		// atributos , propiedades y miembros
		private long numero;
		private int cvv;
		private String titular;
		private int mes;
		private int anio;
		private String marca;
		private String entidad;
		
		//Constructores
		
		public TarjetaBancaria() {
			
			this.numero = numeroAleatorio();
			this.cvv = cvvAleatorio();
			this.titular = generarNombreAleatorio();
			this.mes = generadorMes();
			this.anio = generadorAnio();
			this.marca = generadorMarcas();;
			this.entidad = generadorEntidades();;
			
			
			}
		
		
		public int getCvv() {
			return cvv;
		}


		public void setCvv(int cvv) {
			this.cvv = cvv;
		}


		public String getTitular() {
			return titular;
		}


		public void setTitular(String titular) {
			this.titular = titular;
		}


		public int getMes() {
			return mes;
		}


		public void setMes(int mes) {
			this.mes = mes;
		}


		public int getAnio() {
			return anio;
		}


		public void setAnio(int anio) {
			this.anio = anio;
		}


		public String getMarca() {
			return marca;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}


		public String getEntidad() {
			return entidad;
		}


		public void setEntidad(String entidad) {
			this.entidad = entidad;
		}

		
		public long getNumero() {
			return numero;
		}


		public void setNumero(long numero) {
			this.numero = numero;
		}
		

		// funciones o metodos
	
		private static long numeroAleatorio() {
			
	        long numeroAleatorio = Math.abs(random.nextLong() % 10000000000000000L);
			return numeroAleatorio ;
			
		}

		private static int cvvAleatorio() {
			
			int numeroAleatorio = Math.abs(random.nextInt() % 1000);
			return numeroAleatorio ; 
			
		}
		
		  public static String generarNombreAleatorio() {
		        String nombreAleatorio = nombres[random.nextInt(nombres.length)];
		        String apellidoAleatorio = apellidos[random.nextInt(apellidos.length)];
		        
		        String nombreCompleto = nombreAleatorio + " " + apellidoAleatorio ; 
		        return nombreCompleto;
		    }
		  
		  public static int generadorMes() {
			  
		        int mesAleatorio = random.nextInt(12) + 1;
		        return mesAleatorio;
		       
		  }
		  public static int generadorAnio() {
			  
				 int valorEntero = (int) (Math.floor(Math.random()*(35-24+1)+24)); 
				 return valorEntero;
		  
		  }
		  public static String generadorMarcas() {
			  
		      String marcaAleatoria = marcas[random.nextInt(marcas.length)];
		      return marcaAleatoria;
			  
		  }
		  public static String generadorEntidades() {
			  
		      String entidadAleatoria = entidades[random.nextInt(entidades.length)];
		      return entidadAleatoria;
			  
		  }
		  
		  // imprimir datos 
		  public void imprimirDatos() {
			  System.out.println("GENERADOR DE TARJERTAS DE CREDITO");
			  System.out.println("                                 ");
			  System.out.println("NUMERO DE CUENTA: "+numero);
			  System.out.println("CVV: "+cvv);
			  System.out.println("TITULAR: "+titular);
			  System.out.println("FECHA DE CADUCIDAD: "+mes+" / "+anio);
			  System.out.println("ENTIDAD: "+entidad);
		    }
		  

		  
		
}

