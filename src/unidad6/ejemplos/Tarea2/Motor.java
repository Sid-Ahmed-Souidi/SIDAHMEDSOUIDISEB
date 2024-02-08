package unidad6.ejemplos.Tarea2;

public class Motor {
	
	private int litrosAceite;
	private int cv;
	
	// constructor 
	public Motor(  int cv) {
		
		this.litrosAceite = 0;
		this.cv = cv;
	}
	// getters y setters

	public int getLitrosAceite() {
		return litrosAceite;
	}

	public void setLitrosAceite(int litrosAceite) {
		this.litrosAceite = litrosAceite;
	}


	public int getCv() {
		return cv;
	}
	

}
