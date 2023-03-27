package Guia02;

import java.util.Scanner;

public class Guia02Extra09 {
/*
 * Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
	 */
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		int num = leer.nextInt();
		System.out.println("Ingrese un divisor");
		int divisor = leer.nextInt();
		restaSucesivas(num, divisor);
		
		leer.close();
	}
	
	public static void restaSucesivas (int num, int divisor) {
		int cociente = 0;
		while (num >= divisor) {
			num-=divisor;
			cociente++;
		}
		System.out.println("El cociente de los valores ingresados es " + cociente);
		System.out.println("El residuo de los valores ingresados es " + num);

	}

}
