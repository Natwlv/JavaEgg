package Guia02;

import java.util.Scanner;

public class Guia02Extra06 {
	/*
	 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
	 */

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese cantidad de personas a calcular");
		int Npersonas = leer.nextInt();
		int contador = 0;
		int bajo = 0;
		double alturaTotal=0;
		double alturaBaja=0;
		for (int i=0; i<Npersonas; i++) {
			System.out.println("Ingrese altura de persona " + i);
			double altura = leer.nextDouble();
			contador = contador + 1;
			alturaTotal = altura + altura;
			if (altura < 1.60 ) {
				bajo=bajo+1;
				alturaBaja = altura + altura;
			}
		}
		
		
		System.out.println("El promedio de altura de todas las personas ingresadas es de " + (alturaTotal/contador));
		System.out.println("El promedio de altura de todas las personas por debajo de 1.60 es de " + (alturaBaja/contador));

	

			leer.close();
	}

}
