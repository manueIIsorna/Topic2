package exercises;

import java.util.Scanner;

/***
 * Pedir dos números enteros y decir si son iguales o no.
 * 
 * @author misorna
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		// Bloque de variables
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario ambos números
		System.out.print("Introduzca dos numeros enteros separados por un espacio: ");
		num1 = sc.nextInt(); // leemos de teclado el primer número
		num2 = sc.nextInt(); // leemos de teclado el segundo número

		// Vemos si los números son idénticos o no
		if (num1 == num2) { // Los números son iguales
			System.out.println("Ambos números son iguales");
		} else { // Los números no son iguales
			System.out.println("Ambos números no son iguales");
		}

		// Cerramos el Scanner
		sc.close();
	}
}
