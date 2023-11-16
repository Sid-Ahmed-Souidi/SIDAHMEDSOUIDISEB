package unidad2.ejemplos;

public class factorialPO {

    public static void main(String[] args) {

        int numero = 5;
        int factorial = 1; // Inicializa el resultado del factorial a 1

        for (int i = 1; i <= numero; i++) {
        	//System.out.println(numero);
        	//System.out.println(i); //Aqui en el primer bucle seria 1
        	//System.out.println(factorial);// cuando i vale 3 el factorial ya vale 2 por lo tanto en el siguiente apartado multiplica 3 de i y 2 de factorial
            factorial = factorial * i;
            System.out.println(factorial);// Multiplica el resultado actual por el número en el bucle
        }

        System.out.println("El factorial de 5 es " + factorial);
    }
}