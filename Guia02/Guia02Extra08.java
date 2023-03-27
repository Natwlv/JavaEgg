package Guia02;

import java.util.Scanner;

public class Guia02Extra08 {
	/*
	 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int num;
        int contadorPares = 0;
        int contadorImpares = 0;
        do {
            System.out.println("Ingresa un número");
            num = leer.nextInt();
            if (num % 2 == 0 && num > 0) {
                contadorPares++;
            } else if (num % 2 != 0 && num > 0) {
                contadorImpares++;
            }
        } while (num % 5 != 0);
        System.out.println("Se leyeron " + contadorPares + " números pares");
        System.out.println("Se leyeron " + contadorImpares + " números impares");
        
        
        leer.close();
	}

}
