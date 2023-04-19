package Ejercicios_de_aprendizaje;

import java.util.Scanner;

/* TODO Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/

public class Ej_20_cuadro_magico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cant = 3, afirma, afirmaC, afirmaD;
		int cuadro[][] = new int[cant][cant];
		int cuadroT[][] = new int[cant][cant];
		Scanner leer = new Scanner(System.in);
		int cont = 1;

		for (int i = 0; i < cant; i++) {
			for (int j = 0; j < cant; j++) {
				System.out.println("Ingrese el valor " + cont + " del cuadro magico");
				cuadro[i][j] = leer.nextInt();
				cuadroT[j][i] = cuadro[i][j];
				cont++;
			}
		}
		System.out.println("El cuadro ingresado es:");
		for (int i = 0; i < cant; i++) {
			for (int j = 0; j < cant; j++) {
				System.out.print(cuadro[i][j]);
			}
			System.out.println("");
		}
		afirma = sumaFilas(cuadro, cant);
		afirmaC = sumaFilas(cuadroT, cant);
		afirmaD = sumaDiagonales(cuadro, cant);

		System.out.println(afirma);
		System.out.println(afirmaC);
		System.out.println(afirmaD);

		if (afirma != 0 && afirmaC != 0 && afirmaD != 0) {
			System.out.println("Es un cuadro magico");
		} else {
			System.out.println("No es un cuadro magico");
		}

	}

	public static int sumaFilas(int vector[][], int cant) {
		int contF = 0, aux = 0;
		boolean cond = true;
		;
		for (int i = 0; i < cant; i++) {
			contF = 0;
			for (int j = 0; j < cant; j++) {
				contF += vector[i][j];
			}
			if (i > 0) {
				if (contF != aux) {
					cond = false;
					break;
				}
			}
			aux = contF;
		}
		if (cond == false) {
			return 0;
		} else {
			return contF;
		}

	}

	public static int sumaDiagonales(int vector[][], int cant) {
		int contDMa = 0, contDMe = 0, aux = cant - 1;
		;
		for (int i = 0; i < cant; i++) {
			for (int j = 0; j < cant; j++) {
				if (i == j) {
					contDMa += vector[i][j];
				}
			}
			contDMe += vector[i][aux];
			aux--;
		}
		//System.out.println("Diagonal Mayor: " + contDMa);
		//System.out.println("Diagonal Menor: " + contDMe);
		if (contDMe != contDMa) {
			return 0;
		} else {
			return contDMe;
		}

	}
}
