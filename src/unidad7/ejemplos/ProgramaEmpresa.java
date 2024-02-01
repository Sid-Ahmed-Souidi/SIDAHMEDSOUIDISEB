package unidad7.ejemplos;

public class ProgramaEmpresa {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado(1,"Tomas", "Ventas");
		Empleado e2 = new Empleado(2,"Susana","Administracion");
		Empleado e3 = new Empleado(3,"Pedro", "Operaciones");
		Empleado e4 = new Empleado(4,"Juana","RRHH");
		
		
		
		System.out.println("Nº de empleados creados :"+Empleado.getContador());
		System.out.println("Nº de empleados creados :"+e1.getContador());
		System.out.println("Nº de empleados creados :"+e2.getContador());
		System.out.println("Nº de empleados creados :"+e4.getContador());



	}

}
