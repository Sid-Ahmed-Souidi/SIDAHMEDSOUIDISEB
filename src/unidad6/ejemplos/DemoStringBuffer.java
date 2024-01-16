package unidad6.ejemplos;

public class DemoStringBuffer {

	public static void main(String[] args) {

		String cadenaString = new String("Programación");
		StringBuffer cadenaBuffer = new StringBuffer("Programación");
		StringBuilder cadenaBuilder = new StringBuilder("Programación");
		
		// No se puede modificar 
		System.out.println("Cadena : "+cadenaString);
		// Se puede modificar las dos tipos de cadenas buffer y builder
		System.out.println("Cadena : "+cadenaBuffer);
		System.out.println("Cadena : "+cadenaBuilder);
		
		// creamos una cadena nueva "CadenaStringMod" con la cadenaString 
		String cadenaStringMod	=cadenaString.concat(" en DAW");
		cadenaBuffer.append(" en DAW");
		cadenaBuilder.append(" en DAW");
		
		System.out.println(cadenaStringMod);
		System.out.println(cadenaBuffer);
		System.out.println(cadenaBuilder);
		 
		
		// revertimos la cadena
		cadenaBuffer.reverse();
		System.out.println(cadenaBuffer);
		cadenaBuffer.append(199);
		System.out.println(cadenaBuffer);
		
		
		System.out.println("Longitud : "+cadenaBuffer.length());  
		System.out.println("Capacidad : "+cadenaBuffer.capacity());
		
	}

}
