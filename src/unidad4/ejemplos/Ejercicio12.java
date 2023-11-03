package unidad4.ejemplos;
import java.util.Scanner;

public class Ejercicio12 {
	public static  void areaTriangulo(int lado1,int lado2,int lado3) {
		double sePerimetro ;
		double area ;
		sePerimetro = (lado1 + lado2+ lado3)/ 2;
		System.out.println("Lado-1"+lado1);
		System.out.println("Lado-2"+lado2);
		System.out.println("Lado-3"+lado3);
		area = Math.sqrt((sePerimetro*(sePerimetro - lado1)*(sePerimetro - lado2)*(sePerimetro - lado3)));
		System.out.println("El area del triangulo es "+area);
		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce el area del lado 1");
		int lado1 = entrada.nextInt();
		System.out.println("Introduce el area del lado 2");
		int lado2 = entrada.nextInt();
		System.out.println("Introduce el area del lado 3");
		int lado3 = entrada.nextInt();
		
		System.out.println(areaTriangulo(lado1,lado2,lado3));
		
		
		
		
		
		
		
		
		
	}

}
