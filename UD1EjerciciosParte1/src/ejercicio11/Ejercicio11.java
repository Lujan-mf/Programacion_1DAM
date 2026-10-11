package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);


	       final double VALOR_EURO_EN_PESETAS = 166.0;
	       System.out.print("Introduce la cantidad en pesetas: ");
	       double pesetas = sc.nextDouble();
	     
	       double euros = pesetas / VALOR_EURO_EN_PESETAS;
	       System.out.println(pesetas + " pesetas equivalen a " + euros + " euros.");
	       sc.close();
	   }

}
