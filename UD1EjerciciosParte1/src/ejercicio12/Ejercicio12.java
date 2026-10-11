package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       final double PRECIO_MANZANA = 2.35;
	       final double PRECIO_PERA = 1.95;
	       System.out.print("Introduce los kilos vendidos de manzanas: ");
	       double kilosManzanas = sc.nextDouble();
	       System.out.print("Introduce los kilos vendidos de peras: ");
	       double kilosPeras = sc.nextDouble();
	 
	       double total = (kilosManzanas * PRECIO_MANZANA) + (kilosPeras * PRECIO_PERA);
	       System.out.println("El importe total de las ventas es de : " + total + "€");
	       sc.close();
	   }

}
