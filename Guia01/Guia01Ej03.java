package Guia01;

import java.util.Scanner;

public class Guia01Ej03 {
	/*
	 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
	 */

	public static void main(String[] args) {
	Scanner leer = new Scanner(System.in).useDelimiter("\n");
		
		System.out.print("Ingrese una frase:");
		String frase = leer.nextLine();
		/*para más de una palabra usar nextLine porque si se usa next solo aplica a la primer palabra
		 * 
		 */

		System.out.println("MAYÚSCULAS: " + frase.toUpperCase());
		System.out.println("minúsculas: " + frase.toLowerCase());

		
		leer.close();
	}

}
