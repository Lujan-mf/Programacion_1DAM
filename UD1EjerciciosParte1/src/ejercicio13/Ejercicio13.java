package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.print("¿Está lloviendo? (true/false): ");
	       boolean llueve = sc.nextBoolean();
	       System.out.print("¿Has finalizado las tareas? (true/false): ");
	       boolean tareasFinalizadas = sc.nextBoolean();
	       System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
	       boolean irBiblioteca = sc.nextBoolean();


	       boolean permisoSalir = (!llueve && tareasFinalizadas) || irBiblioteca;
	       System.out.println("¿Tienes permiso para salir a la calle?: " + permisoSalir);
	       sc.close();
	   }

}
