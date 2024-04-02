package metodosCadenas;

public class Contains {

	public static void main(String[] args) {
		  String cadena = "Hola mundo";
	        
	        // Verificar si la cadena contiene la subcadena "mundo"
	        boolean contieneMundo = cadena.contains("mundo");
	        
	        // Verificar si la cadena contiene la subcadena "adiós"
	        boolean contieneAdios = cadena.contains("adiós");
	        
	        System.out.println("¿La cadena contiene 'mundo'? " + contieneMundo); // Salida: true
	        System.out.println("¿La cadena contiene 'adiós'? " + contieneAdios); // Salida: false
	}

}
