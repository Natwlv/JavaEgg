package Guia02;

import java.util.Scanner;

public class Guia02Ej08 {
	/*
	 * . Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
	 */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int num = leer.nextInt();
        
        
        
        for (int i = 0; i < num; i++) {
        	
            for (int j = 0; j < num; j++) {
            	
                if (i == 0 || j == 0 || j == num - 1 || i == num - 1) {
                	
                    System.out.print(" *");
                    
                } else {
                	
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
        leer.close();
    }
}

