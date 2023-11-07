package unidad4.ejemplos;

import java.util.Scanner;

public class Ejercicio14 {
	
	public static double calcularPrecioPorMenor(double Cmayorista , double porcentaje) {
		double pMinorista ;
		double calculoPorcentaje ;
		calculoPorcentaje = (Cmayorista * porcentaje) / 100;
		pMinorista = Cmayorista + calculoPorcentaje ;
		return pMinorista;	
	}
	
	public static void main(String[] args) {
	double Cmayorista ;
	double porcentaje ;	
		
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese el coste mayorista del articulo");
	Cmayorista = entrada.nextDouble();
	System.out.println("Ingrese el coste mayorista del articulo");
	porcentaje = entrada.nextDouble();	
	
	System.out.println("El precio de venta es de :"+calcularPrecioPorMenor(Cmayorista , porcentaje)+"euros");
		
	}

}
