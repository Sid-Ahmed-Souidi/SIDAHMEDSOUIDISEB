package unidad8.ejemplos.herencia.interfaces;

public class Perro  implements Sonido{
	
	int pasos;
	
	public void voz() {
		System.out.println("Guau Guau");
	}
	
	public void andar() {
		pasos++;
	}

}
