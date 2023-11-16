package unidad3.ejemplos;

import java.util.Scanner;

public class ReservaVehiculos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int seleccion;
		int numHoras;
		String bono ;
		double precioBici;
		double precioPati;
		double precioMoto;
		String reservaSN  ;
		do {

			System.out.println("------MENU--------");
			System.out.println("1.Reservar Bicicleta");
			System.out.println("2.Reservar Patinete");
			System.out.println("3.Reservar Moto");
			System.out.println("4.Salir");
			seleccion = entrada.nextInt();

			if(seleccion ==1 ) {
				System.out.println("Introduzca la duracion de la reserva en horas :");
				numHoras = entrada.nextInt();
				System.out.println("Tiene el bono de descuento disponible (Si/No)");
				bono = entrada.next();
				if(bono.equals("Si") || bono.equals("si")) {
						precioBici = numHoras * 2;
						System.out.println("El precio de su reserva dado con la aplicacion de descuento del bono; "+precioBici);
						System.out.println("¿Desea realizar la confirmacion de la reserva?");
						reservaSN = entrada.next();

							if(reservaSN.equals("Si") || reservaSN.equals("si")) {
								System.out.println("Ha realizado la reserva .Muchas Gracias por contar con nosotros.");
								break;
							}else if (reservaSN.equals("No") || reservaSN.equals("no")) {
									System.out.println("No ha realizado la reserva . Gracias Por su tiempo.");
							}

				}else if(bono.equals("No") || bono.equals("no")) {
						precioBici = numHoras * 4 ;
						System.out.println("El precio de reserva sin descuento de bono:   "+precioBici);
						System.out.println("¿Desea realizar la reserva?");
						reservaSN = entrada.next();


							if(reservaSN.equals("Si") || reservaSN.equals("si")) {
								System.out.println("Ha realizado la reserva .Muchas Gracias por contar con nosotros.");
							}else if (reservaSN.equals("No") || reservaSN.equals("no")) {
									System.out.println("No ha realizado la reserva . Gracias Por su tiempo.");
							}

				}


			}else if (seleccion ==2 ) {
					System.out.println("Introduzca la duracion de la reserva del patinete en horas :");
					numHoras = entrada.nextInt();
					System.out.println("Tiene el bono de descuento disponible (Si/No)");
					bono = entrada.next();
					if(bono.equals("Si") || bono.equals("si")) {
							precioPati = numHoras * 1.5;
							System.out.println("El precio de su reserva dado con la aplicacion de descuento del bono; "+precioPati);
							System.out.println("¿Desea realizar la confirmacion de la reserva?");
							reservaSN = entrada.next();

								if(reservaSN.equals("Si") || reservaSN.equals("si")) {
									System.out.println("Ha realizado la reserva .Muchas Gracias por contar con nosotros.");
								}else if (reservaSN.equals("No") || reservaSN.equals("no")) {
									System.out.println("No ha realizado la reserva . Gracias Por su tiempo.");
								}
				}else if(bono.equals("No") || bono.equals("no")) {
						precioPati = numHoras * 3 ;
						System.out.println("El precio de reserva sin descuento de bono:   "+precioPati);
						System.out.println("¿Desea realizar la reserva?");
						reservaSN = entrada.next();

							if(reservaSN.equals("Si") || reservaSN.equals("si")) {
								System.out.println("Ha realizado la reserva .Muchas Gracias por contar con nosotros.");
							}else if (reservaSN.equals("No") || reservaSN.equals("no")) {
								System.out.println("No ha realizado la reserva . Gracias Por su tiempo.");
							}

				}



			}else if (seleccion ==3 ) {
					System.out.println("Introduzca la duracion de la reserva de la moto en horas :");
					numHoras = entrada.nextInt();
					System.out.println("Tiene el bono de descuento disponible (Si/No)");
					bono = entrada.next();
					if(bono.equals("Si") || bono.equals("si")) {
							precioMoto = numHoras * 5;
							System.out.println("El precio de su reserva dado con la aplicacion de descuento del bono; "+precioMoto);
							System.out.println("¿Desea realizar la confirmacion de la reserva?");
							reservaSN = entrada.next();

								if(reservaSN.equals("Si") || reservaSN.equals("si")) {
									System.out.println("Ha realizado la reserva .Muchas Gracias por contar con nosotros.");
								}else if (reservaSN.equals("No") || reservaSN.equals("no")) {
									System.out.println("No ha realizado la reserva . Gracias Por su tiempo.");
								}
				}else if(bono.equals("No") || bono.equals("no")) {
							precioMoto = numHoras * 9 ;
							System.out.println("El precio de reserva sin descuento de bono:   "+precioMoto);
							System.out.println("¿Desea realizar la reserva?");
							reservaSN = entrada.next();

							if(reservaSN.equals("Si") || reservaSN.equals("si")) {
								System.out.println("Ha realizado la reserva .Muchas Gracias por contar con nosotros.");
							}else if (reservaSN.equals("No") || reservaSN.equals("no")) {
								System.out.println("No ha realizado la reserva . Gracias Por su tiempo.");
							}

					}




			}else if(seleccion==4) {
				System.out.println("Ha salido del programa de reserva. Muchas gracias :");



			}


		}while(seleccion!=4);

	}

}
