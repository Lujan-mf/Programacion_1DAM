package ejercicio6;

import java.util.Scanner;

/*Pedir al usuario el número de un mes y el año 
 * (comprobando si es o no bisiesto). 
 * Debe imprimir por pantalla el número de días que tiene el mes.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de un mes: ");
		Integer mes = sc.nextInt();
		System.out.println("Introduce una año: ");
		Integer anyo = sc.nextInt();
		
		Boolean esBisiesto =(anyo % 4 == 0 && anyo % 100 != 0 ) || (anyo % 400 == 0) ;
		
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			System.out.println("El mes "+mes + " tiene 31 dias");
		}else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println("El mes "+ mes + " tiene 30 dias");
		}else if (mes == 2) {
			if (esBisiesto) {
				System.out.println("el mes 2 tiene 29 dias por lo que el "+anyo +" es bisiesto");
			} else {
				System.out.println("El mes 2 tiene 28 deas por lo que el "+anyo+ " no es bisiesto");
			}
		}else {
			System.out.println("Introduce un mes valido del 1 al 12");
		}
	}

}
