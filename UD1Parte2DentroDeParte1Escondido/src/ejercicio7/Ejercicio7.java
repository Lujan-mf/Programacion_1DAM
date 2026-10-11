package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de entradas infantiles: ");
		Integer infantiles = sc.nextInt();
		System.out.println("Numero de entradas de adultos: ");
		Integer adultos = sc.nextInt();
		Double importe = infantiles*15.50+adultos*20.0;
		Double total = importe >= 100 ? importe*0.95 : importe;
		System.out.println("El importe a pagar es: "+total+"€");
		sc.close();
	}

}
