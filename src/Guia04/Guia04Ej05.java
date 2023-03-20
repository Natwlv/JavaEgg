package Guia04;

import java.util.Scanner;

public class Guia04Ej05 {
	/*
	 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese dimensión de matriz");
		int dimension = leer.nextInt();
		int [][] matriz1 = new int[dimension][dimension];
		int [][] matriz2 = new int[dimension][dimension];

		for (int i = 0; i<=(matriz1.length-1);i++) {
			for (int j=0; j<=(matriz1.length-1);j++) {
				matriz1[i][j] = (int) (Math.random() *(10-(-10)+1)+(-10));
			}
		}
		System.out.println("");
		System.out.println("MATRIZ 1:");
		System.out.println("====================");
		System.out.println("");

		
		for (int i = 0; i<=(matriz1.length-1);i++) {
			for (int j=0; j<=(matriz1.length-1);j++) {
				System.out.print("[" + matriz1[i][j] + "] ");
			}
			System.out.println("");

		}
		for (int i = 0; i<=(matriz2.length-1);i++) {
			for (int j=0; j<=(matriz2.length-1);j++) {
				matriz2[j][i] = -(matriz1[i][j]);
			}
		}
		System.out.println("");
		System.out.println("MATRIZ 1:");
		System.out.println("====================");
		System.out.println("");
		
		for (int i = 0; i<=(matriz2.length-1);i++) {
			for (int j=0; j<=(matriz2.length-1);j++) {
				System.out.print("[" + matriz2[i][j] + "] ");
			}
			System.out.println("");

		}
		 boolean antiSimetrica = false;
	        for (int i = 0; i < matriz2.length; i++) {
	            for (int j = 0; j < matriz2.length; j++) {
	                if (matriz1[i][j] == -(matriz2[j][i])) {
	                    antiSimetrica = true;
	                } else {
	                    antiSimetrica = false;
	                    System.out.println();
	                    System.out.println("La matriz no es antisimétrica");
	                    break;
	                }
	            }
	            if (!antiSimetrica) {
	                break;
	            }
	        }
	        if (antiSimetrica) {
	            System.out.println();
	            System.out.println("La matriz es antisimétrica");
	        }

		leer.close();
	}
	

	}

