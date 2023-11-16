package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio8capicua {

	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

		int numero ;
		int ultimoDigito;
		int penultimoDigito ;
		int antepenultimo ;
		int primerDigito ;
		int segundoDigito ;

		System.out.println("Introduzca un numero del 0 al 99.999");
		numero = entrada.nextInt();

		if(numero <= 9) {
		System.out.println("El numero es capicúa");


		}else if(numero >= 10 && numero <= 99) {
			ultimoDigito = numero % 10;
			penultimoDigito = numero / 10 ;
			if(ultimoDigito==penultimoDigito) {
				System.out.println("El numero  es capiúa");
			}else{
				System.out.println("El numero no es capicúa");

			}
		}else if(numero >= 100 && numero <= 999) {
			System.out.println("El numero que ha introducido es de tres cifras");
			ultimoDigito = numero % 10;
			antepenultimo = numero / 100;
			if(ultimoDigito==antepenultimo) {
				System.out.println("El numero es capicúa");
			}else {
				System.out.println("El numero no es capicúa");
			}

		}else if(numero >= 1000 && numero <= 9999) {
			System.out.println("El numero que ha introducido es de cuatro cifras");
			ultimoDigito = numero % 10;
			penultimoDigito = (numero / 10) % 10  ; //saco el ultimo digito ej (1234 a 123)y hago el modulo con 123 (que obtendria el el ultimo de 123 que es 3)
			antepenultimo = (numero / 100) % 10 ; // dividiendo entre 100 obtengo de (1234 a 12 ) y luego hago modelo de ese numero(12) que es 2 el antepenultimo
			primerDigito = numero / 1000;
			System.out.println("f"+ultimoDigito+"---"+penultimoDigito+"---"+antepenultimo+"----"+primerDigito);
			if(primerDigito==ultimoDigito && penultimoDigito==antepenultimo) {
				System.out.println("El numero es capicúa");
			}else {
				System.out.println("El numero no es capicúa");
			}


		}else if(numero >= 10000 && numero <= 99999) {
			System.out.println("El numero que ha introducido es de cinco cifras");
			ultimoDigito = numero % 10;
			penultimoDigito = (numero / 10) % 10  ; //saco el ultimo digito ej (1234 a 123)y hago el modulo con 123 (que obtendria el el ultimo de 123 que es 3)
			antepenultimo = (numero / 100) % 10 ; // dividiendo entre 100 obtengo de (1234 a 12 ) y luego hago modelo de ese numero(12) que es 2 el antepenultimo
			primerDigito = (numero / 1000) / 10; // divido ej(12345) entre 1000 obtengo 12 y divido otra vez por 10 para quedarme con el primero que es 1
			segundoDigito = (numero / 1000) % 10; // dividimos ej(12345) entre 1000 y nos quedamos con 12 y con 12 realizamos modulo y me quedo con el segundoDigito

			if(primerDigito==ultimoDigito && segundoDigito==penultimoDigito) {
				System.out.println("El numero es capicúa");
			}else {
				System.out.println("El numero no es capicúa");
			}
		}


	}

}
