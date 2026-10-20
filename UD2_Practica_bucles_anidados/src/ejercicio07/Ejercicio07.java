package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce N: ");
		Integer N = sc.nextInt();
		for (int i = 1; i<= N; i++) {
			for (int j = 1; j <= N+i-1; j++) {
				if (j<=N -i) {
					System.out.print(" ");
				} else {
					System.out.print("*");

				}
			}
			System.out.println();
		}
		sc.close();

	}

}
