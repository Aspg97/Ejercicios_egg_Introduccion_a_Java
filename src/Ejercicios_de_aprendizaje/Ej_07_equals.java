package Ejercicios_de_aprendizaje;

import java.util.Scanner;

/* TODO Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.*/

public class Ej_07_equals {

	public static void main(String[] args) {
		
		String frase;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese una frase. Se determinara si es correcto o incorrecto");
		frase = leer.nextLine();
		
		if(frase.equals("eureka")) {
			System.out.println("Correcto");
		}else {
			System.out.println("Incorrecto");
		}
	}

}
