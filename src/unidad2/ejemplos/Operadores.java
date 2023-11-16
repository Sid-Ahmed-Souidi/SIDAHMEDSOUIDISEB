package unidad2.ejemplos;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {


		int primerNumero , segundoNumero , tercerNumero;

		//int numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Introuce un numero"));
		//JOptionPane.showMessageDialog(null, numeroUno);

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca el primer numero:");
		primerNumero = entrada.nextInt();

		System.out.println("Introduzca el segundo numero:");
		segundoNumero = entrada.nextInt();

		System.out.println("Introduzca el tercer numero:");
		tercerNumero = entrada.nextInt();


		int suma = primerNumero+segundoNumero+tercerNumero;
		int resta = primerNumero-segundoNumero-tercerNumero;
		int producto = primerNumero*segundoNumero*tercerNumero;
		final double PI = 3.14; // esta es una constante en java y van en letra mayuscula(PI).
		int radio ;
		double media = suma / 3 ;

		int modulo  = suma%2;
		double area ;



	   System.out.println("La suma es:"+suma);
	   System.out.println("La resta es:"+resta);
	   System.out.println("EL producto es:"+producto);
	   System.out.println("La media es"+media);
	   System.out.println("El modulo 2 es: "+modulo);

	   suma++; //aumentamos la suma en mas 1
	   resta--; // restamos la resta en 1

	   System.out.println("Incrementamos en una la suma;"+suma);
	   System.out.println("Decrementamos la resta en uno;"+resta);

	   suma+=3; // equivale a suma = suma+3
	   resta-=4; // equivale a resta = resta-4

	   System.out.println("Incrementamos  la suma en 3;"+suma);
	   System.out.println("Decrementamos la resta en 4 ;"+resta);


	   System.out.println("Introduzca el radio");

	   radio = entrada.nextInt();
	   area = PI * radio * radio;

	   System.out.println("El area es;"+area);

	}

}
