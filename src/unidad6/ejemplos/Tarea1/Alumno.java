package unidad6.ejemplos.Tarea1;

public class Alumno {
	
	private Asignatura asignatura1;
	private Asignatura asignatura2;
	private Asignatura asignatura3;
	
	
	Alumno(Asignatura asignatura1 , Asignatura asignatura2, Asignatura asignatura3){
	
		this.asignatura1 = asignatura1;
		this.asignatura2 = asignatura2;
		this.asignatura3 = asignatura3;
	} 
	
	Alumno(int id1 , int id2,int id3){
		
		this.asignatura1 = new Asignatura(id1);
		this.asignatura2 = new Asignatura(id2);
		this.asignatura3 = new Asignatura(id3);
	}


	// get para los tres atributos 
	public Asignatura getAsignatura1() {
		return asignatura1;
	}

	public Asignatura getAsignatura2() {
		return asignatura2;
	}

	public Asignatura getAsignatura3() {
		return asignatura3;
	}
	
	

}
