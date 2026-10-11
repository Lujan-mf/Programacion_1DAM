package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme una cantidad de segundos");
		Integer totalSegundos = sc.nextInt();
		Integer horas = totalSegundos/3600;
		Integer minutos = (totalSegundos%3600)/60;
		Integer segundos = (totalSegundos%3600)%60;
		System.out.println("Horas: "+horas);
		System.out.println("Minutos: "+minutos);
		System.out.println("Segundos: "+segundos);
		sc.close();
		sc.close();
	}
}
