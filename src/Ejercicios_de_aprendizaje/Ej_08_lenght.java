package Ejercicios_de_aprendizaje;

import java.util.Scanner;

/* TODO Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.*/

public class Ej_08_lenght {

	public static void main(String[] args) {
		String frase;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra de maximo 8 letras");
		frase = leer.nextLine();
		
		if(frase.length()>8) {
			System.out.println("UPS. Incorrecto es mayor a 8 letras");
		}else {
			System.out.println("Correctom es menor a 8 letras");
		}
	}

}
