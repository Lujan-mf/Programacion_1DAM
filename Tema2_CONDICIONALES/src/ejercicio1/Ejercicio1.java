package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.println("Introduce un numero de 1 al 9999");
		Scanner sc = new Scanner(System.in);
		Integer numero = sc.nextInt();
		if (numero<1 || numero>9999) {
			System.out.println("El numero tiene que estar entre 1 y 9999");
			return;
		}
		
	}
}
