package unidad6.ejemplos.Tarea1;

import java.util.Random;

public class Profesor {
	
	
	Random random = new Random();


	//Desarrollar una clase llamada Profesor que:
    // Tenga un método ponerNotas que recibe un parámetro de tipo Alumno y que no devuelve nada.
	//Pondrá una calificación aleatoria a cada una de las asignaturas del alumno.
	//Tenga un método calcularMedia que recibe un parámetro de tipo Alumno y devuelve un double.
	
	public void  ponerNotas(Alumno alumno) {
		//alumno.getAsignatura1().setCalificacion(random.nextDouble(10));
	//error	//alumno.getAsignatura2().setCalificacion(random.nextDouble(10));
		//alumno.getAsignatura3().setCalificacion(random.nextDouble(10));		
		
	}
	
	public double calcularMedia(Alumno alumno) {
		double media = 0;
		 media = (alumno.getAsignatura1().getCalificacion() + alumno.getAsignatura2().getCalificacion() + alumno.getAsignatura3().getCalificacion()) / 3;
		 
		 return media;
		
	}
	

}
