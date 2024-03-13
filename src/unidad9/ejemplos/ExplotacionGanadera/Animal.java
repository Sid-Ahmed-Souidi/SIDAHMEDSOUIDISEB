package unidad9.ejemplos.ExplotacionGanadera;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal {
	
	private LocalDate camada ;
	private int ide;
	private String nombre;
	private SEXO sexo;
	private TIPO_ANIMAL tipoAnimal;
	// clase de revision.
	private LocalDate fechaVacunacion;
	private List<Revision> revisiones;
	private boolean cuidado;
	
	public Animal(LocalDate camada, int ide, String nombre, SEXO sexo,TIPO_ANIMAL tipoAnimal,LocalDate fechaVacunacion, List<Revision> revisiones, boolean cuidado) {
		super();
		this.camada = camada;
		this.ide = ide;
		this.nombre = nombre;
		this.sexo = sexo;
		this.tipoAnimal = tipoAnimal;
		this.fechaVacunacion = fechaVacunacion;
		// conforme me cree un animal me creo una lista para los animales 
		this.revisiones = new ArrayList<Revision>();
		this.cuidado = cuidado;
		
	}
	
	public LocalDate getFechaVacunacion() {
		return fechaVacunacion;
	}


	public void setFechaVacunacion() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el año de la fecha de vacunacion");
		int anyo = entrada.nextInt();
		System.out.println("Introduce el mes ");
		int mes = entrada.nextInt();
		System.out.println("Introduce el dia");
		int dia  = entrada.nextInt();
		LocalDate fechaVacunacion = LocalDate.of(anyo, mes, dia);
		LocalDate fechaActual = LocalDate.now();
		
        long diferenciaDias = ChronoUnit.DAYS.between(fechaVacunacion, fechaActual);

        System.out.println("La diferencia de días entre fechaVacunacion" + fechaVacunacion + " y " + fechaActual + " es: " + diferenciaDias + " días.");

		
		this.fechaVacunacion = fechaVacunacion;
	}


	public LocalDate getCamada() {
		return camada;
	}


	public void setCamada(LocalDate camada) {
		this.camada = camada;
	}


	public int getIde() {
		return ide;
	}


	public void setIde(int ide) {
		this.ide = ide;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public SEXO getSexo() {
		return sexo;
	}


	public void setSexo(SEXO sexo) {
		this.sexo = sexo;
	}


	public TIPO_ANIMAL getTipoAnimal() {
		return tipoAnimal;
	}


	public void setTipoAnimal(TIPO_ANIMAL tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}


	public List<Revision> getRevisiones() {
		return revisiones;
	}


	public void setRevisiones(List<Revision> revisiones) {
		this.revisiones = revisiones;
	}


	public boolean isCuidado() {
		return cuidado;
	}


	public void setCuidado(boolean cuidado) {
		this.cuidado = cuidado;
	}
	
	
}
