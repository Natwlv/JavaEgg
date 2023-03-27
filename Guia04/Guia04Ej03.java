package Guia04;

import java.util.Scanner;

public class Guia04Ej03 {
	/*
	 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		System.out.println("Ingrese una dimensión del vector");
		int dimension = leer.nextInt();
		int[] vector = new int [dimension];
		
		llenarVector(vector, dimension);
		mostrarVector(vector);
		contarDigitos(vector, dimension); 

		leer.close();
	}
	
	public static void llenarVector(int [] vector, int dimension) {
		for (int i = 0; i < dimension;i++){
			vector[i]= (int) (Math.random() * 100000) ;
		}
		
	}
	public static void mostrarVector(int [] vector) {
		for (int elemento : vector) {
			System.out.println("[" + elemento + "] ");
		}
		
	}
	public static void contarDigitos(int [] vector, int dimension) {
		int digito1 = 0;
		int digito2 = 0;
		int digito3 = 0;
		int digito4 = 0;
		int digito5 = 0;
		
		
		for (int i = 0; i < (dimension);i++){
			if (vector[i] >0 && vector[i] <10) {
				digito1++;
			} else if  (vector[i] >10 && vector[i] <100) {
				digito2++;
			} else if (vector[i] >100 && vector[i] <1000) {
				digito3++;
			} else if (vector[i] >1000 && vector[i] <10000) {
				digito4++;
			} else if (vector[i] >10000 && vector[i] <100000) {
				digito5++;
			}
		}
		
		
		System.out.println("Hay " + digito1 + " números de 1 dígito");
		System.out.println("Hay " + digito2 + " números de 2 dígitos");
		System.out.println("Hay " + digito3 + " números de 3 dígitos");
		System.out.println("Hay " + digito4 + " números de 4 dígitos");
		System.out.println("Hay " + digito5 + " números de 5 dígitos");
		
	}

}
