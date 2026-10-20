package ejercicio01;

import java.util.Scanner;

/*Pide filas y columnas. Dibuja un rectángulo de asteriscos.
Ejemplo de entrada: 4 filas, 7 columnas
Salida esperada:
*******
*******
*******
*******
*/
public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de filas: ");
		Integer filas = sc.nextInt();
		System.out.println("Introduce el número de columnas ");
		Integer columnas = sc.nextInt();
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		sc.close();
	}

}
