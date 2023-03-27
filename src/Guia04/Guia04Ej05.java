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
		int [][] matrizA = new int[dimension][dimension];
		int [][] matrizB = new int[dimension][dimension]; 
		
		
		llenarMatriz(matrizA);
		System.out.println("");
		System.out.println("MATRIZ: A");
		System.out.println("====================");
		mostrarMatriz(matrizA);
		convertirMatriz(matrizB, matrizA);
		System.out.println("");
		System.out.println("MATRIZ AT:");
		System.out.println("====================");
		mostrarMatriz(matrizB);
		boolean resultado = matrizAsi(matrizB, matrizA);
        System.out.println("La matriz es antisimétrica: " + resultado);

		leer.close();
	}
	
	
	public static void llenarMatriz(int [][] matrizA) {
				for (int i = 0; i<(matrizA.length);i++) {
					for (int j=0; j<(matrizA.length);j++) {
						matrizA[i][j] = (int) (Math.random() *(10-(-10)+1)+(-10));
					}
				}
		
		
	}
	public static void mostrarMatriz(int [][] matrizA) {
		
		System.out.println("");

		//muestro matriz A
		for (int i = 0; i<(matrizA.length);i++) {
			for (int j=0; j<(matrizA.length);j++) {
				System.out.print("[" + matrizA[i][j] + "] ");
			}
			System.out.println("");

		}
		
		
	}
	public static void convertirMatriz(int [][] matrizB, int [][] matrizA) {
		//convierto la matriz A en matriz AT (traspuesta y asimétrica)
				for (int i = 0; i<(matrizB.length);i++) {
					for (int j=0; j<(matrizB.length);j++) {
						matrizB[j][i] = -(matrizA[i][j]);
					}
				}
	
	
	}
	
	/*
	public static void comprobarMatriz(int [][] matrizB, int [][] matrizA) {
		boolean antiSimetrica = false;
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                if (matrizA[i][j] == -(matrizB[j][i])) {
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
	
	}
	*/
	public static boolean matrizAsi(int [][] matrizB, int [][] matrizA) {
		boolean antiSimetrica = false;
		for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                if (matrizA[i][j] == -(matrizB[j][i])) {
                    antiSimetrica = true;
                } else {
                    antiSimetrica = false;
                  break;
                }
            }
            if (!antiSimetrica) {
                break;
            }
        }
        
		return antiSimetrica;
	}
}

