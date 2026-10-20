package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce N: ");
		Integer N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
