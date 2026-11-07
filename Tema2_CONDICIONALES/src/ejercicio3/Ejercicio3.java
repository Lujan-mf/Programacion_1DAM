package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer dni = sc.nextInt();
		switch (dni%23) {
		case 0:
			System.out.println("T");
			break;
		case 1:
			System.out.println("R");
			break;
		case 2:
			System.out.println("W");
			break;
		case 3: 
			System.out.println("A");
			break;
		case 4:
			System.out.println("G");
			break;
		case 5:
			System.out.println("M");
			break;
		case 6:
			System.out.println("Y");
			break;
		case 7: 
			System.out.println("F");
			break;
		case 8:
			System.out.println("T");
			break;
		case 9:
			System.out.println("R");
			break;
		case 10:
			System.out.println("W");
			break;
		case 11: 
			System.out.println("A");
			break;
		default:
			System.out.println("Eror");
			break;
		}
	}
}
