package ejercicio3;
/*Realiza un programa que sume los números desde 
 * el 1 hasta un número N que se introducirá por teclado. 
 * Por ejemplo: Si el usuario introduce un 5, 
 * el programa debe devolver la suma de 1+2+3+4+5.
 */
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce N: ");
		Integer n = sc.nextInt();
		Integer i = 1;
		Integer suma = 0;
		do {
			
			suma += i;
			i++;
		} while (i<=n);
		System.out.println( n +" la suma de un numero hasta N es : "+ suma);
	}

}
