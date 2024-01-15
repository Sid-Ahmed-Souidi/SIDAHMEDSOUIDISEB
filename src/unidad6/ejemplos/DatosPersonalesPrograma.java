package unidad6.ejemplos;

public class DatosPersonalesPrograma {

	public static void main(String[] args) {
		DatosPersonales persona1 = new DatosPersonales();
		
		persona1.setNombre("Paquito");
		persona1.setEdad(23);
		persona1.setNumeroTelefono(689543662);
		persona1.setDireccion("Calle Corte Cadiz ,numero 4 ,Navalmoral de La Mata.");
		
		
		
		persona1.imprimirDatos();
	}

}
