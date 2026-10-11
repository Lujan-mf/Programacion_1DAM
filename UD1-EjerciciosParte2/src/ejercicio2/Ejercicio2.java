package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad entera de segundos: ");
		Integer segundosTotales = sc.nextInt();
		Integer horas = segundosTotales /3600;
		Integer minutos = (segundosTotales % 3600) / 60;
		Integer segundosRestantes = segundosTotales % 60; 
		System.out.println("Resultado : ");
		System.out.println(horas + "horas" + minutos + "minutos" + segundosRestantes + "segundos");
		sc.close();
	}

}
