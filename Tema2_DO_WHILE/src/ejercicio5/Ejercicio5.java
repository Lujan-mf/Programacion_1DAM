package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int min = 1;
		int max = 100;
		String respuesta;

		System.out.println("Piensa un número del 1 al 100.");
		System.out.println("Responde con '>' si tu número es mayor, '<' si es menor, o '=' si he acertado.\n");

		do {
			// Generar número aleatorio en el rango [min, max]
			int propuesta = (int) (Math.random() * (max - min + 1)) + min;

			System.out.println("¿Es el " + propuesta + "? (>, <, =): ");
			respuesta = sc.next();

			if (respuesta.equals(">")) {
				min = propuesta + 1; // Ajustamos el límite mínimo
			} else if (respuesta.equals("<")) {
				max = propuesta - 1; // Ajustamos el límite máximo
			}

		} while (!respuesta.equals("="));

		System.out.println("¡HAS ACERTADO!");

	}

}
