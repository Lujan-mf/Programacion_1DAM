package ejercicio5;

import java.util.Scanner;
/*Determinar el precio de un billete de tren, conociendo la distancia a recorrer, 
 * y sabiendo que si el número de días de estancia es superior a 7 y la distancia 
 * superior a 800 km el billete tiene una reducción del 30%. El precio por kilómetro 
 * es de 2,5€. La distancia a recorrer y el número de días de estancia los debes solicitar 
 * al usuario por teclado.
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la distancia: ");
		Double distancia = sc.nextDouble();
		System.out.println("Introduce los dias de estancia: ");
		Integer dias = sc.nextInt();
		Double kilometroPrecio = 2.5;
		
		Double precioBase = distancia* kilometroPrecio; 
		Double descuento = precioBase*0.30;
		Double precioFinal = precioBase - descuento;
		
		if (distancia>800 && dias>7) {
			System.out.println(precioFinal + "€");
		} else {
			System.out.println(precioBase +"€");
		}
		

	}

}
