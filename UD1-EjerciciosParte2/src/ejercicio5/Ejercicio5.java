package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
/*Escribe un programa que solicite un número real
 *  y muestre su valor absoluto y su raíz cuadrada 
 *  utilizando métodos de la clase Math. Prueba el 
 *  programa con diferentes valores positivos
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número: ");
		Double numero= sc.nextDouble();
		Double valorAbsoluto = Math.abs(numero);
		Double raizCuadrada = Math.sqrt(numero);
		System.out.println("Valor absoluto " + valorAbsoluto);
		System.out.println("Raíz cuadrada " + raizCuadrada);
		
		sc.close();
	}

}
