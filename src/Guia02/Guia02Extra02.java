package Guia02;

import java.util.Scanner;

public class Guia02Extra02 {
	/*
	 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
	 */

	public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
		
		
		
		System.out.println("Ingrese 4 números enteros");
		int a = leer.nextInt();
		int b = leer.nextInt();
		int c = leer.nextInt();
		int d = leer.nextInt();
		
		
		System.out.println("VALORES ORIGINALES");
		System.out.println("=========================");

		
		System.out.println("A=" + a);
		System.out.println("B=" + b);
		System.out.println("C=" + c);
		System.out.println("D=" + d);

		
		int aux = b;
		b = c;
		c = a;
		a = d;
		d = aux;
		
		
		System.out.println("INTERCAMBIO DE VALORES");
		System.out.println("=========================");

		System.out.println("A=" + a);
		System.out.println("B=" + b);
		System.out.println("C=" + c);
		System.out.println("D=" + d);
		
		leer.close();
	}

}
