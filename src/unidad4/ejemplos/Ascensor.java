package unidad4.ejemplos;

import java.util.Scanner;

public  class Ascensor {

	public static boolean puertaAbierta = false;
	public static int plantaActual = 0;
	public static final int  ULTIMA_PLANTA=5;
	public static final int PRIMERA_PLANTA=0;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0 ;

		do {

			System.out.println("----ASCENSOR-----");
			System.out.println("1Marcar planta");
			System.out.println("2.Abrir puerta");
			System.out.println("3.Cerrar puerta");
			System.out.println("4.Apagar");

			opcion = entrada.nextInt();
			if(opcion==1) {
				System.out.println("Introduzca el numero de planta");
				int plantaMarcada = entrada.nextInt();
				while(plantaMarcada != plantaActual) {
					if(plantaActual < plantaMarcada) {
						System.out.println("Subiendo planta"+plantaActual);
						plantaActual++;
					}else {

						System.out.println("Bajando planta"+plantaActual);
						plantaActual++;
					}

				}

			}else if(opcion==2) {
				System.out.println("Abriendo puerta");
				puertaAbierta = true;
				System.out.println("Puerta abierta");


			}else if(opcion==3) {
				System.out.println("Cerrando puerta");
				puertaAbierta = false;
				System.out.println("Puerta Cerrada");


			}else if(opcion==4) {
				System.out.println("Apagando ");

			}





		}while(opcion!=4);




	}

}
