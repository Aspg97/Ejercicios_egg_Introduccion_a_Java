package Manos_a_la_obra;

import java.util.Scanner;

public class Mao_14_practica_vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		String nombres[] = new String[4];

		for (int i = 0; i < 4; i++) {
			System.out.println("Ingrese el nombre del companero #" + (i + 1));
			nombres[i] = leer.next();
		}

		for (int i = 0; i < 4; i++) {
			System.out.println(nombres[i]);
		}
	}

}
