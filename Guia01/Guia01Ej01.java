package Guia01;

import java.util.Scanner;

public class Guia01Ej01 {
	/*
	 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
	dos. El programa deberá después mostrar el resultado de la suma
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese 2 números enteros");
		int num1 = leer.nextInt();
		int num2 = leer.nextInt();
		int suma = num1 + num2;
		
		
		System.out.println(num1 + " + " + num2 + " = " + suma);
		
		
		leer.close();
		

	}

}
