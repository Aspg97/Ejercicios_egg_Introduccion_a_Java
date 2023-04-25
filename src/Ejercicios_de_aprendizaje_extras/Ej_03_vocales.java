package Ejercicios_de_aprendizaje_extras;

import java.util.Scanner;

/* TODO Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.*/
public class Ej_03_vocales {

	public static void main(String[] args) {
		char vocal;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese una letra");
		vocal = leer.next().charAt(0);
		vocal = Character.toLowerCase(vocal);
		if(vocal=='a'||vocal=='e'||vocal=='i'||vocal=='o'||vocal=='u') {
			System.out.println("'"+vocal+"' es una vocal");
		}else System.out.println("'"+vocal+"' no es una vocal");
	}

}
