package unidad4.ejemplos;
import java.util.Scanner;

public class Ejercicio12 {
	//En esta funcion recibe los lados y calcula el area del triangulo
	public static  double areaTriangulo(double lado1,double lado2,double lado3) {
		double sePerimetro ;
		double area ;
		sePerimetro = (lado1 + lado2+ lado3)/ 2;
		System.out.println(sePerimetro);
		System.out.println("Lado-1 :"+lado1);
		System.out.println("Lado-2 :"+lado2);
		System.out.println("Lado-3 :"+lado3);
		area = Math.sqrt((sePerimetro*(sePerimetro - lado1)*(sePerimetro - lado2)*(sePerimetro - lado3)));
		return area;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce el area del lado 1");
		double lado1 = entrada.nextDouble();
		System.out.println("Introduce el area del lado 2");
		double lado2 = entrada.nextDouble();
		System.out.println("Introduce el area del lado 3");
		double lado3 = entrada.nextDouble();
		
		System.out.println("El area del triangulo es "+areaTriangulo(lado1,lado2,lado3));
		
	}

}
