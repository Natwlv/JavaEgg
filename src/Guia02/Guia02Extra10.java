package Guia02;

import java.util.Scanner;

public class Guia02Extra10 {
	/*
	 * Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		
		int num1 = (int) (Math.random()*5+1);
		int num2 = (int) (Math.random()*2+1);
		int multiplicacion = num1 * num2;
		
		
		System.out.println(num1 + " x " + num2 + " = " + multiplicacion);
		
		System.out.println("Adivine el resultado de la multiplicación");
		int numResultado = leer.nextInt();
		

		
		while (numResultado != multiplicacion) {
				System.out.println("Su respuesta es incorrecta");
				System.out.println("Vuelva a adivinar el resultado de la multiplicación");
				numResultado = leer.nextInt();

			}
		if (numResultado == multiplicacion) {
			System.out.println("Su respuesta es correcta");
			System.out.println(num1 + " x " + num2 + " = " + multiplicacion);

			
		} 
		
				
		
		leer.close();
		
	}

}
