package Ejercicios_de_aprendizaje;

import java.util.Scanner;

/* TODO Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma */

public class Ej_01_pedido_por_teclado {

	public static void main(String[] args) {

		int num1, num2, res;
		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese dos numeros para posteriormente mostrar su suma");

		num1 = leer.nextInt();
		num2 = leer.nextInt();
		res = num1 + num2;

		System.out.println("La suma de los numeros ingresados es: " + res);
	}

}
