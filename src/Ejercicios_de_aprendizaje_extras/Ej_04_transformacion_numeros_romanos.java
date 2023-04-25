package Ejercicios_de_aprendizaje_extras;

import java.util.Scanner;

/* TODO Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.*/
public class Ej_04_transformacion_numeros_romanos {

	public static void main(String[] args) {
		int numero;
		String romanos[]= {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un numero del 1 al 10");
		numero = leer.nextInt();
		System.out.println("El #"+numero+" en romanos es: "+romanos[numero-1]);
	}
}
