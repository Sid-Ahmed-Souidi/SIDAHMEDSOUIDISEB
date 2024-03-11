package unidad9.ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestOrdenacionEstudiantes {

	public static void main(String[] args) {
		
		
		Estudiante estudiante1 = new Estudiante("Juan" , 20 , 21);
		Estudiante estudiante2 = new Estudiante("Patricia" , 15 , 19);
		Estudiante estudiante3 = new Estudiante("Delia" , 25 , 26);
		
		List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
		
		listaEstudiantes.add(estudiante1);
		listaEstudiantes.add(estudiante2);
		listaEstudiantes.add(estudiante3);
		
		mostraListaEstudiantes(listaEstudiantes);
		
		System.out.println("--lista ordenada--");
		Collections.sort(listaEstudiantes);

			mostraListaEstudiantes(listaEstudiantes);

	}
	
	private static void mostraListaEstudiantes(List<Estudiante> estudiantes) {
		
		for(Estudiante estudiante : estudiantes) {
			System.out.println(estudiante);
			
			
		}
	}

}
