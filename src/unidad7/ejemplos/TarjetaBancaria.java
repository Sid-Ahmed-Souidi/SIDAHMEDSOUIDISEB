package unidad7.ejemplos;

public class TarjetaBancaria {

		// atributos , propiedades y miembros
		private String numero;
		private int cvv;
		private String titular;
		private int mes;
		private int anio;
		private String marca;
		private String entidad;
		
		//Constructores
		
		public TarjetaBancaria(String numero, int cvv) {
			
			this.numero = numero;
			this.cvv = cvv;

			}
		
		
		// funciones o metodos
		public String getNumero() {
		return numero;
		}
		
		
		public void setNumero(String numero) {
			this.numero = numero;
		}
		
}

