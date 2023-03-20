package Guia03;

import java.util.Scanner;

public class Guia03Ej03 {
	/*
	 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese cantidad de euros a convertir:");
		int euros = leer.nextInt();
		convertirMoneda(euros);
		leer.close();
	}

	public static void convertirMoneda(int euros) {
		System.out.println(euros + " euros = "+ (euros*0.86)+ " libras");
		System.out.println(euros + " euros = "+ (euros*1.28611)+ " dólares");
		System.out.println(euros + " euros = "+ (euros*129.852)+ " yenes");

	}
		
	}

