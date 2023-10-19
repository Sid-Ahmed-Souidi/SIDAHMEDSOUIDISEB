package unidad3.ejemplos;

public class PracticaCapicua {

	public static void main(String[] args) {

        int numero = 87;
        int numero2 = 934 ;
        int numero3 = 6456;
        int ultimoDigito = numero % 10;
        int penultimoDigito = (numero / 10) % 10;
        int antepenultimo = (numero2 / 100);
        int primero = numero3 / 1000;

        System.out.println("El último dígito de " + numero + " es " + ultimoDigito);
        System.out.println("El penúltimo dígito de " + numero + " es " + penultimoDigito);
        System.out.println("El penúltimo dígito de " + numero + " es " + antepenultimo);
        System.out.println("El penúltimo dígito de " + numero + " es " + primero);

	}

}
