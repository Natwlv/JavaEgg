package Extras;

import java.util.Random;
import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		 Scanner leer = new Scanner(System.in);
	        String[][] matrizPalabras = new String[10][10];
	        String palabra2;
	        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	        int longitudPalabra = 5;
	        String[] palabraVector = new String[5];
	        int cantidadPalabras = 0;
	        char caracter; 
	        Random azar = new Random();
	        
	        for (int i = 0; i < matrizPalabras.length; i++) {
	           int columnaRandom = (int) (Math.random() * 10) * 2;
	            for (int j = 0; j < matrizPalabras.length; j++) {
	                if (j == columnaRandom && cantidadPalabras < 5 && j < 5) {
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