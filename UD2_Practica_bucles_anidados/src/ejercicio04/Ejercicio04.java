package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce la altura: ");
		Integer altura = sc.nextInt();
		for (int i =altura;i > 0; i--) {
			for (int j =0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
