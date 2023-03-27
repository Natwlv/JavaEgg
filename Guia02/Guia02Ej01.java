package Guia02;

import java.util.Scanner;

public class Guia02Ej01 {
	/*
	 * Crear un programa que dado un numero determine si es par o impar
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		int num = leer.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El número " + num + " es par");
		} else {
			System.out.println("El número " + num + " es impar");
		}
		
		
		leer.close();
	}

}
