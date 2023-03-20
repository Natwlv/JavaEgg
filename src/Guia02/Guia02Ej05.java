package Guia02;

import java.util.Scanner;

public class Guia02Ej05 {

	/*
	 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
	 */

		public static void main(String[] args) {
			Scanner leer = new Scanner (System.in);
			
			int valorLimite = 30;
			int num;	
			
			System.out.println("Ingrese un número");
			
			 num = leer.nextInt();
			 
			 
			while (num < valorLimite) {
				
				System.out.println("Ingrese un número");
				
				 int num1 = leer.nextInt();
				 
				 num= num + num1;
				 			
			}
			System.out.println("la suma de los números ingresados " + num + " superó al valor límite de " + valorLimite);

			
			leer.close();	
	}

}
