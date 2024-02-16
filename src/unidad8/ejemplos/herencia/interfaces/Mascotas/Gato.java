package unidad8.ejemplos.herencia.interfaces.Mascotas;

public class Gato extends Animal implements Mascota{
	
	private String codigo;
	private String raza;
	
	public Gato(Sexo sexo , String raza , String codigo) {
		super(sexo);
		this.raza = raza;
		this.codigo = codigo;
		
	}
	
	public Gato(Sexo sexo , String codigo) {
		super(sexo);
		this.codigo = codigo;
		this.raza="siames";
	}

	@Override
	public String getCodigo() {
		
		return codigo;
	}

	@Override
	public void hacerRuido() {
		this.maullar();
		this.ronronea();
	}
	
	public void maullar() {
		System.out.println("Miauuu");
		
	}
	public void ronronea() {
		System.out.println("mrrrrrr");
	}

	@Override
	public void come(String comida) {
		if("pescado".equals(comida)) {
			System.out.println("Ummm, gracias");
			maullar();
		}else {
			System.out.println("Lo siento , yo solo como pescado");
			maullar();
		}
		
	}

	@Override
	public void peleaCon(Animal contrincante) {
		if(this.getSexo()==Sexo.HEMBRA) {
			System.out.println("No me gusta pelear");
		}else if(contrincante.getSexo()==Sexo.HEMBRA) {
			System.out.println("No peleo contra gatitas");
		}else {
			System.out.println("Ven aqui que te meto");
		}
	}
	
	public String toString() {
		return super.toSring()+"Raza: "+this.raza+" \n******";
	}
	
	
	
	
	
	
	
	
	

}
