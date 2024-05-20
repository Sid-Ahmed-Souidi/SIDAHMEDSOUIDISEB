package unidad12.ejemplos.conexion.empleados;

public class SalarioEmpleado {
	
	
	protected String nombre;
	protected String apellido;
	protected static double salario;
	
	
	public SalarioEmpleado(String nombre, String apellido, double salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSalario() {
		return Double.toString(salario);
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	public static String   aplicarIVA() {
		
		double salarioNeto  = salario -((salario * 21) / 100) ;
		  return Double.toString(salarioNeto);
		
		
		
	}
	
	
	
	@Override
	public String toString() {
		return "SalariosEmpleados [nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + "]";
	}
	
	
	
	
	

}
