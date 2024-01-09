import java.security.SecureRandom;

public class GenerarAleatoriosSeguro {

	public static void main(String[] args) {


		SecureRandom random = new SecureRandom();
	
		int numAleatorio = random.nextInt();
		System.out.println(numAleatorio);
	
	}

}
