package Ejercicios_de_aprendizaje;

import java.util.Scanner;

/* TODO Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java. */

public class Ej_09_sub_string {
	public static void main(String[] args) {
		
		String frase;
		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese una frase");
		frase = leer.nextLine();

		if (frase.substring(0,1).equals("A")) {
			System.out.println("CORRECTO la primera letra es una 'A'");
		} else {
			System.out.println("INCORRECTO la primera letra no es una 'A'");
		}
	}
}
