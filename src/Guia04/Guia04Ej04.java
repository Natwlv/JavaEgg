package Guia04;

import java.util.Scanner;

public class Guia04Ej04 {
	/*
	 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		
		int matriz1 [][] = new int [4][4];
		int matriz2 [][] = new int [4][4];
		
		
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				matriz1[i][j] = (int) (Math.random() * 10);
			}
		}
		System.out.println("");
		System.out.println("MATRIZ:");
		System.out.println("====================");
		System.out.println("");


		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.print("[" + matriz1[i][j] + "] ");
			}
			System.out.println("");
		}
		
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				matriz2[j][i] = matriz1[i][j];
			}
		}
		System.out.println("");
		System.out.println("MATRIZ TRASPUESTA:");
		System.out.println("====================");
		System.out.println("");



		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.print("[" + matriz1[j][i] + "] ");
			}
			System.out.println("");
		}
		

		leer.close();

	}

}
