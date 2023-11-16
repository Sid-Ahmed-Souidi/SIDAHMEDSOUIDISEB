package unidad3.ejemplos;

import java.util.Scanner;

public class ObjetivoJubilacion2 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

		int anyo ;
		int dinero ;
		int calculoJubilacion ;
		int dineroTotal = 0  ;
		System.out.println("Introduzca su edad");
		anyo = entrada.nextInt();
		System.out.println("Introduzca el dinero que gana anualmente");
		dinero = entrada.nextInt();
		calculoJubilacion = 65 - anyo ;

		while(calculoJubilacion > 0) {
			dinero += ((dinero * 4) / 100);
			dineroTotal += dinero ;

			calculoJubilacion--;
		}

		System.out.println("El total ahorrado de dinero hasta la jubilación es de :"+dineroTotal);






	}

}
