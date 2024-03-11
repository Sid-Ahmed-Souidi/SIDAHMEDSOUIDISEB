package unidad9.ejemplos;

public class Empleado implements Comparable<Empleado> {
	
	
	private String nombre;
	private double salario;
	
	
	public Empleado(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}




	@Override
	public String toString() {
		
		return "Nombre "+getNombre()+" Salario "+getSalario(); 
	}
	
	@Override
	public int compareTo(Empleado otroEmpleado) {
		
		int comparacion = 0;
		if(salario<otroEmpleado.salario) {
			comparacion=1;
		}
		
		if(salario>otroEmpleado.salario) {
			comparacion=-1;
		}
		
		return comparacion;

	}

}
