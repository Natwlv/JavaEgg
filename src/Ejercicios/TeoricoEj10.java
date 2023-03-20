package Ejercicios;

import java.util.Scanner;

public class TeoricoEj10 {
	/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
	 */

	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); {

        int[] num = new int[4];

        for (int i = 0; i <= 3; i++) {
            do {
                System.out.println("Ingresa un número entre 1 y 20");
                num[i] = leer.nextInt();
            } while ((num[i] > 20) || (num[i] < 1));
        }
        for (int i = 0; i <= 3; i++) {
        	System.out.print(num[i] + " ");
            for (int j = 0; j < num[i]; j++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
        leer.close();
        }
    }
}
