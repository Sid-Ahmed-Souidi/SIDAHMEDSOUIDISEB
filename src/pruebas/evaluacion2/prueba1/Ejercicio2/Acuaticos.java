package pruebas.evaluacion2.prueba1.Ejercicio2;

public class Acuaticos extends Vehiculos {

	
	private String matricula;
	private int  eslora;
	private boolean motor ; 
	private int profundidad;

	
	public Acuaticos( String  modelo ,TIPO_VEHICULO vehiculo ,int  eslora , boolean motor ,String matricula) {
		super(modelo , vehiculo);
		this.eslora = eslora;
		this.motor = motor;
		setMatricula(matricula);
	}

	public Acuaticos( String modelo ,TIPO_VEHICULO vehiculo ,int  eslora , int profundidad,String matricula) {
		super( modelo , vehiculo);
		this.eslora = eslora;
		this.profundidad = profundidad;
		setMatricula(matricula);
	}
	
	

	public int  getEslora() {
		return eslora;
	}


	public void setEslora(int  eslora) {
		this.eslora = eslora;
	}
	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	public int getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		
		if(matricula.matches("[0-9]{3}[a-Z]{10}")) {
			this.matricula = matricula;

		}else{
			
			System.out.println("Formato erroneo");
			this.matricula = " ";
		}
	}


	

}
