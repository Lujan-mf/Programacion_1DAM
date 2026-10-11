package ejercicio7;

import java.util.Random;

/*Utiliza la clase Random para generar y mostrar 
 * tres valores: un número entero aleatorio entre 1 y 100, 
 * un número real aleatorio y un valor booleano aleatorio (true o false).
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		Random random = new Random();
		Integer enteroAleatorio = random.nextInt(100)+1;
		Double realAleatorio = random.nextDouble();
		Boolean booleanAleatorio = random.nextBoolean();
		System.out.println("Número entero: " + enteroAleatorio);
		System.out.println("Número real: " + realAleatorio);
		System.out.println("Número booleano: " + booleanAleatorio);

	}

}
