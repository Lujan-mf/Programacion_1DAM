package ejercicio19;

import java.util.Scanner;
//ejemplo
public class Ejercicio19 {

	public static void main(String[] args) {
		
		System.out.println("Menú");
		Scanner sc = new Scanner(System.in);
		Integer opcion;
		do {
		
		System.out.println("1: Hacer suma");
		System.out.println("2: Hacer producto");
		System.out.println("3: Salir");
		System.out.println("Dame una opción: ");
		opcion = sc.nextInt();
		Integer a;
		Integer b;
		switch (opcion) {
		case 1: 
			System.out.println("Dame a: ");
			a = sc.nextInt();
			System.out.println("Dame b: ");
			b = sc.nextInt();
			System.out.println("La suma es : "+ (a+b));
			break;
		case 2:
			System.out.println("Dame a: ");
			a = sc.nextInt();
			System.out.println("Dame b: ");
			b = sc.nextInt();
			System.out.println("El producto es: "+ (a*b));
			break;
		
			}
		}while(opcion!=3);
		sc.close();
	}

	
}
