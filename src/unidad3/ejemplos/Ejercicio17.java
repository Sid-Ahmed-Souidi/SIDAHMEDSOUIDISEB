package unidad3.ejemplos;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	 char categoria ;


	 do {
		 System.out.println("Introduzca el tipo de pienso que desea(A ,B ,C  y S para salir)");

		 categoria = entrada.next().charAt(0);

		 if(categoria =='A'|| categoria=='a') {
			 System.out.println("El precio del pienso es de 30 centimos por kilogramo");

		 }else if(categoria =='B'|| categoria=='b'){
			 System.out.println("El precio del pienso es de 20 centimos por kilogramo");


		 }else if(categoria =='C'|| categoria=='c') {
			System.out.println("El precio del pienso es de 15 centimos por kilogramo");

		 }else if(categoria!='A' || categoria!='B' || categoria!='C'|| categoria!='a' || categoria!='b' || categoria!='c') {
			 System.out.println("Se ha producido un error , elija una de las opciones A , B , C");

		 }else if(categoria=='S') {

			 System.out.println("Usted ha salido , hasta la proxima");
		 }




	 }while(categoria!='S') ;








	}

}
