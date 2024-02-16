package unidad8.ejemplos.herencia.interfaces.Mascotas;

public class Perro extends Animal implements Mascota {
	
	private String codigo;
	public Perro(Sexo sexo ,String codigo) {
		super(sexo);
		this.codigo = codigo;
	}
	
	public Perro(String codigo) {
		super();
		this.codigo = codigo;
		
	}
	public void ladra() {
		System.out.println("guauu");
	}
	
	@Override
	
	public String getCodigo() {
		
		
		return codigo;
	}
	@Override
	public void hacerRuido() {
		this.ladra();
		
	}
	@Override
	public void come(String comida) {
		if("carne".equals(comida)) {
			System.out.println("Ummm,gracias");
		}else {
			System.out.println("Lo siento , solo como carne");
		}
		
	}
	@Override
	public void peleaCon(Animal contrincante) {
		if(contrincante.getClass().getSimpleName().equals("Perro")) {
			System.out.println("Ven aqui que te vas a enterar");
		}else {
			System.out.println("No me gusta pelear");
		}
			
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	

}
