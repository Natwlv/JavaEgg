package Guia03;
import java.util.Scanner;
public class Guia03Ej01 {
	/*
	 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Ingrese 2 números");
		int num1 = leer.nextInt();
		int num2 = leer.nextInt();
		boolean bucle = true;
		
		
		do {
		System.out.println("");
		System.out.println("========");
		System.out.println("MENÚ");
		System.out.println("========");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		int opcion = leer.nextInt();
		
		
		switch (opcion){
		case 1:
			suma(num1,num2);
			break;	
		case 2:
			resta(num1,num2);
			break;	
		case 3:
			multiplicar(num1,num2);
			break;	
		case 4:
			dividir(num1,num2);
			break;	
		default: 
			System.out.println("Opción ingresada incorrecta");
		}

		} while (bucle);
		
		
		leer.close();

	}
	
	public static void suma(int num1, int num2) {
		int suma = num1+num2;
		System.out.println(num1 + " + " +num2+ " = " +suma);
		
	}
	
	public static void resta(int num1, int num2) {
		int resta = num1-num2;
		System.out.println(num1 + " - " +num2+ " = " +resta);
		
	}
	
	public static void multiplicar(int num1, int num2) {
		int multi = num1*num2;
		System.out.println(num1 + " x " +num2+ " = " +multi);
		
	}
	
	public static void dividir(int num1, int num2) {
		int dividir = num1/num2;
		System.out.println(num1 + " / " +num2+ " = " +dividir);
		
	}
	
	

}
