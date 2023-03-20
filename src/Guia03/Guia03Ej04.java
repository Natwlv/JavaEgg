package Guia03;
import java.util.Scanner;
public class Guia03Ej04 {
	/*
	 * Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un número para saber si es primo");
		int num = leer.nextInt();
		System.out.println("El número ingresado es " + primo(num));
		primo(num);
		leer.close();
	}
	
	public static boolean primo (int num) {
		int iteracion = 1;
		int residuoCero = 0;
		
		while (iteracion <=num) {
			if (num%iteracion==0) {
				residuoCero++;
			}
			iteracion++;
		}
		
		
		return residuoCero ==2;
	}

}
