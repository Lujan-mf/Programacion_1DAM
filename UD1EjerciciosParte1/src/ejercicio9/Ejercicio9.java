package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Introduce tu edad: ");
	       int edad = sc.nextInt();
	     
	       boolean esMayorDeEdad = edad >= 18;
	       System.out.println("¿Es mayor de edad?: " + esMayorDeEdad);
	       sc.close();
	   }

}
