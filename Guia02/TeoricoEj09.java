package Guia02;

import java.util.Scanner;

public class TeoricoEj09 {
	/*
	 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int num;
		int contador = 0;
		int suma = 0;
		
		
		
		do {
			System.out.println("Ingrese un número");
			num = leer.nextInt();
			
			if (num ==0) {
				System.out.println("Se capturó el número cero");
				break;
			} else if (num > 0){
				contador ++;
				suma += num;
			}
			
		} while (contador < 20);
		
		System.out.println("La suma de los números ingresados es de " + suma);
		
		
		leer.close();
	}

}
