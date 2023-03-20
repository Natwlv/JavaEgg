package Ejercicios;


import java.util.Scanner;

import java.util.Date;

public class prueba {

	/*
	 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int num =0;
        System.out.println("Ingrese un numero");

        for (int i = 0; i <4; i++) {
        	System.out.println("");

        num = leer.nextInt();

        for (int f=0; f<num; f++)
        {
            if (f == 0) {
            	System.out.println("");
                System.out.print(num + " ");
            }
            System.out.print("*");
        }
        }
    }

}
