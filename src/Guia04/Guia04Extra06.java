package Guia04;

import java.util.Random;
import java.util.Scanner;

public class Guia04Extra06 {
	/*
	 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
	 */

	public static void main(String[] args) {
		 Scanner leer = new Scanner(System.in);
	        String[][] matrizPalabras = new String[20][20];
	        String palabra2;
	        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	        int longitudPalabra = 5;
	        String[] palabraVector = new String[5];
	        int cantidadPalabras = 0;
	        char caracter; 
	        Random azar = new Random();
	        
	        for (int i = 0; i < matrizPalabras.length; i++) {
	           int filaRandom = (int) (Math.random() * 10) * 2;
	            for (int j = 0; j < matrizPalabras.length; j++) {
	                if (j == filaRandom && cantidadPalabras < 5 && j < 15) {
	                    do {
	                        System.out.println("Ingresa la palabra " + (cantidadPalabras + 1) + " entre 3 y 5 caracteres");
	                        palabra2 = leer.next().toUpperCase();
	                        for (int k = 0; k < longitudPalabra; k++) {
	                            if (k <= palabra2.length() - 1) {
	                                palabraVector[k] = palabra2.substring(k, k + 1);
	                            } else {
	                            	caracter = letras.charAt(azar.nextInt(letras.length()));
	                                palabraVector[k] = String.valueOf(caracter);
	                            }
	                        }
	                    } while ((palabra2.length() > 5) || (palabra2.length() < 3));
	                    for (int k = 0; k < palabraVector.length; k++) {
	                        if (k == 0) {
	                            j -= 1;
	                        }
	                        j++;
	                        matrizPalabras[i][j] = palabraVector[k];
	                    }
	                    cantidadPalabras++;
	                } else {
	                	caracter = letras.charAt(azar.nextInt(letras.length()));
	                    matrizPalabras[i][j] = String.valueOf(caracter);
	                }
	            }
	        }
	        for (String[] palabra : matrizPalabras) {
	            for (int j = 0; j < matrizPalabras.length; j++) {
	                System.out.print(palabra[j] + " ");
	            }
	            System.out.println();
	        }
	        leer.close();
	    }
	}