package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el primer valor:");
		int primerValor = scanner.nextInt();
		System.out.print("Introduce el segundo valor:");
		int segundoValor = scanner.nextInt();
		int suma  = primerValor + segundoValor;
		System.out.println("Resultado de la suma: " + suma);
		
		System.out.print("Introduce el primer Numero:");
		int primerNumero = scanner.nextInt();
		System.out.print("Introduce el segundo Numero:");
		int segundoNumero = scanner.nextInt();
		int resta  = primerNumero - segundoNumero;
		System.out.println("Resultado de la resta: " + resta);
		
		System.out.print("Introduce el primer Numero:");
		int primerNum = scanner.nextInt();
		System.out.print("Introduce el segundo Numero:");
		int segundoNum = scanner.nextInt();
		int multiplicar  = primerNum * segundoNum;
		System.out.println("Resultado de la resta: " + multiplicar);
		scanner.close();
	}
}

