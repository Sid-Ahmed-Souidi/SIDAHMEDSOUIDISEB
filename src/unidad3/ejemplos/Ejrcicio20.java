package unidad3.ejemplos;

import java.util.Scanner;

public class Ejrcicio20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double cuadrado , lado = 0 ;
		double pi= 3.14;
		double circulo , radio = 0;
		double rectangulo;
		double trapecio , base1 = 0 , base2 = 0;
		double triangulo, base = 0 , altura = 0;
		int seleccion ; 
		
		cuadrado = lado * lado; 
		circulo = pi * radio * radio ;
		rectangulo = base * altura;
		trapecio = (base1+ base2) * altura / 2;
		triangulo = (base * altura) / 2;
		
		do {
			
			System.out.println("CALCULO DE SUPERFICIES");
			System.out.println("1.Cuadrado lado*lado");
			System.out.println("2.Círculo pi*radio*radio");
			System.out.println("3.Rectángulo base*altura");
			System.out.println("4.Trapecio (base1+base2)*altura/2");
			System.out.println("5.Triángulo (base*altura)/2");
			System.out.println("6.Salir");
			seleccion = entrada.nextInt();
			
			if(seleccion == 1) {
				System.out.println("Calculo del cuadrado");
				System.out.println("Introduzca el valor de lado del cuadrado");
				lado = entrada.nextDouble();

				cuadrado = lado * lado; 
				
				System.out.println("Resultado :"+cuadrado);
				
			}else if(seleccion == 2) {
				System.out.println("Calculo del Circulo");
				System.out.println("Introduzca el valor de radio");
				radio = entrada.nextDouble();
				System.out.println("Introduzca el valor de la altura");
				circulo = pi * radio * radio ;
				System.out.println("Resultado :"+circulo);
			
			}else if(seleccion == 3) {
					System.out.println("Calculo del rectangulo");
					System.out.println("Introduzca el valor de la base");
					base = entrada.nextDouble();
					System.out.println("Introduzca el valor de la altura");
					altura = entrada.nextDouble();
					rectangulo = base * altura;

					System.out.println("Resultado :"+rectangulo);
				
			}else if(seleccion == 4) {
						System.out.println("Calculo del trapecio");
						System.out.println("Introduzca el valor de la base1");
						base = entrada.nextDouble();
						System.out.println("Introduzca el valor de la base2");
						altura = entrada.nextDouble();
						System.out.println("Introduzca el valor de la altura");
						altura = entrada.nextDouble();
						trapecio = (base1+ base2) * altura / 2;

						System.out.println("Resultado :"+trapecio);
					
			}else if(seleccion == 5) {
							System.out.println("Calculo del triangulo");
							System.out.println("Introduzca el valor de la base");
							base = entrada.nextDouble();
							System.out.println("Introduzca el valor de la altura");
							altura = entrada.nextDouble();
							triangulo = (base * altura) / 2;
							System.out.println("Resultado :"+triangulo);
			
			
			}else if(seleccion== 6) {
					System.out.println("Hasta la proxima.");
					
			}
			
			
			
		}while(seleccion!=6);
	
		
		
		
		
	}

}
