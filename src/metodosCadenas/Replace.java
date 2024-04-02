package metodosCadenas;

public class Replace {

	public static void main(String[] args) {
		 String cadena = "Hola mundo, hola todos";
	        
	        // Reemplazar todas las ocurrencias de "hola" por "adiós"
	        String nuevaCadena = cadena.replace("hola", "adiós");
	        
	        System.out.println("Cadena original: " + cadena); // Salida: Hola mundo, hola todos
	        System.out.println("Nueva cadena: " + nuevaCadena); // Salida: Hola mundo, adiós todos
	}

}
