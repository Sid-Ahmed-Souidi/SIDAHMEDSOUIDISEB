package VALIDACIONES;

public class Otras {

	public static void main(String[] args) {
		String nombre = "John";
		String patronNombre = "[a-zA-Z]+";

		if (nombre.matches(patronNombre)) {
		    System.out.println("El nombre es válido.");
		} else {
		    System.out.println("El nombre no es válido.");
		}
		
		String numero = "123";
		String patronNumeroEntero = "\\d{1,3}";

		if (numero.matches(patronNumeroEntero)) {
		    System.out.println("El número entero es válido.");
		} else {
		    System.out.println("El número entero no es válido.");
		}
		
		
		String correo = "usuario@example.com";
		String patronCorreo = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

		if (correo.matches(patronCorreo)) {
		    System.out.println("El correo electrónico es válido.");
		} else {
		    System.out.println("El correo electrónico no es válido.");
		}
		
		
		String url = "https://www.example.com";
		String patronUrl = "^(https?|ftp)://[^\\s/$.?#].[^\\s]*$";

		if (url.matches(patronUrl)) {
		    System.out.println("La URL es válida.");
		} else {
		    System.out.println("La URL no es válida.");
		}
		
		
		
		String tarjeta = "1234-5678-9012-3456";
		String patronTarjeta = "\\d{4}-\\d{4}-\\d{4}-\\d{4}";

		if (tarjeta.matches(patronTarjeta)) {
		    System.out.println("El número de tarjeta de crédito es válido.");
		} else {
		    System.out.println("El número de tarjeta de crédito no es válido.");
		}
		
		
		
		String fecha = "2024-03-14";
		String patronFecha = "\\d{4}-\\d{2}-\\d{2}";

		if (fecha.matches(patronFecha)) {
		    System.out.println("La fecha es válida.");
		} else {
		    System.out.println("La fecha no es válida.");
		}
		
		
		
		
		
		
		String numeroDecimal = "-123.45";
		String patronNumeroDecimal = "-?\\d+(\\.\\d+)?";

		if (numeroDecimal.matches(patronNumeroDecimal)) {
		    System.out.println("El número decimal es válido.");
		} else {
		    System.out.println("El número decimal no es válido.");
		}
		
		
		String usuario = "user123";
		String patronUsuario = "^[a-zA-Z0-9]{4,12}$";

		if (usuario.matches(patronUsuario)) {
		    System.out.println("El nombre de usuario es válido.");
		} else {
		    System.out.println("El nombre de usuario no es válido.");
		}
		
		
		String codigoPostalUS = "12345-6789";
		String patronCodigoPostalUS = "^\\d{5}(-\\d{4})?$";

		if (codigoPostalUS.matches(patronCodigoPostalUS)) {
		    System.out.println("El código postal de Estados Unidos es válido.");
		} else {
		    System.out.println("El código postal de Estados Unidos no es válido.");
		}
		
	}
	

}
