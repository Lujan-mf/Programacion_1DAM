package ejercicio03;

import java.util.Scanner;

//Pedir diez números por teclado y mostrar la media.
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intoduce 10 números:");
		Double media= 0.0;
		for (int i=1; i<=10; i++) {
			Integer x = sc.nextInt();
			media +=x;
		}
		media/=10;
		System.out.println("La media es " +media);
		sc.close();
	}

	
}
