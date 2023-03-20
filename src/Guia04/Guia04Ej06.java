package Guia04;

import java.util.Scanner;

public class Guia04Ej06 {
	/*
	 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int [][] matriz = new int [3][3];
		boolean magica = false;
		int sumaDiagonalPrincipal = 0;
		int sumaDiagonalSecundaria = 0;
		int [] vectorFilas = new int [3];

		
		System.out.println("Ingrese valores del 1 al 9 para llenar la matriz");
		for (int i=0; i<=2;i++) {
			for (int j=0;j<=2;j++) {
				
				do {
					matriz [i][j] = leer.nextInt();
					
					if (matriz[i][j] > 9 || matriz[i][j] < 1) {
						System.out.println("numero inválido, vuelva a ingresar otro valor del 1 al 9");
					}
				} while (matriz[i][j] > 9 || matriz[i][j] < 1);
				
			}
		}
		System.out.println("");

		System.out.println("MATRIZ");
		System.out.println("============");

		for (int i=0; i<=2;i++) {
			for (int j=0;j<=2;j++) {
				System.out.print("[" +  matriz [i][j]+ "] ");
			}
			System.out.println("");

		}

		for (int i=0; i<=2; i++) {
			vectorFilas[i] = 0;
			
			for (int j=0; j<=2;j++) {
				vectorFilas[i] = vectorFilas[i] + matriz[i][j]; 
				if (i == j) {
					sumaDiagonalPrincipal = sumaDiagonalPrincipal + matriz[i][j];
					
				} 
				
				if ((i+j==2)) {
					sumaDiagonalSecundaria = sumaDiagonalSecundaria + matriz[i][j];
				}
				if (vectorFilas[i]==15 && sumaDiagonalPrincipal==15 && sumaDiagonalSecundaria==15) {
					magica = true;
					
				} else {
					magica = false;
					
				}

			}
		}
		
		System.out.println("");

		for (int i=0; i<=2;i++) {
			System.out.println("La suna de la fila " + i + " es " + vectorFilas[i]);
		}
		
		System.out.println("La suna de la diagonal principal es " + sumaDiagonalPrincipal);
		System.out.println("La suna de la diagonal secundaria es " + sumaDiagonalSecundaria);
		System.out.println("Matriz mágica: " + magica);

		
		
		leer.close();
			
				
	}

}
