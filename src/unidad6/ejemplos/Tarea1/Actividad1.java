package unidad6.ejemplos.Tarea1;

import java.text.DecimalFormat;

public class Actividad1 {

	public static void main(String[] args) {
		
		DecimalFormat  formato = new DecimalFormat("0.00");
		
		Asignatura asignatura1 = new Asignatura(123);
		Asignatura asignatura2 = new Asignatura(213);
		Asignatura asignatura3 = new Asignatura(313);

			
		Alumno alumno1 = new Alumno(asignatura1, asignatura2, asignatura3);
		
		
		Profesor profesor1 = new Profesor();
		
		
		profesor1.ponerNotas(alumno1);
		double media = profesor1.calcularMedia(alumno1);
		
		System.out.println(formato.format(media));
		
		
		
		
	}

}
