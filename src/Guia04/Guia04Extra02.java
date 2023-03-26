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
		
		
		llenarVector(vectorA, n);
		llenarVector(vectorB, n);

		System.out.println("");
		System.out.println("vector A");
		mostrarVector(vectorA);
		
		System.out.println("");
		System.out.println("vector B");
		mostrarVector(vectorB);

		System.out.println("");

		sonIguales(vectorA, vectorB, n);
		leer.close();
		
	}	
	
	public static void llenarVector(int[] vector, int dimension) {
		for (int i=0; i<dimension;i++) {
			vector [i] = (int) (Math.random()*5);
		}
	}
	public static void mostrarVector(int[] vector) {
		for (int muestra: vector) {
			System.out.print("[" + muestra + "] ");
		}
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
