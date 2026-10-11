package ejercicio3;

import java.util.Scanner;
/*Una tienda aplica un descuento fijo del 15% y, posteriormente, 
 * un IVA del 21%. Declara ambos porcentajes como constantes. Pide 
 * el precio inicial al usuario, calcula el precio final y muéstralo 
 * redondeado a dos cifras decimales utilizando Math.round().
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el precio:");
		final Double DESCUENTO = 0.15;
		final Double IVA = 0.21;
		Double precioInicial= sc.nextDouble();
		Double precioConDescuento = precioInicial - (precioInicial*DESCUENTO);
		Double precioFinal = precioConDescuento +(precioConDescuento*IVA);
		Double precioRedondeado = Math.round(precioFinal * 100.0) / 100.0;
		System.out.println("Precio Final: " + precioRedondeado);
		sc.close();
	}
}
