package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame a : ");
		Double a = sc.nextDouble();
		System.out.println("Dame b : ");
		Double b = sc.nextDouble();
		System.out.println("Dame c : ");
		Double c = sc.nextDouble();
		System.out.println("La ecuación es " +a+ " x^2 +" +b+ " 7x +" +c);
		
		if (b*b-4*a*c>=0) {
			System.out.println("Hay dos soluciones");
			Double sol1= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
			Double sol2= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
			System.out.println("Solución 1 --> " + sol1);
			System.out.println("Solución 2 --> " + sol2);
		}  else  {
			System.out.println("No hay solución real ");
			
		}
		sc.close();
	}

}
