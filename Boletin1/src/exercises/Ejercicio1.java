package exercises;

import java.util.Scanner;

/***
 * Diseñar una aplicación que solicite al usuario un número e indique si es par
 * o impar.
 * 
 * @author misorna
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		// Bloque de variables
		int num;
		int resto;
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario el numero
		System.out.print("Introduzca un numero entero: ");
		num = sc.nextInt(); // leemos de teclado

		// Operamos para sacar el resto
		resto = num % 2;

		// Vemos si el numero es par o no
		if (resto == 0) { // Si sale cero sería par
			System.out.println("El número es par");
		} else { // Si sale un número distinto de cero sería impar
			System.out.println("El número es impar");
		}

		// Cerramos el Scanner
		sc.close();
	}
}
