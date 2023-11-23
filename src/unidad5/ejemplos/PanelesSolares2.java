package unidad5.ejemplos;

import java.util.Scanner;

public class PanelesSolares2 {

	public static void main(String[] args) {
		public class PanelSolar {

			public static void imprimirMenu() {
				System.out.println("---PLACAS SOLARES");
				System.out.println("1. Nueva placa solar");
				System.out.println("2. Obtener datos placa solar");
				System.out.println("3. Cambiar estado");
				System.out.println("4. Calcular energía generada");
				System.out.println("5. Salir");
			}
			
			public static void main(String[] args) {
				
				
				int identificador=0;
				long coordenadaX=0;
				long coordenadaY=0;
				double energíaGenerada=0; //KWh
				boolean activo=true; // true false
				int opcion=0;
				Scanner entrada = new Scanner(System.in);
				int numDias=0;
				
				do {
					//MENU
					imprimirMenu();
					
					opcion = entrada.nextInt();
					
					switch(opcion) {
					
						case 1:
							System.out.println("----- Nueva placa ------");
							System.out.println("Identificación:");
							identificador = entrada.nextInt();
							System.out.println("CoordenadaX:");
							coordenadaX = entrada.nextLong();
							System.out.println("CoordenadaY:");
							coordenadaY = entrada.nextLong();
							System.out.println("Energía generada:");
							energíaGenerada = entrada.nextDouble();
							activo = true;
							System.out.println("La placa registrada correctamente");
							
						break;
						case 2:
							
							
							System.out.println("----- Datos placa ----");
							
							if(identificador!=0) {
							
								System.out.println("Identificación:"+identificador);
								System.out.println("CoordenadaX:"+coordenadaX);
								System.out.println("CoordenadaY:"+coordenadaY);
								System.out.println("Energía generada:"+energíaGenerada+" KWh");
								if(activo) {
									System.out.println("Estado:activo");
								}else{
									System.out.println("Estado:inacivo");
								}
							}else {
								System.out.println("No existen datos");
							}
							
							
								
							break;
						case 3:
							System.out.println("Cambiar estado placa");
							activo = !activo;
							
							System.out.println("Estado cambiado correctamente");
							break;
						case 4:
							System.out.println("Calcular energía");
							System.out.println("Introduzca el número de días:");
							numDias = entrada.nextInt();
							System.out.println("Energía generada en "+numDias+" días es"+(numDias*energíaGenerada)+" KWh");
							break;
						case 5:
							System.out.println("Cerrando programa...");
							entrada.close();
							break;
					    default:
					    	System.out.println("Opción no permitida");
					    	
					        break;
						
					
					}
					
					
					
				}while(opcion!=5);
				
				
			}

		}

		
	}

}
