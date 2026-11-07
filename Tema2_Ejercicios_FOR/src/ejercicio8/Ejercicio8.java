package ejercicio8;

import java.util.Scanner;

//Realiza un programa que pida dos números enteros A y B. 
//Luego visualiza los números que hay entre A y B. 
//Si A es menor que B, 
//entonces debe mostrar los números desde A hasta B. Si B es menor que A, 
//entonces debe mostrar los números desde B hasta A.

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce A: ");
		Integer numA = sc.nextInt();
		System.out.println("Introduce B: ");
		Integer numB = sc.nextInt();
		if (numA == numB) {
			System.out.println("Son iguales");
			return;
		}
		Integer numMenor= numA<numB ? numA :numB ;
		Integer numMayor =numA>numB ? numA : numB;
		
		for (int i = numMenor +1; i <numMayor; i++) {
			System.out.println(i);
		}
		
		 

	}

}
