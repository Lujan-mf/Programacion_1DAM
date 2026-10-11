package ejercicio02;

import java.util.Scanner;

/*Realiza un programa que cuente los múltiplos de 3 desde 
 * el 1 hasta un número que introducimos por teclado.
 */
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		Integer contar = 0;
		for (int i=1; i<=num; i++){
			if(i%3==0) {
				contar++;
			}
		System.out.println("Entre 1 y " + num+ " hay "+ contar+ " multiple de 3");
	sc.close();
		}

	}
}
