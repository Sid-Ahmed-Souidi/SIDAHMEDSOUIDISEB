package metodosCadenas;

public class Format {

	public static void main(String[] args) {
		String mensaje = format("Hola, %s. Hoy es %s.", "usuario", "miércoles");
		System.out.println(mensaje);
	}

	
	
	public static String format(String f, Object... args) {
        return String.format(f, args);
        
	}
	
	
}
