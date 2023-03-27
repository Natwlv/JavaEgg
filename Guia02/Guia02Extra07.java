package Guia02;

import java.util.Scanner;

public class Guia02Extra07 {
	/*
	 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Cantidad de números a calcular");
		int nNum = leer.nextInt();
		int contador = 0;
		int suma = 0;
		int numMax = 0;
		int numMin = 100;
		
		while (nNum>contador) {
			System.out.println("Ingrese valores");
			int num = leer.nextInt();
			contador ++;
			suma = suma + num;
			if (num > numMax) {
				numMax = num;
			}
			if (num < numMin) {
				numMin = num;
			}
			


		}
		System.out.println("El número máximo es " + numMax);
		System.out.println("El número mínimo es " + numMin);
		System.out.println("El promedio de los número ingresados es " + (suma / contador));

		
		
		 do {
			System.out.println("Ingrese valores");
			int num = leer.nextInt();
			contador ++;
			suma = suma + num;
			if (num > numMax) {
				numMax = num;
			}
			if (num < numMin) {
				numMin = num;
			}
			


		} while (nNum>contador);
		System.out.println("El número máximo es " + numMax);
		System.out.println("El número mínimo es " + numMin);
		System.out.println("El promedio de los número ingresados es " + (suma / contador));

		
		
		
		leer.close();
	}

}
