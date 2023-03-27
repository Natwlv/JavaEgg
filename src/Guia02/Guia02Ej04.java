package Guia02;

import java.util.Scanner;

public class Guia02Ej04 {
	/*
	 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		
		
		System.out.println("Ingrese una frase");
		String frase = leer.next();
		
		String vocalA = frase.substring(0,1);

		
		
		if (vocalA.equalsIgnoreCase("A") ) {
			System.out.println("CORRECTO");

		}  else {
			System.out.println("INCORRECTO");

		}
		leer.close();

	}

}
