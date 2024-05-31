package tareasFinales.certificadosEnergiaExt;

import java.time.LocalDate;
import java.util.Scanner;

public class GestionEnergetica {
	
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		IdeEdificio edificio1 = new IdeEdificio("Edificio Central","Calle Mayor, 123",
	            "Madrid",
	            "Madrid",
	            "C",
	            "Norma 2021",
	            "12345678A",
	            28013,
	            "Comunidad de Madrid",
	            LocalDate.of(1995, 5, 23)
	        );
		
		/**
		protected DatosTecnico(String nombre, String apellido, String razonSocial, String municipio, String provincia,
				String email, String tituloHabitante, String proReconocido, int calificacion, String dNI, String nIF,
				int codigoPostal, String comunidadAutonoma, int telefono) {
		
		*/
		
		DatosTecnico tecnico = new DatosTecnico("Juan","Alvarez","razon social","Navalmoral de la mata",
				"Cáceres","ssou123@gmail.com"+"tecnico Redes"+"procedimiento Academico",20,"28822319-M","983678222",
				13000,"Extremadura",69876542);
		
		
		System.out.println(edificio1);
		System.out.println(tecnico);
		
		tecnico.calificacionEnergetica();
		
		
	}

}
