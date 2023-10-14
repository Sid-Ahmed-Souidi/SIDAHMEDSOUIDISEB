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
		Promedio de kilometros por litro.
		Tarifas de estacionamiento por día.
		Peajes por día.*/
		
		double costoGasolinaxL;
		double eficiencia;
		double promedio ;
		double CostoLxG ; 
		double numeroDelitros; 
		double precioEstacionamiento;
		double tarifa ;
		double horas ;
		double horasAminutos;
		double precioCombustible; 
		double numeroKilometrosTotal ;
		double peaje;
		int numeroPeajes ;
		double totalPrecioPeajes ; 
		Scanner entrada = new Scanner(System.in);
		
		
		//**El consumo por kilometro gasolina debo realizar una operacion 
		
		System.out.println("Numero de Kilometros recorridos");
		
		numeroKilometrosTotal = entrada.nextDouble();
		
		System.out.println("Precio de combustible por litro");
		
		precioCombustible = entrada.nextDouble();
		
		System.out.println("Eficiencia de coche en litros por cada 100 kilómetros");
		
		eficiencia = entrada.nextDouble();
		
		
		CostoLxG = precioCombustible / eficiencia ; 
		System.out.println("Costo por litro de gasolina "+CostoLxG);
		
		
		numeroDelitros = numeroKilometrosTotal / eficiencia ; 
		System.out.println("El numero de litros usados"+numeroDelitros);

		promedio = numeroKilometrosTotal / numeroDelitros ; 
		System.out.println("El promedio de kilometros por litro"+promedio);
		
		
		System.out.println("Tarifa de estacionamiento  en euros/minutos");
		
		tarifa = entrada.nextDouble(); 
		
		System.out.println("Numero de Horas estacionados");
		
		horas = entrada.nextDouble(); 
		
		horasAminutos = horas * 60 ;

		precioEstacionamiento = horasAminutos * tarifa ;  
		System.out.println("El precio de estacionamiento por dia es de"+precioEstacionamiento);
		
		
		
		System.out.println("numero de peajes encotrados");
		numeroPeajes = entrada.nextInt(); 
		
		totalPrecioPeajes = 0;
		for (int i = 1; i <= numeroPeajes; i ++) {
			System.out.println("El precio de cada peaje");
			peaje = entrada.nextDouble();
			
			totalPrecioPeajes += peaje;
		}
			
		System.out.println("El total del precio de los peajes"+totalPrecioPeajes);
				
				
				
		entrada.close();
		
		
/**		System.out.println("El costo por litro de gasolina ");
		costoGasolinaxL = entrada.nextDouble();
		
		System.out.println("El promedio de kilometros por litro");


		System.out.println("El gasto  gasolina por kilometro recorrido ");
		gastoConsumo = entrada.nextDouble();
		gastoConsumoV = entrada.nextDouble();
		
		gastoConsumoTotal = (Litros consumidos x 100) /km recorridos


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
		
		*/

		

		
		
		
		
		
		
		
		
		
		
		
	}

}
