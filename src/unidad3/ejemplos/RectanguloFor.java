package unidad3.ejemplos;

public class RectanguloFor {

	public static void main(String[] args) {
		int altura = 3;
		int anchura = 10;

		for (int contadorFila = 0; contadorFila < altura; contadorFila++) {
			for (int contadorColumna = 0; contadorColumna < anchura; contadorColumna++) {
				System.out.print("@");
			}
			System.out.println(1);
		}

	}

}
