package Guia02;
import java.util.Scanner;
public class Guia02Extra13 {
	/*
	 * Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese altura de la escalera");
		int altura = leer.nextInt();
		
		for (int i=1; i < altura+1; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(j+1);
			}
			System.out.println("");
		}
		
		
		leer.close();
 
	}

}
