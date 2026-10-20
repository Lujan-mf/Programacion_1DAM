package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce la altura: ");
		Integer altura = sc.nextInt();
		for (int i =0;i < altura; i++) {
			for (int j =0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < altura-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
