package VALIDACIONES;

public class Nombre {

	public static void main(String[] args) {
		String nombreCompleto = "John Doefasdf";
		String patronNombreCompleto = "[A-Z][a-zA-Z]{3}\\s[A-Z][a-zA-Z]*";

		if (nombreCompleto.matches(patronNombreCompleto)) {
		    System.out.println("El nombre completo es válido.");
		} else {
		    System.out.println("El nombre completo no es válido.");
		}
		/**
		Este patrón de expresión regular se desglosa de la siguiente manera:

			[A-Z]: Coincide con la primera letra del nombre, que debe ser una letra mayúscula.
			[a-zA-Z]*: Coincide con cero o más letras (mayúsculas o minúsculas) que siguen después de la primera letra del nombre.
			\s: Coincide con un espacio en blanco (para separar el nombre del apellido).
			[A-Z]: Coincide con la primera letra del apellido, que debe ser una letra mayúscula.
			[a-zA-Z]*: Coincide con cero o más letras (mayúsculas o minúsculas) que siguen después de la primera letra del apellido.
		*/
	
	}

}
