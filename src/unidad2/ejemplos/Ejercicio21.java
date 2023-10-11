package unidad2.ejemplos;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		/**Calculadora de ahorro en viajes compartidos.

		Investigue varios sitios web sobre viajes compartidos. Crear una aplicación que calcula su costo de conducción diario,
		para que pueda estimar cuánto dinero podría ahorrarse.
		Compartir coche también tiene otras ventajas como reducir las emisiones de carbono y 
		reducir la congestión del tráfico.
		La aplicación debe ingresar la siguiente información y mostrar el costo del usuario por día de conducción al trabajo:
		kilometros totales recorridos por día.
		Costo por litro de gasolina.
		Promedio de millas por galón.
		Tarifas de estacionamiento por día.
		Peajes por día.*/
		
		double kilometroTotal ;
		double costoGasolina;
		double gastoConsumo;
		double estacionamiento;
		double peaje;
		
		double gastoTotal ; 
		
		double sumaIda ; 
		double sumaVuelta; 
		double resultado ;
		double kilometroTotalV ,costoGasolinaV ,gastoConsumoV,estacionamientoV ,peajeV;
		Scanner entrada = new Scanner(System.in);
		
		
		//**El consumo por kilometro gasolina debo realizar una operacion 
		
		System.out.println("El costo total kilometrorecorriddo ida y vuelta  ");
		kilometroTotal = entrada.nextDouble();
		kilometroTotalV = entrada.nextDouble();

		
		System.out.println("El costo total gasolina ida y vuelta");
		costoGasolina = entrada.nextDouble();
		costoGasolinaV = entrada.nextDouble();


		System.out.println("El gasto  gasolina por kilometro recorrido ");
		gastoConsumo = entrada.nextDouble();
		gastoConsumoV = entrada.nextDouble();
		
		gastoConsumoTotal = 


		System.out.println("El costo total estacionamiento ida y vuelta ");
		estacionamiento = entrada.nextDouble();
		estacionamientoV = entrada.nextDouble();


		System.out.println("El costo total peaje ida y vuelta ");
		peaje = entrada.nextDouble();
		peajeV = entrada.nextDouble();

		
		 sumaIda = kilometroTotal + costoGasolina + gastoConsumo +estacionamiento +peaje;
			System.out.println("El costo total ida" + sumaIda);

		 sumaVuelta = kilometroTotalV + costoGasolinaV + gastoConsumoV +estacionamientoV +peajeV;
			System.out.println("El costo total peaje vuelta "+sumaIda);


		resultado = (sumaIda ) + (sumaVuelta) ;
		
		System.out.println("El resultado de la media es; "+resultado);
		
		

		

		
		
		
		
		
		
		
		
		
		
		
	}

}
