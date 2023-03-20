package Guia04;

import java.util.Scanner;
public class Guia04Extra02 {
	/*
	 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese dimensión de los vectores");
		int n = leer.nextInt();
		int [] vectorA = new int[n];
		int [] vectorB = new int [n];
		
		
		for (int i=0; i<n;i++) {
			vectorA [i] = (int) (Math.random()*5);
			vectorB [i] = (int) (Math.random()*5);
			System.out.print("[" + vectorA[i] + "] ");
			System.out.print("[" + vectorB[i] + "] ");

		}
		sonIguales( vectorA, vectorB, n);
		leer.close();
		
	}

	public static boolean sonIguales(int[] vectorA, int[] vectorB, int n) {
		for (int i =0; i < n; i++) {
			if (vectorA[i] != vectorB[i]) {
				System.out.println("Los vectores son distintos");
				return false;
			}
		}
		System.out.println("Los vectores son iguales");

		return true;
	}
}
