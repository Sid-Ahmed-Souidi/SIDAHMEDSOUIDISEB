package unidad12.ejemplos.conexion.empleados;

public class GestionEmpleados {

	public static void main(String[] args) {

		
		BaseDatosEmpleados bd = new BaseDatosEmpleados();
		
		SalarioEmpleado empleado = new SalarioEmpleado("Javi" , "Rodrigez" , 1500);
		
		SalarioEmpleado empleado2 = new SalarioEmpleado("Sara" , "Sanchez" , 1300);
		
		bd.crearTabla();
		bd.insertarEnTabla(empleado2);
		
		
		
		
		
		
		
		
	}

}
