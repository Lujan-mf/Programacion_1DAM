package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
/*Pide al usuario su edad y utiliza el operador 
 * ternario para calcular el precio de una entrada: 
 * 6,50 € si es menor de 18 años y 9,50 € en caso 
 * contrario. Muestra el precio correspondiente.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la edad:  ");
		Integer edad = sc.nextInt();
		Double precioEntrada = (edad<18) ? 6.50:9.50;
		System.out.println("El presio de la entrada es de: " + precioEntrada +"€");
		sc.close();
	}

}
