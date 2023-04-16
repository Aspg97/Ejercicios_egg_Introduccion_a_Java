package Ejercicios_de_aprendizaje;

import java.util.Scanner;

/* TODO 10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.*/

public class Ej_10_bucle {

	public static void main(String[] args) {
		
		int lim,num,acu;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un valor limite para la suma continua de numeros");
		lim = leer.nextInt();
		
		acu = 0;
		
		do {
			System.out.println("Ingrese un numero");
			num=leer.nextInt();
			acu+=num;
		}while(lim>acu);
		
		System.out.println("La suma total de los numeros ingresados es: "+acu);
	}

}
