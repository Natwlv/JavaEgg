package Guia02;

import java.util.Scanner;

public class Guia02Ej06 {
	/*
	 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		
		int num;
		int num2;
		
		System.out.println("Ingrese 2 números positivos");
		
		 num = leer.nextInt();
		 num2 = leer.nextInt();
		 
		 
		while (num < 0 || num2 < 0) {
			
			System.out.println("El número debe ser positivo. Ingrese nuevamente 2 números positivos");
			 num = leer.nextInt();
			 num2 = leer.nextInt();
	 	}
		
		int opcion;
		int suma = 0;
		int resta = 0;
		int multiplicar = 1;
		double dividir = 0;
		String salir;
		boolean bucle = true;
		
		
		do {
			System.out.println("");
			System.out.println("---------------");
			System.out.println("MENÚ");
			System.out.println("---------------");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Salir");
			System.out.println("");
			System.out.println("Elija una opción");
			opcion = leer.nextInt();
			
				
		switch (opcion) {
		case 1:
			suma = num + num2;
			System.out.println(num + " + " + num2 + " = " + suma);
			break;
		case 2:
			resta = num - num2;
			System.out.println(num + " - " + num2 + " = " + resta);
			break;
		case 3:
			multiplicar = num * num2;
			System.out.println(num + " * " + num2 + " = " + multiplicar);
			break;
		case 4:
			dividir = num / num2;
			System.out.println(num + " / " + num2 + " = " + dividir);
			break;
		case 5:
			System.out.println("¿Está seguro que desea salir del programa (S/N)?");
			salir = leer.next();
			
			if (salir.equalsIgnoreCase("S")) {
				System.out.println("HA SALIDO DEL SISTEMA");
				bucle = false;
			} 
			break;
		}
		
		
		
		} while (bucle);
		
		
		
		
		leer.close();	
	}

}
