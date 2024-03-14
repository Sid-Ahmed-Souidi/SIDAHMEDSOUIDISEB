package VALIDACIONES;

public class Digitos {

	public static void main(String[] args) {
		String cadena = "123-456-7890";
		String patron = "\\d{3}-\\d{3}-\\d{4}";

		if (cadena.matches(patron)) {
		    System.out.println("La cadena coincide con el patrón.");
		} else {
		    System.out.println("La cadena no coincide con el patrón.");
		}
	}

	/**
	En este ejemplo, si la cadena "123-456-7890" coincide con el patrón "\\d{3}-\\d{3}-\\d{4}",
	se imprimirá "La cadena coincide con el patrón.".

	Algunas cosas a tener en cuenta sobre las expresiones regulares en Java:

	Los metacaracteres en las expresiones regulares tienen significados especiales.
	Por ejemplo, \d representa un dígito, \w representa un carácter alfanumérico, etc.
	Los cuantificadores, como {3}, especifican el número de veces que un elemento puede aparecer en la cadena.
	Algunos caracteres, como \, deben ser escapados con otro \ 
	para que sean interpretados correctamente dentro de una cadena de Java.
	Espero que esta explicación te ayude a comprender mejor cómo funciona el método matches()
	y cómo puedes utilizar expresiones regulares para validar cadenas en Java.
	
	
	*/
}
