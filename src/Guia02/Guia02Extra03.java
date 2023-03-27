package Guia02;

import java.util.Scanner;

public class Guia02Extra03 {
	/*
	 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese una letra del alfabeto");
		String letra = leer.next();

		if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {

			System.out.println("La letra ingresada es una vocal");

		} else {
			System.out.println("La letra ingresada es una consonante");

		}

		leer.close();
	}

}
