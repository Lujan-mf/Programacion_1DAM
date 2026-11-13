package test;

import java.util.List;

import ejercicios.Ejercicios;

public class TestEjercicios {
	
	public static void main(String[] args) {
		System.out.println("\n ----- Ejercicio 1 -----");
		System.out.println(Ejercicios.clasificarTriangulo(3, 4, 5));
		System.out.println(Ejercicios.clasificarTriangulo(5, 5, 5));
		System.out.println(Ejercicios.clasificarTriangulo(5, 5, 8));
		System.out.println(Ejercicios.clasificarTriangulo(4, 6, 9));
		System.out.println(Ejercicios.clasificarTriangulo(2, 2, 4));
		
		
		System.out.println("\n ----- Ejercicio 2 -----");
//		Ejercicios.trianguloAlterno(1);
//		Ejercicios.trianguloAlterno(0);
		Ejercicios.trianguloAlterno(5);
		
		
		System.out.println("\n ----- Ejercicio 3 -----");
		System.out.println(Ejercicios.primeroConDivisores(10, 20, 4));
		System.out.println(Ejercicios.primeroConDivisores(2, 10, 3));
		System.out.println(Ejercicios.primeroConDivisores(13, 13, 2));
		System.out.println(Ejercicios.primeroConDivisores(10, 10, 3));
		
		
		
		System.out.println("\n ----- Ejercicio 4 -----");
		System.out.println(Ejercicios.tribonacci(0));
		System.out.println(Ejercicios.tribonacci(1));
		System.out.println(Ejercicios.tribonacci(2));
		System.out.println(Ejercicios.tribonacci(3));
		System.out.println(Ejercicios.tribonacci(5));
		System.out.println(Ejercicios.tribonacci(7));
		
		
		System.out.println("\n ----- Ejercicio 5 -----");
		System.out.println(Ejercicios.esCasiCreciente(List.of(2, 4, 6, 8)));
		System.out.println(Ejercicios.esCasiCreciente(List.of(2, 5, 3, 7, 9)));
		System.out.println(Ejercicios.esCasiCreciente(List.of(2, 5, 3, 7, 4)));
		System.out.println(Ejercicios.esCasiCreciente(List.of(1,3, 3, 5)));
		
		System.out.println(Ejercicios.esCasiCreciente(List.of(2, 4, 6, 8, 10)));
		System.out.println(Ejercicios.esCasiCreciente(List.of(9, 9, 6, 7)));
		
		
		System.out.println("\n ----- Ejercicio 6 -----");
		
		
		System.out.println("\n ----- Exercise 7 -----");
	}
	
}
