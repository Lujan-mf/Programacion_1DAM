package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Nota del 1º trimestre : ");
	       int t1 = sc.nextInt();
	       System.out.print("Nota del 2º trimestre : ");
	       int t2 = sc.nextInt();
	       System.out.print("Nota del 3º trimestre : ");
	       int t3 = sc.nextInt();
	       double mediaExpediente = (t1 + t2 + t3) / 3.0;
	       int mediaBoletin = (int) mediaExpediente;
	       System.out.println("Nota media en el boletín: " + mediaBoletin);
	       System.out.println("Nota media en el expediente: " + mediaExpediente);
	       sc.close();
	   }

}
