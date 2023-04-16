package Ejercicios_de_aprendizaje;

import java.util.Scanner;

/* TODO Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().*/

public class Ej_05_metodos_Math {

	public static void main(String[] args) {
		int num;
		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese un numero entero");

		num = leer.nextInt();

		System.out.println(
				"El cuadrado del numero ingresado es: " + Math.pow(num, 2) + "\nEl triple del numero ingresado es:"
						+ Math.pow(num, 3) + "\nLa raiz cuadrada del numero ingresado es: " + Math.sqrt(num));
	}

}
