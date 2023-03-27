package Guia04;

import java.util.Scanner;

public class TeoricoEj13 {
	/*
	 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
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
