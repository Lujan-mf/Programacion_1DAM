package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	    
	       final int IVA = 21;
	       System.out.print("Introduce el precio base del producto: ");
	       double precioBase = sc.nextDouble();
	       double precioFinal = precioBase + (precioBase * IVA / 100.0);
	       System.out.println("El precio final con el " + IVA + "% de IVA es: " + precioFinal + "€");
	       sc.close();
	   }
}
