package unidad9.ejemplos;

import java.util.Arrays;

public class TestOrdenacionEmpleados {

	public static void main(String[] args) {

		
		Empleado[] departamento = new Empleado[3];
		departamento[0] = new Empleado("Paco" , 30000);
		departamento[1] = new Empleado("Elena" , 40000);
		departamento[2] = new Empleado("Tamara" , 50000);
		
		mostrarEmpleados(departamento);
		System.out.println("orden ascendente");
		Arrays.sort(departamento);
		
		mostrarEmpleados(departamento);

		

	}
	
	
	
	private static void mostrarEmpleados(Empleado[] empleados) {
		
		for(Empleado empleado : empleados) {
			System.out.println(empleado);
		}
		
	}

}
