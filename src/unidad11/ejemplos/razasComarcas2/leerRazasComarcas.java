package unidad11.ejemplos.razasComarcas2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.google.gson.Gson;

import ejercicio3.Paquete;

public class leerRazasComarcas {
	static ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
	static ArrayList<Animal> listaAnimales2019 = new ArrayList<Animal>();

	public static void main(String[] args) {
		String rutaFichero = "ficheros1" + File.separator + "json" + File.separator + "razasComarcasExtremadura.json";
		
		
		File fichero = new File(rutaFichero);
		Gson gson = new Gson();
		
		try(BufferedReader lector = new BufferedReader(new FileReader(fichero))) {
			
			String cadena;
			cadena = lector.readLine();
			while(cadena!=null) {
				//System.out.println(cadena);
				String [] ciclos =cadena.split(",");
				//separamos campos por coma , pero los campos estan de forma clave :valor ej "raza_ganado":"ovino" 
				String campoCodigo = ciclos[0];
				String StringCodigo =  separarClaveValor(campoCodigo);
				String campoRaza = ciclos[1];
				String raza =  separarClaveValor(campoRaza);
				String campoNumero = ciclos[2];
				String StringNumero =  separarClaveValor(campoNumero);
				String campoFecha = ciclos[3];
				String StringFecha =  separarClaveValor(campoFecha);
				String campoZona = ciclos[4];
				String zona =  separarClaveValor(campoZona);
				raza =quitarCaracteres(raza);
				StringFecha =quitarCaracteres(StringFecha);
				zona =quitarCaracteres(zona);
				zona = zona.substring(0,zona.length() - 1);	
				if(zona.equals("castuera\"")) {
					zona = zona.substring(0,zona.length() - 1);
				}
				int codigo = cambiarNumero(StringCodigo);
				int numero = cambiarNumero(StringNumero);
				LocalDate fecha = transformarFecha(StringFecha);
				listaAnimales.add(crearAnimal(codigo, raza, numero,fecha,zona));
				
				
				cadena = lector.readLine();
			
		
			
		}
			bovinoPlasencia(listaAnimales);
			sacarAnyo(listaAnimales);
			razaCaceres(listaAnimales2019);
			lector.close();	

			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		
		}
		
		
		catch(IOException e){
			e.printStackTrace();
		
		}
		
	}
	
	/**
	 * Aqui nos quedamos con los animales que tienen de año 2019
	 * y lo introducimos a una lista 
	 */
	private static void sacarAnyo(ArrayList<Animal> listaAnimales2) {
		int anyo = 2019;
		for (Animal animal : listaAnimales2) {
			if(animal.getFecha().getYear()==anyo) {
				listaAnimales2019.add(animal);
				
				
			}
		}
	}

	//sacar el el numero de animales que han habido de las diferentes razas en el año 2019 en caceres
	private static void razaCaceres(ArrayList<Animal> listaAnimales20192) {
		int totalBovino= 0;
		int totalCaprino= 0;
		int totalOvino= 0;
		int totalPorcino= 0;
		 	for (Animal animal : listaAnimales20192) {
		 		if(animal.getZona().equals("caceres") && animal.getTipo().equals("bovino")) {
					totalBovino += animal.getNumero();
				}
				else if(animal.getZona().equals("caceres") && animal.getTipo().equals("caprino")) {
					totalCaprino += animal.getNumero();
				}
				else if(animal.getZona().equals("caceres") && animal.getTipo().equals("ovino")) {
					totalOvino += animal.getNumero();
				}
				else if(animal.getZona().equals("caceres") && animal.getTipo().equals("porcino")) {
					totalPorcino += animal.getNumero();
				}
			}
		System.out.println("El total de bovinos que han habido en Caceres en el año 2019 : "+totalBovino);
		System.out.println("El total de caprinos que han habido en Caceres en el año 2019 : "+totalCaprino);
		System.out.println("El total de ovinos que han habido en Caceres en el año 2019 : "+totalOvino);
		System.out.println("El total de porcinos que han habido en Caceres en el año 2019 : "+totalPorcino);

	}
   // esta funcion recibe una lista con los conjutos de animales 
	//con el objetivo de quedarse con los bovinos que han habido en plasencia
	private static void bovinoPlasencia(ArrayList<Animal> listaAnimales2) {
		int numeroAnimal= 0;
		for (Animal animal : listaAnimales2) {
			if(animal.getZona().equals("plasencia") && animal.getTipo().equals("bovino")) {
				numeroAnimal += animal.getNumero();

			}
		}
		System.out.println("El total de bovinos que han habido en plasencia es de "+numeroAnimal);
		
		
	}

	//int codigo, String tipo, int numero, LocalDate fecha, String zona
   private static Animal crearAnimal(int codigo, String raza, int numero, LocalDate fecha, String zona) {
		
	   Animal animal = new Animal(codigo,raza,numero,fecha,zona);
	   return animal;
	   
	
	}


	private static int  cambiarNumero(String codigo) {
        int numeroEntero = Integer.parseInt(codigo);
        return numeroEntero;
		
	}

	private static LocalDate transformarFecha(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate fechaLocalDate = LocalDate.parse(fecha, formatter);
        return fechaLocalDate;

		
	}

	private static String  quitarCaracteres(String campo) {
		campo = campo.substring(1, campo.length() - 1);		
		return campo;
	}

	private static String separarClaveValor(String campo) {
		//array que contiene los campos en formato clave valor 
	 // lo separamos mediante el split y nos quedamos con el valor en este caso por ejemplo de "raza":"bovino"
		// nos quedamos con bovino
		String[] array = campo.split(":");
		return array[1];		
	}

	

}
