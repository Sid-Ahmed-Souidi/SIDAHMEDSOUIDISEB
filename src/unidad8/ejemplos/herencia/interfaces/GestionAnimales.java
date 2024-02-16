package unidad8.ejemplos.herencia.interfaces;

public class GestionAnimales {

	public static void main(String[] args) {
		Perro  perro = new Perro();
		Gato gato = new Gato();
		Leon leon = new Leon();
		
		
		perro.voz();
		gato.voz();
		leon.voz();
		
		Sonido sonido = perro;
		sonido.voz();
		sonido = gato;
		sonido.voz();
		 sonido = leon;
		sonido.voz();
	}

}
