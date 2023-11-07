package unidad2.ejemplos;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Conversiones {

	public static void main(String[] args) {
		
		///byte numeroByte = 24253 ;
		int numeroEntero = 0;
		float numeroFloat = 34.5678f ;
		
		//numeroByte = (byte)numeroEntero;
		
		String saludo = "nos vamos de puente";
		
		//char caracter = (char)saludo;
		
		System.out.println("Numero entero :"+numeroEntero);
		
		numeroEntero = (int)numeroFloat; 
		System.out.println("Numero entero :"+numeroEntero);

		
		System.out.println("Numero Float:"+numeroFloat);
		
		
	}

}
