package Manos_a_la_obra;

import java.util.Scanner;

public class Mao_05_deteccion_de_errores {
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa tu edad");
		String nombre = leer.nextLine();

		System.out.println("Ingresa tu nombre");
		int edad = leer.nextInt();
		
		System.out.println("Se corrigieron las declaraciones que comprometen a las variables: " + nombre + " y " + edad);
	}
}
