package unidad8.ejemplos.Tarea2;

/**
 * Una interface para definir el comportamiento del Responsable 
 * 
 */

public interface Responsable {

	/**
	 * Retorna true si la cadena que recibe es una cantidad valida para depositar  
	 */
	boolean esValidoDeposito(); 
	/**
	 * deposito : la cantidad para ser depositada
	 */

	void depositar(double deposito); 
	/**
	 * Retorna true si la cadena que recibe es una cantidad valida para retirar
	 * 
	 */
	boolean esValidoRetirar(); 
	/**
	 * deposito : la cantidad para ser retirada
	 * 
	 */
	void retirar(double retiro);
	
}
