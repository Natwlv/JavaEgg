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
		
		llenarVector(vector, dimension, leer);
		mostrarVector(vector);		
		
		leer.close();	
	}
	
	public static void llenarVector(int[] vector, int dimension,  Scanner leer) {
		int suma =0;
		for (int i=0; i<dimension; i++) {
			System.out.println("Ingrese valores para el vector en el subíndice " +i);
			vector[i] = leer.nextInt();
			suma+=vector[i];
		}		
		System.out.println("La suma de todos las valores del vector es " +suma);
		
		
	}
	public static void mostrarVector(int[] vector) {
		for (int recorrido : vector) {
			System.out.print("["+recorrido+"] ");
		}
		
		System.out.println("");
	}
	
}
