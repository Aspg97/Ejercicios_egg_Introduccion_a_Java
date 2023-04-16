package Ejercicios_de_aprendizaje;

import java.util.Scanner;

/* TODO Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla. */

public class Ej_02_pedido_por_teclado {

	public static void main(String[] args) {
		String nombre;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un nombre");
		nombre = leer.nextLine();
		
		System.out.println("El nombre ingresado es: "+nombre);

	}

}
