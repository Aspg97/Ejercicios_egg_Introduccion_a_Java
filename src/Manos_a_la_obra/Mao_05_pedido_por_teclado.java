package Manos_a_la_obra;

import java.util.Scanner;

public class Mao_05_pedido_por_teclado {
	public static void main(String[] args) {
		boolean decision;
		double num;
		char letra;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese false o true");
		decision = leer.nextBoolean();
		System.out.println("Ingrese un numero decimal");
		num = leer.nextDouble();
		System.out.println("Ingrese una letra");
		letra = leer.next().charAt(0);
		
		System.out.println("Los valores ingresados son: " + decision + ", " + num + " y " + letra);
		
	}
}
