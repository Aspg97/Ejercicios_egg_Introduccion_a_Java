package Ejercicios_de_aprendizaje;

import java.util.Scanner;

/* TODO Crear un programa que dado un numero determine si es par o impar.*/

public class Ej_06_par_o_impar {

	public static void main(String[] args) {
		int num;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un numero para determinar si es par o impar");
		num = leer.nextInt();
		
		if(num%2==0) {
			System.out.println("Es un numero par");
		}else {
			System.out.println("Es un numero impar");
		}

	}

}
