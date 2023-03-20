package Guia02;
import java.util.Scanner;
public class Guia02Extra14 {
	/*
	 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese cantidad de familias");
		int familias = leer.nextInt();
		int contador = 0;
		int suma=0;
		
		for (int i = 0; i < familias ; i++) {
			System.out.println("Ingrese cantidad de hijos de la familia " +(i+1));
			int hijos = leer.nextInt();
			
			for (int j=0; j<hijos; j++) {
				System.out.println("Ingrese edad del hijo " +(j+1));
				int edad = leer.nextInt();
				contador++;
				suma=suma+edad;
			}
		}
		
		System.out.println("El promedio de edad de los hijos del total de familias es " +(suma/contador));
		
		leer.close();
	}

}
