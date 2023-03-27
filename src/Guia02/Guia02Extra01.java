package Guia02;

import java.util.Scanner;

public class Guia02Extra01 {
	/*
	 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
	 */
	

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
				
		System.out.println("Ingrese cantidad de minutos a convertir:");
		int minutos = leer.nextInt();
		int horas = minutos / 60;
		int dias = 0;
		
		
		if (horas > 24 && horas <48) {
			dias = 1;
			horas = horas - 24;
		}
		
		if (horas > 48 && horas <72) {
			dias = 2;
			horas = horas - 48;
		}
		
		System.out.println(minutos + " minutos = "  + dias + " dias y "+ horas + " horas");

		
		leer.close();
	}

}
