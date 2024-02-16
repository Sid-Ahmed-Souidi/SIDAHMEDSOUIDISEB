package unidad8.ejemplos.herencia.interfaces;

public class Gato  implements Sonido{
	
 double pasos;
	
	public void voz() {
		System.out.println("miauuuuuu");
	}
	
	public void andar() {
		pasos = pasos * 1.15;
	}

}
