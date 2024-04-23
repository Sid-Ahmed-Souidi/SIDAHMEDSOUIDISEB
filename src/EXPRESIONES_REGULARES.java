import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EXPRESIONES_REGULARES {

	public static void main(String[] args) {

		String text = "Este es un ejemplo de texto.";
		String[] palabras = text.split("\\s+");
		System.out.println("Palabras: " + Arrays.toString(palabras));
		
		
		String texto = "La temperatura actual es 25.5 grados Celsius.";
		Pattern patron = Pattern.compile("\\d+\\.\\d");
		Matcher matcher = patron.matcher(texto);
		while (matcher.find()) {
		    System.out.println("Número encontrado: " + matcher.group());
		}
		
		
		
		String texto2 = "La gata está sentada en la alfombra.";
		String nuevoTexto = texto2.replaceAll("gata", "perro");
		System.out.println("Texto modificado: " + nuevoTexto);
		
	}

}
