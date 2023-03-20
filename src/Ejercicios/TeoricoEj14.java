package Ejercicios;

import java.util.Scanner;

public class TeoricoEj14 {
	/*
	 * Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		
		String [] equipo = new String[4];
		
		
		for (int i =0; i<=3; i++){
            System.out.println("Ingrese nombre");
            equipo[i] = leer.next();
	
		}
        System.out.println("");

		for (int i =0; i<=3; i++){
            System.out.println((i+1)+ ". NOMBRE: " + equipo[i]);
	
		}
		
		
		
		
		
		leer.close();
	}

}
