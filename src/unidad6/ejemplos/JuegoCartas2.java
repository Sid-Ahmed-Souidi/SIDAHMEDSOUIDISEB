package unidad6.ejemplos;

public class JuegoCartas2 {


		
		private Palo palo;
		private int puntos;
		
		
		public JuegoCartas2 (Palo palo , int puntos) {
			this.palo = palo;
			this.puntos = puntos;
			
		}


		public Palo getPalo() {
			return palo;
		}


		public void setPalo(Palo palo) {
			this.palo = palo;
		}


		public int getPuntos() {
			return puntos;
		}


		public void setPuntos(int puntos) {
			this.puntos = puntos;
		}
		
		public String getNombrePalo() {
			
			String nombre ="";
			switch(palo){
				case PALO_PICAS:
					nombre = "Picas";
					break;
				case PALO_CORAZONES:
					nombre = "Picas";
					break;
				case PALO_TREBOLES:
					nombre = "Picas";
					break;
				case PALO_DIAMANTES:
					nombre = "Picas";
					break;
				default :
					System.out.println("Palo invalido");
					break;
					
			
			}return nombre;
				
			
		}
		
		
	

}
