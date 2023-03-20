package Ejercicios;

import java.util.Scanner;

public class TeoricoEj06 {
/*
 * Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese 2 números enteros");
		int num1 = leer.nextInt();
		int num2 = leer.nextInt();
		
		
		if (num1 > 25 && num2 > 25) {
			System.out.println("Los números ingresados " + num1 + " y " + num2 + " son mayores a 25");
			
		} else if  (num2 > 25) {
			System.out.println("El número ingresado " + num2 + " es mayor a 25");
			
		} else if (num1 > 25) {
			System.out.println("El número ingresado " + num1 + " es mayor a 25");
			
		} else {
			System.out.println("Los números ingresados " + num1 + " y " + num2 + " son menores a 25");
		}
		leer.close();
	}

}
