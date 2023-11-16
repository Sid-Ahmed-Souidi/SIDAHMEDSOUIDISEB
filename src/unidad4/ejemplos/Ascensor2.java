package unidad4.ejemplos;

import java.util.Scanner;

public class Ascensor2 {

		public static boolean puertaAbierta = false;
		public static int plantaActual = 0;
		public static final int  ULTIMA_PLANTA=5;
		public static final int PRIMERA_PLANTA=0;

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int opcion = 0 ;
			int plantaMarcada ;

			do {

				System.out.println("----ASCENSOR-----");
				System.out.println("1Marcar planta");
				System.out.println("2.Abrir puerta");
				System.out.println("3.Cerrar puerta");
				System.out.println("4.Apagar");

				opcion = entrada.nextInt();
				switch(opcion) {
				case 1:
					System.out.println("Introduzca el numero de planta");
					plantaMarcada = entrada.nextInt();
					marcaPlanta(plantaMarcada);

				break;
				case 2 :
					System.out.println("Abrir pueta");
					System.out.println("Abriendo puerta");
					puertaAbierta = true;
					System.out.println("Puerta abierta");
					abrirPuerta();
				break;
				case 3:
					System.out.println("Cerrando puerta");
					puertaAbierta = false;
					System.out.println("Puerta Cerrada");
					cerrarPuerta();
				case 4 :
					System.out.println("Apagando ");
					cerrar();

				}




			}while(opcion!=4);
	}
		private static void cerrar() {
			System.out.println("Apagando ");

		}
		private static void cerrarPuerta() {
			System.out.println("Cerrando puerta");
			puertaAbierta = false;
			System.out.println("Puerta Cerrada");
		}
		private static void abrirPuerta() {
			System.out.println("Abrir pueta");
			System.out.println("Abriendo puerta");
			puertaAbierta = true;
			System.out.println("Puerta abierta");
		}
		private static void marcaPlanta(int plantaMarcada) {
			while(plantaMarcada != plantaActual) {
				if(plantaActual < plantaMarcada) {
					subir();
				}else {
					bajar();
				}
			}
		}
		private static void bajar() {
			System.out.println("Bajando planta"+plantaActual);
			plantaActual++;
		}
		private static void subir() {
			System.out.println("Subiendo planta"+plantaActual);
			plantaActual++;
		}

}
