package unidad3.ejemplos;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BucleFor2 {

	public static void main(String[] args) {
		
		int a,b;
		b=4;
		boolean encontrado=false;
		for(a=1;a<b&&!encontrado;a++) {
			System.out.println("a="+a);
			System.out.println("b="+b);
			b--;
		}
		
		
		for(a=1,b=4;a<b;a++,b--) {
			
			System.out.println("a"+a);
			System.out.println("b"+b);
			
		}
	}

}
