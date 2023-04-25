package Ejercicios_de_aprendizaje_extras;

import java.util.Scanner;

/*TODO Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.*/
public class Ej_06_promedio {

	public static void main(String[] args) {
		double cont;
		int personas;
		Scanner leer = new Scanner(System.in);
		cont = 0;
		System.out.println("Ingrese el numero de personas");
		personas = leer.nextInt();
		double vectorA[] = new double[personas];
		for (int i = 0; i < personas; i++) {
			System.out.println("Ingrese la altura de la persona #" + (i + 1));
			vectorA[i] = leer.nextDouble();
		}
		for (int i = 0; i < personas; i++) {
			cont += vectorA[i];
		}
		System.out.println("El promedio de las alturas es: " + (double) (cont / personas));

	}

}
