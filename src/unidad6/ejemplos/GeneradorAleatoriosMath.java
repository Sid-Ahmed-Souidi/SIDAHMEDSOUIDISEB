package unidad6.ejemplos;

public class GeneradorAleatoriosMath {

	public static void main(String[] args) {

		//Se genera aleatorio entre 0.0 y 1.0
		double numero = Math.random();
		System.out.println(numero);
		
		//Se genera aleatorio entre 1 y 9
		double numero2 = (int) (Math.random()*10);
		System.out.println(numero2);
		
		//Se genera aleatorio entre 1 y 100
		double numero3 = (int) (Math.random()*100+1);
		System.out.println(numero3);		
		

	
	}

}
