package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
/*Pide al usuario una cantidad de dinero con decimales. 
 * Mediante un cast a int obtén la cantidad de euros enteros. 
 * A partir de la parte decimal, calcula también los céntimos y 
 * redondéalos correctamente
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cantidad de dinero :  ");
		Double dineroTotal = sc.nextDouble();
		Integer euro = (int) dineroTotal.doubleValue();
		Double parteDecimal = dineroTotal-euro;
		Integer centimos = (int) Math.round(parteDecimal * 100);
		System.out.println("Cantidad de euros : " + euro);
		System.out.println("Cantidad con parte decimal : " + parteDecimal);
		System.out.println("Pare redondeada : " + centimos);
		
		sc.close();
	}

}
