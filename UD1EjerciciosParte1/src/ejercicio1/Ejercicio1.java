package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("ingresa un numero : ");
		double numero;
		numero =sc.nextDouble();
		System.out.println("Ha escrito:" + numero);
		sc.close();
	}
}
