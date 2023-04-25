package Ejercicios_de_aprendizaje_extras;

import java.util.Scanner;

/*TODO Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
public class Ej_08_break_multiplo_cinco {

	public static void main(String[] args) {
		int numeros, contP = 0, contI = 0, i = 0;
		Scanner leer = new Scanner(System.in);
		do {
			System.out.println("Ingrese el numero #" + (i + 1));
			numeros = leer.nextInt();
			if (numeros > 0) {
				if (numeros % 2 == 0) {
					contP++;
				} else {
					contI++;
				}
				i++;
			}
		} while (numeros % 5 != 0);
		System.out.println("Numeros totales: " + (i) + "\nNumeros Impares: " + contI + "\nNumeros Pares: " + contP);

	}

}
