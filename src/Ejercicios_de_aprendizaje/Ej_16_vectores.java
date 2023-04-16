package Ejercicios_de_aprendizaje;

import java.util.Scanner;

public class Ej_16_vectores {

	public static void main(String[] args) {
		int tamano, cont, consulta;
		Scanner leer = new Scanner(System.in);
		int vector[];
		cont = 0;
		System.out.println("Ingrese el tamano de numeros que desea registrar");
		tamano = leer.nextInt();
		vector = new int[tamano];
		for (int i = 0; i < tamano; i++) {
			vector[i] = (int) (Math.round(Math.random() * 10));
		}
		System.out.println("Ingrese un numero que desea bucar");
		consulta = leer.nextInt();
		for (int i = 0; i < tamano; i++) {
			if (vector[i] == consulta) {
				System.out.println("El numero " + "'" + consulta + "'" + " se encuentra en la posicion: " + i);
				cont++;
			}
		}
		if (cont > 1) {
			System.out.println("El numero se cuentra repetido #" + cont + " veces");
		} else if (cont == 0) {
			System.out.println("El numero " + "'" + consulta + "'" + " no se cuentra en el vector");
		}
		for (int i = 0; i < tamano; i++) {
			System.out.print("[" + vector[i] + "],");
		}

	}
}
