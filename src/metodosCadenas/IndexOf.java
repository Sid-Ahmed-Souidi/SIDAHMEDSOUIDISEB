package metodosCadenas;

public class IndexOf {

	public static void main(String[] args) {
	
		 String cadena = "hola mundo, hola todos , hola universo";
		        
		        // Obtener la posición de la primera ocurrencia de la cadena "hola"
		int indice = cadena.indexOf("hola");
		        
		System.out.println("La primera ocurrencia de 'hola' está en la posición: " + indice); 
		
		indice = cadena.lastIndexOf("hola");
		
		System.out.println("La ultima ocurrencia de 'hola' está en la posición: " + indice); 

		indice = cadena.lastIndexOf("ordenador");
		
		System.out.println("en este caso -1 ya que  'ordenador' no esta en la cadena: " + indice); 

		    
	}
	

}
