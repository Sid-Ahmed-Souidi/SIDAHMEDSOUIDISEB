package unidad4.ejemplos;

public class Ejercicio5Secuencia2 {
	
	public static  void mostrarSecuencia() {
		int contador = 1 ;
		int numeroSucesivo ; 
		int primerNumero = 1;
		int segundoNumero = 1;
		System.out.println(primerNumero);
		System.out.println(segundoNumero);
		while(contador <=10) {
			numeroSucesivo = primerNumero + segundoNumero ;
			System.out.println(numeroSucesivo);		
			
			primerNumero = segundoNumero;
			segundoNumero = numeroSucesivo; 
			
			contador+= 1;
			
		
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		mostrarSecuencia();		
	}

}
