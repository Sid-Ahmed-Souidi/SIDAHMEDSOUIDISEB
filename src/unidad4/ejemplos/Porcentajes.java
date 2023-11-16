package unidad4.ejemplos;

public class Porcentajes {

	public static double calcularPorcentaje(double valor1,double valor2) {

		double calculoPorcentaje = (valor1 / valor2) * 100;
		return calculoPorcentaje;

	}

	public static void main(String[] args) {
	double valor1 = 2;
	double valor2 = 5;


	 System.out.println(+valor1+" es "+calcularPorcentaje(valor1,valor2)+" por ciento de "+valor2);




	}

}
