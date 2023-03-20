package Guia04;

import java.util.Scanner;

public class Guia04Ej02 {

	/*
	 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
	 */
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese tamaño de vector");
		int dimension = leer.nextInt();
		
		int[] vector = new int [dimension];
		
		
		
		for (int i = 0; i <= dimension-1; i++) {
			vector[i]= (int) (Math.random() * 10) ;

		}
		System.out.println("");
		System.out.println("Ingrese número a buscar en el vector");
		int numBuscado = leer.nextInt();
		int contador = 0;
		
		for (int i = 0; i <= dimension-1; i++) {
			if (numBuscado == vector[i]) {
				contador++;
				System.out.println("El número " + numBuscado + " se encontró en el subíndice " + i);
			

			}
			
		}
		System.out.println("=======================================");

		System.out.println("El número " + numBuscado + " se encontró " + contador + " veces");
		
		System.out.println("=======================================");

		
		
		leer.close();
	}

}
