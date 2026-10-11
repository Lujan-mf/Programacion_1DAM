package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce el año actual: ");
	        int añoActual = scanner.nextInt();
	        System.out.print("Año de nacimiento: ");
	        int añoNacimiento = scanner.nextInt();
	        int edad = añoActual -añoNacimiento;
	        System.out.println("Tu edad actual (o la que cumplirás este año) es: " + edad + " años.");
	        scanner.close();
	    }
	
	}

