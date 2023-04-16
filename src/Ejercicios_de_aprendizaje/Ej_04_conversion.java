package Ejercicios_de_aprendizaje;

import java.util.Scanner;

/* TODO Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */

public class Ej_04_conversion {

	public static void main(String[] args) {
		
		double gradosC,gradosF;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese una cantidad de grados Centigrados para transformarlos a Fahrenheit");
		
		gradosC = leer.nextDouble();
		gradosF = 32 + (9*gradosC/5);
		
		System.out.println("En grados Fahrenheit es: "+gradosF);
	}
}
