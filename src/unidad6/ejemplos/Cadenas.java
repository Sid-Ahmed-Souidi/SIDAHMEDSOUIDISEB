package unidad6.ejemplos;

public class Cadenas {

	public static void main(String[] args) {
		
		
		String cadena = new String(" Esto es una linea de texto"+"que se almacena como cadena");
		
		System.out.println("Longitud: "+cadena.length());
		
		String otraCadena = ", ahora ampliamos la cadena";
		
		String cadenaFinal = cadena + otraCadena;
		System.out.println(cadenaFinal);
		
		
		String otraCadenaFinal = cadena.concat(otraCadena);
		System.out.println(otraCadenaFinal);
		
		
		String nombre1 = "Sid";
		String nombre2 = "Sid";
		
		if(nombre1.equals(nombre2)) {
			System.out.println("Son iguales");
			
		}else {
			System.out.println("No son iguales");
		}
		
		//Elimina los espacios en blanco delante y detras de la cadena
		System.out.println(cadena.trim());
		System.out.println(cadena.charAt(4));
		String matricula = "5555 mhl";
		System.out.println(matricula.toUpperCase());
		System.out.println(cadena.indexOf("cadena"));
		System.out.println(cadena.replace("a", "i"));
		
		
		String nombres = "DAW,DAM,ASIR,SMR";
		//Siempre se tiene que guardar en una array cuando queremos trozear la cadena
		
		String ciclos[] = nombres.split(",");
		
		String  curso = "DAW";
		for(String nombre : ciclos) {
			System.out.println(nombre);
		}
		
		
		if(ciclos[0].equals(curso)) {
			
			System.out.println("Correcto es igual");
			
		}
		
		
	}

}
