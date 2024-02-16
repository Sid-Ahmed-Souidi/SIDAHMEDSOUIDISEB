package unidad8.ejemplos.herencia.interfaces.Mascotas;

public class Animal {
	
	private Sexo sexo;
	
	public Animal() {
		sexo = Sexo.HEMBRA;
		
	}
	public Animal(Sexo sexo) {
		this.sexo = sexo;
		
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public String toSring() {
		return "Sexo: "+this.sexo+"\n";
	
	}
	
	
	
	public void duerme() {
		System.out.println("Zzzzzz");
	}

}
