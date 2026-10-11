package ejercicios10;

import java.util.Scanner;


public class ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer anyo = sc.nextInt();
		Boolean b = anyo%400==0 || (anyo%4==0 && anyo%100!=0);
		System.out.println("El año " + anyo + "-->" + b);
		sc.close();
	
	}
}
