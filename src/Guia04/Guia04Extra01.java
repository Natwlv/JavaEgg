package Guia04;
import java.util.Scanner;
public class Guia04Extra01 {
	/*
	 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese tamaño del vector");
		int dimension = leer.nextInt();
		int [] vector = new int [dimension];
		int suma =0;
		
		for (int i=0; i<dimension; i++) {
			System.out.println("Ingrese valores para el vector en el subíndice " +i);
			vector[i] = leer.nextInt();
			suma+=vector[i];
		}
		
		for (int i=0; i<dimension; i++) {
			System.out.print("["+vector[i]+"] ");
		}
		System.out.println("");
		
		System.out.println("La suma de todos las valores del vector es " +suma);
		
		leer.close();

	}

}
