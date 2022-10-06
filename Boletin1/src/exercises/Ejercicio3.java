package exercises;

import java.util.Scanner;

/***
 * Implementar un programa que pida por teclado un número decimal e indique si
 * es un número casi-cero, que son aquellos, positivos o negativos, que se
 * acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 no se considera
 * un número casi-cero. Es decir, un número casi-cero es el que se encuentra en
 * el intervalo (-1, 1), donde se excluye el -1, el 0 y el 1.
 * 
 * @author misorna
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		// Bloque de variables
		double num;
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario el número
		System.out.print("Introduzca un número decimal: ");
		num = sc.nextDouble(); // leemos de teclado el número

		// Vemos si el número es casi-cero o si llega a ser uno
		// dentro del rango no permitido
		if (num == 0) { // Se trata del número 0
			System.out.println("No puede tratarse de 0");
		} else if (num > -1 && num < 1) { // Se trata de un número casi-cero
			System.out.println("Se trata de un número casi-cero");
		} else { // Se trata de uno de los números no permitidos (Rango -1 - 1)
			System.out.println("Ha de tener el número 0 como primera unidad");
		}

		// Cerramos el Scanner
		sc.close();
	}
}
