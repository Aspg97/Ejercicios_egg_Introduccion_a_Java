package Ejercicios_de_aprendizaje;

import java.util.Scanner;

public class Ej_19_matrices {
	public static void main(String[] args) {
		boolean afirmacion = false;
		Scanner leer = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int matrizT[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = leer.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + ",");
			}
			System.out.println("");
		}
		System.out.println("///////////************///////////");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizT[i][j] = matriz[j][i];
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrizT[i][j] + ",");
			}
			System.out.println("");
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matriz[i][j] == (-matrizT[i][j])) {
					afirmacion = true;
				} else {
					System.out.println("falso");
					afirmacion = false;
					break;
				}
			}
		}
		if (afirmacion == true) {
			System.out.println("Es una matriz anti simetrica");
		} else {
			System.out.println("No es una matriz anti simetrica");
		}
	}
}
