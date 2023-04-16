package Ejercicios_de_aprendizaje;

import java.util.Scanner;

public class Ej_17_vector {

	public static void main(String[] args) {
		int cantidad, nDigitos;
		Scanner leer = new Scanner(System.in);
		String vector[];
		System.out.println("Ingrese el numero de numeros que se van a almacenar en el vector");
		cantidad = leer.nextInt();
		vector = new String[cantidad];
		for (int i = 0; i < cantidad; i++) {
			vector[i] = String.valueOf(Math.round(Math.random() * 10000));
		}
		for (int i = 0; i < cantidad; i++) {
			nDigitos = 0;
			for (int j = 0; j < vector[i].length(); j++) {
				nDigitos++;
			}
			System.out.println(vector[i] + " Tiene " + nDigitos + " digitos");
		}
	}
}
