package Ejercicios_de_aprendizaje;

import java.util.Scanner;

/* TODO Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java. */

public class Ej_03_metodos_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese una frase");
		
		frase = leer.nextLine();
		
		System.out.println("La frase en MAYUSCULAS ES: "+frase.toUpperCase());
		System.out.println("La frase en minusculas ES: "+frase.toLowerCase());
	}

}
