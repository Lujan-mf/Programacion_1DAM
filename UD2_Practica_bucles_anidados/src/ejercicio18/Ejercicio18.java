package ejercicio18;

import java.util.Scanner;
//Une una pirámide invertida con otra creciente, evitando duplicar la fila más estrecha.

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce N: ");
		Integer n = sc.nextInt();
		for (int i = 0; i < 2*n; i++) {
			for (int j = 0; j <2*n; j++) {
				if (i<=j && i<=(2*n-1)/2)
					System.out.print("*");
			}
			else if() {
					System.out.println("*");
			}
				
		sc.close();

			}
		}
	}

