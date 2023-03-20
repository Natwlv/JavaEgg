package Guia01;

import java.util.Scanner;

public class Guia01Ej04 {
	/*
	 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese grados centígrados: ");
		int grados = leer.nextInt();
		int fahrenheit = 32 + (9 * grados / 5);
		
		System.out.println("FAHRENHEIT: " + fahrenheit);

		
		leer.close();
	}

}
