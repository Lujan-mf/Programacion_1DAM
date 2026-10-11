package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
/*Una empresa guarda productos en cajas con una capacidad 
 * determinada. Pide al usuario el número de productos y la 
 * capacidad de cada caja. Calcula cuántas cajas son necesarias 
 * para guardar todos los productos utilizando Math.ceil(). El resultado 
 * final debe mostrarse como un número entero.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Número de productos: ");
		Integer productos= sc.nextInt();
		System.out.println("Introduce la capacidad de las cajas: ");
		Integer capacidadCajas = sc.nextInt();
		Integer cajasNecesarias = (int) Math.ceil(productos.doubleValue()/capacidadCajas);
		System.out.println("El número de cajas necesarias es de: " + cajasNecesarias);
		
		sc.close();

	}

}
