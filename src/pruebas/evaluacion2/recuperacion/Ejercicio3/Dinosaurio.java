package pruebas.evaluacion2.recuperacion.Ejercicio3;

public class Dinosaurio {
	
	private String  id;
	private int edad;
	private int altura;
	private int peso; 
	private String  tipoSangre;
	private String dieta;
	private boolean  monoEspecie;
	



	public Dinosaurio(String id, int edad, int altura, String tipoSangre, String dieta, boolean monoEspecie) {
		super();
		this.id = id;
		this.edad = edad;
		this.altura = altura;
		this.tipoSangre = tipoSangre;
		this.dieta = dieta;
		this.monoEspecie = monoEspecie;
	}
	
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public int getAltura() {
		return altura;
	}



	public void setAltura(int altura) {
		this.altura = altura;
	}



	public String getTipoSangre() {
		return tipoSangre;
	}



	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}



	public String getDieta() {
		return dieta;
	}



	public void setDieta(String dieta) {
		this.dieta = dieta;
	}



	public boolean isMonoEspecie() {
		return monoEspecie;
	}



	public void setMonoEspecie(boolean monoEspecie) {
		this.monoEspecie = monoEspecie;
	}
	
	
	public static  void calcularAgua(int peso , String Sangre , String dieta) {
		
		if(Sangre.equals("fria") && dieta.equals("carne")) {
			
			double litroAgua = peso * 3.5 * 1.2;
			System.out.println("El total de agua es de"+litroAgua);
			
		}else if(Sangre.equals("fria") && dieta.equals("hierba")) {
			
			double litroAgua = peso * 0.5 * 1.2;
			System.out.println("El total de agua es de"+litroAgua);
			
		}else if(Sangre.equals("fria") && dieta.equals("ambos")) {
			
			double litroAgua = peso * 1.25 * 1.2;
			System.out.println("El total de agua es de"+litroAgua);
			
		}else if(Sangre.equals("caliente") && dieta.equals("ambos")) {
			
			double litroAgua = peso * 1.25 * 2.5;
			System.out.println("El total de agua es de"+litroAgua);
			
			
		}else if(Sangre.equals("caliente") && dieta.equals("carne")) {
			
			double litroAgua = peso * 3.5 * 2.5;
			System.out.println("El total de agua es de"+litroAgua);
			
		}
			else if(Sangre.equals("caliente") && dieta.equals("hierba")) {
			
			double litroAgua = peso * 0.5 * 2.5;
			System.out.println("El total de agua es de"+litroAgua);
			
		}
		
		
		
		
		
		
		
		
		
	}



	@Override
	public String toString() {
		return "Dinosaurio [id=" + id + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", tipoSangre="
				+ tipoSangre + ", dieta=" + dieta + ", monoEspecie=" + monoEspecie + "]";
	}

	
	
	
	
	
	


	

}
