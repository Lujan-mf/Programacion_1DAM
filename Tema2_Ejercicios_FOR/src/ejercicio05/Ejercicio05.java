package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce un número:");
		Integer n= sc.nextInt();
		Long res=1L;
		for (int i=1; i<=n;i++) {
			res=res*i;
			
		}
		System.out.println(res);
		sc.close();
	}

}
