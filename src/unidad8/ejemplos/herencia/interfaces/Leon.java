package unidad8.ejemplos.herencia.interfaces;

public class Leon implements Sonido{
	
	 double pasos;
		
		public void voz() {
			System.out.println("grrrrrrr");
		}
		
		public void andar() {
			pasos = pasos + pasos;
		}

}
