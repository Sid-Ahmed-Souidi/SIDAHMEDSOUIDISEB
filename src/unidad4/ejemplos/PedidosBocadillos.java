package unidad4.ejemplos;

import java.util.Scanner;

public class PedidosBocadillos {
	static  double precioJamon = 3.50 ;
	static  double precioQueso = 3.00 ;
	static  double precioMixto = 4.00 ;
	static  double precioVegetal = 3.50 ;
	static int contadorA=0;
	static int contadorB=0;
	static int contadorC=0;
	static int contadorD=0;
	static double precioTotal ;


  // Numero de bocadillos
	public static void contadorBocadillo(char seleccion) {

		if(seleccion=='a') {
			contadorA++;
		}
		else if(seleccion=='b') {
			contadorB++;
		}else if(seleccion=='c') {
			contadorC++;
		}else if(seleccion=='d') {
			contadorD++;
		}	

		
	} 
	//MOSTRAR TOTALES

	public static double precioTotal(char  seleccion) {
		 precioJamon = contadorA * precioJamon ;
		 precioQueso = contadorB * precioQueso ;
		 precioMixto = contadorC * precioMixto ;
		 precioVegetal = contadorD * precioVegetal ;
		 double PrecioT = precioJamon+precioQueso+precioMixto+precioVegetal;
		 return PrecioT;

	}	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char seleccion ;
		
		do{
			System.out.println("----Menu-Bocadillos-----");
			System.out.println("a.Bocadillo de Jamón");
			System.out.println("b.Bocadillo de Queso");
			System.out.println("c.Bocadillo de mixto");
			System.out.println("d.Bocadillo de vegetal");
			System.out.println("e.Salir");
			seleccion = entrada.next().charAt(0);
			
			if(seleccion=='a') {
				contadorBocadillo(seleccion);
				
				
			}
			else if(seleccion=='b') {
				contadorBocadillo(seleccion);
				
				
			}else if(seleccion=='c') {
				contadorBocadillo(seleccion);
				
				
			}else if (seleccion=='e') {
				System.out.println("Cerramos");
			}
				

		}while(seleccion!='e');{
			System.out.println("Numero Bocadillos de Jamon es de:"+contadorA);
			System.out.println("Numero Bocadillos de Queso es de:"+contadorB);
			System.out.println("Numero Bocadillos de Mixto es de:"+contadorC);
			System.out.println("Numero Bocadillos de Vegetal es de:"+contadorD);
			System.out.println("Precio Total es :"+precioTotal(seleccion));
	
		}
		
		
	
		
	
		
		
	}

}
