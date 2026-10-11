package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el primer valor:");
		int primerValor = scanner.nextInt();
		System.out.print("Introduce el segundo valor:");
		int segundoValor = scanner.nextInt();
		int notaMedia = primerValor % segundoValor;
		System.out.println("Nota media: " + notaMedia);
		 scanner.close();
	}
}

