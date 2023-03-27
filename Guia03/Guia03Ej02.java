package Guia03;
import java.util.Scanner;
public class Guia03Ej02 {
	/*
	 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String nombre;
		int edad;
		String respuesta;
		do {
			System.out.println("Ingrese nombre");
			nombre = leer.next();
			System.out.println("Ingrese edad de " +nombre);
			edad = leer.nextInt();
			if (edad>=18) {
				System.out.println(nombre +" es mayor de edad");
			} else {
				System.out.println(nombre + " es menor de edad");
			}
			System.out.println("¿Desea seguir mostrando personas (SI-NO)?");
			respuesta = leer.next();
			if (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO")) {
				System.out.println("Respuesta incorrecta");
				System.out.println("¿Desea seguir mostrando personas (SI-NO)?");
				respuesta = leer.next();

			}
			
		} while (respuesta.equalsIgnoreCase("SI"));
		leer.close();

	}
	
	

}
