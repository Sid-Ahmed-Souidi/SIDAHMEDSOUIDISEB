package unidad3.ejemplos;

import java.util.Scanner;

public class MayorEdad {

	public static void main(String[] args) {

		int  edad;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca su edad , gracias");
		edad = entrada.nextInt();

		if(edad>18) {
			System.out.println("Es mayor de edad");
			System.out.println("Enhorabuena!!");// si no ponemos las llaves siempre se va a ejecutar enhorabuena
			if(edad > 30) {
				System.out.println("Es un/a pureta");

			}
		}else if(edad==17){
			System.out.println("Estas apunto de cumplir los 18");





		}


		else {
			System.out.println("Eres menor de edad");

		}
		System.out.println("Gracias por la participación");





	}

}
