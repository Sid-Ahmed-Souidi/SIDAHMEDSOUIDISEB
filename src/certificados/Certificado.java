package certificados;
//ID Certificado;Propietario;Dirección;Tipo de Propiedad;Clasificación Energética;Fecha de Expedición;Empresa Certificadora;Código Técnico

import java.time.LocalDate;
import java.util.Objects;

public class Certificado {
	
	
	private String id;
	private String propietario;
	private String direccion;
	private String tipoPropiedad;
	private String clasificacionEnergetica;
	private String fechaExpedicion;
	private String empresaCertificadora;
	private String codigoTecnico;
	
	
	
	public Certificado(String id, String propietario, String direccion, String tipoPropiedad,
			String clasificacionEnergetica, String fechaExpedicion, String empresaCertificadora, String codigoTecnico) {
		super();
		this.id = id;
		this.propietario = propietario;
		this.direccion = direccion;
		this.tipoPropiedad = tipoPropiedad;
		this.clasificacionEnergetica = clasificacionEnergetica;
		this.fechaExpedicion = fechaExpedicion;
		this.empresaCertificadora = empresaCertificadora;
		this.codigoTecnico = codigoTecnico;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPropietario() {
		return propietario;
	}



	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getTipoPropiedad() {
		return tipoPropiedad;
	}



	public void setTipoPropiedad(String tipoPropiedad) {
		this.tipoPropiedad = tipoPropiedad;
	}



	public String getClasificacionEnergetica() {
		return clasificacionEnergetica;
	}



	public void setClasificacionEnergetica(String clasificacionEnergetica) {
		this.clasificacionEnergetica = clasificacionEnergetica;
	}



	public String getFechaExpedicion() {
		return fechaExpedicion;
	}



	public void setFechaExpedicion(String fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}



	public String getEmpresaCertificadora() {
		return empresaCertificadora;
	}



	public void setEmpresaCertificadora(String empresaCertificadora) {
		this.empresaCertificadora = empresaCertificadora;
	}



	public String getCodigoTecnico() {
		return codigoTecnico;
	}



	public void setCodigoTecnico(String codigoTecnico) {
		this.codigoTecnico = codigoTecnico;
	}



	
	
	
	@Override   
	public boolean equals(Object obj) {
		// comprobar si el objeto es el mismo
		if (this == obj) return true;

		// comprobar si el objeto es null o es de diferente clase 
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Certificado certificado = (Certificado) obj;
        
        return Objects.equals(id, certificado.id) &&
               Objects.equals(propietario, certificado.propietario) &&
               Objects.equals(direccion, certificado.direccion) &&
               Objects.equals(tipoPropiedad, certificado.tipoPropiedad) &&
               Objects.equals(clasificacionEnergetica, certificado.clasificacionEnergetica) &&
               Objects.equals(fechaExpedicion, certificado.fechaExpedicion) &&
               Objects.equals(empresaCertificadora, certificado.empresaCertificadora) &&
               Objects.equals(codigoTecnico, certificado.codigoTecnico);
	}
	
	@Override
	public String toString() {
		return "Certificado [id=" + id + ", propietario=" + propietario + ", direccion=" + direccion
				+ ", tipoPropiedad=" + tipoPropiedad + ", clasificacionEnergetica=" + clasificacionEnergetica
				+ ", fechaExpedicion=" + fechaExpedicion + ", empresaCertificadora=" + empresaCertificadora
				+ ", codigoTecnico=" + codigoTecnico + "]";
	}
	
	
	
	
	
	
	
	

	

}
