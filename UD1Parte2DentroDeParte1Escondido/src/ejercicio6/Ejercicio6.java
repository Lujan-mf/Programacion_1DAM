package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme una distancia en milimetros");
		Double milimetros = sc.nextDouble();
		System.out.println("Deme una distancia en centimetros");
		Double centimetros = sc.nextDouble();
		System.out.println("Deme una distancia en metros");
		Double metros = sc.nextDouble();
		Double suma = milimetros/10+centimetros+metros*100;
		System.out.println("La suma en centimetros es: "+suma);
		sc.close();

	}
}