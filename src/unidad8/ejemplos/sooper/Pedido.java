package unidad8.ejemplos.sooper;

import unidad8.ejemplos.sooper.Contenedores.Contenedores;

public class Pedido {
	
	private static final int MIN_CONTENEDORES = 4;
	
	private String referencia;
	private IContenedores[] contenedores;
	
	
	
	public Pedido(String referencia) {
		super();
		this.referencia = referencia;
		contenedores = new IContenedores[MIN_CONTENEDORES];
	}

	
	public String getReferencia() {
		return referencia;
	}



	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}



	public IContenedores[] getContenedores() {
		return contenedores;
	}



	public void setContenedores(IContenedores[] contenedores) {
		this.contenedores = contenedores;
	}
	
	
	
	
	
	
	
	

}
