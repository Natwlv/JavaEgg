package Guia01;

import java.util.Scanner;

public class Guia01Ej05 {
	/*
	 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese un número entero: ");
		int num = leer.nextInt();

		int doble = num * 2;
		int triple = num * 3;
		double raizCuadrada = Math.sqrt(num);
		
		
		System.out.println("DOBLE: " + doble);
		System.out.println("TRIPLE: " + triple);
		System.out.println("RAÍZ CUADRADA: " + raizCuadrada);

		
		leer.close();
	}

}
