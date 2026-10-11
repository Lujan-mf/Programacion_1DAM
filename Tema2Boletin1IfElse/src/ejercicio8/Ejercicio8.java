package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a = sc.nextInt();
		System.out.println("Dame a : ");
		Integer b = sc.nextInt();
		System.out.println("Dame b : ");
		Integer c = sc.nextInt();
		System.out.println("Dame c : ");
		
		Boolean res = false;
		if ( a+b==c || a+c==b ||b+c==a) {
			res=true;
		}
		System.out.println(res);
		
		sc.close();
	}

}
