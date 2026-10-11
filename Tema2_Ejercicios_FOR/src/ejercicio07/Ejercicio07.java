package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {
//Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero positivo:");
		Integer numero= sc.nextInt();
		Boolean esPrimo= numero>1;
		for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                esPrimo = false; 
            }
        }

	 if (esPrimo) {
	       System.out.println("El número " + numero + " es primo.");
	        } else {
	            System.out.println("El número " + numero + " no es primo.");
	    }	
	 sc.close();
	}

}


