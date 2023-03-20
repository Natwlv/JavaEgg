package Guia02;

import java.util.Scanner;

public class Guia02Extra11 {
	/*
	 * Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
	 */

	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número que desea saber la cantidad de dígitos");
        int num = leer.nextInt();
        System.out.println("El número tiene " + digitos(num) + " dígitos");
        
        leer.close();
    }

    public static int digitos(int num) {
        int digitos = 0;
        while (num > 0) {
            num /= 10;
            digitos++;
        }
        return digitos;
    }
}