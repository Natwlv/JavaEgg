package Guia02;

import java.util.Scanner;

public class Guia02Extra05 {
	/*
	 * Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese tipo de socio");
		String socio = leer.next();
		 socio = socio.toUpperCase(); 

		System.out.println("Ingrese valor del tratamiento");
		int valor = leer.nextInt();
	
		
		while ( !socio.equalsIgnoreCase("A") && !socio.equalsIgnoreCase("B")  && !socio.equalsIgnoreCase("C") ){
			System.out.println("Tipo de socio ingresado incorrecto. Vuelva a ingresar tipo de socio");
			 socio = leer.next();
			 socio = socio.toUpperCase(); 
		}
		
		
		switch (socio) {
		case "A":
			int valorA = valor - (valor * 50 / 100);
			System.out.println("Aplica un 50% de descuento. Total a abonar por el tratamiento: $" + valorA);
			break;
		case "B":
			int valorB = valor - (valor * 35 / 100);
			System.out.println("Aplica un 35% de descuento. Total a abonar por el tratamiento: $" + valorB);
			break;
		case "C":
			System.out.println("No se aplican descuentos. Total a abonar por el tratamiento: $" + valor);
			break;
					
		}

			leer.close();
	}

}
