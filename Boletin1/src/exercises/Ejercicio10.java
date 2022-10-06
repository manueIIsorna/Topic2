package exercises;

import java.util.Scanner;

/***
 * Pedir dos números y mostrarlos ordenados de menor a mayor.
 * 
 * @author misorna
 */
public class Ejercicio10 {
	public static void main(String[] args) {
		// Bloque de variables
		double num1;
		double num2;
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario los dos números
		System.out.print("Introduzca dos números separados por espacio: ");
		num1 = sc.nextDouble(); // leemos de teclado el número 1
		num2 = sc.nextDouble(); // leemos de teclado el número 2

		// Vemos cuál número es el menor de todos, y ordenamos según
		if (num1 == num2) { // El primer y segundo número contienen los mismos valores
			System.out.println("Ninguno de estos es menor o mayor uno con otro");
		} else if (num1 > num2) { // El primer número es mayor que el segundo
			System.out.println("El orden iría tal que así --> " + num2 + " < " + num1);
		} else { // El primer número es menor que el segundo
			System.out.println("El orden iría tal que así --> " + num1 + " < " + num2);
		}

		// Cerramos el Scanner
		sc.close();
	}
}
