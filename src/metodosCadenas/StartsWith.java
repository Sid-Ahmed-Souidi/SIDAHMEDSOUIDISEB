package metodosCadenas;

public class StartsWith {

	public static void main(String[] args) {
		
		String cadena = "Hola mundo";
        
        // Verificar si la cadena comienza con "Hola"
        boolean empiezaConHola = cadena.startsWith("Hola");
        
        System.out.println("¿La cadena comienza con 'Hola'? " + empiezaConHola); // Salida: true
        
        
                   
            // Verificar si la cadena termina con "mundo"
            boolean terminaConMundo = cadena.endsWith("mundo");
            
            System.out.println("¿La cadena termina con 'mundo'? " + terminaConMundo); // Salida: true

	}

}
