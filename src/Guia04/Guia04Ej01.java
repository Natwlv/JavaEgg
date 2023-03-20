package Guia04;

import java.util.Scanner;

public class Guia04Ej01 {
	/*
	 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int[] vector = new int [100];
		
		
		
		for (int i = 0; i <= 99; i++) {
			vector[i]=i;

		}
		System.out.println("");
		System.out.println("MUESTRA VECTOR DESCENDENTE");
		System.out.println("=============================");
		System.out.println("");

		
		for (int i=99; i>=0; i--) {
			System.out.print("[" + (vector[i]+1) + "] ");
			
		}
		
		
		
		leer.close();
	}

}
