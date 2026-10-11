package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
/*Un depósito contiene una cantidad de litros de agua y se quiere
 *  llenar botellas de una capacidad determinada. Solicita ambos valores
 *   y calcula cuántas botellas completas pueden llenarse utilizando Math.floor().
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de litros de agua : ");
		Double litrosDeDeposito = sc.nextDouble();
		System.out.println("Introduce la cantidad de litros que tiene la botella: ");
		Double capacidadBotella = sc.nextDouble();
		Integer botellasCompletas = (int) Math.floor(litrosDeDeposito*capacidadBotella);
		System.out.println("La cantidad de botellas que puede llenarse son: " + botellasCompletas);
		
		sc.close();
	}

}
