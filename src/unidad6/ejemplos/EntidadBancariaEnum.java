package unidad6.ejemplos;

public enum EntidadBancariaEnum {
	
	
	DNI("76085597G") , FECHA("06/03/2001") , CLAVE(686123);

	private final String codigoDni;
	private final String codigoFecha;
	private final int codigoClave;
	
	EntidadBancariaEnum(String codigoDni) {
		this.codigoDni = codigoDni;
		
	}
	
	public String getCodigo() {
		return codigoDni;
		
	}
	
	EntidadBancariaEnum1(String codigoFecha){
		
		this.codigoFecha = codigoFecha;
	}
	
	public String getCodigoFecha() {
		return codigoFecha;
		
		
	}

}
