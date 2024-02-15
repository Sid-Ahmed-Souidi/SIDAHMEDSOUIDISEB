package unidad8.ejemplos.herencia;

public class GestionPersonal {

	public static void main(String[] args) {
		
		
		Persona persona1 = new Persona("Manuel");
		Persona persona2 = new Persona("Manuel");
		persona1.setLocalidad("Malaga");
		persona2.setLocalidad("Berlin");
		
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		if(persona1.getNombre().equals(persona2.getNombre())) {
			System.out.println("Son las mismas personas");
		}else {
			System.out.println("No son las mismas personas");
		}

	}

}
