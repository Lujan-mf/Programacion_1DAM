package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la altura: ");
		Integer altura = sc.nextInt();
		for (int i = 1; i <=  altura; i++) {
			for (int j = 1; j <= altura -i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
