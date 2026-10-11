package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean algunSuspenso=false;
		for(int i=1;1<=5;i++) {
			System.out.println("Dame la nota: ");
			Integer nota=sc.nextInt();
			if(nota<5) {
				algunSuspenso=false;
				break;
			}
		System.out.println(algunSuspenso);
		sc.close();
			}

		}
	}

