package COVID;

import java.util.Scanner;

public class CovidPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PruebaCovid covidPrueba = new PruebaCovid();
		
		System.out.println("Introduce el nombre del paciente");
		String nombre = sc.next();
		covidPrueba.setNombre(nombre);
		System.out.println("Introduce el apellido del paciente");
		String apellido = sc.next();
		covidPrueba.setApellidos(apellido);
		System.out.println("Introduce el dni del paciente");
		int  nif = sc.nextInt();
		covidPrueba.setNif(nif);
		
		System.out.println(covidPrueba);
			
		
	}

}
