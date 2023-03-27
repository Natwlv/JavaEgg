package Guia03;

import java.util.Scanner;

public class TeoricoEj12 {
	/*
	Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
	que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
	segundo, sino informe que no lo son.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese 2 números");
		int num = leer.nextInt();
		int num2 = leer.nextInt();
		
		EsMultiplo (num, num2);
		
		leer.close();
	}
	
	
	
	public static void EsMultiplo (int num, int num2) { 
		if (num % num2 == 0) {
			System.out.println("El "+ num + " es múltiplo de " + num2);
		} else {
			System.out.println("El primer numero NO es múltiplo del segundo");
		}
	}

}
