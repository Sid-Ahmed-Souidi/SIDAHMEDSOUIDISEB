package unidad4.ejemplos;

public class Ejercicio5Secuencia {
	
	public static  void mostrarSecuencia() {
		int contador = 1 ;
		int numeroSucesivo ; 
		int numeroAnterior = 1;
		int numeroAnAnterior = 1;
		while(contador <=10) {
			numeroSucesivo = numeroAnAnterior + numeroAnterior ; // 1 +1 = 2
			System.out.println(numeroSucesivo); //imprimimos 2
			numeroAnterior = numeroSucesivo; //guardamos numero anterior 2
			numeroSucesivo = numeroAnterior + numeroAnAnterior; // 2 + 1 = 3
			numeroAnAnterior = numeroSucesivo - numeroAnterior; // 3 -2 = 1

			System.out.println(numeroSucesivo);
			
			
			contador+= 1;
			
		
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		mostrarSecuencia();		
	}

}
