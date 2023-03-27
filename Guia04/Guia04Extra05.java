package Guia04;
import java.util.Scanner;
public class Guia04Extra05 {
	/*
	 * Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese cantidad de filas de la matriz");
		int n = leer.nextInt();
		System.out.println("Ingrese cantidad de columnas de la matriz");
		int m = leer.nextInt();
		int [][] matriz = new int [n][m];
		
		sumarValores(matriz, n, m);		
		
		leer.close();
	}
	
	public static void sumarValores(int[][] matriz, int n, int m) {
		int suma=0;

		for (int i = 0; i < n; i++) {
			for (int j=0; j<m;j++) {
				matriz[i][j] = (int) (Math.random()*5);
				System.out.print("[" + matriz[i][j]+ "] "); 
				suma+= matriz[i][j];
			}
			System.out.println("");
		}
		
		System.out.println("La suma de los valores de la matriz es " +suma);
	}
}
