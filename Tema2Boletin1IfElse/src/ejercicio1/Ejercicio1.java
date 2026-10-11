package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer x = sc.nextInt();
		if (x%2==0) {
			System.out.println("El número es par:" + x);
			
		}else {
			System.out.println("El núero es impar : " + x);
		}
		
		sc.close();
	}
}
