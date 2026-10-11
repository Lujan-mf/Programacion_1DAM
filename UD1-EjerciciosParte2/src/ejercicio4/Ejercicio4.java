package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
/*Pide al usuario un número real y muestra: el entero
 *  inmediatamente inferior mediante Math.floor(), el entero 
 *  inmediatamente superior mediante Math.ceil() y el entero más 
 *  cercano mediante Math.round().
 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el número : ");
		Double numero = sc.nextDouble();
		System.out.println("Entero inferior: " + Math.floor(numero));
		System.out.println("Entero superior: " + Math.ceil(numero));
		System.out.println("Entero más cercano: " + Math.round(numero));
		sc.close();
	}

}
