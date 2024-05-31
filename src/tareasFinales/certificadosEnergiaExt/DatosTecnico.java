package tareasFinales.certificadosEnergiaExt;

import java.util.Scanner;

public class DatosTecnico {
	
	protected static String nombre;
	protected static String apellido;
	protected String razonSocial;
	protected String municipio;
	protected String provincia;
	protected String email;
	protected String tituloHabitante;
	protected String proReconocido;
	protected int calificacion;
	protected String DNI;
	protected String NIF;
	protected int codigoPostal;
	protected String comunidadAutonoma;
	protected int telefono;
	
	
	public DatosTecnico(String nombre, String apellido, String razonSocial, String municipio, String provincia,
			String email, int calificacion, String dNI, String nIF,
			int codigoPostal, String comunidadAutonoma, int telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.razonSocial = razonSocial;
		this.municipio = municipio;
		this.provincia = provincia;
		this.email = email;
		this.tituloHabitante = tituloHabitante;
		this.proReconocido = proReconocido;
		this.calificacion = calificacion;
		DNI = dNI;
		NIF = nIF;
		this.codigoPostal = codigoPostal;
		this.comunidadAutonoma = comunidadAutonoma;
		this.telefono = telefono;
		
		
		
		
		
		
		
		
		
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


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public String getMunicipio() {
		return municipio;
	}


	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTituloHabitante() {
		return tituloHabitante;
	}


	public void setTituloHabitante(String tituloHabitante) {
		this.tituloHabitante = tituloHabitante;
	}


	public String getProReconocido() {
		return proReconocido;
	}


	public void setProReconocido(String proReconocido) {
		this.proReconocido = proReconocido;
	}


	public int getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public String getNIF() {
		return NIF;
	}


	public void setNIF(String nIF) {
		NIF = nIF;
	}


	public int getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public String getComunidadAutonoma() {
		return comunidadAutonoma;
	}


	public void setComunidadAutonoma(String comunidadAutonoma) {
		this.comunidadAutonoma = comunidadAutonoma;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	public static void calificacionEnergetica() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca calificación energética");
		String calificacion = entrada.next();
		System.out.println("Introduzca emisiones de dioxido de carbono ");
		String emisiones = entrada.next();
		System.out.println("La calificación del tecnico "+nombre+" "+apellido+" del consumo de energia"
				+ "no renovable  es de "+calificacion+"\n.La emision de dioxido de carbono del edificio es de"+
				" "+emisiones+" g CO2eq/kWh");
		
	}
	
	
	


	@Override
	public String toString() {
		return "DatosTecnico [razonSocial=" + razonSocial + ", municipio=" + municipio + ", provincia=" + provincia
				+ ", email=" + email + ", tituloHabitante=" + tituloHabitante + ", proReconocido=" + proReconocido
				+ ", calificacion=" + calificacion + ", DNI=" + DNI + ", NIF=" + NIF + ", codigoPostal=" + codigoPostal
				+ ", comunidadAutonoma=" + comunidadAutonoma + ", telefono=" + telefono + "]";
	}



	
	

	
	
	

}
