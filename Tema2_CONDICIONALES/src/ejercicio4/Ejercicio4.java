package ejercicio4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random cosa = new Random();
		Integer num1 = cosa.nextInt(1,100);
		Integer num2 = cosa.nextInt(1,100);
		Integer suma = num1 +num2;
		System.out.println(num1 +"+"+num2);
		if (sc.nextInt()== suma) {
			System.out.println("Es correcto");
		}
		else {
			System.out.println("Es incorrecto");
		}

	}

}
