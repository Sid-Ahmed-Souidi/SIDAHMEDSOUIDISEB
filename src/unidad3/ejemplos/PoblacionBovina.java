package unidad3.ejemplos;

public class PoblacionBovina {

	public static void main(String[] args) {
		
		int bovino = 354000;
		int ovino = 410000;
		int contadorAnyo = 0; 
		
		while(ovino>= bovino) {
			System.out.println("Poblacion bovino cada año  :"+bovino);
			bovino += ((bovino * 1.01)/ 100);
			System.out.println("Poblacion ovino cada año  :"+ovino);
			ovino -= ((ovino * 0.15) / 100);
		
		contadorAnyo++; 
			
			
		}
		System.out.println("Poblacion bovino una vez que supere a poblacion ovino :"+bovino);
		System.out.println("Poblacion ovino superada por poblacion bovino :"+ovino);
		System.out.println("Numero de años que hace falta para que supere la poblacion bovino a ovino:"+contadorAnyo);


		
		
		
		
	}

}
