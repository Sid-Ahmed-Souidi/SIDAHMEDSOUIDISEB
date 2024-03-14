package unidad6.ejemplos;

import java.util.Scanner;

public class AmonestacionPrograma {
	
	
	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
			
		AmonestacionPrograma amonestacion1 = new AmonestacionPrograma();
		
		
		System.out.println("Introduzca el nombre del tutor legal:");
		String nombreTutor = entrada.next();
		//amonestacion1.setNombrePaciente(nombreTutor);
		
		System.out.println("Introduzca el apellido del tutor legal :");
		String apellidoTutor = entrada.next();
		//amonestacion1.setApellidoTutLegal(apellidoTutor);
		
		System.out.println("Introduzca la direccion :");
		String direccion = entrada.next();
		//amonestacion1.setDirrecion(direccion);
		
		System.out.println("Introduzca el codigo postal :");
		int codigoPostal = entrada.nextInt();
	//	amonestacion1.setCodigoPostal(codigoPostal);
		
		System.out.println("Introduzca el nombre del alumno :");
		String nombreHijo = entrada.next();
	//	amonestacion1.setNombreHijo(nombreHijo);
		
		
		System.out.println("Introduzca el curso del alumno:");
		String curso = entrada.next();
		//amonestacion1.setCurso(curso);
		
		System.out.println("sIntroduzca el asunto por la cual fue amonestado :");
		String asunto = entrada.next();
	//	amonestacion1.setAsunto(asunto);
		
		System.out.println("Introduzca el dia de contacto con el tutor legal :");
		String fechaIncidencia = entrada.next();
	//	amonestacion1.setFecha(fecha);

		System.out.println("A las horas :");
		String hora = entrada.next();
	//	amonestacion1.setHora(hora);
		
		System.out.println("Introduzca la fecha local :");
		String fechalocal = entrada.next();
	//	amonestacion1.setFechaLocal(fechalocal);
		
		
		
		
		
		
		
		
		
		
		
	//	Amonestacion1.imprimirDatos();
		
		
		
		
		
	}

}
