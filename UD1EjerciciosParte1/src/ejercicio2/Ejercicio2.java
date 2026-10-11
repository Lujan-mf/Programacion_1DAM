package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa tu edad: ");
        int edadActual = scanner.nextInt();
        int edadProxima = edadActual + 1;
        System.out.println("El próximo año tendrás " + edadProxima + " años.");
        scanner.close();
	}
}
