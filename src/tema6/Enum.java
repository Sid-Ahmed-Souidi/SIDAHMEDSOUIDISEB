package tema6;

public class Enum {
	
	 public static void main(String[] args) {
	    
		 for(DIASEMANA dia : DIASEMANA.values()) {
			 System.out.println(dia);
		 }
		 
		 System.out.println(DIASEMANA.MARTES.name());
		 System.out.println(DIASEMANA.MARTES.ordinal());
		 System.out.println(DIASEMANA.MARTES.name());
		 DIASEMANA.valueOf("DOMINGO");
	    }
	
}
