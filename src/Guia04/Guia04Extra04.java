package Guia04;
import java.util.Scanner;
public class Guia04Extra04 {
	/*
	 * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int aprobados = 0;
		int desaprobados = 0;
		for (int i=0; i<4; i++) {
			System.out.println("Ingrese nota del 1TP del alumno " +(i+1));
			int tp1 = leer.nextInt();
			System.out.println("Ingrese nota del 2TP del alumno " +(i+1));
			int tp2 = leer.nextInt();
			System.out.println("Ingrese nota del 1Integrador del alumno " +(i+1));
			int Int1 = leer.nextInt();
			System.out.println("Ingrese nota del 1Integrador del alumno " +(i+1));
			int Int2 = leer.nextInt();
			double promedio = (tp1*0.10)+(tp2*0.15)+(Int1*0.25)+(Int2*0.50);
			System.out.println("El promedio del alumno "+(i+1) +" es "+promedio);
			
			if (promedio>=7) {
				aprobados++;
			} else {
				desaprobados++;
			}
			

			
		}
		System.out.println("TOTAL DE APROBADOS: " +aprobados);
		System.out.println("TOTAL DE DESAPROBADOS: " +desaprobados);
		
		leer.close();
	}

}
