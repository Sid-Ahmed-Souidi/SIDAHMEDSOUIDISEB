package tareasFinales.certificadosEnergiaExt;

import java.time.LocalDate;

public class IdeEdificio {
	
	protected String nombre;
	private String direccion;
	private String municipio;
	private String provincia;
	private String zonaClimatica;
	private String normaVigente;
	private String referenciaCatastrofe;
	private int  codigoPostal;
	private String ComunidadAutonoma;
	private LocalDate AnyoConstrucion;
	
	
	
	
	protected IdeEdificio(String nombre, String direccion, String municipio, String provincia, String zonaClimatica,
			String normaVigente, String referenciaCatastrofe, int codigoPostal, String comunidadAutonoma,
			LocalDate anyoConstrucion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.municipio = municipio;
		this.provincia = provincia;
		this.zonaClimatica = zonaClimatica;
		this.normaVigente = normaVigente;
		this.referenciaCatastrofe = referenciaCatastrofe;
		this.codigoPostal = codigoPostal;
		ComunidadAutonoma = comunidadAutonoma;
		AnyoConstrucion = anyoConstrucion;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getDireccion() {
		return direccion;
	}




	public void setDireccion(String direccion) {
		this.direccion = direccion;
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




	public String getZonaClimatica() {
		return zonaClimatica;
	}




	public void setZonaClimatica(String zonaClimatica) {
		this.zonaClimatica = zonaClimatica;
	}




	public String getNormaVigente() {
		return normaVigente;
	}




	public void setNormaVigente(String normaVigente) {
		this.normaVigente = normaVigente;
	}




	public String getReferenciaCatastrofe() {
		return referenciaCatastrofe;
	}




	public void setReferenciaCatastrofe(String referenciaCatastrofe) {
		this.referenciaCatastrofe = referenciaCatastrofe;
	}




	public int getCodigoPostal() {
		return codigoPostal;
	}




	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}




	public String getComunidadAutonoma() {
		return ComunidadAutonoma;
	}




	public void setComunidadAutonoma(String comunidadAutonoma) {
		ComunidadAutonoma = comunidadAutonoma;
	}




	public LocalDate getAnyoConstrucion() {
		return AnyoConstrucion;
	}




	public void setAnyoConstrucion(LocalDate anyoConstrucion) {
		AnyoConstrucion = anyoConstrucion;
	}




	@Override
	public String toString() {
		return "IdeEdificio [nombre=" + nombre + ", direccion=" + direccion + ", municipio=" + municipio
				+ ", provincia=" + provincia + ", zonaClimatica=" + zonaClimatica + ", normaVigente=" + normaVigente
				+ ", referenciaCatastrofe=" + referenciaCatastrofe + ", codigoPostal=" + codigoPostal
				+ ", ComunidadAutonoma=" + ComunidadAutonoma + ", AnyoConstrucion=" + AnyoConstrucion + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
