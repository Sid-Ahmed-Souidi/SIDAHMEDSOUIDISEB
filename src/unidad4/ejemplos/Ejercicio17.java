package unidad4.ejemplos;

import java.util.Scanner;


public class Ejercicio17 {
	
		final static int numerosDNI = 23;
		

		public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduce el DNI");
		 int DNI = entrada.nextInt();
		 
		 letraDNI(DNI,numerosDNI);
		
		
	}
		
		public static void  letraDNI(int DNI ,   int numerosDNI) {
		int	resto = DNI % numerosDNI;
		
		if(resto==0) {
			System.out.println("T");
		}else if(resto==1) {
			System.out.println("R");
		}else if(resto==2) {
			System.out.println("W");
		}else if(resto==3) {
			System.out.println("A");
		}else if(resto==4) {
			System.out.println("G");
		}else if(resto==5) {
			System.out.println("M");
		}else if(resto==6) {
			System.out.println("Y");
		}else if(resto==7) {
			System.out.println("F");
		}else if(resto==8) {
			System.out.println("P");
		}else if(resto==9) {
			System.out.println("D");
		}else if(resto==10) {
			System.out.println("X");
		}else if(resto==11) {
			System.out.println("B");
		}else if(resto==12) {
			System.out.println("N");
		}else if(resto==13) {
			System.out.println("J");
		}else if(resto==14) {
			System.out.println("Z");
		}else if(resto==15) {
			System.out.println("S");
		}else if(resto==16) {
			System.out.println("Q");
		}else if(resto==17) {
			System.out.println("V");
		}else if(resto==18) {
			System.out.println("H");
		}else if(resto==19) {
			System.out.println("L");
		}else if(resto==20) {
			System.out.println("C");
		}else if(resto==21) {
			System.out.println("K");
		}else if(resto==22) {
			System.out.println("E");
		}else {
			System.out.println("Introduce el DNI Correcto ");
			
		}
			
			
			
		}
		
		
			
		}


