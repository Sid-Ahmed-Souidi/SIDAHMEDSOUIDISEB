package pruebas.ordinaria.evaluacion2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GestionVeterinaria {
	/**
	private String idAnimal;
	private String nombre ;
	private LocalDate fechaNacimiento;
	private Propietario propietario;
	private Visita visita;
	*/
	
	public static List<Servicio> servicios = new ArrayList<Servicio>(); 
	public static void main(String[] args) {
	
		
		
		/**
		 * Creamos los diferentes objetos que vamos a necesitar cirugias consultas , tratamientos etc 
		 */
		 LocalDate  fechaCirugia1 = LocalDate.of(2024, 1, 1);
		 Cirugia cirugia = new Cirugia("Cirugia Corazón abierto",200.00 ,fechaCirugia1,"tipo Cirugia Corazón","Jose Maria Rodrigez");
		 LocalDate  fechaCirugia2 = LocalDate.of(2024, 2, 3);
		 Cirugia cirugia2 = new Cirugia("Cirugia ligamento cruzado de la pata derecha ",300.00 ,fechaCirugia2,"tipo Cirugia operacion Pata derecha","Manuel Garcia");

		 LocalDate  fechaConsulta = LocalDate.of(2024, 2, 2);

		 Consulta consulta = new Consulta("Consulta en medicina veterinaria ",60.00 ,fechaConsulta,"Adrian de la llave","especialido en operaciones de corazón");
		
		 LocalDate  fechaConsulta2 = LocalDate.of(2024, 2, 4);
		 Consulta consulta2 = new Consulta("Consulta revision medicina veterinaria la pata derecha",80.00 ,fechaConsulta2,"Martin Gomez","especialido en operaciones de lesiones");

		
		 LocalDate  fechaTratamiento = LocalDate.of(2024, 2, 4);
		 LocalDate  fechaInicioMedicacion = LocalDate.of(2024, 3, 4);

		 Tratamiento tratamiento  = new Tratamiento("tratamiento post operacion ",30.00 ,fechaConsulta2," Opirozen comprimido",1 ,fechaInicioMedicacion ,4);

		 
		 
		 /**
		  * Añadimos a la lista servivios los diferentes servicios que hemos creado y que vamos a utilizar en la fichaCliente 
		  */
		 servicios.add(cirugia);
		 servicios.add(consulta);
		 servicios.add(cirugia2);
		 servicios.add(consulta2);
		 servicios.add(tratamiento);



		 LocalDate  fechaVisita = LocalDate.of(2024, 3, 3);
		 Visita visita  = new Visita(fechaVisita,servicios);
		 
		 Propietario propietario = new Propietario("12345","Juan Garcia",677896435);
		 LocalDate  fechaNacimiento = LocalDate.of(2016, 1, 3);
		 
		 
		 
		 FichaCliente ficha = new FichaCliente("8899","Bob",fechaNacimiento,propietario,visita);
		 
		 
		 
		 int contadorServicios = 0;
		 double precioTotal = 0.0;
		 for (Servicio numServicios : ficha.getVisita().getServicios()) {
			 contadorServicios++;
			 precioTotal += numServicios.getPrecioEspecifico();
			
		}
	
		 System.out.println("Visita agregada : Visita con "+contadorServicios+" servicios. Precio total : "+precioTotal );
		 System.out.println("Ficha agregada : "+ficha.getPropietario().getNombre());
		 
		 
		 
		 System.out.println("Listado inicial de fichas y susu historiales");
		 System.out.println();
		 System.out.println();
		 
		 		
		  	double precioCirugia = 0.0;
		  	int contadorCirugia = 0;
		 for (Servicio numServicios : ficha.getVisita().getServicios()) {
			 if(numServicios instanceof Cirugia) {
			 System.out.println("Historial de "+ficha.getPropietario().getNombre()+"  : ");
			 System.out.print((numServicios.getDescripcion()+" realizada  por el  Dr. "+((Cirugia)numServicios).getNombreCirujano())+"el ");
			 System.out.print(numServicios.getFecha()+((Cirugia)numServicios).getTipoCirugia()+" ("+numServicios.getPrecioEspecifico()+")");
			 precioCirugia+=numServicios.getPrecioEspecifico();
			 contadorCirugia++;
			 }
			 
			 }
		 System.out.println("Visita con "+contadorCirugia+" servicios "+" Precio total :"+precioCirugia);
		 
		 
	 		
		  	double precioConsulta = 0.0;
		  	int contadorConsulta = 0;
		 
		 
		 for (Servicio numServicios : ficha.getVisita().getServicios()) {
			 
			 if(numServicios instanceof Consulta) {
			 System.out.println("Historial de "+ficha.getPropietario().getNombre()+"  : ");
			 System.out.print((numServicios.getDescripcion()+" realizada  por el  Dr. "+((Consulta)numServicios).getVeterinario()+"el "));
			 System.out.print("Revision general "+ numServicios.getFecha()+" ("+numServicios.getPrecioEspecifico()+")");
			 precioConsulta+=numServicios.getPrecioEspecifico();
			 contadorConsulta++;
			 }
			 
			 if(numServicios instanceof Tratamiento) {
			 System.out.println("Tratamiento de "+"(dosis : "+((Tratamiento)numServicios).getDosis()+"g)");
			 System.out.print("Revision general "+ numServicios.getFecha()+" ("+numServicios.getPrecioEspecifico()+")");
			 precioConsulta+=numServicios.getPrecioEspecifico();
			 contadorConsulta++;
			 }
			 
			 
			 }
		 System.out.println("Visita con "+contadorCirugia+" servicios "+" Precio total :"+precioCirugia);
		  double precioTotal1 = precioConsulta+precioCirugia;
		 System.out.println("Precio Total de la visitas"+precioTotal1);
		 


		
	}

}
