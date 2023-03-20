package Guia02;

import java.util.Scanner;

public class Guia02Ej07 {
	/*
	 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		String codigo;
		int contadorCorrecto = 0;
		int contadorIncorrecto = 0;
		
		do {
			
		System.out.println("Ingrese código");
		codigo = leer.next();
		
		int longitud = codigo.length();
		String letraX = codigo.substring(0, 1);
		String letraO = codigo.substring(longitud-1, longitud);
		

		
		if (longitud < 5 && letraX.equalsIgnoreCase("X") && letraO.equalsIgnoreCase("O")) {
			contadorCorrecto ++;
		} else {
			contadorIncorrecto ++;
		}
		
		
		} while (!codigo.equals("&&&&&"));
		
		
		
		
		System.out.println("----------------");
		System.out.println("INFORME");
		System.out.println("----------------");
		System.out.println("Lecturas correctas: " + contadorCorrecto);
		System.out.println("Lecturas incorrectas: " + (contadorIncorrecto-1));

		
		
		
		
		
		
		leer.close();	
	}

}
