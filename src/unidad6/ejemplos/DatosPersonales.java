package unidad6.ejemplos;

public class DatosPersonales {
	
	//atributos
	private static String nombre ;
	private static String direccion ;
	private static int edad ;
	private static int numeroTelefono ;
	
	
	
	
	
	
	// get y set 
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		DatosPersonales.nombre = nombre;
	}
	public static String getDireccion() {
		return direccion;
	}
	public static void setDireccion(String direccion) {
		DatosPersonales.direccion = direccion;
	}
	public static int getEdad() {
		return edad;
	}
	public static void setEdad(int edad) {
		DatosPersonales.edad = edad;
	}
	public static int getNumeroTelefono() {
		return numeroTelefono;
	}
	public static void setNumeroTelefono(int numeroTelefono) {
		DatosPersonales.numeroTelefono = numeroTelefono;
	}
	
	
	
	
	// imprimirDatos
	
	public void imprimirDatos() {
		
		System.out.println("DATOS PERSONALES");
		System.out.println("----------------");
		System.out.println("Nombre :"+nombre);
		System.out.println("Dirección :"+direccion);
		System.out.println("Edad :"+edad);
		System.out.println("Numero de Telefono :"+numeroTelefono);
	}
	
	
	
	
	
	
	
	
	
	
	

}



