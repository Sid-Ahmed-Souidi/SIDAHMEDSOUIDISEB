package repasoSegundaEva.empresaLogistica;

import java.util.Random;

public class Caja {
	
	private String tipo ;
	private int numero;
	private String codigo;
	
	
	
	
	public Caja(String tipo) {
		super();
		this.tipo = tipo;
		generarNumero();
		crearCodigo();
	}

	
	private void generarNumero() {
		  Random random = new Random();
	       numero = random.nextInt(9000) + 1000;
	        

	}


	
	
	private void crearCodigo() {
		String numeroString = String.valueOf(numero);
		 codigo =  tipo + numeroString ;
		
	}


	

	
	
  
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		return "Caja [tipo=" + tipo + ", numero=" + numero + ", codigo=" + codigo + "]";
	}


	

}
