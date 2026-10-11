package ejercicio1;

import java.util.Scanner;

/*Realizar un programa que pida como entrada un número con 
  decimales y lo muestre redondeado al entero más próximo*/

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intoduce un número con decimales :");
		Double decimal =sc.nextDouble();
		Integer resultado = (int) (decimal +0.50);
		
		System.out.println("El número es : " +resultado);
		sc.close();
	}

}
