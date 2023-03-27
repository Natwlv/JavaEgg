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
		//declaro e inicializo las matrices
		int matrizA [][] = new int [4][4];
		int matrizB [][] = new int [4][4];		
		
		llenarMatriz(matrizA);
		mostrarMatriz(matrizA);
		matrizTraspuesta(matrizA, matrizB);
		mostrarTraspuesta(matrizA); 
		
		leer.close();

	}
	
	public static void llenarMatriz(int[][] matriz) {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				matriz[i][j] = (int) (Math.random() * 10);
			}
		}
		
	}
	public static void mostrarMatriz(int [][] matriz) {
		System.out.println("");
		System.out.println("MATRIZ A:");
		System.out.println("====================");
		System.out.println("");

		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("[" + matriz[i][j] + "] ");
			}
			System.out.println("");
		}
		
	}
	public static void matrizTraspuesta(int [][] matriz, int [][] matriz2) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz2[j][i] = matriz[i][j];
			}
		}
		
	}
	public static void mostrarTraspuesta(int [][] matriz) {
		System.out.println("");
		System.out.println("MATRIZ TRASPUESTA:");
		System.out.println("====================");
		System.out.println("");



		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("[" + matriz[j][i] + "] ");
			}
			System.out.println("");
		}
		
	}

}
