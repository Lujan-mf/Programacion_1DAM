package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce a: ");
		Double a = sc.nextDouble();
		System.out.println("Introduce b: ");
		Double b = sc.nextDouble();
		System.out.println("Introduce c: ");
		Double c = sc.nextDouble();
		System.out.println("Introduce x: ");
		Double x = sc.nextDouble();
		Double y = a*x*x + b*x + c;
		System.out.println("El valor de y es: "+y);
		sc.close();
	}

}
