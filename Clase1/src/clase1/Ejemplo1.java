package clase1;

import java.util.Scanner;

public class Ejemplo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un edad: ");
		Integer x = sc.nextInt();
		System.out.println("La edad es: " + x);
		Boolean b=x >=18;
		System.out.println("Mayor de edad? --> " + b);
		sc.close();
	}
}
