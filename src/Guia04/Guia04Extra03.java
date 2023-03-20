package Guia04;
import java.util.Scanner;
public class Guia04Extra03 {
	/*
	 * Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese dimensión del vector");
		int n = leer.nextInt();
		int[] vector = new int [n];
		llenarVector(vector,n);
		imprimirVector(vector,n);
		
		leer.close();
	}
	public static void llenarVector(int [] vector, int n) {
		for (int i=0; i<n;i++) {
			vector[i] = (int) (Math.random()*5);
		}
	}
	
	public static void imprimirVector(int [] vector, int n){
		for (int i=0; i<n; i++) {
			System.out.print("[" + vector[i]+ "] ");

		}
	}

}
