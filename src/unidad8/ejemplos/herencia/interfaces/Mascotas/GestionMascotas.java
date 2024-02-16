package unidad8.ejemplos.herencia.interfaces.Mascotas;

public class GestionMascotas {

	public static void main(String[] args) {
		
		Mascota garfield = new Gato(Sexo.MACHO,"8383");
		Mascota lisa = new Gato(Sexo.HEMBRA,"siberiana");
		Mascota kuki = new Perro(Sexo.HEMBRA,"5454");
		Mascota ayo = new Perro(Sexo.MACHO,"5456");
		
		System.out.println(garfield.getCodigo());
		System.out.println(lisa.getCodigo());
		System.out.println(kuki.getCodigo());
		System.out.println(ayo.getCodigo());
		
		garfield.come("pescado");
		lisa.come("hamburguesa");
		kuki.come("pescado");
		
		lisa.peleaCon((Gato)garfield);
		ayo.peleaCon((Perro)kuki);
	
	System.out.println(garfield);
	System.out.println(lisa);
	}

}
