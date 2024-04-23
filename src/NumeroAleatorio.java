import java.util.Random;

public class NumeroAleatorio {

	public static void main(String[] args) {
		Random random = new Random();
		int min = 0;
        int max = 4;
        int posicion1 = random.nextInt(max - min + 1) + min;
        int posicion2 = random.nextInt(max - min + 1) + min;
        int posicion3 = random.nextInt(max - min + 1) + min;
        
        while(posicion1==posicion2) {
        	posicion2 = random.nextInt(max - min + 1) + min;
        	
        }
        while(posicion3==posicion1 || posicion3==posicion2) {
        	posicion3 = random.nextInt(max - min + 1) + min;
        }
        
        System.out.println(posicion1);
        System.out.println(posicion2);
        System.out.println(posicion3);
	}

}
