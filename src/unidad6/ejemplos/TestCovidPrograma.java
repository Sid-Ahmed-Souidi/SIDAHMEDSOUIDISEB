package unidad6.ejemplos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestCovidPrograma {
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		TestCovid test1 = new TestCovid();
		
		System.out.println("Introduzca el nombre del paciente :");
		String nombre = entrada.next();
		test1.setNombrePaciente(nombre);
		
		System.out.println("Introduzca el resultado del paciente :");
		String resultado = entrada.next();
		test1.setResultado(resultado);
		
		System.out.println("Introduzca la fecha de realización del test(yyyy-MM-dd):");
		String fechaRealizacionString = entrada.next();
		
		LocalDate fechaRealizacion = LocalDate.parse(fechaRealizacionString , DateTimeFormatter.ISO_LOCAL_DATE);
		test1.setFechaRealizacion(fechaRealizacion);
		
		System.out.println("Introduzca el tipo de test realizado  :");
		String tipoTest = entrada.next();
		test1.setTipoDePrueba(tipoTest);
		
		System.out.println("Introduzca el numero de identificacion del test:");
		int ide = entrada.nextInt();
		test1.setNumeroIde(ide);
		
		System.out.println("Introduzca la informacion del test :");
		String informacion = entrada.next();
		test1.setInfoLaboratorio(informacion);
		
		System.out.println("Introduzca los sintomas del paciente :");
		String Sintomas = entrada.next();
		test1.setSintomas(Sintomas);
		
		System.out.println("Introduzca la fecha de entrega del test:");
		String fechaEntregaString= entrada.next();
		
		LocalDate fechaEntrega = LocalDate.parse(fechaEntregaString , DateTimeFormatter.ISO_LOCAL_DATE);
		test1.setFechaEntrega(fechaEntrega);
		
		
		System.out.println("Introduzca el nombre del medico que solicito el test :");
		String nombreMedico= entrada.next();
		test1.setNombreMedico(nombreMedico);
		
		
		test1.imprimirDatos();
		
		
		entrada.close();
		
		
	}

}
