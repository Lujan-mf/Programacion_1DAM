package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme la longitud del lanzamiento en metros");
		Double metros = sc.nextDouble();
		Integer centimetros = (int)(metros*100);
		System.out.println("La longitud para el ranking es: "+centimetros+" centimetros");
		sc.close();
	}

}
