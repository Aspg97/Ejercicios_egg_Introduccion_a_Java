package Ejercicios_de_aprendizaje;

import java.util.Scanner;

/* TODO Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.*/

public class Ej_21_composicion_de_matrices {

	public static void main(String[] args) {
		int cantM = 4, cantP = 2;
		boolean verificacion;
		int matrizM[][] = new int[cantM][cantM];
		int matrizP[][] = new int[cantP][cantP];
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese los elementos de la matriz M");
		matrizM = llenarMatriz(cantM, leer);
		System.out.println("La matriz M ingresada es");
		mostrarMatriz(matrizM, cantM);
		System.out.println("Ingrese los elementos de la matriz P");
		matrizP = llenarMatriz(cantP, leer);
		System.out.println("La matriz P ingresada es");
		mostrarMatriz(matrizP, cantP);
		verificacion = verificacion(matrizM, matrizP, cantM, cantP);
		System.out.println(verificacion);

	}

	public static int[][] llenarMatriz(int cantidad, Scanner leer) {
		int indice = 1;
		int vector[][] = new int[cantidad][cantidad];
		for (int i = 0; i < cantidad; i++) {
			for (int j = 0; j < cantidad; j++) {
				System.out.println("Ingrese el elemento #" + indice);
				vector[i][j] = leer.nextInt();
				// vector[i][j] = (int) (Math.random() * 100);
				indice++;
			}
		}
		return vector;
	}

	public static void mostrarMatriz(int vector[][], int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			for (int j = 0; j < cantidad; j++) {
				if (vector[i][j] > 9) {
					System.out.print("[" + vector[i][j] + "]");
				} else {
					System.out.print("[" + vector[i][j] + " ]");
				}
			}
			System.out.println("");
		}
	}

	public static boolean verificacion(int vectorM[][], int vectorP[][], int cantM, int cantP) {
		boolean validacion = true;
		int cont = 0;
		for (int i = 0; i < cantM; i++) {
			for (int j = 0; j < cantM; j++) {
				validacion = true;
				if (vectorM[i][j] == vectorP[0][0]) {
					for (int k = 0; k < cantP; k++) {
						for (int l = 0; l < cantP; l++) {
							if(((j+l)<cantM)&&((i+k)<cantM)) {
								if (vectorM[i + k][j + l] == vectorP[k][l]) {
									System.out.println("El elemento '" + vectorP[k][l] + "' Se encontro en la posicion: "
											+ (i + k) + "," + (j + l));
									cont++;
								} else {
									cont = 0;
									validacion = false;
									break;
								}
							}
						}
						if (validacion == false) {
							break;
						}
					}
				} else {
					if (cont < Math.pow(cantP, 2)) {
						validacion = false;
						//System.out.println(cont);
						continue;
					} else {
						validacion = true;
						break;
					}
				}
			}
		}
		System.out.println(cont);
		return validacion;
	}
}
