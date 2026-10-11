package ejercicio3;

import java.util.Scanner;

/*Modifica el ejercicio anterior para que, indicando 
 * dos números, por ejemplo, num1 y num2, diga qué cantidad 
 * hay que sumarle a num1 para que sea múltiplo de num2.
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intoduce un número :");
		Integer num1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		Integer num2 = sc.nextInt();
		Integer cantidad = (num2-(num1%num2))%num2;
		System.out.println("hay que sumerle: " +cantidad);
		
	sc.close();
	}
}
