package ejercicio4;
/*Realiza un programa que muestre la tabla de 
 * multiplicar de un número introducido por teclado. 
 * Por ejemplo, si se introduce el número 3 se debe imprimir lo siguiente:
 
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30
*/
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		Integer num = sc.nextInt();
		
		Integer i = 1;
		
		do {
			Integer resultado = num*i;
			System.out.println(num + " x " + i + " = " + resultado);
			i++;
		} while (i<=10);
	}

}
