package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static boolean esMayorEdad(int edad) {
		if(edad >= 18) {
		    boolean verdadero = true;
		    return verdadero;
		}else {
			boolean falso = false;
		    return falso;
		}
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la edad (mayor de edad = true , menor de edad = false)");
		int edad = entrada.nextInt();
		System.out.println(esMayorEdad(edad));
		
		
	}

}
