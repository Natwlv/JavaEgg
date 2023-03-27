package Guia01;

import java.util.Scanner;

public class Guia01Ej02 {
	/*
	 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.print("NOMBRE:");
		String nombre = leer.next();

		System.out.print("APELLIDO:");
		String apellido = leer.next();

		System.out.println("");

		System.out.println("Nombre completo: " + nombre + " " + apellido);
		
		
		leer.close();
		

		
		
		
	}

}
