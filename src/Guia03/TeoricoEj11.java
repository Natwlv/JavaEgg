package Guia03;

import java.util.Scanner;

public class TeoricoEj11 {
	
	/*
	 * Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese una frase");
		String frase = leer.nextLine(), fraseTransformada = "";
		
		int longitud = frase.length();
		

		for (int i = 0; i <=longitud-1; i++) {
            fraseTransformada = fraseTransformada + vocal(frase.charAt(i));
		}

		System.out.println("");
        System.out.println("Frase codificada: " + fraseTransformada);
        leer.close();
	}

    public static char vocal(char letra){
    char reemplazo; 
    	switch (letra){
               case 'a':
                    reemplazo='@';
                    break;
               case 'e':     
            	   reemplazo='#';
            	   break;
               case 'i':
            	   reemplazo='$';
            	   break;
               case 'o':
            	   reemplazo='%';
            	   break;
               case 'u':
            	   reemplazo='*';
            	   break;
               default:
            	   reemplazo=letra;
            	   break;
    }
    return reemplazo;
    
    }
}