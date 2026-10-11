package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base del rectángulo : ");
		double base = sc.nextDouble();
		System.out.print("Introduce la altura del rectángulo: ");
	    double altura = sc.nextDouble();
	    double perimetro = 2 * (base + altura);
        double area = base * altura;
        System.out.println("\nResultados:");
        System.out.println("- El perímetro del rectángulo es: " + perimetro);
        System.out.println("- El área del rectángulo es: " + area);
		sc.close();
		
	}
}
